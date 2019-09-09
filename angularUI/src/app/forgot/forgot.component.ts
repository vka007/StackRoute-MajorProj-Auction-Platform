import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-forgot',
  templateUrl: './forgot.component.html',
  styleUrls: ['./forgot.component.scss']
})
export class ForgotComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  notification()
  {
    alert("Reset link send to your email id");
  }

}
