import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { AuctionService } from 'src/app/auction.service';

@Component({
  selector: 'app-wishlist',
  templateUrl: './wishlist.component.html',
  styleUrls: ['./wishlist.component.scss']
})
export class WishlistComponent implements OnInit {

  constructor(private auctionService:AuctionService, private route: ActivatedRoute,
    private router:Router) { }
    arrayOfProducts:any=[];
  ngOnInit() {
 this.getWishList();
  }
  getWishList():void{

    this.auctionService.getWishList().subscribe(data =>{
      console.log(data);
      this.arrayOfProducts = data;
    })
  }
  
  delete(product):any{

    console.log("routing to delete");
    this.auctionService.delete(product);
    console.log(product);
    this.router.navigateByUrl("/favs");
  
    // var myVal = muzix.id;
    // this.muzixService.deleteTrack(myVal);
    // this.router.navigateByUrl("/favs");
  
  }
}