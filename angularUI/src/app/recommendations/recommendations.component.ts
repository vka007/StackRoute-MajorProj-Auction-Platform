import { Component, OnInit } from '@angular/core';
import { AuctionService } from '../auction.service';
import { ActivatedRoute, Router } from '@angular/router';
@Component({
  selector: 'app-recommendations',
  templateUrl: './recommendations.component.html',
  styleUrls: ['./recommendations.component.scss']
})
export class RecommendationsComponent implements OnInit {

  constructor(private auctionService:AuctionService,private route:ActivatedRoute,
    private router:Router) { }
    arrayOfProducts:any=[];
  ngOnInit() {
    this.getRecommendList();
  }
  getRecommendList():void
  {
    this.auctionService.getRecommendList().subscribe(data=>{
      console.log(data);
      this.arrayOfProducts=data;
    })
  }

  addToWishList(value) {
    this.auctionService.addToWishList(value);
    this.router.navigateByUrl("favs");
  }

}



