import axios from "axios";
import { useEffect, useState } from "react";

function FakePostList() {
  const [posts, setPosts]           = useState([]);
  const [userFilter, setUserFilter] = useState("");

  const fetchPosts = async () => {
    const res = await axios.get("https://dummyjson.com/posts");
    setPosts(res.data.posts);
  };

  useEffect(() => { fetchPosts(); }, []);

  const filteredPosts = userFilter === ""
    ? posts
    : posts.filter(post => post.userId === Number(userFilter));

  const userIds = [...new Set(posts.map(p => p.userId))].sort((a, b) => a - b);

  return (
    <div className="container">
      <h2>Fake API Posts</h2>

      <div style={{ display: "flex", gap: 12, alignItems: "center", marginBottom: 16 }}>
        <button onClick={fetchPosts}>Refresh</button>
        <label>Filter by User ID:
          <select onChange={e => setUserFilter(e.target.value)} value={userFilter}>
            <option value="">All</option>
            {userIds.map(id => (
              <option key={id} value={id}>User {id}</option>
            ))}
          </select>
        </label>
      </div>

      <ul>
        {filteredPosts.map(post => (
          <li key={post.id}>
            <b>{post.title}</b>
            <p>{post.body}</p>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default FakePostList;
