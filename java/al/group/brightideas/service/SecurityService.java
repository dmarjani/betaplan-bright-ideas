package java.al.group.brightideas.service;

public interface SecurityService {
    
	String findLoggedInUsername();

    void autoLogin(String username, String password);
    
}
