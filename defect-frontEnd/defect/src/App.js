import React from 'react';
import './App.css';
import Header from "./components/Header/Header"
import Add from "./components/addDefect"
import AddForm from "./components/Header/AddForm"

function App() {
  return (
    <div className="App">
  <Header />
  <Add />
  <AddForm />
    </div>
  );
}

export default App;
