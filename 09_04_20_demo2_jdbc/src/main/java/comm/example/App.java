package comm.example;

import java.sql.Connection;
import java.sql.SQLException;

import comm.example.factory.MyConnectionFactory;
//Main App
public class App 
{
	
	
	
    public static void main( String[] args )
    {
    
    	MyConnectionFactory factory,factory1=null;
    	factory=MyConnectionFactory.getConnectionObject();
    	factory1=MyConnectionFactory.getConnectionObject();
    	System.out.println(factory==factory1);
    	try {
			Connection connection=factory.getMyConnection();
			System.out.println(connection);
			Connection connection1=factory.getMyConnection();
			System.out.println(connection1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
}
