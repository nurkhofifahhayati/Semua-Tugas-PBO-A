/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aya
 */
public class MVC_Praktikum {
    ViewPraktikum vp = new ViewPraktikum();
    ModelPraktikum mp = new ModelPraktikum();
    ControllerPraktikum cp = new ControllerPraktikum(vp, mp);
}
