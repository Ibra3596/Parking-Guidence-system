/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingguide;

import java.util.ArrayList;

/**
 *
 * @author Abdelrhman
 */
public class EntryOperator extends Staff{
 
    public Ticket GenerateTicket (ParkingSlot p)
    {
        Ticket  t = new Ticket ();
        
        
        return t;
    }
    
    public ParkingSlot BestSlot ()
    {
        ParkingSlot ps = new ParkingSlot();
        
        
        return ps;
    }
    
    public ArrayList<ParkingSlot> FreeSlots ()
    {
        ArrayList <ParkingSlot> ps = new ArrayList<ParkingSlot>();
        
        
        return ps;
    }
}
