import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
  import { HeaderComponent } from './header/header.component';
import { FormsModule} from '@angular/forms';
import { CarbaseComponent } from './carbase/carbase.component';
import { NewsComponent } from './news/news.component';
import { CarsComponent } from './cars/cars.component';
import { Assign1Component } from './assign1/assign1.component';
//import { AssginComponent } from './assgin/assgin.component';
import { Assign2Component } from './assign2/assign2.component';
import { CardelComponent } from './cardel/cardel.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,

    HeaderComponent,
    CarbaseComponent,
    NewsComponent,
    CarsComponent,
  //  AssginComponent,
    Assign1Component,
    Assign2Component,
    CardelComponent 
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,

    RouterModule.forRoot([
      { path:'',component:HomeComponent},
      { path: 'header',component:HeaderComponent },
      { path: 'carbase',component:CarbaseComponent },
      { path: 'cars',component:CarsComponent },
    { path: 'assign2',component:Assign2Component },
      { path: 'assign1',component:Assign1Component },
      { path: 'cardel',component:CardelComponent },

    
    ]),
    FormsModule,
    


  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
