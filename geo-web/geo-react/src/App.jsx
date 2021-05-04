import React, { Component } from 'react';
import './App.css';
import Header from './components/Header/Header.jsx';
import SearchBar from './components/SearchBar/SearchBar.jsx';
import SearchResult from './components/SearchResult/SearchResult';
import 'typeface-roboto';

class App extends Component {
  render() {
    return (
      <main className="container">
        <Header />
        <SearchBar />
        <SearchResult />
      </main>
    );
  }
}

export default App;
