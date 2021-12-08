package com.ivanovsegei.spring.mvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class myController {


    @RequestMapping("/")
    public String showFirstView(){
        return "first-view";
    }
    @RequestMapping("/askDetails")//в методах контроллера нужно прописывать разные адреса чтобы не было ambigious err
    public String askEmployeeDetails(Model model){
        model.addAttribute("employee", new Employee());

//        Employee emp = new Employee();
//        emp.setName("Ivan");
//        emp.setSurname("Petrov");
//        emp.setSalary(500);
        model.addAttribute("employee", new Employee());

        return "ask-emp-details-view";
    }

//    @RequestMapping("showDetails")
//    public String showEmpDetails(){
//        return  "show-emp-details-view";
//    }



//    @RequestMapping("showDetails")
//    public String showEmpDetails(HttpServletRequest request, Model model){
//
//        String empName = request.getParameter("employeeName");
//        empName = "Mr. "+empName;
//        model.addAttribute("nameAttribute", empName);//контейнер для данных
//
//        model.addAttribute("desctiption", " - worker");
//
//        return  "show-emp-details-view";
//    }


//    @RequestMapping(path = "/showDetails", method = RequestMethod.GET)//сработает только для выбранного метода
    @GetMapping("/showDetails")//заставляет работать при вызове запроса гет
    //@PostMapping для пост
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult){

//        String name = emp.getName(); //////можно обработать поля
//        emp.setName("Mr. "+ name);
//        String surname = emp.getSurname();
//        emp.setSurname(surname + "!");
//        int salary = emp.getSalary();
//        emp.setSalary(salary*5);


        if (bindingResult.hasErrors()){
            return  "ask-emp-details-view";
        }else {
            return  "show-emp-details-view";
        }
    }
}
