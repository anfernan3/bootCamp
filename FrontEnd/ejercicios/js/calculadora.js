class Calculadora {

    constructor(pantalla){
        this.pantalla = pantalla;
    }

    imprimir(){
        this.pantalla.textContent += value;
    }

    // OPERACIONES

    sumar(num1, num2) {
        return num1 + num2;
    }

    restar(num1, num2) {
        return num1 - num2;
    }

    multiplicar(num1, num2) {
        return num1 * num2;
    }

    dividir(num1, num2) {
        return num1 / num2;
    }
}
