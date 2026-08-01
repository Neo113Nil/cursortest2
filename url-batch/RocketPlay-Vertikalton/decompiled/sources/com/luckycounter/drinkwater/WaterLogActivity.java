package com.luckycounter.drinkwater;

import S0.a;
import S0.o;
import S0.p;
import U0.g;
import android.os.Bundle;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.luckycounter.drinkwater.data.HydrationRepository;
import g.AbstractActivityC0129i;
import i1.f;
import q1.AbstractC0352s;

/* loaded from: classes.dex */
public final class WaterLogActivity extends AbstractActivityC0129i {

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f2487B = 0;

    /* renamed from: A, reason: collision with root package name */
    public g f2488A;

    /* renamed from: y, reason: collision with root package name */
    public final V0.g f2489y = new V0.g(new a(this, 4));

    /* renamed from: z, reason: collision with root package name */
    public HydrationRepository f2490z;

    @Override // g.AbstractActivityC0129i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(t().f1162a);
        this.f2490z = new HydrationRepository(this);
        this.f2488A = new g(new o(this));
        t().f1163b.setLayoutManager(new LinearLayoutManager(1));
        RecyclerView recyclerView = t().f1163b;
        g gVar = this.f2488A;
        if (gVar != null) {
            recyclerView.setAdapter(gVar);
        } else {
            f.h("adapter");
            throw null;
        }
    }

    @Override // g.AbstractActivityC0129i, android.app.Activity
    public final void onResume() {
        super.onResume();
        AbstractC0352s.g(J.e(this), null, new p(this, null), 3);
    }

    public final T0.g t() {
        return (T0.g) this.f2489y.a();
    }
}
