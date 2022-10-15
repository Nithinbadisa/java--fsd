import { Component, OnInit } from '@angular/core';
import { FormBuilder, ReactiveFormsModule, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { registrationmdoel } from './registration.model';
import { ApiService } from '../shared/api.service';


@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  submitted = true;
  employeeForm!: FormGroup;
  registrationModelObj : registrationmdoel = new registrationmdoel();
  
  fDate:any;
  Country:Country[]=[];
  City:City[]=[];
  
  
  

  constructor(private fb:FormBuilder,private router:Router,private api:ApiService) { }

  ngOnInit(): void 
  {
      this.employeeForm = this.fb.group({
        Name:['',[Validators.required]],
        DOB:['',Validators.required],
        Gender:['',Validators.required],
        PhoneNo:['',Validators.compose([Validators.required,Validators.pattern('[0-9+]*'),Validators.minLength(10)])],
        Address:['',Validators.required],
        EmailId:['',Validators.compose([Validators.required,Validators.pattern('^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$')])],
        Designation:['',Validators.required],
        Salary:['',Validators.compose([Validators.required,Validators.pattern('[0-9+]*')])],
        Country:['',Validators.required],
        City:['',Validators.required],
        Password:['',Validators.compose([Validators.required,Validators.minLength(6)])]
      })
     
  }

  postEmployeeDetails(){
    this.registrationModelObj.Name = this.employeeForm.value.name;
    this.registrationModelObj.DOB = this.employeeForm.value.DOB
    this.registrationModelObj.Gender = this.employeeForm.value.Gender;
    this.registrationModelObj.PhoneNo = this.employeeForm.value.PhoneNo;
    this.registrationModelObj.Address = this.employeeForm.value.Address;
    this.registrationModelObj.EmailId = this.employeeForm.value.EmailId;
    this.registrationModelObj.Designation =this.employeeForm.value.Designation;
    this.registrationModelObj.Salary = this.employeeForm.value.Salary;
    this.registrationModelObj.Country = this.employeeForm.value.Country;
    this.registrationModelObj.City = this.employeeForm.value.City;
    this.registrationModelObj.Password = this.employeeForm.value.Password;

    this.api.postemployee(this.registrationModelObj)
    .subscribe((res: any): void => {
      console.log(res);
      alert("employee added successfully");
    },
      (    err: any)=>{
        alert("employee not added successfully");

    })
      
  
  }
 

  get loadRegistration()
  {
     return this.employeeForm?.controls;
  }

  getCity(event:any)
  {
     this.City = [];
    
  }

  onSubmit()
  {
     this.submitted = true;
     if(this.employeeForm.valid) 
     {
      this.router.navigate(['DashBoard']);
     }
  }

}

interface Country
{
  Id:number;
  name:string;
}

interface City
{
  cityId:number;
  name:string;
}