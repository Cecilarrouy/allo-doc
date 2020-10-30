import { Component, OnInit } from '@angular/core';
import {Praticien} from '../model/praticien';
import {PraticienService} from '../praticien/praticien.service';
import {ActivatedRoute} from '@angular/router';
import {CommonService} from '../common.service';
import {RecherchePraticienNomSpeService} from './recherche-par-nom-ou-specialite.service';

@Component({
  selector: 'app-recherche-par-nom-ou-specialite',
  templateUrl: './recherche-par-nom-ou-specialite.component.html',
  styleUrls: ['./recherche-par-nom-ou-specialite.component.scss']
})
export class RechercheParNomOuSpecialiteComponent implements OnInit {

  nom: string;
  praticienList: Array<Praticien> = new Array<Praticien>();
  civilites: Array<string> = new Array<string>();


  constructor(private praticienService: PraticienService, private route: ActivatedRoute, private commonService: CommonService, private nomSpeService: RecherchePraticienNomSpeService) {
    this.route.params.subscribe(params => {
      this.nom = params.nom;
      this.nomSpeService.findAllBySpecialiteOuNom(params.nom).subscribe(resp => this.praticienList = resp, error => console.log(error)); });
  }


  ngOnInit(): void {
    this.commonService.findAllCivilites().subscribe(resp => this.civilites = resp, err => console.log(err));
  }

  list(): Array<Praticien> {
    return this.praticienService.findAll();
  }

}
