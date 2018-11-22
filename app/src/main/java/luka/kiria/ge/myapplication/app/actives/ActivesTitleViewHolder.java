package luka.kiria.ge.myapplication.app.actives;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import luka.kiria.ge.myapplication.R;
import luka.kiria.ge.myapplication.app.actives.models.ActiveMember;

public class ActivesTitleViewHolder extends ActivesViewHolder {
    private TextView titleTextView;

    public ActivesTitleViewHolder(@NonNull View itemView) {
        super(itemView);
        titleTextView = itemView.findViewById(R.id.titleTextView);
    }

    @Override
    public void bindData(Object title) {
        titleTextView.setText((String ) title);
    }


}
