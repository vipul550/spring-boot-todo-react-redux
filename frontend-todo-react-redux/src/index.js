import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';
import './index.css';
import {Provider} from 'react-redux';
import rootReducer from "../src/reducers";
import { createStore ,applyMiddleware} from 'redux';
import apiMiddleware from "../src/middleware/api";


const store = createStore(rootReducer,applyMiddleware(apiMiddleware));

ReactDOM.render(
  <Provider store={store}><App /></Provider>,
  document.getElementById('root')
);






