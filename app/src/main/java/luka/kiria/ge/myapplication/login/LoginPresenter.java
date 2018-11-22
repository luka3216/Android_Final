package luka.kiria.ge.myapplication.login;

import android.content.Context;
import android.content.Intent;
import android.os.strictmode.InstanceCountViolation;
import android.util.Log;

import java.util.InputMismatchException;

import luka.kiria.ge.myapplication.RetrofitInstance;
import luka.kiria.ge.myapplication.app.AppMainActivity;

public class LoginPresenter implements Contract.Presenter, Contract.Intractor.OnFinishedListener {
    private Contract.MainView mainView;
    private Contract.Intractor intractor;

    public LoginPresenter(Contract.MainView mainView) {
        this.mainView = mainView;
        this.intractor = new LoginIntractor(this);
    }

    @Override
    public void loginAttempt(String username, String password) {
        MainActivity.InvalidInput error = MainActivity.InvalidInput.CORRECT;
        if (username.length() < 3) {
            error = MainActivity.InvalidInput.SHORT_USERNAME;
        }if (password.length() < 3) {
            error = error == MainActivity.InvalidInput.CORRECT ? MainActivity.InvalidInput.SHORT_PASSWORD : MainActivity.InvalidInput.SHORT_BOTH;
        }
        if (error != MainActivity.InvalidInput.CORRECT) {
            mainView.signalInvalidInput(error);
        }
        else {
            intractor.registerSession(username, password);
        }
    }

    @Override
    public void onSuccess(String sessionID) {
        RetrofitInstance.setInterceptor(sessionID);
        mainView.signalSuccessfulLogin(sessionID);
    }

    @Override
    public void onFail() {
        Log.d("loginfail", "login fail");
    }
}
