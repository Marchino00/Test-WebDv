// Ottenere il riferimento agli elementi dei pulsanti e degli elementi del colore casuale
var generaColoreBtns = document.querySelectorAll('.generaColoreBtn'); // NodeList dei pulsanti con classe 'generaColoreBtn'
var coloreCasuali = document.querySelectorAll('.coloreCasuale'); // NodeList degli elementi con classe 'coloreCasuale'

// Assicurarsi che ci siano almeno due elementi nella NodeList
if (coloreCasuali.length >= 2) {
  // Aggiungere l'evento click a ciascun pulsante
  generaColoreBtns.forEach(function(btn) {
    btn.addEventListener('click', function() {
      // Generare il colore casuale
      var colore = generaColoreCasuale();
      
      // Assegnare il colore solo ai primi due elementi del colore casuale
      coloreCasuali[0].style.backgroundColor = colore; // Assegna il colore come sfondo al primo elemento
      coloreCasuali[0].textContent = colore; // Imposta il valore del testo del primo elemento al colore
      coloreCasuali[1].style.backgroundColor = colore; //al secondo elemento
      coloreCasuali[1].textContent = colore; //al secondo elemento
    });
  });
}







function generaColoreCasuale() {
    var colore = '#'; // Variabile per contenere il colore generato
    
    // Generazione casuale delle componenti RGB
    var rosso = generaComponenteCasuale();
    var verde = generaComponenteCasuale();
    var blu = generaComponenteCasuale();
    
    // Conversione delle componenti in esa e costruzione della stringa colore
    colore += convertiComponenteInesa(rosso);
    colore += convertiComponenteInesa(verde);
    colore += convertiComponenteInesa(blu);
    
    return colore; // Restituisce il colore casuale generato
  }
  
  function generaComponenteCasuale() {
    return Math.floor(Math.random() * 256); // Genera un numero casuale compreso tra 0 e 255
  }
  
  function convertiComponenteInesa(componente) {
    var esa = componente.toString(16); // Converte la componente in esa
    return esa.length == 1 ? "0" + esa : esa; // Aggiunge uno zero iniziale se necessario e restituisce la componente in esa
  }
  