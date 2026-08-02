package com.neptunesoft.gestionbacdz;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.neptunesoft.gestionbacdz.adapter.AdapterAvg;
import com.neptunesoft.gestionbacdz.classobjects.Avg;
import com.neptunesoft.gestionbacdz.database.DataBaseMarks;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class AvgActivity extends AppCompatActivity {
    static AdapterAvg adapterAvg;
    static List<Object> list = new ArrayList();
    static RecyclerView recyclerViewAvg;
    Button addTriple;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avg);
        recyclerViewAvg = (RecyclerView) findViewById(R.id.avgRecyclerView);
        this.addTriple = (Button) findViewById(R.id.addTriple);
        recyclerViewAvg.setHasFixedSize(false);
        recyclerViewAvg.setLayoutManager(new LinearLayoutManager(this));
        this.addTriple.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.AvgActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AvgActivity.this.m524lambda$onCreate$0$comneptunesoftgestionbacdzAvgActivity(view);
            }
        });
        refreshRecycleView(this);
    }

    /* renamed from: lambda$onCreate$0$com-neptunesoft-gestionbacdz-AvgActivity, reason: not valid java name */
    /* synthetic */ void m524lambda$onCreate$0$comneptunesoftgestionbacdzAvgActivity(View view) {
        startActivity(new Intent(this, (Class<?>) AddTripleActivity.class));
    }

    static void refreshRecycleView(final Context context) {
        DataBaseMarks dataBaseMarks = new DataBaseMarks(context, SplashScreen.darkmode);
        list.clear();
        list = dataBaseMarks.getAllAvg();
        AdapterAvg adapterAvg2 = new AdapterAvg(list);
        adapterAvg = adapterAvg2;
        recyclerViewAvg.setAdapter(adapterAvg2);
        adapterAvg.setClickListener(new AdapterAvg.ItemClickListener() { // from class: com.neptunesoft.gestionbacdz.AvgActivity$$ExternalSyntheticLambda1
            @Override // com.neptunesoft.gestionbacdz.adapter.AdapterAvg.ItemClickListener
            public final void onItemClick(View view, int i) {
                AvgActivity.lambda$refreshRecycleView$1(context, view, i);
            }
        });
    }

    static /* synthetic */ void lambda$refreshRecycleView$1(Context context, View view, int i) {
        ListMarksActivity.avg = (Avg) list.get(i);
        context.startActivity(new Intent(context, (Class<?>) ListMarksActivity.class));
    }
}
