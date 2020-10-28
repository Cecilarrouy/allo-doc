import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MesDonneesPersonnellesComponent } from './mes-donnees-personnelles.component';

describe('MesDonneesPersonnellesComponent', () => {
  let component: MesDonneesPersonnellesComponent;
  let fixture: ComponentFixture<MesDonneesPersonnellesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MesDonneesPersonnellesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MesDonneesPersonnellesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
