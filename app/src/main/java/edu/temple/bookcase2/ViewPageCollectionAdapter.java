package edu.temple.bookcase2;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPageCollectionAdapter extends FragmentStatePagerAdapter {
    public ViewPageCollectionAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        ViewPage v = new ViewPage();
        BookDetailsFragment d= new BookDetailsFragment();
        Bundle b= d.getBundle();

        v.setArguments(b);
        return v;
    }

    @Override
    public int getCount() {
        return 10;
    }
}
