import React, {useEffect, useState} from 'react';
import './App.css';
import axios from "axios";

type Info = {
    id: string,
    name: string
}


function App() {
  const [info, setInfo] = useState<Info[]>([])

  useEffect(() => {
    loadInfo()
  }, [])

  const loadInfo = () => {
    axios.get("/api/info")
        .then(response => setInfo(response.data))
        .catch(reason => console.log(reason))
  }

  const saveInfo = () => {
      axios.post("api/info")
          .then(r => console.log(r.data))
          .catch(reason => console.log(reason))
  }

  return (
    <div className="App">
      {
          info.map(d => <p key={d.id}> {d.id} : {d.name} </p>)
      }
      <br/>
      <button onClick={saveInfo}>
          ADD new info
      </button>
    </div>
  );
}

export default App;
