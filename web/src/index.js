import './index.css';
import 'pixi.js';
// eslint-disable-next-line import/no-webpack-loader-syntax
import * as engine from 'exports-loader?main!../../target/generated/js/teavm/classes';

engine();