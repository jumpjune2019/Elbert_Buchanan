// This will be my JavaScript
$.ready(function() {
	// $.get('title').innerHTML = $.string.format("Quiz Game {0}", $.getVersion());
});
function allowDrop(ev) {
    ev.preventDefault();
  }
  
  function drag(ev) {
    ev.dataTransfer.setData("text", ev.target.id);
  }
  
  function drop(ev) {
    ev.preventDefault();
    var data = ev.dataTransfer.getData("text");
    ev.target.appendChild(document.getElementById(data));
  }
  
  var status = "begin";

//----------------------------------------------------------------------------------------------

/* The concept is simple enough. Each element in the HTML file has attributes
that has an id and can be linked to a javascript function, giving it some ability. 
*/

// Start button functionality
// Button Id is "startPause" | "clkStart is the onClick function"
  function clkStart() {
    debugger;
    if(status == "begin") {
        //change text to "Start" button
        document.getElementById("startPause").innerText = "End";
        //make terms draggable 
        // mkDrag(true);

        // set game status
        status = "started";
        
        //load JSON
        //ldJson()
    }

    else if (status == "started"){
      // change text to "Score"
      document.getElementById("startPause").innerText = "Show Score";

      // make undraggable
      //mkDrag(false);

      // status change to "ended"
      status = "ended";
    }

    else if(status == "ended"){
      document.getElementById("startPause").innerText = "Play Again";

      // status change to
      status = "score";
      
    }

    else if(status == "score"){



    }
  }
//-----------------------------------------------------------------------------------------------
// when "start" button is clicked, game will be started and make 
// draggable elements movable 
/*
  function mkDrag(dragOn){
    var defs = document.getElementByTermName("termWidget");
    for(var i = 0; i < defs.length; i++){
      defs[i].setAttribute('draggable', dragOn)
    }
  }
*/  

 /* 
var timer = documet.getElementById("output");
  watch = new Stopwatch(timer);
  watch.start();
*/


/*
I have a list of 5 divs that already has D&D functionality
I need to make said divs be able to load the terms from the JSON file and put them into the divs */

// button also will keep the draggable from  being grabable until the game is started

// Undo function that will be able to undo last action ala ctrl+Z

// Submit that will then show the correct and incorrect answers

// after game is over, ask to play again

// Terms are kept in a JSON and will be linked to the game

//Draggable object will change to green when correct and
//Red when incorrect

//Will revisit the timer part of it

// button that will start the game and keep track of time
//Start the game to make the terms load from the JSON into the divs
// the click event for the "start" button needs to load the data
myJSON([
  {
		"id": "1",
		"term" : "term1",
		"definition" : "definition of term1"
	},
	{
		"id": "2",
		"term" : "term2",
		"definition" : "definition of term2"
	},
	{
		"id": "3",
		"term" : "term3",
		"definition" : "definition of term3"
	},
	{
		"id": "4",
		"term" : "term4",
		"definition" : "definition of term4"
	},
	{
		"id": "5",
		"term" : "term5",
		"definition" : "definition of term5"
	},
	{
		"id": "6",
		"term" : "term6",
		"definition" : "definition of term6"
	},
	{
		"id": "7",
		"term" : "term7",
		"definition" : "definition of term7"
	},
	{
		"id": "8",
		"term" : "term8",
		"definition" : "definition of term8"
	},
	{
		"id": "9",
		"term" : "term9",
		"definition" : "definition of term9"
	},
	{
		"id": "10",
		"term" : "term10",
		"definition" : "definition of term10"
	},
	{
		"id": "11",
		"term" : "term11",
		"definition" : "definition of term11"
	},
	{
		"id": "12",
		"term" : "term12",
		"definition" : "definition of term12"
	},
	{
		"id": "13",
		"term" : "term13",
		"definition" : "definition of term13"
	},
	{
		"id": "14",
		"term" : "term14",
		"definition" : "definition of term14"
	},
	{
		"id": "15",
		"term" : "term15",
		"definition" : "definition of term15"
	},
	{
		"id": "16",
		"term" : "term16",
		"definition" : "definition of term16"
	},
	{
		"id": "17",
		"term" : "term17",
		"definition" : "definition of term17"
	},
	{
		"id": "18",
		"term" : "term18",
		"definition" : "definition of term18"
	},
	{
		"id": "19",
		"term" : "term19",
		"definition" : "definition of term19"
	},
	{
		"id": "20",
		"term" : "term20",
		"definition" : "definition of term20"
	},
	{
		"id": "21",
		"term" : "term21",
		"definition" : "definition of term21"
	},
	{
		"id": "22",
		"term" : "term22",
		"definition" : "definition of term22"
	},
	{
		"id": "23",
		"term" : "term23",
		"definition" : "definition of term23"
	},
	{
		"id": "24",
		"term" : "term24",
		"definition" : "definition of term24"
	},
	{
		"id": "25",
		"term" : "term25",
		"definition" : "definition of term25"
	}
]);
 // needs function to link the terms to the divs 5 at a time randomly
function myJSON(arr){

}






