import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute, ParamMap } from '@angular/router';

import { Location } from '@angular/common';
import { AuctionService } from '../auction.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {

  productList:any;  
  constructor(private searchService: AuctionService, private route: ActivatedRoute, private location: Location,
    private router:Router ) { }

  ngOnInit() {
    this.route.paramMap.subscribe((params: ParamMap) => 
      {
        let searchString = params.get('value');
        this.searchService.getSearch(searchString).subscribe((data)=> {
          this.productList = data;
          console.log(this.productList[0]);
        }

        );
      }

    );

  }


}
