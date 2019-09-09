import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Item } from '../item';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private httpClient : HttpClient) { }

  url="http://localhost:8080";
  getItem():Observable<Item>
  {
    return this.httpClient.get<Item>(this.url+"/item/1");
  }

  value: string;
  updateItem(itemCurrentBid,noOfDaysNeeded):Observable<Item>
  {
    // console.log(this.url,"/updateItem/1/"+itemCurrentBid+"/"+noOfDaysNeeded);
    return this.httpClient.put<Item>(this.url+"/updateItem/1/"+itemCurrentBid+"/"+noOfDaysNeeded, this.value);
  }
}
