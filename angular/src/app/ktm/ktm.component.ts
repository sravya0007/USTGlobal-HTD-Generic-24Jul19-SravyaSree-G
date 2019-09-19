import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ktm',
  templateUrl: './ktm.component.html',
  styleUrls: ['./ktm.component.css']
})
export class KtmComponent implements OnInit {
bikeData:any='';
  
  bikes: any= [{
    brand:'hllo',
    img: 'https://cdn.pixabay.com/photo/2014/09/07/22/33/motorbike-438464__340.jpg',
    description: 'DescriptionKTM AG is an Austrian motorcycle and sports car manufacturer owned by KTM Industries AG and Indian manufacturer Bajaj Auto. It was formed in 1992 but traces its foundation to as early as 1934. Today, KTM AG is the parent company of the KTM Group. KTM is known for its off-road motorcycles'

  },
  {
    brand:'bike',
    img: 'https://cdn.pixabay.com/photo/2014/07/05/16/44/biker-384921__340.jpg',
    description: 'DescriptionKTM AG is an Austrian motorcycle and sports car manufacturer owned by KTM Industries AG and Indian manufacturer Bajaj Auto. It was formed in 1992 but traces its foundation to as early as 1934. Today, KTM AG is the parent company of the KTM Group. KTM is known for its off-road motorcycles'

  },
  {
    brand:'watermelon bike',
    img: 'https://cdn.pixabay.com/photo/2016/11/19/12/15/bicycle-1838972_960_720.jpg',
    description: 'DescriptionKTM AG is an Austrian motorcycle and sports car manufacturer owned by KTM Industries AG and Indian manufacturer Bajaj Auto. It was formed in 1992 but traces its foundation to as early as 1934. Today, KTM AG is the parent company of the KTM Group. KTM is known for its off-road motorcycles'

  },
  {
    brand:'hllo',
    img: 'https://cdn.pixabay.com/photo/2016/11/18/21/30/bike-1836962__340.jpg',
    description: 'DescriptionKTM AG is an Austrian motorcycle and sports car manufacturer owned by KTM Industries AG and Indian manufacturer Bajaj Auto. It was formed in 1992 but traces its foundation to as early as 1934. Today, KTM AG is the parent company of the KTM Group. KTM is known for its off-road motorcycles'

  },
  {
    brand:'bike',
    img: 'https://cdn.pixabay.com/photo/2015/08/27/09/06/bike-909690__340.jpg',
    description: 'DescriptionKTM AG is an Austrian motorcycle and sports car manufacturer owned by KTM Industries AG and Indian manufacturer Bajaj Auto. It was formed in 1992 but traces its foundation to as early as 1934. Today, KTM AG is the parent company of the KTM Group. KTM is known for its off-road motorcycles'

  },
  {
    brand:'watermelon bike',
    img: 'https://cdn.pixabay.com/photo/2013/11/12/16/36/dirt-bike-209489__340.jpg',
    description: 'DescriptionKTM AG is an Austrian motorcycle and sports car manufacturer owned by KTM Industries AG and Indian manufacturer Bajaj Auto. It was formed in 1992 but traces its foundation to as early as 1934. Today, KTM AG is the parent company of the KTM Group. KTM is known for its off-road motorcycles'

  },
  {
    brand:'hllo',
    img: 'https://cdn.pixabay.com/photo/2016/01/19/16/46/motorcycle-1149389__340.jpg',
    description: 'DescriptionKTM AG is an Austrian motorcycle and sports car manufacturer owned by KTM Industries AG and Indian manufacturer Bajaj Auto. It was formed in 1992 but traces its foundation to as early as 1934. Today, KTM AG is the parent company of the KTM Group. KTM is known for its off-road motorcycles'

  },
  {
    brand:'bike',
    img: 'https://cdn.pixabay.com/photo/2015/05/15/14/38/couple-768607__340.jpg',
    description: 'DescriptionKTM AG is an Austrian motorcycle and sports car manufacturer owned by KTM Industries AG and Indian manufacturer Bajaj Auto. It was formed in 1992 but traces its foundation to as early as 1934. Today, KTM AG is the parent company of the KTM Group. KTM is known for its off-road motorcycles'

  },
  {
    brand:'watermelon bike',
    img: 'https://cdn.pixabay.com/photo/2015/07/02/10/13/dirt-bike-828644__340.jpg',
    description: 'DescriptionKTM AG is an Austrian motorcycle and sports car manufacturer owned by KTM Industries AG and Indian manufacturer Bajaj Auto. It was formed in 1992 but traces its foundation to as early as 1934. Today, KTM AG is the parent company of the KTM Group. KTM is known for its off-road motorcycles'

  }
  
  
  ];
  

  constructor() { 
    }
    sendBike(bike){
      this.bikeData=bike;

    }
  

  ngOnInit() {
  }   

}
