function Todo(props) {

    return (
        <li>
            {props.todoItem}
            <button onClick={() => props.handleDeleteTodo(props.index)}>x</button>
        </li>
    )

}
export default Todo;