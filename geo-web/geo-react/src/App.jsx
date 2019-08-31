import React, { Component } from 'react';
import './App.css';
import Header from './components/Header/Header.jsx';
import SearchBar from './components/SearchBar/SearchBar.jsx';
import SearchResult from './components/SearchResult/SearchResult';

class App extends Component {
  render() {
    return (
      <main className="container">
        <Header />
        <SearchBar />
        <SearchResult />
        <section className="row">
          <div class="col-sm-6 col-md-4">
            <div class="thumbnail">
              <img src="..." alt="..." />
              <div class="caption">
                <h3>Thumbnail label</h3>
                <p>...</p>
                <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
              </div>
            </div>
          </div>
        </section>
      </main>
    );
  }
}

export default App;
