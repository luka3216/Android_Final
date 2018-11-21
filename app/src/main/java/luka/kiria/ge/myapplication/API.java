package luka.kiria.ge.myapplication;

import luka.kiria.ge.myapplication.app.profile.models.ProfileInfo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface API {
    @GET("Clients/Login/{username}/{password}")
    Call<SessionData> getLiginData(@Path("username") String username, @Path("password") String password);

    @GET("Clients/ClientInfo/z")
    Call<ProfileInfo> getProfileInfo();
}
