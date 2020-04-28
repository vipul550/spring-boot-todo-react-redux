import {
    SET_TODO,
    API_START,
    API_END,
    FETCH_TODO,
    AFTER_TODO
   
  } from "../actions/types";
  
  export default function(state = {}, action) {
    
    switch (action.type) {
      case SET_TODO:
        return { data: action.payload };
      case AFTER_TODO:
        return {data : 'success'}  
      case API_START:
        
        if (action.payload === FETCH_TODO ) {
          return {
            ...state,
            isLoadingData: true
          };
        }
        
        break;
     
      case API_END:
        if (action.payload === FETCH_TODO) {
          return {
            ...state,
            isLoadingData: false
          };
        }
        break;
      default:
        return state;
    }
  }
