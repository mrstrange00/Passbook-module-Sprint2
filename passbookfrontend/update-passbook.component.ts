import { Component, OnInit } from '@angular/core';
import{PassbookService} from '../passbook.service';
import{Passbook} from '../passbook';
import{Observable,Subject} from "rxjs";
import { NgModule } from '@angular/core';
import{FormControl,FormGroup,Validators} from'@angular/forms';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
@Component({
  selector: 'app-update-passbook',
  templateUrl: './update-passbook.component.html',
  styleUrls: ['./update-passbook.component.scss']
})
export class UpdatePassbookComponent implements OnInit {

  constructor(private passbookservice:PassbookService) { }
passbookArray:Observable<Passbook[]>;
accountNumber:number;
passbooks:Passbook[];

  ngOnInit(): void { 
}

 updatePassbook(accountNumber:number){
   this.accountNumber=accountNumber;
    this.passbookservice.getPassbookdetailsbeforeupdation(accountNumber).subscribe(data => {
      this.passbookArray = data;
    });
}

}
