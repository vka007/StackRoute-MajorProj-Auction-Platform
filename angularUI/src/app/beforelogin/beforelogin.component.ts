import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { AuthenticationService } from '../service/authentication.service';

@Component({
  selector: 'app-beforelogin',
  templateUrl: './beforelogin.component.html',
  styleUrls: ['./beforelogin.component.scss']
})
export class BeforeloginComponent implements OnInit {

  isLoggedIn$: Observable<boolean>;
  loggedIn: boolean;

  constructor(private authenticateService: AuthenticationService) { }

  ngOnInit() {
    this.isLoggedIn$ = this.authenticateService.logged;
    this.isLoggedIn$.subscribe(data => {
      this.loggedIn = data;
      console.log(this.loggedIn)
    });
  }

}
