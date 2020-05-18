import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';  
import { Observable } from 'rxjs'; 

@Injectable({
  providedIn: 'root'
})
export class PassbookService {

  constructor(private http:HttpClient) { }
  private baseUrl="http://localhost:8075/passbookdetails/";
  myUrl:string;
  getPassbookdetails(accountNumber:number):Observable<any>{
    this.myUrl=this.baseUrl+"displaypassbookByAccountnumber/"+accountNumber;
    alert(accountNumber);
    return this.http.get(this.myUrl);
  }

  getPassbookdetailsbeforeupdation(accountNumber):Observable<any>{
    this.myUrl=this.baseUrl+"updatePassbook/"+accountNumber;
    alert(accountNumber);
    return this.http.get(this.myUrl);
  }
  getPassbookdetailsbyDate(accountNumber,startDate,endDate):Observable<any>{
    this.myUrl=this.baseUrl+accountNumber+"/startDate/"+startDate+"/endDate/"+endDate;
    alert(accountNumber);
    alert(startDate);
    return this.http.get(this.myUrl);
  }
}
