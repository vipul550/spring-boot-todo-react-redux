import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import AddTodo from './components/addTodo';
import TodoList from './components/TodoList';


class App extends Component {
  render() {
    return (
   <div className="page-content page-container" id="page-content">
    <div className="padding">
        <div className="row container d-flex justify-content-center">
            <div className="col-lg-12">
                <div className="card px-3">
                    <div className="card-body">
                        <h4 className="card-title">Awesome Todo list</h4>
                        <AddTodo></AddTodo>
                        <TodoList></TodoList>
                       
                    </div>
                </div>
            </div>
            </div>
    </div>
    </div>
    
    
    );
  }
}

export default App;
