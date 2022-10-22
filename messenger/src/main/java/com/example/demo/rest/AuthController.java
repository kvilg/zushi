package com.example.demo.rest;

import com.example.demo.model.FriendSend;
import com.example.demo.model.Product;
import com.solidfire.gson.Gson;
import org.springframework.web.bind.annotation.*;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/product/get")
public class AuthController {



    @GetMapping(path = "/sushi")
    public String getAuthUser(){

        Gson gson = new Gson();

        List<Product> p = new LinkedList<>();

        p.add(new Product("калифорния",600,"grhdyjrftj"));
        p.add(new Product("стандарт",500,"grhdyjrftj"));
        p.add(new Product("изыск",1000,"grhdyjrftj"));
        p.add(new Product("бомж стайл",200,"grhdyjrftj"));
        p.add(new Product("калифорния",600,"grhdyjrftj"));
        p.add(new Product("стандарт",500,"grhdyjrftj"));
        p.add(new Product("изыск",1000,"grhdyjrftj"));
        p.add(new Product("бомж стайл",200,"grhdyjrftj"));


        FriendSend g = new FriendSend();
        g.arrProduct = p;
        String jsonOut = gson.toJson(g);

        return jsonOut;
    }



//    @GetMapping(path = "/sets")
//    public String getUserByJWT() {
//
//        Gson gson = new Gson();
//
//        List<Product> p = new LinkedList<>();
//
//        p.add(new Product("калифорния",600,"grhdyjrftj"));
//        p.add(new Product("стандарт",500,"grhdyjrftj"));
//        p.add(new Product("изыск",1000,"grhdyjrftj"));
//        p.add(new Product("бомж стайл",200,"grhdyjrftj"));
//        p.add(new Product("калифорния",600,"grhdyjrftj"));
//        p.add(new Product("стандарт",500,"grhdyjrftj"));
//        p.add(new Product("изыск",1000,"grhdyjrftj"));
//        p.add(new Product("бомж стайл",200,"grhdyjrftj"));
//
//
//
//        FriendSend g = new FriendSend();
//        g.arrProduct = p;
//        String jsonOut = gson.toJson(g);
//
//        return jsonOut;
//    }

//    @PostMapping(path = "/drink")
//    public String registration(@RequestBody String json) throws Exception {
//
//        Gson gson = new Gson();
//
//        List<Product> p = new LinkedList<>();
//
//        p.add(new Product("калифорния",600,"grhdyjrftj"));
//        p.add(new Product("стандарт",500,"grhdyjrftj"));
//        p.add(new Product("изыск",1000,"grhdyjrftj"));
//        p.add(new Product("бомж стайл",200,"grhdyjrftj"));
//        p.add(new Product("калифорния",600,"grhdyjrftj"));
//        p.add(new Product("стандарт",500,"grhdyjrftj"));
//        p.add(new Product("изыск",1000,"grhdyjrftj"));
//        p.add(new Product("бомж стайл",200,"grhdyjrftj"));
//
//
//
//        FriendSend g = new FriendSend();
//        g.arrProduct = p;
//        String jsonOut = gson.toJson(g);
//
//        return jsonOut;
//    }


/** для того что бы токен авторизировал нужен префикс Bearer {token}
 *
 * PS. ЭТО ТОЛЬКО ДЛЯ ЗНАЧЕНИЯ AUTORIZAIFION NE JWT
 * */
}
