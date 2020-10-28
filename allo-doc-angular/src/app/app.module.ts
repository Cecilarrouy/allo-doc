import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RecherchePraticienComponent } from './recherche-praticien/recherche-praticien.component';
import { ResultatComponent } from './resultat/resultat.component';
import { FicheNomPraticienComponent } from './fiche-nom-praticien/fiche-nom-praticien.component';
import { PrendreRdvComponent } from './prendre-rdv/prendre-rdv.component';
import { ConfirmationComponent } from './confirmation/confirmation.component';
import { SeConnecterComponent } from './se-connecter/se-connecter.component';

@NgModule({
  declarations: [
    AppComponent,
    RecherchePraticienComponent,
    ResultatComponent,
    FicheNomPraticienComponent,
    PrendreRdvComponent,
    ConfirmationComponent,
    SeConnecterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
