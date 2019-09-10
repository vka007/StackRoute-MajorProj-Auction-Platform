import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RentItemsComponent } from './rent-items.component';

describe('RentItemsComponent', () => {
  let component: RentItemsComponent;
  let fixture: ComponentFixture<RentItemsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RentItemsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RentItemsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
