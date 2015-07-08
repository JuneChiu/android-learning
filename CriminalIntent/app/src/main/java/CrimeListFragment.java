import android.os.Bundle;
import android.support.v4.app.ListFragment;

import com.example.chiu.criminalintent.Crime;
import com.example.chiu.criminalintent.R;

import java.util.ArrayList;

/**
 * Created by chiu on 7/7/15.
 */
public class CrimeListFragment extends ListFragment {

    private ArrayList<Crime> mCrimes;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        getActivity().setTitle(R.string.crime_title);

        mCrimes = CrimeLab.ge
    }

}
