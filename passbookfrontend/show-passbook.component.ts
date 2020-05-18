import { Component, OnInit } from '@angular/core';
import{PassbookService} from '../passbook.service';
import{Passbook} from '../passbook';
import{Observable,Subject} from "rxjs";
import { NgModule } from '@angular/core';
import{FormControl,FormGroup,Validators} from'@angular/forms';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
@Component({
  selector: 'app-show-passbook',
  templateUrl: './show-passbook.component.html',
  styleUrls: ['./show-passbook.component.scss']
})
export class ShowPassbookComponent implements OnInit {
  
  constructor(private passbookservice:PassbookService) { }
passbookArray:Observable<Passbook[]>;
accountNumber:number;
passbooks:Passbook[];

  ngOnInit(): void { 
  
}
 showPassbook(accountNumber:number){
   this.accountNumber=accountNumber;
    this.passbookservice. getPassbookDetails(accountNumber).subscribe(data => {
      this.passbookArray = data;
    });
}


}
