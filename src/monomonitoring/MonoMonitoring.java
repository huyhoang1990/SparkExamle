/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package monomonitoring;
import static spark.Spark.*;
import spark.*;
import java.util.HashMap;
import java.util.Map;
import spark.template.freemarker.FreeMarkerEngine;
/**
 *
 * @author hohuyhoang
 */
public class MonoMonitoring {

    public static void main(String[] args) {
        staticFileLocation("/public");
        
        get("/hello", (request, response) -> {
            Map<String, Object> att = new HashMap<>();
            att.put("message", "hoang");
            return new ModelAndView(att, "test.html");
        }, new FreeMarkerEngine());
    }
    
}
