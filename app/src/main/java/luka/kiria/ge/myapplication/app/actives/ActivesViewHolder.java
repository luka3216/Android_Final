package luka.kiria.ge.myapplication.app.actives;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public abstract class ActivesViewHolder extends RecyclerView.ViewHolder {
    public ActivesViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    abstract void bindData(Object obj);
}
