package com.resume;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class GenerateResume extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Collect form data
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String linkedin = request.getParameter("linkedin");
        String objective = request.getParameter("objective");
        String technical = request.getParameter("technical");
        String skills = request.getParameter("skills");
        String hobbies = request.getParameter("hobbies");
        String languages = request.getParameter("languages");
        String academic = request.getParameter("academic");
        String education = request.getParameter("education");
        String projects = request.getParameter("projects");
        String certifications = request.getParameter("certifications");

        // HTML + CSS
        out.println("<html><head><title>My Resume</title>");
        out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/jspdf/2.5.1/jspdf.umd.min.js'></script>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; background: #f4f7fb; margin: 0; padding: 40px; }");
        out.println(".resume-container { display: flex; justify-content: center; }");
        out.println(".resume { background: #fff; width: 850px; padding: 40px; border-radius: 12px; box-shadow: 0 4px 12px rgba(0,0,0,0.1); display: flex; gap: 30px; }");
        out.println(".left { width: 40%; padding-right: 20px; border-right: 2px solid #e0e0e0; }");
        out.println(".right { width: 60%; padding-left: 20px; }");
        out.println(".name { font-size: 28px; font-weight: bold; color: #0d47a1; margin-bottom: 8px; }");
        out.println(".contact { font-size: 14px; line-height: 1.6; color: #333; margin-bottom: 20px; }");
        out.println("h2 { color: #1565c0; border-bottom: 2px solid #1976d2; padding-bottom: 4px; margin-top: 25px; font-size: 18px; }");
        out.println("p { font-size: 14px; color: #444; line-height: 1.6; margin-top: 8px; white-space: pre-line; }");
        out.println(".btn-container { text-align: center; margin-top: 30px; }");
        out.println(".download-btn { background-color: #1976d2; color: white; border: none; padding: 10px 20px; border-radius: 6px; font-size: 16px; cursor: pointer; transition: 0.3s; }");
        out.println(".download-btn:hover { background-color: #0d47a1; }");
        out.println("</style></head><body>");

        out.println("<div class='resume-container'>");
        out.println("<div class='resume' id='resumeContent'>");

        // LEFT COLUMN
        out.println("<div class='left'>");
        out.println("<div class='name'>" + name + "</div>");
        out.println("<div class='contact'>" + address + "<br>" + email + "<br>" + phone + "<br>LinkedIn: " + linkedin + "</div>");
        out.println("<h2>Career Objective</h2><p>" + objective + "</p>");
        out.println("<h2>Technical Competencies</h2><p>" + technical + "</p>");
        out.println("<h2>Interpersonal Skills</h2><p>" + skills + "</p>");
        out.println("<h2>Interests & Hobbies</h2><p>" + hobbies + "</p>");
        out.println("<h2>Languages Known</h2><p>" + languages + "</p>");
        out.println("<h2>Academic Achievements</h2><p>" + academic + "</p>");
        out.println("</div>");

        // RIGHT COLUMN
        out.println("<div class='right'>");
        out.println("<h2>Education</h2><p>" + education + "</p>");
        out.println("<h2>Projects</h2><p>" + projects + "</p>");
        out.println("<h2>Certifications & Achievements</h2><p>" + certifications + "</p>");
        out.println("</div>");

        out.println("</div></div>"); // resume-container

        // Download button
        out.println("<div class='btn-container'>");
        out.println("<button class='download-btn' onclick='downloadPDF()'>Download as PDF</button>");
        out.println("</div>");

        // JS for PDF
     // JS for PDF
        out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/html2canvas/1.4.1/html2canvas.min.js'></script>");
        out.println("<script>");
        out.println("function downloadPDF() {");
        out.println("  const resume = document.getElementById('resumeContent');");
        out.println("  html2canvas(resume, {scale: 2}).then(canvas => {");
        out.println("    const imgData = canvas.toDataURL('image/png');");
        out.println("    const pdf = new jspdf.jsPDF('p', 'pt', 'a4');");
        out.println("    const imgProps = pdf.getImageProperties(imgData);");
        out.println("    const pdfWidth = pdf.internal.pageSize.getWidth();");
        out.println("    const pdfHeight = (imgProps.height * pdfWidth) / imgProps.width;");
        out.println("    pdf.addImage(imgData, 'PNG', 0, 0, pdfWidth, pdfHeight);");
        out.println("    pdf.save('My_Resume.pdf');");
        out.println("  });");
        out.println("}");
        out.println("</script>");

    }
}
