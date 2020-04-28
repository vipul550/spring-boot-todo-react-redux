import React,{Component} from 'react';
import {fetchTodos} from '../actions';
import {connect} from 'react-redux'


class AddTodo extends Component{
    state={
        message:'sample Text'
    }
    handleChange = (event)=> {
        this.setState({message: event.target.value});
    }

render(){
    return(
        <div>
        <div className="add-items d-flex"> 
           <input type="text" className="form-control todo-list-input" placeholder="What do you need to do today?" onChange={this.handleChange} /> 
           <button className="add btn btn-primary font-weight-bold todo-list-add-btn" onClick={()=>this.props.fetchTodos(this.state.message)} >Add</button> 
           </div> 
       
        </div>
       
    )
    
};
}

export default connect(null,{fetchTodos})(AddTodo);