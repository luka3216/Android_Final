package luka.kiria.ge.myapplication.app.history;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Date;

import luka.kiria.ge.myapplication.R;
import luka.kiria.ge.myapplication.app.actives.ActivesViewHolder;
import luka.kiria.ge.myapplication.app.history.models.MyOperation;

public class HistoryViewHolder extends RecyclerView.ViewHolder {
    private TextView dateTextView;
    private TextView merchantTextView;
    private TextView amountTextView;
    private TextView entryGroupTextView;

    public HistoryViewHolder(@NonNull View itemView) {
        super(itemView);
        dateTextView = itemView.findViewById(R.id.dateTextView);
        merchantTextView = itemView.findViewById(R.id.merchantTextView);
        amountTextView = itemView.findViewById(R.id.historyAmountTextview);
        entryGroupTextView = itemView.findViewById(R.id.entryGroupTextField);
    }

    public void bindData(MyOperation myOperation) {
        String opDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date(myOperation.getDate()));
        String todayDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String date = opDate.equals(todayDate) ? "დღეს" : opDate;
        dateTextView.setText(date);
        String merchant;
        switch (myOperation.getEntryGroupNameId()) {
            case 7:
                merchant = myOperation.getMerchantName();
                amountTextView.setText((-myOperation.getAmount()) + " ლარი");
                break;
            case 5:
            case 6:
                merchant = myOperation.getBeneficiary();
                amountTextView.setText(myOperation.getAmount() + " ლარი");
                break;
            default:
                merchant = "საკუთარი";
                amountTextView.setText((-myOperation.getAmount()) + " ლარი");

        }
        merchantTextView.setText(merchant);
        entryGroupTextView.setText(myOperation.getEntryGroupName());
    }


}
