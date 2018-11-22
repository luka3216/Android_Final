package luka.kiria.ge.myapplication.app.cards;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import luka.kiria.ge.myapplication.R;
import luka.kiria.ge.myapplication.app.cards.models.Card;
import luka.kiria.ge.myapplication.app.history.HistoryViewHolder;
import luka.kiria.ge.myapplication.app.history.models.MyOperation;

public class CardRecyclerAdapter extends RecyclerView.Adapter<CardViewHolder> {

    private List<Card> data = new ArrayList<>();

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new CardViewHolder(LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.card_cell_re, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder cardViewHolder, int i) {
        cardViewHolder.bindData(data.get(i));
    }



    @Override
    public int getItemCount() {
        return data.size();
    }


    public void setData(List<Card> data) {
        this.data.clear();
        this.data.addAll(data);
        notifyDataSetChanged();
    }
}
