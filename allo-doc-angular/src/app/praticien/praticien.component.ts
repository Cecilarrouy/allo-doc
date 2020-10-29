import {Component, OnInit} from '@angular/core';
import {Praticien} from "../model/praticien";

import {ActivatedRoute} from "@angular/router";
import {SessionService} from "../session.service";
import {CommonService} from "../common.service";
import {PraticienService} from "./praticien.service";

@Component({
  selector: 'app-praticien',
  templateUrl: './praticien.component.html',
  styleUrls: ['./praticien.component.scss']
})
export class PraticienComponent implements OnInit {
  praticienForm : Praticien;
  praticienList: Array<Praticien> = new Array<Praticien>();
  civilites: Array<String> = new Array<string>();

  constructor(private praticienService: PraticienService, private route: ActivatedRoute, private commonService: CommonService) {
    this.route.params.subscribe(params => {
      if (params.nom != null && params.lieu == null) {
        this.praticienService.findAllByNomOuSpe(params.nom).subscribe(resp => this.praticienList = resp, error => console.log(error))
      }
      else{}
    });

  }



  ngOnInit(): void {
    this.commonService.findAllCivilites().subscribe(resp => this.civilites = resp, err => console.log(err));
  }

  list(): Array<Praticien> {
    return this.praticienService.findAll();
  }


}
