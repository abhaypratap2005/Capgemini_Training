import { useState , useEffect} from 'react'
import './App.css'
import axios from 'axios'
import image from "./assets/image.png";

function App() {
     const[students , setStudents] = useState([])
    const[name, setName] = useState("")
    const[course , setCourse] = useState("")
    const [editId, setEditId] = useState(null)

  const api = "http://localhost:5353/students"

  useEffect(()=>{
    fetchStudent()
  }, [])

  const fetchStudent = async()=>{
    const res = await axios.get(api)
    setStudents(res.data) 
  }

  const addStudent = async()=>{
    await axios.post(api, {
     name: name, 
     course : course
    })
    fetchStudent()
    setCourse("");
    setName("");

  }

  const updateStudent = async(id)=>{
       await axios.put(`${api}/${editId}`, {   //ye yaha smaajhna h
      name: name,
      course: course
  })
  fetchStudent()
  setEditId(null);
   setCourse("");
    setName("");
}

  const deleteStudent = async(id)=>{
    await axios.delete(`${api}/${id}`)
     fetchStudent()
  }

  const startEdit = (student) => {
  setEditId(student.id);
  setName(student.name)
  setCourse(student.course)
}

  return (

    <>
     <div className="con" >
    
      <div style={{padding:"20px"}}>

      <h2>Add Student</h2>

      <input
        placeholder="Name"
        value={name}
        onChange={(e)=>setName(e.target.value)}
      />

      <input
        placeholder="Course"
        value={course}
        onChange={(e)=>setCourse(e.target.value)}
      />

     < button onClick={editId ? updateStudent : addStudent}>
  {editId ? "Update Student" : "Add Student"}
</button>

      <h2>Students List</h2>

     

      {students.map((s)=>(
  <div key={s.id}>
    <p>{s.name} - {s.course}</p>

    <button onClick={()=>deleteStudent(s.id)}>
      Delete
    </button>

    <button onClick={()=>startEdit(s)}>
      Edit
    </button>

  </div>
))}

    </div>
    </div>
  </>
  )
}

export default App
