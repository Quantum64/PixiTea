import React, { Component } from 'react';
import 'pixi.js';

// eslint-disable-next-line import/no-webpack-loader-syntax
import * as engine from 'exports-loader?main!../../target/generated/js/teavm/classes';

class App extends Component {

  injectPixiContext(element) {
    if (element && element.children.length <= 0) {
      engine();
    }
  }

  render() {
    return (
      <div ref={element => this.injectPixiContext(element)} />
    );
  }
}

export default App;
