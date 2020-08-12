package com.example.tugas_uas_akb_if3_10117097.View;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.example.tugas_uas_akb_if3_10117097.Database.TourPlace;
import com.example.tugas_uas_akb_if3_10117097.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/** NIM : 10117097
 * Nama : Imam Jati Permana
 * Kelas : IF-3
 * Tanggal : 09-08-2020**/

public class MapActivity extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap map;
    private TourPlace tp;


    public static final String EXTRA_NOTE = "extra_note";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
 //       getSupportActionBar().hide();

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        tp = getIntent().getParcelableExtra(EXTRA_NOTE);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;

        LatLng farmhouse = new LatLng(Double.valueOf(tp.getLang()), Double.valueOf(tp.getLeng()));
        map.addMarker(new MarkerOptions().position(farmhouse).title(tp.getNama()));
        map.moveCamera(CameraUpdateFactory.newLatLng(farmhouse));
        map.animateCamera(CameraUpdateFactory.zoomTo(15),200, null);

    }
}
