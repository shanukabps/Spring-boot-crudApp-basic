package hms.hr_crudapp_springb_jpa_jsp.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;


@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value="/", method=RequestMethod.GET)
    public ModelAndView listEmployee() {

        ModelAndView mv = new ModelAndView("home");
        List<Employee> employeeList = employeeService.getAllEmployee();
        mv.addObject("employeeList",employeeList);
        return mv;
    }

    @RequestMapping(value="/searchPage", method=RequestMethod.GET)
    public ModelAndView goSearchPage() {
        ModelAndView mv = new ModelAndView("search");
        List<Employee> employeeList = employeeService.getAllEmployee();
        mv.addObject("employeeList",employeeList);
        return mv;
    }


    @RequestMapping(value="/search", method=RequestMethod.GET)
    public ModelAndView getEmployee(@RequestParam String empId) {

        ModelAndView mv = new ModelAndView("search");
        List<Employee> employeeList = employeeService.findByEmpId(empId);
        mv.addObject("employeeList",employeeList);
        return mv;
    }

    @RequestMapping(value="/searchDep", method=RequestMethod.GET)
    public ModelAndView getEmployeeByDpe(@RequestParam String depId) {

        ModelAndView mv = new ModelAndView("search");
        List<Employee> employeeList = employeeService.findByDepId(depId);
        mv.addObject("employeeList",employeeList);
        System.out.println(employeeList);
        return mv;
    }

    @RequestMapping(value="/addemp",method = RequestMethod.GET)
    public ModelAndView addEmployeePage(){

        ModelAndView model = new ModelAndView();
        Employee Employee = new Employee();
        model.addObject("EmployeeForm", Employee);
        model.setViewName("addEmp");
        return model;
    }

    @RequestMapping(value="/addEmployee",method = RequestMethod.POST)
    public View addemployeeReq(@ModelAttribute("EmployeeForm") Employee emp){

        RedirectView redirect = new RedirectView("/");
        redirect.setExposeModelAttributes(false);

        if(emp.getDepId().equals(emp.getDepartment().getDepId())) {
            employeeService.addEmployee(emp);

            return redirect;
        }else {
            return redirect;
        }
    }

    @RequestMapping(value="/updateEmployee/{empId}/{depId}", method=RequestMethod.GET)
    public ModelAndView updateEmployee(@PathVariable("empId") String empId,
                                    @PathVariable("depId") String depId) {

        ModelAndView model = new ModelAndView();
        Employee employee = employeeService.findByEmpIdAndDepId(empId,depId);
        model.addObject("EmployeeForm", employee);
        model.setViewName("addEmp");
        return model;
    }

    @RequestMapping(value="/deleteEmployee/{empId}/{depId}", method=RequestMethod.GET)
    public View deleteEmployee(@PathVariable("empId") String empId,
                               @PathVariable("depId") String depId ) {

        employeeService.deleteEmployee(empId,depId);
        RedirectView redirect = new RedirectView("/");
        redirect.setExposeModelAttributes(false);
        return redirect;
    }

    @RequestMapping(value="/SearchMethodNic", method=RequestMethod.GET)
    @ResponseBody
    public ModelAndView findEmployeeNic(@RequestParam String nicStart){

        ModelAndView mv = new ModelAndView("search");
        List<Employee> employees = employeeService.findByNicStartsWith(nicStart);
        mv.addObject("employeeList",employees);
        return mv;
    }

    @RequestMapping(value="/searchMethodDate", method=RequestMethod.GET)
    @ResponseBody
    public ModelAndView findEmployeeWorkYear(@RequestParam String nicStart){

        ModelAndView mv = new ModelAndView("search");
        List<Employee> employees = employeeService.findByNicStartsWith(nicStart);
        mv.addObject("employeeList",employees);
        return mv;
    }

}
