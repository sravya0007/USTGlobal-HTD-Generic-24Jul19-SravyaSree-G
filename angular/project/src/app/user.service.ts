// decorator ,to create service
import {  Injectable } from '@angular/core';
@Injectable({

    providedIn :"root"
 //with this "UserService will be available for each and every component withoutspecifyitng it"
})
export class UserService{
    users=[
        
        {
            name: 'sravya',
            company: 'ustGlobal'

        },
        {
            name: 'sravya',
            company: 'ustGlobal'
        },
        {

        }
    ]
//how to call a function pesent in a service
printDetails(){
    console.log('the function present in userservice');
}
}