import { Component, OnInit } from '@angular/core';
import { EmailValidator, NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  constructor() { }
u=[];
  printForm(loginForm : NgForm) {
    console.log(loginForm.value);
    this.u.push(loginForm.value);
    return  this.u;
  }

  ngOnInit() {
  }

}
