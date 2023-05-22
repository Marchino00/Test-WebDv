function moveSquare() {
    var elem = document.getElementById("square");
    var pos = 0;
    var id = setInterval(frame, 0);
    function frame() {
      if (pos == window.innerWidth - 70) {
        clearInterval(id);
      } else {
        pos++;
        elem.style.left = pos + "px";
      }
    }
  }
  document.getElementById("square").addEventListener("click", moveSquare);