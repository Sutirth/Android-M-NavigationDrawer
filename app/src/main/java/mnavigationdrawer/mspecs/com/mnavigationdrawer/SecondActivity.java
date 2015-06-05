package mnavigationdrawer.mspecs.com.mnavigationdrawer;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Lenovo on 02-06-2015.
 */
public class SecondActivity extends Fragment {

        @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.second_activity,
                container, false);

        return rootView;
    }

//            @Override
//    public void onCreate(Bundle savedInstanceState){
//                super.onCreate(savedInstanceState);
//                setContentView(R.layout.second_activity);
//                Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//                setSupportActionBar(toolbar);
//                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//                getSupportActionBar().setTitle("Second Screen");
//
//
//
//            }

     @Override
        public boolean onOptionsItemSelected(MenuItem item){
         switch (item.getItemId()){
             case android.R.id.home:
                    //onBackPressed();
                    return true;
             default:
                 return super.onOptionsItemSelected(item);
         }
     }


}
