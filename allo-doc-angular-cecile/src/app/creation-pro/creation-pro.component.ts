import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {SeConnecterService} from '../se-connecter/se-connecter.service';
import {ActivatedRoute} from '@angular/router';
import {CommonService} from '../common.service';
import {Personne} from '../model/personne';

@Component({
  selector: 'app-creation-pro',
  templateUrl: './creation-pro.component.html',
  styleUrls: ['./creation-pro.component.scss']
})
export class CreationProComponent implements OnInit {

  userForm: Personne;
  civilites: Array<String> = new Array<string>();

  constructor(private http: HttpClient, private route: ActivatedRoute, private commonService: CommonService) {}

  ngOnInit(): void {
    this.commonService.findAllCivilites().subscribe(resp => this.civilites = resp, err => console.log(err));
    console.log(this.civilites);
  }

}
