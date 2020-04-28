import { SET_TODO, API, FETCH_TODO} from "./types";



export function fetchTodos(data) {
  return apiAction({
    url: "http://localhost:8080/todos",
    onSuccess: setTodos,
    method:(data)?"POST":"GET",
    data:(data)?{"name":data,"desc":null}:null,
    OnSuccess: () => setTodos,
    onFailure: () => console.log("Error occured loading Todos"),
    label: FETCH_TODO
  });
}




function setTodos(data) {
  
  return {
    type: SET_TODO,
    payload: data
  };
}


function apiAction({
  url = "",
  method = "GET",
  data = null,
  accessToken = null,
  onSuccess = () => {},
  onFailure = () => {},
  label = "",
  headersOverride = null
}) {
  return {
    type: API,
    payload: {
      url,
      method,
      data,
      accessToken,
      onSuccess,
      onFailure,
      label,
      headersOverride
    }
  };
}