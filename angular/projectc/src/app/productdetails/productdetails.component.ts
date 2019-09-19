import { Component, OnInit } from '@angular/core';
import {ProductService} from '../product.service';
import { Router} from '@angular/router';


@Component({
  selector: 'app-productdetails',
  templateUrl: './productdetails.component.html',
  styleUrls: ['./productdetails.component.css']
})
export class ProductdetailsComponent implements OnInit {

  constructor(private product: ProductService, private router: Router) { }
  ngOnInit() {
     this.product.getData();
     console.log(this.product.product);
  
   }
    updateProduct(prod) {
      this.product.selectedProduct = prod;
      this.router.navigateByUrl('/product');
    }
    deleteProduct(prod) {
       this.product.deleteData(prod).subscribe((data) => {
   console.log(data);
     this.product.getData();
   });
    }
  } 
 
