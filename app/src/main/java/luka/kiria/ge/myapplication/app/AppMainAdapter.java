package luka.kiria.ge.myapplication.app;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v7.app.AppCompatActivity;

import luka.kiria.ge.myapplication.app.profile.ProfileFragment;

public class AppMainAdapter extends FragmentStatePagerAdapter {

    private static final String[] TITLES = {"პროფილი", "აქტივები", "გადახდების ისტორია", "ბარათები"};

    public AppMainAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new ProfileFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return TITLES[position];
    }
}
