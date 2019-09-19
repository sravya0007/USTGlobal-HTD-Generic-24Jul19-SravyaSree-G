 import { Directive, ElementRef, HostListener, HostBinding } from '@angular/core';

@Directive({
  selector: '[appMyDirective]'
})
export class MyDirectiveDirective {

  constructor(private  elementRef: ElementRef) {
     //elementRef.nativeElement.style.backgroundColor= 'orange';
    // elementRef.nativeElement.style.color='cyan';
    // elementRef.nativeElement.style.padding= '40px';
   }

@HostBinding ('style.background') background: string;



   @HostListener('mouseenter')
mouseEnter(){
  this.background ='orange';
//console.log('mouse entered');
//alert('mouse entered');
// this.elementRef.nativeElement.style.background= 'cyan';
// this.elementRef.nativeElement.style.color= 'black';
// this.elementRef.nativeElement.style.fontsize= '0px';

}
@HostListener('mouseleave')
mouseLeave(){
  this.background = 'purple';
  // this.elementRef.nativeElement.style.background= 'skyblue';
  // this.elementRef.nativeElement.style.fontsize= '50px';
}
//
}
 