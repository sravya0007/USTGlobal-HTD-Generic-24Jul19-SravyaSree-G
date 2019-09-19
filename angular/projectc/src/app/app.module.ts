import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';
import { RouterModule } from '@angular/router';
import { FormsModule} from '@angular/forms';
import { HeaderComponent } from './header/header.component';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { ProductComponent } from './product/product.component';
import {ProductdetailsComponent} from './productdetails/productdetails.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    ProductComponent,
    ProductdetailsComponent,
    
    
  ],
  imports: [
    BrowserModule,
    HttpClientModule,


    RouterModule.forRoot([
      { path:'',component:HomeComponent},
      { path: 'header',component:HeaderComponent },
      { path: 'product',component:ProductComponent },
      { path: 'productdetails',component:ProductdetailsComponent },
    
  ]),
  FormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
