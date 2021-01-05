/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edit;

/**
 *
 * @author Aya
 */
public class MVC_Edit {
    ViewEdit ve = new ViewEdit();
    ModelEdit me = new ModelEdit();
    ControllerEdit ce = new ControllerEdit(ve, me);
}
