import { Component, OnInit } from '@angular/core';
import {EmployeeService} from "../employee.service";
import {Router} from "@angular/router";
import {Observable} from "rxjs";
import {Employee} from "../employee";

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  employees: Observable<Employee[]>;

  constructor(private employeeService: EmployeeService,
              private router: Router) {}

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.employees = this.employeeService.getEmployeesList();
  }

  deleteEmployee(id: number) {
    this.employeeService.deleteEmployee(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }


  employeeDetails(id: number){
    this.router.navigate(['details', id]);
  }
  employeeupdate(id: number){
    this.router.navigate(['update', id]);
  }
}
