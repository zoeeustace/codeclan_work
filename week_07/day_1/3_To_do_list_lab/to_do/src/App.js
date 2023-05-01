import React, {useState} from 'react';
import './App.css';

function App() {

  const [todos, setTodos] = useState([
    {name: "Meal Prep", priority: "high"},
    {name: "Laundry", priority: "high"},
    {name: "Clean Wardrobe", priority: "low"}
  ])

  const [newTodo, setNewTodo] = useState("")

  const todoNodes = todos.map((todo, index) => {
    return(<li key={index} className={todo.priority? "high-priority" : "low-priority"}>
      <span>{todo.name}</span></li>)
  }) 

  const handleTodoInput = (event) => {
    setNewTodo(event.target.value)
  }

  const onOptionChange = () => {
  }

  // const handleTodoInput = (event) => {
  //   const copyItem = [...newTodo]
  //   copyItem.name = event.target.value
  //   setNewTodo(copyItem)
  // }

  // const onOptionChange = (event) => {
  //   const copyItem = [...newTodo]
  //   copyItem.priority = event.target.value
  //   setNewTodo(copyItem)

  const saveNewTodo = (event) => {
    event.preventDefault()
    const copyTodos = [...todos]
    copyTodos.push({name: newTodo, priority: "low"})
    setTodos(copyTodos)
    setNewTodo("")
  }

  return (
    <div className="App">
      <h1>ToDo's</h1>

      <form onSubmit={saveNewTodo}>
        <input id="new-todo" type="text" value={newTodo} onChange={handleTodoInput}/>
        <label htmlFor="high-priority">High</label>
        <input id="high-priority" type="radio" name="priority" onChange={onOptionChange} value="high"/>
        <label htmlFor="low-priority">Low</label>
        <input id="low-priority" type="radio" name="priority" onChange={onOptionChange} value="low" checked/>
        <input type="submit" value="Save Item"/>
      </form>

      <ul>
        {todoNodes}
      </ul>

    </div>
  );
}

export default App;
