import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RecherchePraticienComponent } from './recherche-praticien/recherche-praticien.component';
import { PraticienComponent } from './praticien/praticien.component';
import { FicheNomPraticienComponent } from './fiche-nom-praticien/fiche-nom-praticien.component';
import { PrendreRdvComponent } from './prendre-rdv/prendre-rdv.component';
import { ConfirmationComponent } from './confirmation/confirmation.component';
import { SeConnecterComponent } from './se-connecter/se-connecter.component';
import { EspacePatientComponent } from './espace-patient/espace-patient.component';
import { MesDonneesPersonnellesComponent } from './mes-donnees-personnelles/mes-donnees-personnelles.component';
import { MesRdvPassesComponent } from './mes-rdv-passes/mes-rdv-passes.component';
import { MesRdvFutursComponent } from './mes-rdv-futurs/mes-rdv-futurs.component';
import { EspaceProfessionnelComponent } from './espace-professionnel/espace-professionnel.component';
import { DrNomPrenomComponent } from './dr-nom-prenom/dr-nom-prenom.component';
import { InformationsComponent } from './informations/informations.component';
import { LieuxEtCreneauComponent } from './lieux-et-creneau/lieux-et-creneau.component';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { PlanningComponent } from './planning/planning.component';
import {RouterModule} from "@angular/router";
import { RechercheParNomOuSpecialiteComponent } from './recherche-par-nom-ou-specialite/recherche-par-nom-ou-specialite.component';
import { RechercheParVilleComponent } from './recherche-par-ville/recherche-par-ville.component';
import { RechercheMultiCriteresComponent } from './recherche-multi-criteres/recherche-multi-criteres.component';

@NgModule({
  declarations: [
    AppComponent,
    RecherchePraticienComponent,
    PraticienComponent,
    FicheNomPraticienComponent,
    PrendreRdvComponent,
    ConfirmationComponent,
    SeConnecterComponent,
    EspacePatientComponent,
    MesDonneesPersonnellesComponent,
    MesRdvPassesComponent,
    MesRdvFutursComponent,
    EspaceProfessionnelComponent,
    DrNomPrenomComponent,
    InformationsComponent,
    LieuxEtCreneauComponent,
    PlanningComponent,
    RechercheParNomOuSpecialiteComponent,
    RechercheParVilleComponent,
    RechercheMultiCriteresComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    FormsModule,
    RouterModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
