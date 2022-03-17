function numAleatorio(min, max){
   
    for(let i=min; i<max; i++){
        num=Math.floor(Math.random()*max)+1;        
    }
    return num;
}

function adivinaNumero(){
    let numAAdivinar = Math.floor(Math.random()*99)+1;
    let intentos = 10;
    for(let i=0; i<10; i++){ 
        let numUsuario=prompt("Introduce un numero");           
        if(numUsuario != numAAdivinar){
            intentos--;
            alert("Has fallado, te quedan " + intentos + " intentos");

            if(numUsuario < numAAdivinar){
                alert("El numero es mayor");
            }
            if(numUsuario > numAAdivinar){
                alert("El numero es menor");
            }
        }else{
            alert("Has acertado");
            return numAAdivinar;
        }
    }

}

function arrayConElementos(){

}

