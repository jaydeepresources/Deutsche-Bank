import React, { useState } from 'react'
import './App.css'

function App() {

  const [todos, setTodos] = useState(['Practise Hooks', 'Complete Labs', 'Install Node'])

  var newTodo

  function deleteTodo(index) {
    // copy todos into temp array
    let tempTodos = []
    Object.assign(tempTodos, todos)

    // delete temp index
    tempTodos.splice(index, 1)

    // setTodos will update todos with temp
    setTodos(tempTodos)
  }

  function saveTodo() {

    // copy todos into temp array
    let tempTodos = []
    Object.assign(tempTodos, todos)

    // push new element
    tempTodos.push(newTodo.value)

    // setTodos will update todos with temp
    setTodos(tempTodos)

    // clear the textfield
    newTodo.value = ''
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

      <div>
        <input type="text" placeholder="enter new todo" ref={(data) => newTodo = data} />
        <button onClick={() => saveTodo()}>save</button>
      </div>

    </div>


  )

}

export default App;