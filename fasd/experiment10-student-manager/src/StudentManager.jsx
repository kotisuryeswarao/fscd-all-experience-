import React, { useState } from "react";

function StudentManager() {

  const [students, setStudents] = useState([
    { id: 1, name: "Ravi",  course: "CSE" },
    { id: 2, name: "Anita", course: "ECE" },
    { id: 3, name: "Kiran", course: "IT"  },
    { id: 4, name: "Meena", course: "EEE" },
    { id: 5, name: "Rahul", course: "Mechanical" }
  ]);

  const [newStudent, setNewStudent] = useState({ id: "", name: "", course: "" });

  const handleChange = (e) => {
    setNewStudent({ ...newStudent, [e.target.name]: e.target.value });
  };

  const addStudent = () => {
    if (!newStudent.id || !newStudent.name || !newStudent.course) {
      alert("Please fill all fields");
      return;
    }
    setStudents([...students, newStudent]);
    setNewStudent({ id: "", name: "", course: "" });
  };

  const deleteStudent = (id) => {
    setStudents(students.filter((s) => s.id !== id));
  };

  return (
    <div>
      <h2>Student Manager</h2>
      <div>
        <input type="number" name="id"     placeholder="Enter ID"     value={newStudent.id}     onChange={handleChange} />
        <input type="text"   name="name"   placeholder="Enter Name"   value={newStudent.name}   onChange={handleChange} />
        <input type="text"   name="course" placeholder="Enter Course" value={newStudent.course} onChange={handleChange} />
        <button onClick={addStudent}>Add Student</button>
      </div>

      {students.length === 0 ? (
        <p>No students available</p>
      ) : (
        <table border="1">
          <thead>
            <tr><th>ID</th><th>Name</th><th>Course</th><th>Action</th></tr>
          </thead>
          <tbody>
            {students.map((student) => (
              <tr key={student.id}>
                <td>{student.id}</td>
                <td>{student.name}</td>
                <td>{student.course}</td>
                <td><button onClick={() => deleteStudent(student.id)}>Delete</button></td>
              </tr>
            ))}
          </tbody>
        </table>
      )}
    </div>
  );
}

export default StudentManager;
