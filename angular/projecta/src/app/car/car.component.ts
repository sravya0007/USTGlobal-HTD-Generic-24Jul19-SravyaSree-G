import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-car',
  templateUrl: './car.component.html',
  styleUrls: ['./car.component.css']
})
export class CarComponent implements OnInit {

  carData:any='';
  
  cars: any= [{
    brand:'fiat',
    img: 'https://cdn.pixabay.com/photo/2019/07/07/14/03/fiat-4322521__340.jpg',
    description: 'DescriptionKTM AG is an Austrian motorcycle and sports car manufacturer owned by KTM Industries AG and Indian manufacturer Bajaj Auto. It was formed in 1992 but traces its foundation to as early as 1934. Today, KTM AG is the parent company of the KTM Group. KTM is known for its off-road motorcycles'

  },
  {
    brand:'bike',
    img: 'https://cdn.pixabay.com/photo/2012/05/29/00/43/car-49278__340.jpg',
    description: 'DescriptionKTM AG is an Austrian motorcycle and sports car manufacturer owned by KTM Industries AG and Indian manufacturer Bajaj Auto. It was formed in 1992 but traces its foundation to as early as 1934. Today, KTM AG is the parent company of the KTM Group. KTM is known for its off-road motorcycles'

  },
  {
    brand:'audi',
    img: 'https://cdn.pixabay.com/photo/2013/07/13/11/36/volkswagen-158463__340.png',
    description: 'DescriptionKTM AG is an Austrian motorcycle and sports car manufacturer owned by KTM Industries AG and Indian manufacturer Bajaj Auto. It was formed in 1992 but traces its foundation to as early as 1934. Today, KTM AG is the parent company of the KTM Group. KTM is known for its off-road motorcycles'

  },
  {
    brand:'ferrari',
    img: 'https://cdn.pixabay.com/photo/2015/05/28/23/12/auto-788747__340.jpg',
    description: 'DescriptionKTM AG is an Austrian motorcycle and sports car manufacturer owned by KTM Industries AG and Indian manufacturer Bajaj Auto. It was formed in 1992 but traces its foundation to as early as 1934. Today, KTM AG is the parent company of the KTM Group. KTM is known for its off-road motorcycles'

  },
  {
    brand:'car',
    img: 'https://cdn.pixabay.com/photo/2017/12/28/23/41/car-3046424__340.jpg',
    description: 'DescriptionKTM AG is an Austrian motorcycle and sports car manufacturer owned by KTM Industries AG and Indian manufacturer Bajaj Auto. It was formed in 1992 but traces its foundation to as early as 1934. Today, KTM AG is the parent company of the KTM Group. KTM is known for its off-road motorcycles'

  },
  {
    brand:'ford',
    img: 'https://cdn.pixabay.com/photo/2012/11/02/13/02/ford-63930__340.jpg',
    description: 'DescriptionKTM AG is an Austrian motorcycle and sports car manufacturer owned by KTM Industries AG and Indian manufacturer Bajaj Auto. It was formed in 1992 but traces its foundation to as early as 1934. Today, KTM AG is the parent company of the KTM Group. KTM is known for its off-road motorcycles'

  },
  {
    brand:'bmw',
    img: 'https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408_960_720.jpg',
    description: 'DescriptionKTM AG is an Austrian motorcycle and sports car manufacturer owned by KTM Industries AG and Indian manufacturer Bajaj Auto. It was formed in 1992 but traces its foundation to as early as 1934. Today, KTM AG is the parent company of the KTM Group. KTM is known for its off-road motorcycles'

  },
  {
    brand:'bmw',
    img: 'https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408_960_720.jpg',
    description: 'DescriptionKTM AG is an Austrian motorcycle and sports car manufacturer owned by KTM Industries AG and Indian manufacturer Bajaj Auto. It was formed in 1992 but traces its foundation to as early as 1934. Today, KTM AG is the parent company of the KTM Group. KTM is known for its off-road motorcycles'

  },
  {
    brand:'alto',
    img: 'https://cdn.pixabay.com/photo/2014/10/22/17/22/ford-498244__340.jpg',
    description: 'DescriptionKTM AG is an Austrian motorcycle and sports car manufacturer owned by KTM Industries AG and Indian manufacturer Bajaj Auto. It was formed in 1992 but traces its foundation to as early as 1934. Today, KTM AG is the parent company of the KTM Group. KTM is known for its off-road motorcycles'

  }
  
  
  ];
  

  constructor() { 
    }
    sendCar(car){
      this.carData=car;

    }
  

  ngOnInit() {
  }   

}
