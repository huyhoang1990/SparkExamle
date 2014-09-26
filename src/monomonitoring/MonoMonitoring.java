/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package monomonitoring;
import java.util.HashMap;
import java.util.Map;
import spark.*;
import static spark.Spark.*;
import spark.template.freemarker.FreeMarkerEngine;
import java.lang.Exception;
/**
 *
 * @author hohuyhoang
 */
public class MonoMonitoring {

    public static void main(String[] args) {
        staticFileLocation("/public");
        try {
            get("/hello", (request, response) -> {
                Map<String, Object> att = new HashMap<>();
                att.put("message", "hoang");
                System.out.println(1/0);
                return new ModelAndView(att, "test.html");
            }, new FreeMarkerEngine());
        } catch (ExceptionInInitializerError e) {
            System.out.println(e.getMessage());
        }
    }
}
