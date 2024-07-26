import React, { useState } from 'react'
import './App.css'

function App() {

  const [color, setColor] = useState('black')

  return (
    <div>
      <h1>Color Changer</h1>
      <hr />

      <p className={color}>This is a sample text.</p>

      <button onClick={() => setColor('red')}>Red</button>
      <button onClick={() => setColor('green')}>Green</button>
      <button onClick={() => setColor('blue')}>Blue</button>
      <button onClick={() => setColor('black')}>Black</button>

    </div>
  )

}

export default App;