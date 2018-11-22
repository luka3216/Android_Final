package luka.kiria.ge.myapplication.app.cards;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

import luka.kiria.ge.myapplication.R;
import luka.kiria.ge.myapplication.app.cards.models.Card;
import luka.kiria.ge.myapplication.app.history.models.MyOperation;

public class CardViewHolder extends RecyclerView.ViewHolder {
    private TextView cardTypeTextField;
    private TextView cardExpireDateTextField;
    private TextView cardNumberTextField;
    private TextView cardHolderNameTextField;
    private ImageView cardThumbnail;
    private RelativeLayout relativeLayout;

    public CardViewHolder(@NonNull View itemView) {
        super(itemView);
        cardTypeTextField = itemView.findViewById(R.id.cardTypeTextField);
        cardExpireDateTextField = itemView.findViewById(R.id.cardExpireDateTextField);
        cardNumberTextField = itemView.findViewById(R.id.cardNumberTextField);
        cardHolderNameTextField = itemView.findViewById(R.id.holderNameTextField);
        cardThumbnail = itemView.findViewById(R.id.cardThumbnail);
        relativeLayout = itemView.findViewById(R.id.cardRelativeLayout);

    }

    public void bindData(Card card) {
        String date = new SimpleDateFormat("MM/yy").format(new Date(card.getExpDate()));
        cardExpireDateTextField.setText(date);
        cardTypeTextField.setText(card.getNameDictionaryValue());
        cardNumberTextField.setText("XXXX XXXX XXXX " + card.getLastFour());
        cardHolderNameTextField.setText(card.getCardHolder());
        if (card.getCardClass().equals("AMEX")) {
            cardThumbnail.setImageResource(R.drawable.card_icon_amex_single);
        } else {
            cardThumbnail.setImageResource(R.drawable.card_icon_visa_border_single);
        }
        switch (card.getCardId() % 3) {
            default:
                relativeLayout.setBackgroundResource(R.drawable.account_background_visa_gold);
                break;
            case 1:
                relativeLayout.setBackgroundResource(R.drawable.account_background_solo);
                break;
            case 2:
                relativeLayout.setBackgroundResource(R.drawable.account_background_amex_green);
                break;
        }
    }


}
