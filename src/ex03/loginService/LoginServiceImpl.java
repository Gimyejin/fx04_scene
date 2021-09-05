package ex03.loginService;

import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class LoginServiceImpl implements LoginService{

	@Override
	public void LoginProc(Parent root) {
		TextField id = (TextField)root.lookup("#id");
		PasswordField pw=(PasswordField)root.lookup("#pw");
		//System.out.println(id+"/"+pw);
		System.out.println(id.getText());
		System.out.println(pw.getText());
		
	}

	@Override
	public void CancelProc(Parent root) {
		TextField id = (TextField)root.lookup("#id");
		PasswordField pw=(PasswordField)root.lookup("#pw");
		id.clear();
		pw.clear();
	}

	@Override
	public void OpenMembershipForm(Parent root) {
		System.out.println("회원가입 버튼이 눌렸다");
		
	}

}
