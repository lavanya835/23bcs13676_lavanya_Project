<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Online Resume Builder</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(135deg, #e3f2fd, #bbdefb);
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }
    .form-container {
        background-color: white;
        padding: 25px;
        border-radius: 12px;
        box-shadow: 0 4px 10px rgba(0,0,0,0.1);
        width: 450px;
        overflow-y: auto;
        height: 90vh;
    }
    h2 {
        text-align: center;
        color: #1565c0;
    }
    label {
        font-weight: bold;
    }
    input, textarea {
        width: 100%;
        padding: 8px;
        margin: 6px 0 12px;
        border: 1px solid #ccc;
        border-radius: 6px;
    }
    button {
        background-color: #1565c0;
        color: white;
        padding: 10px;
        border: none;
        border-radius: 6px;
        width: 100%;
        cursor: pointer;
    }
    button:hover {
        background-color: #0d47a1;
    }
</style>
</head>
<body>
    <div class="form-container">
        <h2>Online Resume Builder</h2>
        <form action="GenerateResume" method="post">
            <label>Name:</label>
            <input type="text" name="name" required>

            <label>Address:</label>
            <textarea name="address" required></textarea>

            <label>Email:</label>
            <input type="email" name="email" required>

            <label>Phone:</label>
            <input type="text" name="phone" required>

            <label>LinkedIn:</label>
            <input type="text" name="linkedin">

            <label>Career Objective:</label>
            <textarea name="objective"></textarea>

            <label>Technical Competencies:</label>
            <textarea name="technical"></textarea>

            <label>Interpersonal Skills:</label>
            <textarea name="skills"></textarea>

            <label>Interests and Hobbies:</label>
            <textarea name="hobbies"></textarea>

            <label>Languages Known:</label>
            <textarea name="languages"></textarea>

            <label>Academic Achievements:</label>
            <textarea name="academic"></textarea>

            <label>Education:</label>
            <textarea name="education"></textarea>

            <label>Projects:</label>
            <textarea name="projects"></textarea>

            <label>Certifications & Achievements:</label>
            <textarea name="certifications"></textarea>

            <button type="submit">Generate Resume</button>
        </form>
    </div>
</body>
</html>
