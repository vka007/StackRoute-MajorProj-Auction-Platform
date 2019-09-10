import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { AuctionService } from '../auction.service';
// import { Observable } from 'rxjs';
import { LoginComponent } from '../login/login.component';
// import { User } from '../service/authentication.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent implements OnInit {

  productList:any = [];
  
  constructor(private searchService: AuctionService, private route: ActivatedRoute,
    private router:Router,private loginObj:LoginComponent) { 
  
    }

   
    // user = this.loginObj.username;
    
    // user;

    // receiveuser($event)
    // {
    //   this.user = $event;
    // }
    
   
  ngOnInit() {
  }

  clickSearch(value):any {
    // value=value.equalIgnoreCase();
    this.router.navigate(['/search/',value]);
   
  }
}
