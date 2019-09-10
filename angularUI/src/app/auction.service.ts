import { Injectable } from '@angular/core';
import { HttpClient, HttpParams,HttpHeaders } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class AuctionService {
  url;
  constructor(private httpclient: HttpClient) { }

  addToWishList(value) : any {
    this.httpclient.post("http://172.23.238.180:8081/api/v1/savewishlist",value).subscribe();
    console.log(value);
   }
   getWishList() : any {
  return  this.httpclient.get("http://172.23.238.180:8081/api/v1/myproducts");
    // console.log(value);
   }
 delete(product) :any
 {
  return this.httpclient.post("http://172.23.238.180:8081/api/v1/removefav",product).subscribe();
  //console.log(product);
 }

 getSearch(val:String)
 {
   this.url = "http://172.23.238.165:8080/api/v1/productname/"+val ;
   return this.httpclient.get(this.url);
 }

 getRecommendList()
 { 
   var url='http://172.23.238.180:8081/api/v1/userrcm'
  return this.httpclient.get(url);
 }
 
}
