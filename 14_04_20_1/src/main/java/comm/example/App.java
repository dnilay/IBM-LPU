package comm.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import comm.example.bean.Account;
import comm.example.config.JDBCConfig;
import comm.example.service.AccountService;
import comm.example.service.AccountServiceImpl;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JDBCConfig.class);
		/*
		 * ToDoService service=context.getBean("toDoServiceImpl",ToDoServiceImpl.class);
		 * ToDo todo=context.getBean("toDo",ToDo.class);
		 * todo.setTodoID(UUID.randomUUID().toString()); todo.setTodoName("testing");
		 * todo=service.createToDo(todo); System.out.println(todo);
		 */
		AccountService service = context.getBean("accountServiceImpl", AccountServiceImpl.class);
		Account account = context.getBean("account", Account.class);

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

		/*
		 * account=service.findByAccountNumber("46555cd3"); System.out.println(account);
		 */
		/*
		 * List<Account> l=service.findByAmount(5000); for(Account a:l) {
		 * System.out.println(a); }
		 */

		service.deleteById("f53ce40c");

	}
}
