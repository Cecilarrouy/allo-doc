import {Component, Input, OnInit} from '@angular/core';
import {Praticien} from "../model/praticien";


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


