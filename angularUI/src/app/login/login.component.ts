import { Component, OnInit } from '@angular/core';
import { AuthenticationService} from '../service/authentication.service'
import { Router } from '@angular/router';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
  // username = ''
  // password = ''
  invalidLogin = false
  constructor(private router: Router,
    private loginservice: AuthenticationService) { }
  ngOnInit() {
  }
  checkLogin(username, password) {
    (this.loginservice.authenticate(username, password).subscribe(
      data => {
        this.router.navigate(['landing'])
        this.invalidLogin = false
      },
      error => {
        this.invalidLogin = true
      }
    )
    );
  }
}
