import React, {Component} from "react";
import {BrowserRouter as Router , Route , Switch} from "react-router-dom";
import ListProject from "./ListProject";


export default class ProjectIndex extends Component {
  render() {
    return (
        <Router>
            <Switch>
                <Route path="/" exact Component={ListProject} />
            </Switch>
        </Router>
    )
  }
}
