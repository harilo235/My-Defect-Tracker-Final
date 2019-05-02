import React from 'react';
import './App.css';
import Header from "./components/Header/Header-nav"
import Bottom from "./components/Bottom/Bottom-nav"
import Cards from "./components/Cards/Cards"

function App() {
  return (
    <div className="App">
      <Header />
      <Cards />
      <Cards />
      <Cards />
      <Bottom />
    </div>
  );
}

export default App;
