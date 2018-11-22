package luka.kiria.ge.myapplication;

import java.util.List;

import luka.kiria.ge.myapplication.app.actives.models.AssetsAndLiabilities;
import luka.kiria.ge.myapplication.app.cards.models.Card;
import luka.kiria.ge.myapplication.app.history.models.TransactionHistory;
import luka.kiria.ge.myapplication.app.profile.models.ProfileInfo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface API {
    @GET("Clients/Login/{username}/{password}")
    Call<SessionData> getLiginData(@Path("username") String username, @Path("password") String password);

    @GET("Clients/ClientInfo/")
    Call<ProfileInfo> getProfileInfo();

    @GET("Products/AssetsAndLiabilities/")
    Call<AssetsAndLiabilities> getAssetsAndLiabilities();

    @GET("Products/Transactions/")
    Call<TransactionHistory> getTransactionHistory();

    @GET("Products/Cards/")
    Call<List<Card>> getCards();
}
