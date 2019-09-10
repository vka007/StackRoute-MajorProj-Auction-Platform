import { Component, OnInit, Injectable, Output, EventEmitter } from '@angular/core';
import { AuthenticationService} from '../service/authentication.service'
import { Router } from '@angular/router';
import { FormGroup } from '@angular/forms';

@Injectable({
  providedIn: 'root'
})

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
  username;
  // password = ''
  loginform:FormGroup;
  invalidLogin = false
  constructor(private router: Router,
    private loginservice: AuthenticationService) { }


    // message:string = this.username;

    // @Output() messageEvent = new EventEmitter<string>();

    // sendMessage()
    // {
    //   this.messageEvent.emit(this.message);
    // }

  ngOnInit() {
    
    
  }
  checkLogin(username, password) {
    console.log(username);
    (this.loginservice.authenticate(username, password).subscribe(
      data => {
        this.router.navigate(['/landing/'], {queryParams: { username}})
        //this.router.navigate([this.loginform.get('username').value+'/landing'])
        this.invalidLogin = false
      },
      error => {
        this.invalidLogin = true
      }
    )
    );
  }
}
