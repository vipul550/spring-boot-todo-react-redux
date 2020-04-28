import React,{Component} from 'react';
import {fetchTodos} from '../actions'
import {connect} from 'react-redux';


class TodoList extends Component {
    componentDidMount() {
        this.props.fetchTodos();
      }
    render(){
        const Localtodos = Array.from(this.props.data);
        console.log(Localtodos);
       
        return(
        <div className="list-wrapper">
        <ul className="d-flex flex-column-reverse todo-list">
        {Localtodos.map((Obj) => (
        <li>
        <div className="form-check"> <label className="form-check-label"> <input className="checkbox" type="checkbox" /> {Obj.name} </label> </div> <i className="remove mdi mdi-close-circle-outline"></i>
        </li>
        ))
        }
          
          
           
        </ul>
    </div>
        )};

}

const mapStateToProps = ({ data = {}, isLoadingData = false }) => ({
    data,
    isLoadingData
  });
  export default connect(
    mapStateToProps,
    {
      fetchTodos
    }
  )(TodoList);


