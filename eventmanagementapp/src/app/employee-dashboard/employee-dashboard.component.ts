import { Component, OnInit } from '@angular/core';
import { FormBuilder,ReactiveFormsModule ,FormsModule, FormGroup } from '@angular/forms';
import { ApiService } from '../api.service';
import { EmployeeModel } from './employee-dashboard.model';

@Component({
  selector: 'app-employee-dashboard',
  templateUrl: './employee-dashboard.component.html',
  styleUrls: ['./employee-dashboard.component.css']
})
export class EmployeeDashboardComponent implements OnInit {

  formValue !: FormGroup;
  employeeModelObj : EmployeeModel = new EmployeeModel();
  employeeData : any;
  showAdd !: boolean;
  showUpdate !: boolean;
  constructor(private formbuiler: FormBuilder, private api : ApiService) { }

  ngOnInit(): void {
    this.formValue = this.formbuiler.group({
      firstName : [''],
      lastName : [''],
      email : [''],
      mobile : [''],
      salary : ['']
    })
    this.getAllEmployee();
  }

  clickAddEmployee()
  {
    this.formValue.reset();
    this.showAdd= true;
    this.showUpdate= false;

  }

  postEmployeeDetails()
  {
    this.employeeModelObj.firstName = this.formValue.value.firstName;
    this.employeeModelObj.lastName = this.formValue.value.lastName;
    this.employeeModelObj.email = this.formValue.value.email;
    this.employeeModelObj.mobile = this.formValue.value.mobile;
    this.employeeModelObj.salary = this.formValue.value.salary;

  
    this.api.postEmployee(this.employeeModelObj)
    .subscribe(res=>{
      console.log(res);
      alert("employee Added")
      let ref = document.getElementById('cancel')
      ref?.click();
      this.formValue.reset();
      this.getAllEmployee();


    },
    err=>{
      alert("Something went wrong")
    })
  }

  getAllEmployee(){
    this.api.getEmployee()
    .subscribe(res=>{
      this.employeeData = res;

    })
  }

  deleteEmployee(temp : any){
    this.api.deleteEmployee(temp.id)
    .subscribe(res=>{
      alert("employee Deleted");
      this.getAllEmployee();
    })
  }

  onEdit(temp : any)
  {
    this.showAdd= false;
    this.showUpdate= true;
    this.employeeModelObj.id = temp.id;
    this.formValue.controls['firstName'].setValue(temp.firstName);
    this.formValue.controls['lastName'].setValue(temp.lastName);
    this.formValue.controls['email'].setValue(temp.email);
    this.formValue.controls['mobile'].setValue(temp.mobile);
    this.formValue.controls['salary'].setValue(temp.salary);
  }

  updateEmployee()
  {
    
    this.employeeModelObj.firstName = this.formValue.value.firstName;
    this.employeeModelObj.lastName = this.formValue.value.lastName;
    this.employeeModelObj.email = this.formValue.value.email;
    this.employeeModelObj.mobile = this.formValue.value.mobile;
    this.employeeModelObj.salary = this.formValue.value.salary;
    
    this.api.updateEmployee(this.employeeModelObj, this.employeeModelObj.id)
    .subscribe(res=>{
      alert("Updated Successfully")
      let ref = document.getElementById('cancel')
      ref?.click();
      this.formValue.reset();
      this.getAllEmployee();

    })
  }
}