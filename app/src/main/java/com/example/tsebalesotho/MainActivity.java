package com.example.tsebalesotho;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Model> models;
    private RecyclerView recyclerView;
    private Adaptor.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        models = new ArrayList<>();

        setModelInfo();
        setAdapter();
    }

    private void setAdapter() {
        setOnClickListener();
        Adaptor adaptor = new Adaptor(models, listener);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(adaptor);
    }

    private void setModelInfo() {
        models.add(new Model(R.drawable.ha_kome, "Ha-Kome Cave Houses", "The tall, deep rock overhangs that characterise the highlands of Lesotho have provided shelter to humans since time immemorial."));
        models.add(new Model(R.drawable.mafika_lisiu_post, "Mafika-lisiu Pass", "Mafika Lisiu Pass is a high mountain pass at an elevation of 3.090m (10,137ft) above the sea level."));
        models.add(new Model(R.drawable.mohale, "Mohale Dam", "Mohale Dam is the second largest dam in the Lesotho Highlands Water Project (LHWP). It is a concrete-faced rockfill\n" +
                "dam. It is connected to Katse Dam through a transfer tunnel which has a maximum capacity of 807.56 million m3/a. \n"));
        models.add(new Model(R.drawable.morija_museum, "Morija museum & Archive", "Morija Museum & Archives, also known as Morija Museum, is located in Morija, a large village in the Maseru district of Lesotho."));
        models.add(new Model(R.drawable.seaka_bridge, "Seaka bridge", "Seaka Bridge is one of the iconic places in Lesotho. The bridge is a colonial legacy."));
        models.add(new Model(R.drawable.lesotho_original, "Ts’ehlanyane national park", "This is the largest National Park in Lesotho. The park owes its very existence to the “Hlotse Tunnel” adit (Lesotho Highlands Water Project)."));
        models.add(new Model(R.drawable.gates_of_paradise, "Gates of Paradise Pass", "Lay your eyes on the landscape via Gates of Paradise Pass, a path that showcases a colorful panorama of mountains and skies. "));
        models.add(new Model(R.drawable.thaba_bosiu, "Thaba-Bosiu National Monument", "Thaba Bosiu was used as a hideout by Moshoeshoe I and his subjects after they migrated from Butha-Buthe in 1824 escaping the ravages of the Difaqane/Mfecane Wars"));
    }

    private void setOnClickListener() {
        listener = (view, position) -> {
            Intent intent = new Intent(getApplicationContext(),details.class);
            intent.putExtra("title2", "Ha-Kome Cave Houses");
            intent.putExtra("img",R.drawable.kome_aftr_click);
            intent.putExtra("desc1", "The tall, deep rock overhangs that characterise the highlands of Lesotho have provided shelter to humans since time immemorial. In prehistoric times, these spacious natural refuges are where San (Bushman) families would huddle together around a fire to eat and exchange stories, while their shamans performed mysterious trance rituals and adorned the walls with colourful rock paintings. More recently, the caves of the highlands have offered sanctuary to many a blanketed Basotho shepherd and his livestock on a cold winter night. The cave dwelling tradition of Lesotho reaches its modern apotheosis at Ha Kome, some 60km northeast of Maseru. Here, a cluster of five beautifully constructed igloo-like huts is set entirely within a deep natural overhang, their smooth and curvaceous adobe exteriors reminiscent more of the adobe architecture of Mali’s Bandiagara Escarpment than of anything else in you’ll see Southern Africa.");
            intent.putExtra("desc2", "Still inhabited by a few fourth-generation descendants of its founders, the cave village at Ha Kome reputedly dates back to 1824, when it served as a hideout for Basia and Bataung clans from the Eastern Cape during the same Difaqane Wars that prompted King Moshoeshoe to retreat to the fortresslike heights of Thaba Bosiu.");
            intent.putExtra("desc3", "A few vestigial pock paintings dating to an earlier San (Bushmen) occupation can also be seen in the cattle kraal at the far end of the overhang. The tall trees that shelter the entrance to this far side of the cave were reputedly planted as protection from lightning when the ancestors of the present-day inhabitants arrived there almost 200 years ago. ");
            startActivity(intent);

        };
    }
}