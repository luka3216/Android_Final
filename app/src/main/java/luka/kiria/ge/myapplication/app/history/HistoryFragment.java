package luka.kiria.ge.myapplication.app.history;

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

import org.w3c.dom.Text;

import luka.kiria.ge.myapplication.API;
import luka.kiria.ge.myapplication.R;
import luka.kiria.ge.myapplication.RetrofitInstance;
import luka.kiria.ge.myapplication.app.actives.ActivesRecyclerAdapter;
import luka.kiria.ge.myapplication.app.actives.models.AssetsAndLiabilities;
import luka.kiria.ge.myapplication.app.history.models.TransactionHistory;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class HistoryFragment extends Fragment {

        private RecyclerView recyclerView;
        private TextView incomeTextView;
        private TextView outcomeTextView;

        private HistoryRecyclerAdapter adapter;

        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.history_fragment, container, false);
        bindViews(view);
        adapter = new HistoryRecyclerAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(adapter);

        Retrofit retrofit = RetrofitInstance.getInstance();
        API api = retrofit.create(API.class);

        api.getTransactionHistory().enqueue(new Callback<TransactionHistory>() {
            @Override
            public void onResponse(Call<TransactionHistory> call, Response<TransactionHistory> response) {
                if (response.isSuccessful()) {
                    TransactionHistory history = response.body();
                    adapter.setData(history.getMyOperations());
                    incomeTextView.setText(history.getIncomeSum() + "");
                    outcomeTextView.setText(history.getOutcomeSum() + "");
                }
            }

            @Override
            public void onFailure(Call<TransactionHistory> call, Throwable t) {
                System.out.println(t.getMessage());
            }
        });
        return view;
    }

        private void bindViews(View view) {
            this.recyclerView = view.findViewById(R.id.historyRecyclerView);
            this.incomeTextView = view.findViewById(R.id.incomeTextView);
            this.outcomeTextView = view.findViewById(R.id.outcomeTextView);
        }

    }
