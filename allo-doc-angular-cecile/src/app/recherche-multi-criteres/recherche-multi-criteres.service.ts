import {Injectable} from '@angular/core';
import {Praticien} from '../model/praticien';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RechercheMultiCriteresService {

  private praticiens: Array<Praticien> = new Array<Praticien>();

  constructor(private http: HttpClient) {
    this.load();
  }

  load() {
    this.http.get<Array<Praticien>>("http://localhost:8080/praticien").subscribe(resp => {
      this.praticiens = resp;
    }, error => console.log(error))
  }

  findAllBySpecialiteOuNomOuVille(nom, ville): Observable<Array<Praticien>>{
    return this.http.get<Array<Praticien>>('http://localhost:8080/praticien/recherche-multi-criteres/' + nom+ '/' + ville);
  }
}
