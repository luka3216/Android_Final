package luka.kiria.ge.myapplication.app.actives;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

import luka.kiria.ge.myapplication.API;
import luka.kiria.ge.myapplication.R;
import luka.kiria.ge.myapplication.RetrofitInstance;
import luka.kiria.ge.myapplication.app.actives.models.AssetsAndLiabilities;
import luka.kiria.ge.myapplication.app.profile.models.ClientAddress;
import luka.kiria.ge.myapplication.app.profile.models.ProfileInfo;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class ActivesFragment extends Fragment {

    private RecyclerView recyclerView;
    private ActivesRecyclerAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.actives_fragment, container, false);
        bindViews(view);
        adapter = new ActivesRecyclerAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(adapter);

        Retrofit retrofit = RetrofitInstance.getInstance();
        API api = retrofit.create(API.class);

        api.getAssetsAndLiabilities().enqueue(new Callback<AssetsAndLiabilities>() {
            @Override
            public void onResponse(Call<AssetsAndLiabilities> call, Response<AssetsAndLiabilities> response) {

                if (response.isSuccessful()) {
                    adapter.setData(response.body());
                }
            }

            @Override
            public void onFailure(Call<AssetsAndLiabilities> call, Throwable t) {
            }
        });
        return view;
    }

    private void bindViews(View view) {
        this.recyclerView = view.findViewById(R.id.recyvclerView);
    }

}
