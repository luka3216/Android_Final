package luka.kiria.ge.myapplication.app.cards;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import luka.kiria.ge.myapplication.API;
import luka.kiria.ge.myapplication.R;
import luka.kiria.ge.myapplication.RetrofitInstance;
import luka.kiria.ge.myapplication.app.cards.models.Card;
import luka.kiria.ge.myapplication.app.history.HistoryRecyclerAdapter;
import luka.kiria.ge.myapplication.app.history.models.TransactionHistory;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class CardsFragment extends Fragment {

    private RecyclerView recyclerView;
    private CardRecyclerAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.card_fragment, container, false);
        bindViews(view);
        adapter = new CardRecyclerAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(adapter);

        Retrofit retrofit = RetrofitInstance.getInstance();
        API api = retrofit.create(API.class);

        api.getCards().enqueue(new Callback<List<Card>>() {
            @Override
            public void onResponse(Call<List<Card>> call, Response<List<Card>> response) {
                if (response.isSuccessful()) {
                    adapter.setData(response.body());
                }
            }

            @Override
            public void onFailure(Call<List<Card>> call, Throwable t) {
                System.out.println(t.getMessage());
            }
        });
        return view;
    }

    private void bindViews(View view) {
        this.recyclerView = view.findViewById(R.id.cardRecyclerView);
    }
}
