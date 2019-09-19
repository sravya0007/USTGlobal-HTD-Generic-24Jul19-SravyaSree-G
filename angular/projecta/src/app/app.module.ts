import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import{ RouterModule} from '@angular/router';
import { FormsModule} from '@angular/forms';

import { AppComponent } from './app.component';
import { CarComponent } from './car/car.component';
import { RecipeComponent } from './recipe/recipe.component';
import { NewsComponent } from './news/news.component';
import { FruitsComponent } from './fruits/fruits.component';
import { HeaderComponent } from './header/header.component';
import { CardetailsComponent } from './cardetails/cardetails.component';
import { RecipedetailsComponent } from './recipedetails/recipedetails.component';
import { FruitsdetailsComponent } from './fruitsdetails/fruitsdetails.component';
import { NewsdetailsComponent } from './newsdetails/newsdetails.component';
import { from } from 'rxjs';
import { PracComponent } from './prac/prac.component';
import { PracdetailsComponent } from './pracdetails/pracdetails.component';

@NgModule({
  declarations: [
    AppComponent,
    CarComponent,
    RecipeComponent,
    NewsComponent,
    FruitsComponent,
    HeaderComponent,
    CardetailsComponent,
    RecipedetailsComponent,
    FruitsdetailsComponent,
    NewsdetailsComponent,
    PracComponent,
    PracdetailsComponent
  ],
  imports: [
    BrowserModule,FormsModule,
    RouterModule.forRoot([
    {path:'car',component: CarComponent},
    {path:'news',component: NewsComponent},
    {path:'recipe',component: RecipeComponent},
    {path:'fruits',component: FruitsComponent},
    {path: 'header', component: HeaderComponent},
    {path: 'prac', component: PracComponent}
])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
