import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {FicheNomPraticienService} from "./fiche-nom-praticien.service";
import {Praticien} from "../model/praticien";
import {HttpClient} from "@angular/common/http";
import {LieuDeConsultation} from "../model/lieuDeConsultation";
import {RendezVous} from "../model/rendezVous";
import {MotifsConsultations} from "../model/motifsConsultations";

@Component({
  selector: 'app-fiche-nom-praticien',
  templateUrl: './fiche-nom-praticien.component.html',
  styleUrls: ['./fiche-nom-praticien.component.scss']
})
export class FicheNomPraticienComponent implements OnInit {

  praticien : Praticien;
  listLieuDeConsultation: Array<LieuDeConsultation> = new Array<LieuDeConsultation>();
  lieuDeConsultation: LieuDeConsultation;
  motif : MotifsConsultations;
  listMotifDeConsultation : Array<MotifsConsultations> = new Array<MotifsConsultations>();

  constructor(private FicheNomPraticienService: FicheNomPraticienService, private route: ActivatedRoute, private http: HttpClient) {

    this.route.params.subscribe(parameters => {
      this.FicheNomPraticienService.findById(parameters.id).subscribe(resp => {
        this.praticien = resp;
        console.log(resp);
      }, error => console.log(error));
      this.FicheNomPraticienService.findLieuDeConsultations(parameters.id).subscribe(resp => {
        this.listLieuDeConsultation = resp;
      }, error => console.log(error));
      this.FicheNomPraticienService.findMotifDeConsultations(parameters.id).subscribe(resp => {
        this.listMotifDeConsultation = resp;
      }, error => console.log(error));


    })
  }

  ngOnInit(): void {
  }

  /*save() {
    if (!this.stagiaireForm.id) {
      this.stagiaireService.create(this.stagiaireForm).subscribe(resp => {
          this.stagiaireForm = null;
          this.stagiaireService.load();
        },
        error => console.log(error)
      )
      ;
    } else {
      this.stagiaireService.modify(this.stagiaireForm).subscribe(resp => {
        this.stagiaireForm = null;
        this.stagiaireService.load();
      }, error => console.log(error));
    }
  }*/

}
