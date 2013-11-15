package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void home() {
        render();
    }

    public static void produits() {
        render("Application/produits.html");
    }

    public static void categories() {
        render("Application/categories.html");
    }

    public static void courses() {
        render("Application/courses.html");
    }

}