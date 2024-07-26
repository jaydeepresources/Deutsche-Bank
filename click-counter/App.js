import React, { useState } from 'react'

function App() {

  const [count, setCount] = useState(0)

  return (
    <div>
      <h1>Click Counter</h1>
      <hr />

      <h3>Button was clicked {count} number of times.</h3>
      <button onClick={() => setCount(count + 1)}>click me</button>

    </div>
  )

}

export default App;

// setCount internally updates the count with its new values as provided in the param arg.