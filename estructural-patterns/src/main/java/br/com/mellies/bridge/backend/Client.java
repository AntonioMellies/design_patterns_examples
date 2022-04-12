package br.com.mellies.bridge.backend;

import br.com.mellies.bridge.backend.dao.UserMongoDao;
import br.com.mellies.bridge.backend.dao.UserMysqlDao;
import br.com.mellies.bridge.backend.dao.UserOracleDao;
import br.com.mellies.bridge.backend.dao.UserPostgresDao;
import br.com.mellies.bridge.backend.model.User;
import br.com.mellies.bridge.backend.services.UserEJB;
import br.com.mellies.bridge.backend.services.UserRest;
import br.com.mellies.bridge.backend.services.UserService;
import br.com.mellies.bridge.backend.services.UserSoap;

public class Client {

	public static void main(String[] args) {
		User user = new User("user", "user@email.com", "passwd");
		
		UserService userRestOracleService = new UserRest(new UserOracleDao());
		userRestOracleService.save(user);
		
		UserService userEJBMongoService = new UserEJB(new UserMongoDao());
		userEJBMongoService.save(user);
		
		UserService userSoapPostgresService = new UserSoap(new UserPostgresDao());
		userSoapPostgresService.save(user);
		
		//.......
		
		UserService userRestMysqlService = new UserRest(new UserMysqlDao());
		userRestMysqlService.save(user);
		
	}
}
