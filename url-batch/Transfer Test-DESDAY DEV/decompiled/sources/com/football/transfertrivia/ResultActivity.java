package com.football.transfertrivia;

import R0.ViewOnClickListenerC0027a;
import V0.m;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.football.transfertrivia.db.AppDatabase;
import g1.f;
import o1.AbstractC0302t;
import o1.AbstractC0308z;
import s0.o;
import s0.s;
import t0.c;

/* loaded from: classes.dex */
public final class ResultActivity extends AppCompatActivity {

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f1748C = 0;

    /* renamed from: A, reason: collision with root package name */
    public AppDatabase f1749A;

    /* renamed from: B, reason: collision with root package name */
    public o f1750B;

    /* renamed from: z, reason: collision with root package name */
    public c f1751z;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c inflate = c.inflate(getLayoutInflater());
        this.f1751z = inflate;
        if (inflate == null) {
            f.g("binding");
            throw null;
        }
        setContentView(inflate.f3777a);
        this.f1749A = AppDatabase.Companion.getDatabase(this);
        int intExtra = getIntent().getIntExtra("FINAL_SCORE", 0);
        String string = getIntent().getIntExtra("QUESTIONS_ANSWERED", 0) >= 10 ? getString(R.string.game_completed) : getString(R.string.game_over);
        f.b(string);
        c cVar = this.f1751z;
        if (cVar == null) {
            f.g("binding");
            throw null;
        }
        cVar.f3780e.setText(string);
        c cVar2 = this.f1751z;
        if (cVar2 == null) {
            f.g("binding");
            throw null;
        }
        cVar2.d.setText(getString(R.string.final_score, Integer.valueOf(intExtra)));
        o oVar = new o();
        oVar.d = m.f875a;
        this.f1750B = oVar;
        c cVar3 = this.f1751z;
        if (cVar3 == null) {
            f.g("binding");
            throw null;
        }
        cVar3.f3779c.setLayoutManager(new LinearLayoutManager(1));
        c cVar4 = this.f1751z;
        if (cVar4 == null) {
            f.g("binding");
            throw null;
        }
        o oVar2 = this.f1750B;
        if (oVar2 == null) {
            f.g("leaderboardAdapter");
            throw null;
        }
        cVar4.f3779c.setAdapter(oVar2);
        AbstractC0302t.i(J.e(this), AbstractC0308z.f3346b, new s(this, null));
        c cVar5 = this.f1751z;
        if (cVar5 != null) {
            cVar5.f3778b.setOnClickListener(new ViewOnClickListenerC0027a(5, this));
        } else {
            f.g("binding");
            throw null;
        }
    }
}
