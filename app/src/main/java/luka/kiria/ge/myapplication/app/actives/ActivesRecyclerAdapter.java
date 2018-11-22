package luka.kiria.ge.myapplication.app.actives;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import luka.kiria.ge.myapplication.R;
import luka.kiria.ge.myapplication.app.actives.models.Asset;
import luka.kiria.ge.myapplication.app.actives.models.AssetsAndLiabilities;

public class ActivesRecyclerAdapter extends RecyclerView.Adapter {

    private List<Object> data = new ArrayList<>();

    public static final int CELL_TITLE = 0;
    public static final int CELL_MEMBER = 1;

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i == CELL_TITLE) {
            return new ActivesTitleViewHolder(LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.actives_title_cell, viewGroup, false));
        } else {
            return new ActivesMemberViewHolder(LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.actives_member_cell, viewGroup, false));
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ((ActivesViewHolder) viewHolder).bindData(data.get(i));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public int getItemViewType(int position) {
        return data.get(position) instanceof String ? CELL_TITLE : CELL_MEMBER;
    }

    public void setData(AssetsAndLiabilities assetsAndLiabilities) {
        data.clear();
        if (assetsAndLiabilities.getPoints().size() > 0) {
            data.add("ქულები");
            data.addAll(assetsAndLiabilities.getPoints());
        }
        if (assetsAndLiabilities.getAssets().size() > 0) {
            data.add("აქტივები");
            data.addAll(assetsAndLiabilities.getAssets());
        }
        if (assetsAndLiabilities.getLiabilities().size() > 0) {
            data.add("ვალდებულებები");
            data.addAll(assetsAndLiabilities.getLiabilities());
        }
        if (assetsAndLiabilities.getAvailableAmounts().size() > 0) {
            data.add("ხელმისაწვდომი რაოდენობები");
            data.addAll(assetsAndLiabilities.getAvailableAmounts());
        }
        notifyDataSetChanged();
    }
}
