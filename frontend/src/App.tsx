import React, {useEffect, useState} from 'react';
import './App.css';
import axios from "axios";

function App() {
  const [info, setInfo] = useState<string>("")

  useEffect(() => {
    loadInfo()
  }, [])

  const loadInfo = () => {
    axios.get("/api/info")
        .then(response => setInfo(response.data))
        .catch(reason => console.log(reason))
  }

  return (
    <div className="App">
      {info}
    </div>
  );
}

export default App;
