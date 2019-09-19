import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {

  newsData:any='';
  
  news: any= [{
    brand:'omlet',
    img: 'https://cdn.pixabay.com/photo/2017/01/04/21/00/new-years-eve-1953253__340.jpg',
    description: ' Food is what people and animals eat to survive. Food usually comes from animals or plants. It is eaten by living things to provide energy and nutrition. Food contains the nutrition that people and animals need to be healthy. The consumption of food is enjoyable to humans. It contains protein, fat, carbohydrates, vitamins, water and minerals. Liquids used for energy and nutrition are often called "drinks". If someone cannot afford food they go hungry. '

  },
  {
    brand:'soup',
    img: 'https://cdn.pixabay.com/photo/2015/05/15/14/21/architecture-768432__340.jpg',
    description: ' Food is what people and animals eat to survive. Food usually comes from animals or plants. It is eaten by living things to provide energy and nutrition. Food contains the nutrition that people and animals need to be healthy. The consumption of food is enjoyable to humans. It contains protein, fat, carbohydrates, vitamins, water and minerals. Liquids used for energy and nutrition are often called "drinks". If someone cannot afford food they go hungry.   '

  },
  {
    brand:'oats',
    img: 'https://cdn.pixabay.com/photo/2016/03/06/05/03/seascape-1239727__340.jpg',
    description: ' Food is what people and animals eat to survive. Food usually comes from animals or plants. It is eaten by living things to provide energy and nutrition. Food contains the nutrition that people and animals need to be healthy. The consumption of food is enjoyable to humans. It contains protein, fat, carbohydrates, vitamins, water and minerals. Liquids used for energy and nutrition are often called "drinks". If someone cannot afford food they go hungry.   '

  },
  {
    brand:'momos',
    img: 'https://cdn.pixabay.com/photo/2018/03/07/17/15/balloon-3206530__340.jpg',
    description: ' Food is what people and animals eat to survive. Food usually comes from animals or plants. It is eaten by living things to provide energy and nutrition. Food contains the nutrition that people and animals need to be healthy. The consumption of food is enjoyable to humans. It contains protein, fat, carbohydrates, vitamins, water and minerals. Liquids used for energy and nutrition are often called "drinks". If someone cannot afford food they go hungry.   '

  },
  {
    brand:'salad',
    img: 'https://image.shutterstock.com/image-photo/took-this-shot-christchurch-new-260nw-1123095263.jpg',
    description: ' Food is what people and animals eat to survive. Food usually comes from animals or plants. It is eaten by living things to provide energy and nutrition. Food contains the nutrition that people and animals need to be healthy. The consumption of food is enjoyable to humans. It contains protein, fat, carbohydrates, vitamins, water and minerals. Liquids used for energy and nutrition are often called "drinks". If someone cannot afford food they go hungry.   '

  },
  {
    brand:'half-boiled',
    img: 'https://image.shutterstock.com/image-photo/row-beautiful-grape-yard-before-260nw-515048128.jpg',
    description: ' Food is what people and animals eat to survive. Food usually comes from animals or plants. It is eaten by living things to provide energy and nutrition. Food contains the nutrition that people and animals need to be healthy. The consumption of food is enjoyable to humans. It contains protein, fat, carbohydrates, vitamins, water and minerals. Liquids used for energy and nutrition are often called "drinks". If someone cannot afford food they go hungry.   '

  },
  {
    brand:'brownie',
    img: 'https://cdn.pixabay.com/photo/2015/06/19/21/24/the-road-815297__180.jpg',
    description: ' Food is what people and animals eat to survive. Food usually comes from animals or plants. It is eaten by living things to provide energy and nutrition. Food contains the nutrition that people and animals need to be healthy. The consumption of food is enjoyable to humans. It contains protein, fat, carbohydrates, vitamins, water and minerals. Liquids used for energy and nutrition are often called "drinks". If someone cannot afford food they go hungry.   '

  },
  {
    brand:'desert',
    img: 'https://cdn.pixabay.com/photo/2015/03/03/05/56/woodland-656969__180.jpg',
    description: ' Food is what people and animals eat to survive. Food usually comes from animals or plants. It is eaten by living things to provide energy and nutrition. Food contains the nutrition that people and animals need to be healthy. The consumption of food is enjoyable to humans. It contains protein, fat, carbohydrates, vitamins, water and minerals. Liquids used for energy and nutrition are often called "drinks". If someone cannot afford food they go hungry.   '

  },
  {
    brand:'poha',
    img: 'https://cdn.pixabay.com/photo/2015/03/03/05/56/woodland-656969__180.jpg',
    description: ' Food is what people and animals eat to survive. Food usually comes from animals or plants. It is eaten by living things to provide energy and nutrition. Food contains the nutrition that people and animals need to be healthy. The consumption of food is enjoyable to humans. It contains protein, fat, carbohydrates, vitamins, water and minerals. Liquids used for energy and nutrition are often called "drinks". If someone cannot afford food they go hungry.  '

  }
  
  
  ];
  

  constructor() { 
    }
    sendNew(newss){
      this.newsData=newss;

    }
  

  ngOnInit() {
  }   

}
