import { Component, OnInit, Input } from '@angular/core';
import { DataService } from '../service/data.service';

@Component({
  selector: 'app-biddingpage',
  templateUrl: './biddingpage.component.html',
  styleUrls: ['./biddingpage.component.scss']
})
export class BiddingpageComponent implements OnInit {
  @Input() item
  constructor(private data: DataService) { }

  ngOnInit() {
    this.data.getItem().subscribe(data =>{
      this.item=data
    });
  }

  itemUpdater(bidValue, daysRent)
  {
    // console.log(bidValue);
    this.data.updateItem(bidValue,daysRent).subscribe(data=>this.item=data);
  //  this.data.getItem()
  //  .subscribe(data=>this.item=data,
  //   );
  }

}
