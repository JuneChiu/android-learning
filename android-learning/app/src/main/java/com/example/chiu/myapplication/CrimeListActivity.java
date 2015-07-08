package com.example.chiu.myapplication;

import android.support.v4.app.Fragment;

/**
 * Created by chiu on 7/8/15.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }

}
