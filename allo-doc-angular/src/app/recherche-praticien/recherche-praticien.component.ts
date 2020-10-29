import { Component, OnInit } from '@angular/core';
import {Praticien} from "../model/praticien";

@Component({
  selector: 'app-recherche-praticien',
  templateUrl: './recherche-praticien.component.html',
  styleUrls: ['./recherche-praticien.component.scss']
})
export class RecherchePraticienComponent implements OnInit {
  praticienForm: Praticien;

  constructor() { }

  ngOnInit(): void {
  }

}
