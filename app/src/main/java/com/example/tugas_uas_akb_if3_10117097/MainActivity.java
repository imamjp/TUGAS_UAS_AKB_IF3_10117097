package com.example.tugas_uas_akb_if3_10117097;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.tugas_uas_akb_if3_10117097.Database.DatabaseHelper;
import com.example.tugas_uas_akb_if3_10117097.View.ContactActivity;
import com.example.tugas_uas_akb_if3_10117097.View.ListTourPlaceActivity;
import com.example.tugas_uas_akb_if3_10117097.View.ProfileActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/** NIM : 10117097
 * Nama : Imam Jati Permana
 * Kelas : IF-3
 * Tanggal : 09-08-2020**/
public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

  //  MenuItem menuItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
//        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#03AC0E")));

        DatabaseHelper dh = new DatabaseHelper(getBaseContext());
        Toast.makeText(getApplication(), dh.getDatabaseName() +" sudah ada", Toast.LENGTH_SHORT).show();

        bottomNavigationView = findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
        //I added this if statement to keep the selected fragment when rotating the device
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new ListTourPlaceActivity()).commit();
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        FragmentManager fragmentManager = getSupportFragmentManager();
        ListTourPlaceActivity fragmentListTour = new ListTourPlaceActivity();
        fragmentManager.beginTransaction().replace(R.id.fragment_container, fragmentListTour).commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;
                    switch (item.getItemId()) {
                        case R.id.friend:
                            selectedFragment = new ListTourPlaceActivity();
                            break;
                        case R.id.contact:
                            selectedFragment = new ContactActivity();
                            break;
                        case R.id.profile:
                            selectedFragment = new ProfileActivity();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();
                    return true;
                }
            };

}
