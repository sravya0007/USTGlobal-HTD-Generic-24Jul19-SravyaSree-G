import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-directives',
  templateUrl: './directives.component.html',
  styleUrls: ['./directives.component.css']
})
export class DirectivesComponent implements OnInit {

condition = false;
  users=[
    {
        id: 123,
        name: 'sravya',
        city: 'madanapalle'
    },
    {
        id: 123,
        name: 'sravya',
        city: 'madanapalle'
    },
    {
        id: 123,
        name: 'sravya',
        city: 'madanapalle'
    },
    {
        id: 123,
        name: 'sravya',
        city: 'madanapalle'
    },
    {
        id: 123,
        name: 'sravya',
        city: 'madanapalle'
    }];
     constructor() { }
     removeUser(user){
       let index=this.users.indexOf(user);
       this.users.splice(index,1);
       this.condition=true;
     }

  ngOnInit() {
  }

}
