import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FicheNomPraticienComponent } from './fiche-nom-praticien.component';

describe('FicheNomPraticienComponent', () => {
  let component: FicheNomPraticienComponent;
  let fixture: ComponentFixture<FicheNomPraticienComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FicheNomPraticienComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FicheNomPraticienComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
