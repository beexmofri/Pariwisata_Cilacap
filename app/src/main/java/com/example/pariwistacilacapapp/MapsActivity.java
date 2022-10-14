package com.example.pariwistacilacapapp;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.pariwistacilacapapp.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng KarangBolong = new LatLng(-7.7602277440208285, 109.04318342493698);
        mMap.addMarker(new MarkerOptions().position(KarangBolong).title("Benteng Karang Bolong"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(KarangBolong));

        LatLng Pendem = new LatLng(-7.749041238946359, 109.01732334179805);
        mMap.addMarker(new MarkerOptions().position(Pendem).title("Benteng Pendem"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Pendem));

        LatLng Cimandaway = new LatLng(-7.2176514004104435, 108.60842823995102);
        mMap.addMarker(new MarkerOptions().position(Cimandaway).title("Curug Cimandaway"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Cimandaway));

        LatLng Mandala = new LatLng(-7.590267793513075, 109.05432732645752);
        mMap.addMarker(new MarkerOptions().position(Mandala).title("Curug Mandala"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Mandala));

        LatLng Kemit = new LatLng(-7.466974588972991, 108.84040608043794);
        mMap.addMarker(new MarkerOptions().position(Kemit).title("Kemit Forest"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Kemit));

        LatLng Kemiren = new LatLng(-7.696787957948564, 109.05770358412789);
        mMap.addMarker(new MarkerOptions().position(Kemiren).title("Pantai Kemiren"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Kemiren));

        LatLng Widarapayung = new LatLng(-7.696829783163117, 109.24665351296275);
        mMap.addMarker(new MarkerOptions().position(Widarapayung).title("Pantai Widarapauyung"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Widarapayung));

        LatLng Mandara = new LatLng(-7.680607138340607, 109.18488087063253);
        mMap.addMarker(new MarkerOptions().position(Mandara).title("Pura Mandara Giri Selok"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Mandara));

        LatLng Teluk = new LatLng(-7.733689738605224, 109.02187231908077);
        mMap.addMarker(new MarkerOptions().position(Teluk).title("Pantai Teluk Penyu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Teluk));

        LatLng Waduk = new LatLng(-7.614625407374823, 108.9604459534482);
        mMap.addMarker(new MarkerOptions().position(Waduk).title("Waduk Kubangkakung"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Waduk));

    }
}
