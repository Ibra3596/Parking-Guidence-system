/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingguide;

/**
 *
 * @author Abdelrhman
 */
public class Staff extends User {
    String password,mail,name,phone;
    
    
    
    public Boolean Login(String username,String Password)
    {
        return true;
    }
    
    public Boolean Logout()
    {
        return true;
    }
}
