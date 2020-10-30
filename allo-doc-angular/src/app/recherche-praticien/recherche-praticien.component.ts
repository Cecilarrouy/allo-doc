import {Component, Input, OnInit} from '@angular/core';
import {Praticien} from "../model/praticien";
import {HttpClient} from "@angular/common/http";
import {PraticienService} from "../praticien/praticien.service";
import {RecherchePraticienService} from "./recherche-praticien.service";
import {Router} from "@angular/router";


@Component({
  selector: 'app-recherche-praticien',
  templateUrl: './recherche-praticien.component.html',
  styleUrls: ['./recherche-praticien.component.scss']
})
export class RecherchePraticienComponent implements OnInit {

  nom: string;
  ville: string;
  nomReset : string;
  villeReset: string;
  url: string;
  praticienList: Array<Praticien> = new Array<Praticien>();
  civilites: Array<String> = new Array<string>();

  constructor(private http: HttpClient, private praticienService: PraticienService, private recherchePraticienService: RecherchePraticienService, private router: Router) {
    this.praticienService.findAllByNomOuSpe(this.nom).subscribe(resp => this.praticienList = resp, error => console.log(error))
  }

  ngOnInit(): void {

  }


}


