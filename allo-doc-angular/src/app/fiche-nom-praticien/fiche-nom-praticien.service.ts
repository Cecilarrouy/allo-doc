import { Injectable } from '@angular/core';
import {Praticien} from "../model/praticien";
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {LieuDeConsultation} from "../model/lieuDeConsultation";
import {MotifsConsultations} from "../model/motifsConsultations";

@Injectable({
  providedIn: 'root'
})
export class FicheNomPraticienService {

  constructor(private http: HttpClient) { }

  findById(id: number): Observable<Praticien> {
    return this.http.get<Praticien>("http://localhost:8080/praticien/" + id);
  }

  findLieuDeConsultations(id: number) : Observable<Array<LieuDeConsultation>> {
    return this.http.get<Array<LieuDeConsultation>>("http://localhost:8080/lieu/lieu-de-consultation/par-praticien/" + id);
  }

  findMotifDeConsultations(id: number) : Observable<Array<MotifsConsultations>> {
    return this.http.get<Array<MotifsConsultations>>("http://localhost:8080/motifs/motif-de-consultation/par-praticien/" + id);
  }
}
