import axios from 'axios'
import { useState, useEffect } from 'react'

function Posts() {

  useEffect(() => {
    getPosts()
  }, [])

  const [posts, setPosts] = useState([])

  function getPosts() {
    axios.get('https://jsonplaceholder.typicode.com/posts')
      .then(response => setPosts(response.data))
  }

  function mapPostsToDiv() {
    const divStr = posts.map((post, index) =>
      <div className="card" key={index}>
        <p>Title: {post.title}</p>
        <p>Body: {post.body}</p>
      </div>
    )

    return divStr
  }

  return (
    <div className="container">
      <h1>Posts</h1>
      <hr />

      {mapPostsToDiv()}

    </div>
  )
}

export default Posts;