import React, {Component} from "react";
import {BrowserRouter as Router , Route , Switch} from "react-router-dom";
import ListProject from "./ListProject";
import AddProject from "./AddProject";
// import AddModal from "./AddModal";

export default class ProjectIndex extends Component {
  render() {
    return (
        <Router>
            <Switch>
                <Route path="/" exact component={ListProject} />
                <Route path="/add" exact component={AddProject} />
                
            </Switch>
        </Router>
    )
  }
}
