import Todo from "./Todo";

function TodoList(props) {

    function mapTodosList() {
        const listItems = props.todos.map((todo, index) => <Todo key={index} todoItem={todo} index={index}
            handleDeleteTodo={(index) => props.handleDeleteTodoApp(index)}
        />)
        return listItems
    }

    return (
        <ul>
            {mapTodosList()}
        </ul>
    )

}
export default TodoList;