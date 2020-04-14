package comm.example.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AccountRowMapper implements RowMapper<Account> {

	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
		Account account=new Account();
		account.setAccountNumber(rs.getString("accountNumber"));
		account.setAccountType(rs.getString("accountType"));
		account.setInitialBalance(rs.getInt("balance"));
		return account;
	}

}
