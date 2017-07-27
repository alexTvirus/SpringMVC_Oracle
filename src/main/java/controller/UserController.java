/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import repository.*;
import entity.*;
import java.util.List;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller


public class UserController implements Serializable {

    private Userentity user;

    @Autowired
    UserRepository userRepository;

     @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index() {

        return "jsp/index";
    }
    
    
    
    @RequestMapping(value = "/listuser", method = RequestMethod.GET)
    public String showUsers(Model mm) {

        mm.addAttribute("listuser", (List<Userentity>) userRepository.findAll());
        
        return "jsp/home";
    }
//

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String search(@RequestParam(value = "searchinput") String searchInput, Model mm) {
        List<Userentity> listbook;
        if (searchInput.isEmpty()) {
            listbook = (List<Userentity>) userRepository.findAll();
        } else {
            listbook = (List<Userentity>) userRepository.findByNameContaining(searchInput);
        }
        mm.addAttribute("listbook", listbook);
        return "jsp/home";
    }
//
//    @RequestMapping(value = "/newBook", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
//    public String saveBook(Bookentity book) {
//        bookRepository.save(book);
//
//        return "redirect:/";
//    }
//
//    @RequestMapping(value = "/newBook", method = RequestMethod.GET)
//    public String setupnewBook(Model mm) {
//        mm.addAttribute("book", new Bookentity());
//        mm.addAttribute("msg", "add new book");
//
//        mm.addAttribute("action", "newBook");
//        setCategoryList();
//        return "jsp/book";
//    }
//
//    @RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
//    public String setupEdit(Model mm, @PathVariable int id) {
//        mm.addAttribute("book", bookRepository.findOne(id));
//        mm.addAttribute("msg", "Update book");
//        mm.addAttribute("type", "update");
//        mm.addAttribute("action", "updateBook");
//        setCategoryList();
//        return "jsp/book";
//    }
//
//    @RequestMapping(value = "edit/updateBook", method = RequestMethod.POST)
//    public String updateBook(@ModelAttribute(value = "book")  Bookentity book) {
//        
//        bookRepository.save(book);
//        return "redirect:/";
//    }

//    public void setCategoryList() {
//        listcate = (List<CategoryEntity>) categoryRepository.findAll();
//
//    }
}
