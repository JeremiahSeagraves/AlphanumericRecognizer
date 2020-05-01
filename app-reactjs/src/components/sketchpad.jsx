import React, { useState, useEffect } from "react";
let Sketchpad = require("responsive-sketchpad");
var pad;

function SketchPadComponent(props) {
  
  const [count, setCount] = useState(0);
  // Similar to componentDidMount and componentDidUpdate:

  const handleClear = () => {
    pad.clear();
  };


  const handleSaveImage = () => {
    console.log(pad.toDataURL('png'));
  };

  const addSaveImage = () => {
    Sketchpad.prototype.toDataURL = function(type)
    {
        return this.canvas.toDataURL(type);
    }
  }
  

  useEffect(() => {
    // create sketchpad
    let el = document.getElementById("sketchpad");
    pad = new Sketchpad(el, {
        line: {
            color: '#f44335',
            size: 5
        }
    });
    addSaveImage()
    pad.setLineColor("#4CAF50");
  });
  return (
    <div>
      <div id="sketchpad"></div>
      <button onClick={handleClear}>Clear</button>
      <button onClick={handleSaveImage}>Save</button>
    </div>
  );
}

SketchPadComponent.propType = {

}

SketchPadComponent.defaultProps = {

}

export default SketchPadComponent;
