/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys1.pkg2;

/**
 *
 * @author julian.dragoi
 */
public enum ProjectStatus
{
    INPLANNING ("In PLANNING"), INDEVELOPEMTN ("In DEVLOPMENT"), QATESTING("QA TESTING"), ONHOLD("ON HOLD"), USERTESTING("USER TESTING"), FINALIMPROVEMENTS("Final Improvements"), LIVE("LIVE");

    private final String name;       

    private ProjectStatus (String s) {
        name = s;
    }

    public boolean equalsName(String otherName) {
        return (otherName == null) ? false : name.equals(otherName);
    }

    public String toString() {
       return this.name;
    }
}