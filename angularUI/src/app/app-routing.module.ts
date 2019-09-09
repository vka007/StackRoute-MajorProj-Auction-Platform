import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { LandingpageComponent } from './landingpage/landingpage.component';
import { HelpdeskComponent } from './helpdesk/helpdesk.component';
import { HomeComponent } from './home/home.component';
import { RecommendationsComponent } from './recommendations/recommendations.component';
import {WishlistComponent} from './wishlist/wishlist.component';
import { SearchComponent } from './search/search.component';
import { ForgotComponent } from './forgot/forgot.component';
import { BiddingpageComponent } from './biddingpage/biddingpage.component';

const routes: Routes = [
  {path:'',pathMatch:'full',redirectTo:'/app-home'},
  {path:'app-home',component:HomeComponent},
  {path: 'login', component : LoginComponent},
  {path: 'registration', component: RegistrationComponent},
  {
    path: 'landing', component: LandingpageComponent
  },
  {
    path: 'helpdesk', component: HelpdeskComponent
  },
  {
    path:'recommendations',
    component: RecommendationsComponent

  },
  {
    path:'favs',
     component: WishlistComponent
  },
  { path: 'search/:value', component: SearchComponent },
  { path: 'forgot', component:ForgotComponent},
  {path:'bidding',component:BiddingpageComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
