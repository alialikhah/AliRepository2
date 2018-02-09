package service;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class People
 */
@Stateless
public class People implements PeopleLocal {

    /**
     * Default constructor. 
     */
    public People() {
        // TODO Auto-generated constructor stub
    }
    @Override
    public void send(){
    	System.err.println("sended");
    }
    
    @Override
    public void send2(){
    	System.err.println("sended2");
    }

}
