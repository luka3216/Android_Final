package luka.kiria.ge.myapplication.login;


import java.util.List;

public interface Contract {

    interface  Presenter {
        void loginAttempt(String username, String password);
    }

    interface MainView {
        void signalInvalidInput(MainActivity.InvalidInput error);
        void signalSuccessfulLogin(String sessionID);
    }

    interface Intractor {
        interface OnFinishedListener{
            void onSuccess(String sessionID);
            void onFail();
        }

        void registerSession(String username, String password);
    }
}
