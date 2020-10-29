export class Utilisateur {
  id: number;
  version: number;
  identifiant: string;
  motDePasse: string;

  constructor(id: number, version: number, identifiant: string, motDePasse: string) {
    this.id = id;
    this.version = version;
    this.identifiant = identifiant;
    this.motDePasse = motDePasse;
  }
}
