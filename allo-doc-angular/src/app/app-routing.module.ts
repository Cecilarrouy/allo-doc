import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {ConfirmationComponent} from './confirmation/confirmation.component';
import {DrNomPrenomComponent} from './dr-nom-prenom/dr-nom-prenom.component';
import {EspacePatientComponent} from './espace-patient/espace-patient.component';
import {EspaceProfessionnelComponent} from './espace-professionnel/espace-professionnel.component';
import {InformationsComponent} from "./informations/informations.component";
import {LieuxEtCreneauComponent} from "./lieux-et-creneau/lieux-et-creneau.component";
import {MesDonneesPersonnellesComponent} from "./mes-donnees-personnelles/mes-donnees-personnelles.component";
import {MesRdvFutursComponent} from './mes-rdv-futurs/mes-rdv-futurs.component';
import {MesRdvPassesComponent} from "./mes-rdv-passes/mes-rdv-passes.component";
import {PrendreRdvComponent} from './prendre-rdv/prendre-rdv.component';
import {RecherchePraticienComponent} from "./recherche-praticien/recherche-praticien.component";
import {PraticienComponent} from "./praticien/praticien.component";
import {SeConnecterComponent} from "./se-connecter/se-connecter.component";
import {FicheNomPraticienComponent} from "./fiche-nom-praticien/fiche-nom-praticien.component";
import {PlanningComponent} from './planning/planning.component';
import {RechercheParNomOuSpecialiteComponent} from './recherche-par-nom-ou-specialite/recherche-par-nom-ou-specialite.component';
import {RechercheParVilleComponent} from './recherche-par-ville/recherche-par-ville.component';
import {RechercheMultiCriteresComponent} from './recherche-multi-criteres/recherche-multi-criteres.component';


const routes: Routes = [
  {path: 'confirmation', component: ConfirmationComponent},
  {path: 'dr-nom-prenom', component: DrNomPrenomComponent},
  {path: 'espace-patient', component: EspacePatientComponent},
  {path: 'espace-professionnel', component: EspaceProfessionnelComponent},
  {path: 'fiche-nom-praticien', component: FicheNomPraticienComponent},
  {path: 'informations', component: InformationsComponent},
  {path: 'espace-professionnel/lieux-et-creneau', component: LieuxEtCreneauComponent},
  {path: 'espace-professionnel/mes-donnees-personnelles', component: MesDonneesPersonnellesComponent},
  {path: 'mes-rdv-futurs', component: MesRdvFutursComponent},
  {path: 'mes-rdv-passes', component: MesRdvPassesComponent},
  {path: 'espace-professionnel/planning', component: PlanningComponent},
  {path: 'prendre-rdv', component: PrendreRdvComponent},
  {path: 'accueil', component: RecherchePraticienComponent},
  {path: 'praticien/recherche-par-nom-ou-specialite/:nom', component: RechercheParNomOuSpecialiteComponent},
  {path: 'praticien/recherche-par-ville/:ville', component: RechercheParVilleComponent},
  {path: 'praticien/recherche-multi-criteres/:nom/:ville', component: RechercheMultiCriteresComponent},
  {path: '', redirectTo: 'accueil', pathMatch: 'full'},
  {path: 'praticien', component: PraticienComponent},
  {path: 'se-connecter', component: SeConnecterComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
