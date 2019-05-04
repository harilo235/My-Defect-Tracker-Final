import React from 'react';
import './App.css';
// import Header from "./components/Header/Header-nav"
// import Bottom from "./components/Test/Bottom-nav"
import ProjectIndex from './components/Project/ProjectIndex';
import SideNav from './components/Header/SideDrawer';



function App() {
  return (
    <div className="App">
      {/* <Header />  */}
      <SideNav />
      <br></br>
      <br></br>
      <br></br>
      <ProjectIndex />
      <br></br>
      <br></br>
      {/* <Bottom /> */}
    </div>
  );
}

export default App;
