import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private router: Router) {}
 

  ngOnInit(): void {
  }

  gotoAdmin() {
    this.router.navigate(['/admin']);
  }

  gotoCitizen() {
    this.router.navigate(['/user']);
    
  }
  gotoRegister(){
    this.router.navigate(['/myaadhar2']);
    
  }
}
