import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RecherchePraticienComponent } from './recherche-praticien.component';

describe('RecherchePraticienComponent', () => {
  let component: RecherchePraticienComponent;
  let fixture: ComponentFixture<RecherchePraticienComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RecherchePraticienComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RecherchePraticienComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
