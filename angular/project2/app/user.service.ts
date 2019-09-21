import { Injectable } from '@angular/core';
@Injectable({
    providedIn: "root"
})
export class Userservice{
    users = [
        {
            name: 'bhavana',
            company: 'Ust Global'
        },
        {
            name: 'jithin',
            company: 'tcs'
        }
    ]
}