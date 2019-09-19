 import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent} from './home/home.component';
import { HeaderComponent} from './header/header.component';
import { CarbaseComponent} from './carbase/carbase.component';
import { Assign1Component } from './assign1/assign1.component';
import { CarsComponent } from './cars/cars.component';
import { Assign2Component } from './assign2/assign2.component';


const routes: Routes = [
  {
    path: '', component: HomeComponent
  },
  
  {
    path: 'header', component: HeaderComponent,
  },
  {
    path: 'assign2', component: Assign2Component,
  },
  {
    path: 'assign1', component: Assign1Component,
  },
  {
    path: 'cars', component: CarsComponent,
  },

  {
    path: 'carbase', component: CarbaseComponent,
  }



];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
