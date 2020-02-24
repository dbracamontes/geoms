import React, { Component } from 'react';
import './App.css';
import Header from './components/Header/Header.jsx';
import SearchBar from './components/SearchBar/SearchBar.jsx';
import SearchResult from './components/SearchResult/SearchResult';
import State from './state/State';

class App extends Component {
  render() {
    return (
      <main className="container">
        <Header />
        <SearchBar />
        <SearchResult />
        <State name="nombre"/>
        <section className="row">
          <div className="col-sm-6 col-md-4">
            <div className="thumbnail">
              <img src="..." alt="..." />
              <div className="caption">
                <h3>Thumbnail label</h3>
                <p>...</p>
                <p><a href="#" className="btn btn-primary" role="button">Button</a> <a href="#" className="btn btn-default" role="button">Button</a></p>
              </div>
            </div>
          </div>
        </section>
      </main>
    );
  }
}

export default App;
