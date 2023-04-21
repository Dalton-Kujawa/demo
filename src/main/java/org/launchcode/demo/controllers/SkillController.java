package org.launchcode.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@ResponseBody
//@RequestMapping("form")
@Controller
public class SkillController {

    @GetMapping
    public String skillsTracker(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>" +
                "<ol>Java</ol>" +
                "<ol>Python</ol>" +
                "<ol>C++</ol>" +
                "</h2>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(value="order",method = {RequestMethod.GET, RequestMethod.POST})
    public String order(@RequestParam String user,@RequestParam String number1, @RequestParam String number2, @RequestParam String number3){
        String userChoicesHTML = "<html>" +

                "<style>" +
                "table, th, td {border:1px solid black;}" +
                "</style>" +

                "<body>" +

                "<h1>" + user + "</h1>" +

//                "<h2>" +
                "<table style='Width:100%'>" +
                "<tr>" +
                "<th>Favorite</th>" +
                "<th>Second Favorite</th>" +
                "<th>Third Favorite</th>" +
                "</tr>" +
                "<tr>" +
                "<th>"+ number1 +"</th>" +
                "<th>"+ number2 +"</th>" +
                "<th>"+ number3 +"</th>" +
                "</tr>" +
                "</table>" +
//                "<ol>" +
//                "<li>"+ number1 +"</li>" +
//                "<li>"+ number2 +"</li>" +
//                "<li>"+ number3 +"</li>" +
//                "</ol>" +
//                "</h2>" +

                "</body>" +

                "</html>";
        return userChoicesHTML;
    }

    @GetMapping("form")
    public String selectFavoriteOrder(){
        String html =
                "<html>" +
                        "<body>" +

                        "<form method = 'get' action = '/order'>" +

                        "<label for='user'>Please enter your name</label>" +
                        "<br><input type = 'text' name = 'user' />" +

                        "<br><label for='firstChoice'>My Favorite Language</label>" +
                        "<br><select name='number1' id='firstChoice'>" +

                        "<option value=''>--Please choose an option--</option>" +
                        "<option value='java'>Java</option>" +
                        "<option value='python'>Python</option>" +
                        "<option value='c++'>C++</option>" +

                        "</select>" +

                        "<br><label for='secondChoice'>My Second Favorite</label>" +
                        "<br><select name='number2' id='secondChoice'>" +

                        "<option value=''>--Please choose an option--</option>" +
                        "<option value='java'>Java</option>" +
                        "<option value='python'>Python</option>" +
                        "<option value='c++'>C++</option>" +

                        "</select>" +

                        "<br><label for='thirdChoice'>My Third Favorite</label>" +
                        "<br><select name='number3' id='thirdChoice'>" +

                        "<option value=''>--Please choose an option--</option>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='Python'>Python</option>" +
                        "<option value='C++'>C++</option>" +

                        "</select>" +

                        "<br><input type = 'submit' value = 'Submit' />" +

                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }
}
