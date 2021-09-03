package ex01;

import java.net.URL;
import java.util.ResourceBundle;

import ex01.login.LoginClass;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller implements Initializable {
	private Parent root;
	@FXML private TextField fxid;//이번 방법
	@FXML private PasswordField fxpwd;//이번 방법

	public void setRoot(Parent root) {
		this.root = root;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

	public void LoginProc() {
		/*
		System.out.println("로그인 버튼 클릭");
		TextField t= (TextField)root.lookup("#fxid"); //#은 필수 이벤트필드의 id를 명시해줌
		System.out.println(t.getText());
		
		System.out.println("어노테이션 사용: "+fxid.getText());
		*/
		LoginClass lc = new LoginClass();
		lc.loginCheck( fxid, fxpwd );
		lc.loginCheck(root);
	}

}
