package luka.kiria.ge.myapplication.login;

import luka.kiria.ge.myapplication.API;
import luka.kiria.ge.myapplication.RetrofitInstance;
import luka.kiria.ge.myapplication.SessionData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class LoginIntractor implements Contract.Intractor{

    private Contract.Intractor.OnFinishedListener onFinishedListener;

    public LoginIntractor(Contract.Intractor.OnFinishedListener onFinishedListener) {
        this.onFinishedListener = onFinishedListener;
    }

    @Override
    public void registerSession(String username, String password) {
        Retrofit retrofit = RetrofitInstance.getInstance();
        API api = retrofit.create(API.class);
        Call<SessionData> call = api.getLiginData(username,password);
        call.enqueue(new Callback<SessionData>() {
            @Override
            public void onResponse(Call<SessionData> call, Response<SessionData> response) {
                if (response.isSuccessful()) {
                    onFinishedListener.onSuccess(response.body().getSessionId());
                } else {
                    onFinishedListener.onFail();
                }
            }

            @Override
            public void onFailure(Call<SessionData> call, Throwable t) {
                onFinishedListener.onFail();
            }
        });
    }
}
