import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { IUser } from '../models/user';
@Injectable({
  providedIn: 'root'
})
export class RegistrationService {
  private _registerUrl = "http://172.23.238.225:8080/api/v1/user";
  private registeredUser:any;
    constructor(private http: HttpClient) { }
      saveUser(user: IUser){
        console.log(IUser);
        return this.http.post<any>(this._registerUrl,user);
    }
}
