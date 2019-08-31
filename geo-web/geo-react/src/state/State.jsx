import React, { Component } from 'react';
import './State.css';
import imagen from './img_avatar1.png';
import PropTypes from 'prop-types';
import axios from 'axios';

class State extends Component {

  constructor(props) {
    super(props);

    this.clickState = this.clickState.bind(this);
  }

  clickState() {
    axios.get('http://localhost:8080/geo/cities/1')
      .then(res => {
        /*const persons = res.data;
        this.setState({ persons });*/
        console.log(res);
      })
  }

  render() {
    return (
      <div className="card" id="state">
        <img className="card-img-top" src={imagen} alt="Jalisco" />
        <div className="card-body">
          <h4 className="card-title">Jalisco</h4>
          <p className="card-text">
            Lorem ipsum dolor sit amet, in  tewte afsteaewtaewt teawst aeset ttawetweat eaw tewat wet
                    </p>
          <button onClick={this.clickState} className="card-link btn btn-primary">Card link</button>
        </div>
      </div>
    );
  }

}

export default State;