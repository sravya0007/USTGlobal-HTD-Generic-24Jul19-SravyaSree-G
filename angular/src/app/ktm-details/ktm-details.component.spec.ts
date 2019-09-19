import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { KtmDetailsComponent } from './ktm-details.component';

describe('KtmDetailsComponent', () => {
  let component: KtmDetailsComponent;
  let fixture: ComponentFixture<KtmDetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ KtmDetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(KtmDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
