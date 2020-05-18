import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowpassbookbydateComponent } from './showpassbookbydate.component';

describe('ShowpassbookbydateComponent', () => {
  let component: ShowpassbookbydateComponent;
  let fixture: ComponentFixture<ShowpassbookbydateComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ShowpassbookbydateComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ShowpassbookbydateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
