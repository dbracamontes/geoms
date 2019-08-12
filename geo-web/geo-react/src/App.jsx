import React, { Component } from 'react';
import './App.css';
import Header from './components/Header/Header.jsx';
import SearchBar from './components/SearchBar/SearchBar.jsx';

class App extends Component {
  render() {
    return (
      <main className="container">
        <Header />
        <SearchBar/>

      </main>
      /*
      <header className="App-header">
        <SearchBar />

       
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <div className="alert alert-primary" role="alert">
          A simple primary alert—check it out!
</div>
        <div className="alert alert-secondary" role="alert">
          A simple secondary alert—check it out!
</div>
        <div className="alert alert-danger" role="alert">
          A simple danger alert—check it out!
</div>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>

        <div className="card">
          <div className="card-body">Basic card</div>
        </div>


        <State />
      </header>*/

    );
  }
}

export default App;
