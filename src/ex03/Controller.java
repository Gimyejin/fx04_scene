package ex03;

import java.net.URL;
import java.util.ResourceBundle;

import ex03.loginService.LoginService;
import ex03.loginService.LoginServiceImpl;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class Controller implements Initializable {
	private Parent root;
	LoginService ls;

	public void setRoot(Parent root) {
		this.root = root;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ls=new LoginServiceImpl();

	}

	public void login() {
		ls.LoginProc(root);
	}

	public void cancel() {
		ls.CancelProc(root);
	}

	public void memberAdd() {
		ls.OpenMembershipForm(root);
	}

}
