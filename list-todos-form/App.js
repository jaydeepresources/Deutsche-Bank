import React, { useState } from 'react'
import './App.css'

function App() {

  const [todos, setTodos] = useState(['Practise Hooks', 'Complete Labs', 'Install Node'])

  const [newTodo, setNewTodo] = useState('')


  function deleteTodo(index) {
    // copy todos into temp array
    let tempTodos = []
    Object.assign(tempTodos, todos)

    // delete temp index
    tempTodos.splice(index, 1)

    // setTodos will update todos with temp
    setTodos(tempTodos)
  }

  function saveTodo(e) {

    // stop reloading and mimic a real form submit 
    e.preventDefault()

    // copy todos into temp array
    let tempTodos = []
    Object.assign(tempTodos, todos)

    // push new element
    tempTodos.push(newTodo)

    // setTodos will update todos with temp
    setTodos(tempTodos)

    // clear the textfield
    setNewTodo('')
  }

  function mapTodosList() {
    const listItems = todos.map((todo, index) =>
      <li key={index}>
        {todo}
        <button onClick={() => deleteTodo(index)}>x</button>
      </li>
    )
    return listItems
  }

  return (
    <div className="container">
      <h1>Todos</h1>
      <hr />

      <ul>
        {mapTodosList()}
      </ul>

      <form onSubmit={(e) => saveTodo(e)}>
        <div className="form-container">
          <input className="inner" type="text" placeholder="enter new todo" value={newTodo} onChange={(e) => setNewTodo(e.target.value)} />
          <button type="submit">save</button>
        </div>
      </form>
    </div>
  )

}

export default App;