/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pinjam;

/**
 *
 * @author Aya
 */
public class MVC_Pinjam {
    ViewPinjam vp = new ViewPinjam();
    ModelPinjam mp = new ModelPinjam();
    ControllerPinjam cp = new ControllerPinjam(vp, mp);
}
