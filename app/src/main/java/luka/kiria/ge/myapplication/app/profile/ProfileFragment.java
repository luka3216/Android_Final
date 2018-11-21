package luka.kiria.ge.myapplication.app.profile;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

import luka.kiria.ge.myapplication.API;
import luka.kiria.ge.myapplication.R;
import luka.kiria.ge.myapplication.RetrofitInstance;
import luka.kiria.ge.myapplication.app.profile.models.ClientAddress;
import luka.kiria.ge.myapplication.app.profile.models.ProfileInfo;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class ProfileFragment extends Fragment {

    private TextView firstnameTextField;
    private TextView lastnameTextField;
    private TextView sexTextField;
    private TextView birthdateTextField;
    private TextView clientCategoryTextField;
    private TextView phoneTextField;
    private TextView addressTextField;
    private TextView emailTextField;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.profile_fragment, container, false);
        bindViews(view);
        Retrofit retrofit = RetrofitInstance.getInstance();
        API api = retrofit.create(API.class);
        api.getProfileInfo().enqueue(new Callback<ProfileInfo>() {
            @Override
            public void onResponse(Call<ProfileInfo> call, Response<ProfileInfo> response) {
                if (response.isSuccessful()) {
                    setData(response.body());
                }
            }

            @Override
            public void onFailure(Call<ProfileInfo> call, Throwable t) {
            }
        });
        return view;
    }

    private void bindViews(View view) {
        firstnameTextField = view.findViewById(R.id.nameTextView);
        lastnameTextField = view.findViewById(R.id.lastNameTextField);
        sexTextField = view.findViewById(R.id.sexTextField);
        birthdateTextField = view.findViewById(R.id.birthdayTextField);
        clientCategoryTextField = view.findViewById(R.id.clientCategoryTextView);
        phoneTextField = view.findViewById(R.id.phoneTextView);
        addressTextField = view.findViewById(R.id.addressTextView);
        emailTextField = view.findViewById(R.id.emailTextView);
    }

    public void setData(ProfileInfo data) {
        firstnameTextField.setText(data.getClient().getFirstName());
        lastnameTextField.setText(data.getClient().getLastName());
        sexTextField.setText(data.getClient().getSex().equals("M") ? "მამრობითი" : "მდედრობითი");
        birthdateTextField.setText(new SimpleDateFormat("yyyy-mm-dd").format(new Date(data.getClient().getBirthDate())));
        clientCategoryTextField.setText(data.getClient().getCategoryType());
        phoneTextField.setText(data.getClientPhones().get(0).getMobile());
        ClientAddress address = data.getClientAddresses().get(0);
        addressTextField.setText(address.getStreet() + " " + address.getBuilding());
        emailTextField.setText(data.getClientMails().get(0).getMail());
    }
}
