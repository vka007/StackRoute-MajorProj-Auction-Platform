import { Component, OnInit } from '@angular/core';
import { IUser } from '../models/user';
import { RegistrationService } from '../service/registration.service';
import { FormGroup, FormBuilder, FormControl, Validators, FormGroupDirective, NgForm } from '@angular/forms';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.scss']
})
export class RegistrationComponent implements OnInit {
  registerForm:FormGroup;
  register = new IUser();
  category:FormControl;
  categoryList:string[]=['Electronics','Car & Bike','Fashion','Antique','Artifacts','Jewellery'];
  constructor(private userService: RegistrationService,private formBuilder:FormBuilder) {
    this.category = new FormControl();

   }

  ngOnInit() {
    this.registerForm=new FormGroup({
      userName: new FormControl(),
      userEmail:new FormControl(),
      userPassword: new FormControl(),
      PhoneNumber: new FormControl('',[Validators.pattern('[6-9]\\d{9}')]),
      AadharNumber: new FormControl('',[Validators.pattern('[1-9]\\d{12}')]),
      userGender: new FormControl(),
      category: new FormControl()
    });
  }
  registeredUser()
  {
    this.register.userName = this.registerForm.get('userName').value;
    this.register.userEmail = this.registerForm.get('userEmail').value;
    this.register.userPassword = this.registerForm.get('userPassword').value;
    this.register.userPhoneNumber = this.registerForm.get('PhoneNumber').value;
    this.register.userAadharNumber = this.registerForm.get('AadharNumber').value;
    this.register.userGender=this.registerForm.get('userGender').value;
    this.register.category=this.registerForm.get('category').value;
    console.log(this.register);
     this.userService.saveUser(this.register)
    .subscribe(
       response => console.log(response),
       error => console.log(error)
     ) 
  }

}
