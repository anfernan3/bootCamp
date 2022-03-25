import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CalculadoraComponent } from './calculadora.component';

describe('CalculadoraComponent', () => {
  let component: CalculadoraComponent;
  let fixture: ComponentFixture<CalculadoraComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CalculadoraComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CalculadoraComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
    component.inicializa;
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  describe(' Metodo: inicializa', () => {
    it('inicializa la calculadora', () => {
      component.inicializa();
      expect(component.displayCurrentValue).toBe('0');
    })
  })

  describe('Método: calcula', () => {
		describe('Operadores desconocidos', function () {
			'%&$^a9:'.split('').forEach(operador => {
				it(`Operador ${operador} desconocido`, () => {
					component.calcula(operador, operador)
					expect(component.displayCurrentValue).toBe('0')
				})
			});
		});

		describe('Calcula sumas', function () {
			[[22222, 22222, 44444], [-1, 2, 1], [2, -1, 1], [0, 0, 0],
			[0.1, 0.2, 0.3], [9.9, 1.3, 11.2]].forEach(caso => {
				it(`Suma: ${caso[0]} + ${caso[1]} = ${caso[2]}`, function () {
					component.calcula(caso[0] ,'+')
					expect(component.displayCurrentValue).toBe(caso[2].toString())
				})
			});
		});

});
