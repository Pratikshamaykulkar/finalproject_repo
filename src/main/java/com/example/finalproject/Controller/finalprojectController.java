
package com.example.finalproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.finalproject.Model.Contact;
import com.example.finalproject.Model.Order;
import com.example.finalproject.Service.finalservice;
import com.example.finalproject.Service.orderservice;

@Controller
public class finalprojectController {

    @Autowired
    private finalservice contactService;

    @Autowired
    private orderservice service;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/about")
    public String aboutUs() {
        return "about us";
    }

    @GetMapping("/explore")
    public String explore() {
        return "explore food";
    }

    @GetMapping("/reviews")
    public String reviews() {
        return "review";
    }

    // @GetMapping("/contact")
    // public String contactUs(Model model) {
    //     model.addAttribute("contact", new Contact());
    //     return "contact us";
    // }
    @GetMapping("/contact")
    public String contactUs(){
        return  "contact us";
    }

    @PostMapping("/contact")
    public String processContactForm(@ModelAttribute Contact contact){
        contactService.add(contact);
        return "redirect:/contact";
    }

    // @PostMapping("/contact")
    // public String processContactForm(@ModelAttribute("contact") Contact contact) {
    //     contactService.add(contact);
    //     return "redirect:/contact";
    // }

  

    @GetMapping("/online")
    public String onlinepay() {
        return "online_pay";
    }

    @GetMapping("/orderpg")
    public String ordernow() {
        return "order";
    }

    @PostMapping("/orderplaced")
    public String placeOrder(@ModelAttribute Order order) {
        System.out.println("ddtails=" + order.toString());
        service.saveOrder(order);
        return "redirect:/";
    }

    @GetMapping("/read")
    public String readmore() {
        return "Read more";
    }
}
