package com.example.mongo.Controller_folder;
import java.util.List;


import com.example.mongo.Model_folder.customer_model;
import com.example.mongo.Respository_folder.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/home")
public class Cust_Controller {
    
    @Autowired
    public repository obj;
   
    @PostMapping("/AddDetails")
    public String Add_Cust_Details(@RequestBody customer_model nith)
    {
        obj.save(nith);
        return "details Added";
    }

   /* @GetMapping("/GetDetails/{id}")
    public List<customer_model> Get_Cust_Details(@PathVariable int id)
    {
          return obj.findAll();
    }
    @DeleteMapping("/DeleteDetails/{id}")
    public String Delete_Details(@PathVariable int id)
    {
        obj.deleteById(id);
        return "Detail deleted";
    }
    @PutMapping("UpdateDetails/{id}/{item_purchased}")
    public List<customer_model> update_details(@PathVariable int id,@PathVariable String item )
    { 
     
        customer_model cust=obj.findById(id).get();
        cust.setItem_purchased(item);
        obj.save(cust);
        return obj.findAll();
    }
*/

}
