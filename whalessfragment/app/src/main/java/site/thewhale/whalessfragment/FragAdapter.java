package site.thewhale.whalessfragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import site.thewhale.whalessfragment.fragments.FragOne;
import site.thewhale.whalessfragment.fragments.FragThree;
import site.thewhale.whalessfragment.fragments.FragTwo;

public class FragAdapter extends FragmentPagerAdapter {


    public FragAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FragOne();
            case 1:
                return new FragTwo();
            case 2:
                return new FragThree();

        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
