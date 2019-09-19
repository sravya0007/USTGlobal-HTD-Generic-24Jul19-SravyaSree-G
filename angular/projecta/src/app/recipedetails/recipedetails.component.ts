import { Component, OnInit,Input } from '@angular/core';

@Component({
  selector: 'app-recipedetails',
  templateUrl: './recipedetails.component.html',
  styleUrls: ['./recipedetails.component.css']
})
export class RecipedetailsComponent implements OnInit {

  @Input() recipeDetails:any='';
  constructor() { }

  ngOnInit() {
  }

}
