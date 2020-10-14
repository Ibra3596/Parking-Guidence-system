/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingguide;

import java.util.ArrayList;
import java.util.Date;


public class Admin extends Staff{
    int ID;
    
    public boolean AddSlots(ParkingSlot S)
    {
        return true;
    }
    
    public ArrayList<ParkingSlot> ViewSpots()
    {
        ArrayList<ParkingSlot> result = new ArrayList<ParkingSlot>();
        
        
        
        return result;
    }
    
    
    public boolean AddUser (User U)
    {
        return true;
    }
    
    public boolean DeleteUser (User U)
    {
        return true;
    }
    
    public boolean UpdateUser (User U)
    {
        return true;
    }
    
    public ArrayList<ParkingSlot> ViewUsedSpots()
    {
        ArrayList<ParkingSlot> result = new ArrayList<ParkingSlot>();
        
        
        
        return result;
    }
    public ShiftReport ViewShiftReport(Date from,Date to)
    {
        ShiftReport sr = new ShiftReport();
        
        return sr;
    }
}
