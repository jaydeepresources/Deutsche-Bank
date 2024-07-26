import React, { useState } from 'react'
import './App.css'
import Title from './Title'
import TodoList from './TodoList'
import TodoForm from './TodoForm'

function App() {

  const [todos, setTodos] = useState(['Practise Hooks', 'Complete Labs', 'Install Node'])

  function deleteTodo(index) {
    // copy todos into temp array
    let tempTodos = []
    Object.assign(tempTodos, todos)

    // delete temp index
    tempTodos.splice(index, 1)

    // setTodos will update todos with temp
    setTodos(tempTodos)
  }

  function saveTodo(newTodo) {
    // copy todos into temp array
    let tempTodos = []
    Object.assign(tempTodos, todos)

    // push new element
    tempTodos.push(newTodo)

    // setTodos will update todos with temp
    setTodos(tempTodos)
  }

  return (
    <div className="container">

      <Title title="Todos" />
      <hr />

      <TodoList todos={todos} handleDeleteTodoApp={(index) => deleteTodo(index)} />

      <TodoForm handleSaveTodo={(newTodo) => saveTodo(newTodo)} />

    </div>
  )

}

export default App;