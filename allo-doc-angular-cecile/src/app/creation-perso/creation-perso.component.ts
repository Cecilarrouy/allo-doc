import { Component, OnInit } from '@angular/core';
import {Personne} from '../model/personne';
import {HttpClient} from '@angular/common/http';
import {ActivatedRoute} from '@angular/router';
import {CommonService} from '../common.service';

@Component({
  selector: 'app-creation-perso',
  templateUrl: './creation-perso.component.html',
  styleUrls: ['./creation-perso.component.scss']
})
export class CreationPersoComponent implements OnInit {

  userForm: Personne;
  civilites: Array<String> = new Array<string>();

  constructor(private http: HttpClient, private route: ActivatedRoute, private commonService: CommonService) {}

  ngOnInit(): void {
    this.commonService.findAllCivilites().subscribe(resp => this.civilites = resp, err => console.log(err));
    console.log(this.civilites);
  }

}
