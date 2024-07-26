import React, { useState } from 'react'

function TodoForm(props) {

    const [newTodo, setNewTodo] = useState('')

    function saveTodo(e) {
        e.preventDefault()

        // send data to parent
        props.handleSaveTodo(newTodo)

        // clear the textfield
        setNewTodo('')
    }

    return (
        <>
            <form onSubmit={(e) => saveTodo(e)}>
                <div className="form-container">
                    <input className="inner" type="text" placeholder="enter new todo" value={newTodo} onChange={(e) => setNewTodo(e.target.value)} />
                    <button type="submit">save</button>
                </div>
            </form></>
    )

}
export default TodoForm;