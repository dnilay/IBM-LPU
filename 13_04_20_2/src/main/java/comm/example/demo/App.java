package comm.example.demo;

import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import comm.example.demo.bean.Account;
import comm.example.demo.bean.AccountType;
import comm.example.demo.bean.ToDo;
import comm.example.demo.repo.ToDoRepository;
import comm.example.demo.repo.ToDoRepositoryImpl;
import comm.example.demo.service.AccountService;
import comm.example.demo.service.AccountServiceImpl;
import comm.example.demo.service.ToDoService;
import comm.example.demo.service.ToDoServiceImpl;

public class App 
{

	
	
	
	public static void main( String[] args )
    {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		/*
		 * ToDoService service=context.getBean("toDoServiceImpl",ToDoServiceImpl.class);
		 * ToDo todo=context.getBean("toDo",ToDo.class);
		 * todo.setTodoID(UUID.randomUUID().toString()); todo.setTodoName("testing");
		 * todo=service.createToDo(todo); System.out.println(todo);
		 */
		AccountService service=context.getBean("accountServiceImpl",AccountServiceImpl.class);
		Account account=context.getBean("account",Account.class);
		
		/*
		 * String str[]=UUID.randomUUID().toString().split("-");
		 * account.setAccountNumber(str[0]); account.setAccountType("LOAN");
		 * account.setInitialBalance(1000000);
		 * 
		 * account=service.createAccount(account); System.out.println(account);
		 */
		 
		
		/*
		 * List<Account> list=service.getAllAccountDetails(); Iterator<Account>
		 * i=list.iterator(); while(i.hasNext()) { Account account2=i.next();
		 * System.out.println(account2); }
		 */
		
		account=service.findByAccountNumber("46555cd3");
		System.out.println(account);
		
		
		 
		
    }
}
