/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampil;

/**
 *
 * @author Aya
 */
public class MVC_Tampil {
    ViewTampil vt = new ViewTampil();
    ModelTampil mt = new ModelTampil();
    ControllerTampil ct = new ControllerTampil(vt, mt);
}
