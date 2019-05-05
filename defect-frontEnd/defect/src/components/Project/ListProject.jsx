import React, { Component } from 'react'
import ListProject from "mui-datatables"

const columns = ["Name", "Company", "City", "State"];

const data = [
 ["Joe James", "Test Corp", "Yonkers", "NY"],
 ["John Walsh", "Test Corp", "Hartford", "CT"],
 ["Bob Herm", "Test Corp", "Tampa", "FL"],
 ["James Houston", "Test Corp", "Dallas", "TX"],
];

const options = {
  filterType: 'checkbox',
};

class List extends Component {
  render() {
    return (
      <div>
        <List 
          title={"Project List"} 
          data={data} 
          columns={columns} 
          options={options} 
        />
      </div>
    )
  }
}

export default List
