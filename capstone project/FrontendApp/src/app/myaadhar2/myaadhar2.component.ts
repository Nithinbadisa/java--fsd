import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { myaadhar } from "./myaadhar";
import { AppService } from './myaadhar.service';



@Component({
  selector: 'app-myaadhar2',
  templateUrl: './myaadhar2.component.html',
  styleUrls: ['./myaadhar2.component.css']
})
export class MyAadhar2Component implements OnInit{
  public records: myaadhar[];
  public editRecord: myaadhar;
  public deleteRecord: myaadhar;

  constructor(private appService: AppService){ }
  ngOnInit(): void {
    this.get();
  }

  public get(): void {
    this.appService.get().subscribe(
      (response: myaadhar[]) => {
        this.records=response;
        console.log(this.records);
      },
        (error: HttpErrorResponse) => {
          alert (error.message);
        }
        );
  }

  public searchCitizen(key: string): void {
    console.log(key);
    const results: myaadhar[] = [];
    for (const record of this.records) {
      if (record.fullname.toLowerCase().indexOf(key.toLowerCase()) !== -1
      || record.email.toLowerCase().indexOf(key.toLowerCase()) !== -1
      || record.dob.toLowerCase().indexOf(key.toLowerCase()) !== -1
      || record.address.toLowerCase().indexOf(key.toLowerCase()) !== -1) {
        results.push(record);
      }
    }
    this.records = results;
    if (results.length === 0 || !key) {
      this.get();
    }
  }

  public getElementById(id: number): void {
    this.appService.findmyaadharById(id).subscribe(
      (response: myaadhar) => {
        console.log(response);
        // this.get();
        
       },
       (error: HttpErrorResponse) => {
         alert(error.message);
         
       }
    )
  }

  public onUpdateCitizen(record: myaadhar): void {
    
    this.appService.update(record).subscribe(
      (response: myaadhar) => {
       console.log(response);
       this.get();
       
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
        
      }
    );
  }

  OnUpdateRequest(){
    alert("Message for Aadhar Update Sent Successfully!");
  }

  OnDeleteRequest(){
    alert("Message for Aadhar delete Sent Successfully!");
  }

  public onOpenModal(record: myaadhar, mode: string): void {
    const container = document.getElementById('main-container');
    const button = document.createElement('button');
    button.type = 'button';
    button.style.display = 'none';
    button.setAttribute('data-toggle', 'modal');
    if (mode === 'add') {
      button.setAttribute('data-target', '#addCitizenModal');
    }
    if (mode === 'edit') {
      this.editRecord = record;
      button.setAttribute('data-target', '#updateCitizenModal');
    }
    if (mode === 'delete') {
      this.deleteRecord=record;
      button.setAttribute('data-target', '#deleteCitizenModal');
    }
    container.appendChild(button);
    button.click();
  }

  public onAddCitizen(addForm: NgForm): void {
    document.getElementById('add-record-form').click();
    this.appService.add(addForm.value).subscribe(
      (response: myaadhar) => {
       console.log(response);
       this.get();
       addForm.reset();
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
        addForm.reset();
      }
    );
  }

  
}