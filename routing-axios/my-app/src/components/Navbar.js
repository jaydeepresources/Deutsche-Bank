import React, { Component } from 'react'

import { NavLink } from "react-router-dom";

class Navbar extends Component {

  // replace a href with NavLink to

  render() {
    return (
      <div className="navbar">
        <NavLink className="link" to="/posts">Posts</NavLink>
        <NavLink className="link" to="/albums">Albums</NavLink>
        <NavLink className="link" to="/todos">Todos</NavLink>
      </div>
    );
  }
}

export default Navbar;