import * as React from "react";
import axios from 'axios';
interface Props {
}

const SearchResult: React.FC<Props> = (props: Props) => {

  const [states,setStates] = React.useState<any[]>([]);

  React.useEffect(()=>{
    axios.get('http://localhost:8080/geo/cities/1')
      .then(res => {
        setStates(res.data);
        console.log(states);
      });
  },[]);

  const statesElements = () => {
    return states.map(
      state => {
      return (
      <div className="card" id="state">
        <img className="card-img-top" src={state.name} alt={state.name} />
        <div className="card-body">
          <h4 className="card-title">{state.name}</h4>
          <p className="card-text">
            {state.name}
          </p>
        </div>
      </div>)
      });
  };


  return (
    <React.Fragment>
      { statesElements }
    </React.Fragment>
  );
};

export default SearchResult; 