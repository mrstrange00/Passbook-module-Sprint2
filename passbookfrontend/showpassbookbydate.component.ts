import { Component, OnInit } from '@angular/core';
import{PassbookService} from '../passbook.service';
import{Passbook} from '../passbook';
import{Observable,Subject} from "rxjs";
import { NgModule } from '@angular/core';
import{FormControl,FormGroup,Validators} from'@angular/forms';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';

@Component({
  selector: 'app-showpassbookbydate',
  templateUrl: './showpassbookbydate.component.html',
  styleUrls: ['./showpassbookbydate.component.scss']
})
export class ShowpassbookbydateComponent implements OnInit {

  constructor(private passbookservice:PassbookService) { }
passbookArray:Observable<Passbook[]>;
accountNumber:number;
passbooks:Passbook[];
startDate:Date;
endDate:Date;

  ngOnInit(): void { 
}
showPassbookbyDate(accountNumber:number,startDate:Date,endDate:Date){
   this.accountNumber=accountNumber;
   this.startDate=startDate;
   this.endDate=endDate;
    this.passbookservice.getPassbookdetailsbyDate(accountNumber,startDate,endDate).subscribe(data => {
      this.passbookArray = data;
    });
}

}
