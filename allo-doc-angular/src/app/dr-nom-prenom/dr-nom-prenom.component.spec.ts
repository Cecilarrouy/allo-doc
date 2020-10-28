import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DrNomPrenomComponent } from './dr-nom-prenom.component';

describe('DrNomPrenomComponent', () => {
  let component: DrNomPrenomComponent;
  let fixture: ComponentFixture<DrNomPrenomComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DrNomPrenomComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DrNomPrenomComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
