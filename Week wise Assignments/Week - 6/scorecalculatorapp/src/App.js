// App.js
import React from 'react';
import './Stylesheets/mystyle.css';
import { CalculateScore } from './Components/CalculateScore';


function App() {
  return (
    <div>
      <CalculateScore
        Name={"Sadiya Tehreen"}
        School={"Sunshine Public School"}
        total={430}
        goal={500}
      />
    </div>
  );
}

export default App;
