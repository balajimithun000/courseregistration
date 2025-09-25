function  showCourses(){

 fetch("http://localhost:8080/courses")
 .then((response) => response.json ())
 .then((courses)=>{
  const dataTable = document.getElementById("coursetable")

  courses.forEach(course => {

    var row = `<tr>
    <td>${course.courseId}</td>
    <td>${course.courseName}</td>
    <td>${course.trainer}</td>
    <td>${course.durationInWeek}</td>`
    
    dataTable.innerHTML+=row;
  });
 }); 

}

function showEnrolledstudent(){
fetch("http://localhost:8080/courses/enrolled")
 .then((response) => response.json ())
 .then((students)=>{
  const dataTable = document.getElementById("enrolledTable")

  students.forEach(student => {

    var row = `<tr>
    <td>${student.name}</td>
    <td>${student.emailId}</td>
    <td>${student.courseName}</td>
    
    </tr>`
    
    dataTable.innerHTML+=row;
  });
 }); 

}