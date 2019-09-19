import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-prac',
  templateUrl: './prac.component.html',
  styleUrls: ['./prac.component.css']
})
export class PracComponent implements OnInit {
 pracData:any='';
 prac=[
  {
    brand:'omlet',
    img: 'https://cdn.pixabay.com/photo/2017/01/04/21/00/new-years-eve-1953253__340.jpg',
    description: ' Food is what people and animals eat to survive. Food usually comes from animals or plants. It is eaten by living things to provide energy and nutrition. Food contains the nutrition that people and animals need to be healthy. The consumption of food is enjoyable to humans. It contains protein, fat, carbohydrates, vitamins, water and minerals. Liquids used for energy and nutrition are often called "drinks". If someone cannot afford food they go hungry. '

  },{
    brand:'omlet',
    img: 'https://cdn.pixabay.com/photo/2017/01/04/21/00/new-years-eve-1953253__340.jpg',
    description: ' Food is what people and animals eat to survive. Food usually comes from animals or plants. It is eaten by living things to provide energy and nutrition. Food contains the nutrition that people and animals need to be healthy. The consumption of food is enjoyable to humans. It contains protein, fat, carbohydrates, vitamins, water and minerals. Liquids used for energy and nutrition are often called "drinks". If someone cannot afford food they go hungry. '

  },{
    brand:'omlet',
    img: 'https://cdn.pixabay.com/photo/2017/01/04/21/00/new-years-eve-1953253__340.jpg',
    description: ' Food is what people and animals eat to survive. Food usually comes from animals or plants. It is eaten by living things to provide energy and nutrition. Food contains the nutrition that people and animals need to be healthy. The consumption of food is enjoyable to humans. It contains protein, fat, carbohydrates, vitamins, water and minerals. Liquids used for energy and nutrition are often called "drinks". If someone cannot afford food they go hungry. '

  },{
    brand:'omlet',
    img: 'https://cdn.pixabay.com/photo/2017/01/04/21/00/new-years-eve-1953253__340.jpg',
    description: ' Food is what people and animals eat to survive. Food usually comes from animals or plants. It is eaten by living things to provide energy and nutrition. Food contains the nutrition that people and animals need to be healthy. The consumption of food is enjoyable to humans. It contains protein, fat, carbohydrates, vitamins, water and minerals. Liquids used for energy and nutrition are often called "drinks". If someone cannot afford food they go hungry. '

  },{
    brand:'omlet',
    img: 'https://cdn.pixabay.com/photo/2017/01/04/21/00/new-years-eve-1953253__340.jpg',
    description: ' Food is what people and animals eat to survive. Food usually comes from animals or plants. It is eaten by living things to provide energy and nutrition. Food contains the nutrition that people and animals need to be healthy. The consumption of food is enjoyable to humans. It contains protein, fat, carbohydrates, vitamins, water and minerals. Liquids used for energy and nutrition are often called "drinks". If someone cannot afford food they go hungry. '

  },{
    brand:'omlet',
    img: 'https://cdn.pixabay.com/photo/2017/01/04/21/00/new-years-eve-1953253__340.jpg',
    description: ' Food is what people and animals eat to survive. Food usually comes from animals or plants. It is eaten by living things to provide energy and nutrition. Food contains the nutrition that people and animals need to be healthy. The consumption of food is enjoyable to humans. It contains protein, fat, carbohydrates, vitamins, water and minerals. Liquids used for energy and nutrition are often called "drinks". If someone cannot afford food they go hungry. '

  }]

  constructor() { }

  sendData(hi){
    this.prac=hi;

  }

  ngOnInit() {
  }
}
