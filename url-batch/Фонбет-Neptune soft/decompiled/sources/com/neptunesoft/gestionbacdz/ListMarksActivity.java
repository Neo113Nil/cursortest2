package com.neptunesoft.gestionbacdz;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.neptunesoft.gestionbacdz.adapter.AdapterMarks;
import com.neptunesoft.gestionbacdz.classobjects.Avg;
import com.neptunesoft.gestionbacdz.classobjects.Mark;
import com.neptunesoft.gestionbacdz.database.DataBaseMarks;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ListMarksActivity extends AppCompatActivity {
    static AdapterMarks adapterMarks;
    static Avg avg;
    static List<Object> list = new ArrayList();
    static RecyclerView listMarksRecyclerView;
    Button deleteMarks;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_marks);
        listMarksRecyclerView = (RecyclerView) findViewById(R.id.listMarksRecyclerView);
        this.deleteMarks = (Button) findViewById(R.id.deleteMarks);
        listMarksRecyclerView.setHasFixedSize(false);
        listMarksRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.deleteMarks.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.ListMarksActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ListMarksActivity.this.m662lambda$onCreate$3$comneptunesoftgestionbacdzListMarksActivity(view);
            }
        });
        refreshRecycleView(this);
    }

    /* renamed from: lambda$onCreate$3$com-neptunesoft-gestionbacdz-ListMarksActivity, reason: not valid java name */
    /* synthetic */ void m662lambda$onCreate$3$comneptunesoftgestionbacdzListMarksActivity(View view) {
        final AlertDialog create = new AlertDialog.Builder(this).create();
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.gestionbacdz.ListMarksActivity$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ListMarksActivity.this.m660lambda$onCreate$0$comneptunesoftgestionbacdzListMarksActivity(create, dialogInterface);
            }
        });
        create.setMessage("هل تريد حذف هذا الثلاثي ؟\nتنبيه : عملية الحذف هذه ستؤدي إلى حذف جميع العلامات في كل المواد الخاصة بهذا الثلاثي فقط.");
        create.setButton(-1, "حذف", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.ListMarksActivity$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ListMarksActivity.this.m661lambda$onCreate$1$comneptunesoftgestionbacdzListMarksActivity(create, dialogInterface, i);
            }
        });
        create.setButton(-2, "إلغاء", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.ListMarksActivity$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        create.show();
    }

    /* renamed from: lambda$onCreate$0$com-neptunesoft-gestionbacdz-ListMarksActivity, reason: not valid java name */
    /* synthetic */ void m660lambda$onCreate$0$comneptunesoftgestionbacdzListMarksActivity(AlertDialog alertDialog, DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        alertDialog.getButton(-1).setTextColor(getResources().getColor(R.color.blue));
        alertDialog.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    /* renamed from: lambda$onCreate$1$com-neptunesoft-gestionbacdz-ListMarksActivity, reason: not valid java name */
    /* synthetic */ void m661lambda$onCreate$1$comneptunesoftgestionbacdzListMarksActivity(AlertDialog alertDialog, DialogInterface dialogInterface, int i) {
        alertDialog.dismiss();
        new DataBaseMarks(this, SplashScreen.darkmode).deleteTriple(avg.getId_triple());
        Toast.makeText(this, "تمت عملية الحذف بنجاح", 0).show();
        AvgActivity.refreshRecycleView(this);
        finish();
    }

    static void refreshRecycleView(final Context context) {
        DataBaseMarks dataBaseMarks = new DataBaseMarks(context, SplashScreen.darkmode);
        list.clear();
        list = dataBaseMarks.getAllMarks(avg.getId_triple());
        AdapterMarks adapterMarks2 = new AdapterMarks(list);
        adapterMarks = adapterMarks2;
        listMarksRecyclerView.setAdapter(adapterMarks2);
        adapterMarks.setClickListener(new AdapterMarks.ItemClickListener() { // from class: com.neptunesoft.gestionbacdz.ListMarksActivity$$ExternalSyntheticLambda4
            @Override // com.neptunesoft.gestionbacdz.adapter.AdapterMarks.ItemClickListener
            public final void onItemClick(View view, int i) {
                ListMarksActivity.lambda$refreshRecycleView$4(context, view, i);
            }
        });
    }

    static /* synthetic */ void lambda$refreshRecycleView$4(Context context, View view, int i) {
        ShowEditMarkActivity.mark = (Mark) list.get(i);
        context.startActivity(new Intent(context, (Class<?>) ShowEditMarkActivity.class));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        AvgActivity.refreshRecycleView(this);
    }
}
