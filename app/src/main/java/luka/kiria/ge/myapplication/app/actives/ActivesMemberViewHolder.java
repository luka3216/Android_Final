package luka.kiria.ge.myapplication.app.actives;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import luka.kiria.ge.myapplication.R;
import luka.kiria.ge.myapplication.app.actives.models.ActiveMember;


public class ActivesMemberViewHolder extends ActivesViewHolder {

    private TextView titleTextView;
    private TextView ammountTextView;

    public ActivesMemberViewHolder(@NonNull View itemView) {
        super(itemView);
        titleTextView = itemView.findViewById(R.id.productNameTextVIew);
        ammountTextView = itemView.findViewById(R.id.ammountTextView);
    }

    @Override
    void bindData(Object member) {
        titleTextView.setText( ((ActiveMember)member).getProductName());
        ammountTextView.setText("" + ( (ActiveMember)member).getAmountBase());

    }

}
