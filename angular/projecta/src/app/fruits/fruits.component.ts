import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-fruits',
  templateUrl: './fruits.component.html',
  styleUrls: ['./fruits.component.css']
})
export class FruitsComponent implements OnInit {

  fruitData:any='';
  
  fruits: any= [{
    brand:'omlet',
    img: 'https://cdn.pixabay.com/photo/2018/02/21/22/44/oatmeal-3171723__340.jpg',
    description: ' Food is what people and animals eat to survive. Food usually comes from animals or plants. It is eaten by living things to provide energy and nutrition. Food contains the nutrition that people and animals need to be healthy. The consumption of food is enjoyable to humans. It contains protein, fat, carbohydrates, vitamins, water and minerals. Liquids used for energy and nutrition are often called "drinks". If someone cannot afford food they go hungry. '

  },
  {
    brand:'soup',
    img: 'https://cdn.pixabay.com/photo/2015/10/26/07/21/soup-1006694__340.jpg',
    description: ' Food is what people and animals eat to survive. Food usually comes from animals or plants. It is eaten by living things to provide energy and nutrition. Food contains the nutrition that people and animals need to be healthy. The consumption of food is enjoyable to humans. It contains protein, fat, carbohydrates, vitamins, water and minerals. Liquids used for energy and nutrition are often called "drinks". If someone cannot afford food they go hungry.   '

  },
  {
    brand:'oats',
    img: 'https://cdn.pixabay.com/photo/2018/02/21/22/44/oatmeal-3171723__340.jpg',
    description: ' Food is what people and animals eat to survive. Food usually comes from animals or plants. It is eaten by living things to provide energy and nutrition. Food contains the nutrition that people and animals need to be healthy. The consumption of food is enjoyable to humans. It contains protein, fat, carbohydrates, vitamins, water and minerals. Liquids used for energy and nutrition are often called "drinks". If someone cannot afford food they go hungry.   '

  },
  {
    brand:'momos',
    img: 'https://cdn.pixabay.com/photo/2018/12/15/23/59/korean-food-3877788__340.jpg',
    description: ' Food is what people and animals eat to survive. Food usually comes from animals or plants. It is eaten by living things to provide energy and nutrition. Food contains the nutrition that people and animals need to be healthy. The consumption of food is enjoyable to humans. It contains protein, fat, carbohydrates, vitamins, water and minerals. Liquids used for energy and nutrition are often called "drinks". If someone cannot afford food they go hungry.   '

  },
  {
    brand:'salad',
    img: 'https://image.shutterstock.com/image-photo/avocado-quinoa-roasted-sweet-potato-260nw-753380965.jpg',
    description: ' Food is what people and animals eat to survive. Food usually comes from animals or plants. It is eaten by living things to provide energy and nutrition. Food contains the nutrition that people and animals need to be healthy. The consumption of food is enjoyable to humans. It contains protein, fat, carbohydrates, vitamins, water and minerals. Liquids used for energy and nutrition are often called "drinks". If someone cannot afford food they go hungry.   '

  },
  {
    brand:'half-boiled',
    img: 'https://cdn.pixabay.com/photo/2012/02/29/12/14/fried-18967_960_720.jpg',
    description: ' Food is what people and animals eat to survive. Food usually comes from animals or plants. It is eaten by living things to provide energy and nutrition. Food contains the nutrition that people and animals need to be healthy. The consumption of food is enjoyable to humans. It contains protein, fat, carbohydrates, vitamins, water and minerals. Liquids used for energy and nutrition are often called "drinks". If someone cannot afford food they go hungry.   '

  },
  {
    brand:'brownie',
    img: 'https://cdn.pixabay.com/photo/2017/03/19/18/22/italian-food-2157246__340.jpg',
    description: ' Food is what people and animals eat to survive. Food usually comes from animals or plants. It is eaten by living things to provide energy and nutrition. Food contains the nutrition that people and animals need to be healthy. The consumption of food is enjoyable to humans. It contains protein, fat, carbohydrates, vitamins, water and minerals. Liquids used for energy and nutrition are often called "drinks". If someone cannot afford food they go hungry.   '

  },
  {
    brand:'desert',
    img: 'https://cdn.pixabay.com/photo/2018/07/31/09/30/antioxidant-3574601__340.jpg',
    description: ' Food is what people and animals eat to survive. Food usually comes from animals or plants. It is eaten by living things to provide energy and nutrition. Food contains the nutrition that people and animals need to be healthy. The consumption of food is enjoyable to humans. It contains protein, fat, carbohydrates, vitamins, water and minerals. Liquids used for energy and nutrition are often called "drinks". If someone cannot afford food they go hungry.   '

  },
  {
    brand:'poha',
    img: 'https://cdn.pixabay.com/photo/2016/10/14/14/29/rice-dish-1740298__340.jpg',
    description: ' Food is what people and animals eat to survive. Food usually comes from animals or plants. It is eaten by living things to provide energy and nutrition. Food contains the nutrition that people and animals need to be healthy. The consumption of food is enjoyable to humans. It contains protein, fat, carbohydrates, vitamins, water and minerals. Liquids used for energy and nutrition are often called "drinks". If someone cannot afford food they go hungry.  '

  }
  
  
  ];
  

  constructor() { 
    }
    sendFruit(fruit){
      this.fruitData=fruit;

    }
  

  ngOnInit() {
  }   

}
