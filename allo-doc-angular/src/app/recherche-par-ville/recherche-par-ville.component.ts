import { Component, OnInit } from '@angular/core';
import {Praticien} from '../model/praticien';
import {PraticienService} from '../praticien/praticien.service';
import {ActivatedRoute} from '@angular/router';
import {CommonService} from '../common.service';
import {RechercheParVilleService} from './recherche-par-ville.service';

@Component({
  selector: 'app-recherche-par-ville',
  templateUrl: './recherche-par-ville.component.html',
  styleUrls: ['./recherche-par-ville.component.scss']
})
export class RechercheParVilleComponent implements OnInit {

  praticienList: Array<Praticien> = new Array<Praticien>();
  civilites: Array<string> = new Array<string>();


  constructor(private praticienService: PraticienService, private route: ActivatedRoute, private commonService: CommonService, private villeService: RechercheParVilleService) {
    this.route.params.subscribe(params => {
      this.villeService.findAllByVille(params.ville).subscribe(resp => this.praticienList = resp, error => console.log(error)); });
  }



  ngOnInit(): void {
    this.commonService.findAllCivilites().subscribe(resp => this.civilites = resp, err => console.log(err));
  }

  list(): Array<Praticien> {
    return this.praticienService.findAll();
  }




}
