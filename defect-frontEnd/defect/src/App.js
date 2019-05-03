import React from 'react';
import './App.css';
import Header from "./components/Header/Header-nav"
import Bottom from "./components/Test/Bottom-nav"
import ProjectIndex from './components/Project/ProjectIndex';



function App() {
  return (
    <div className="App">
      {/* <Header /> */}
      <ProjectIndex />
      {/* <Bottom /> */}
    </div>
  );
}

export default App;
