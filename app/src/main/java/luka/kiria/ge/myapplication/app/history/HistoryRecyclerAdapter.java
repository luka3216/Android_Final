package luka.kiria.ge.myapplication.app.history;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import luka.kiria.ge.myapplication.R;
import luka.kiria.ge.myapplication.app.actives.ActivesMemberViewHolder;
import luka.kiria.ge.myapplication.app.history.models.MyOperation;

public class HistoryRecyclerAdapter extends RecyclerView.Adapter<HistoryViewHolder> {

    private List<MyOperation> data = new ArrayList<>();

    @NonNull
    @Override
    public HistoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new HistoryViewHolder(LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.history_cell, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryViewHolder historyViewHolder, int i) {
        historyViewHolder.bindData(data.get(i));
    }


    @Override
    public int getItemCount() {
        return data.size();
    }


    public void setData(List<MyOperation> data) {
        this.data.clear();
        this.data.addAll(data);
        notifyDataSetChanged();
    }
}
