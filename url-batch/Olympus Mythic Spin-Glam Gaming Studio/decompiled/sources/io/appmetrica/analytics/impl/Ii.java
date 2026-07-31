package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.C4538a2;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class Ii extends Bn {
    public final Hi d;
    public final ICommonExecutor e;

    public Ii(@NonNull C5532n5 c5532n5, @NonNull InterfaceC5239bm interfaceC5239bm, @NonNull ICommonExecutor iCommonExecutor) {
        super(c5532n5, interfaceC5239bm);
        this.d = new Hi(this);
        this.e = iCommonExecutor;
    }

    @Override // io.appmetrica.analytics.impl.Bn
    public final void a() {
        this.e.remove(this.d);
    }

    @Override // io.appmetrica.analytics.impl.Bn
    public final void f() {
        this.b.a();
        C5804xh c5804xh = (C5804xh) ((C5532n5) this.a).k.a();
        if (c5804xh.k.a(c5804xh.j)) {
            String str = c5804xh.m;
            if (TextUtils.isEmpty(str) || C4538a2.f.equals(str)) {
                return;
            }
            try {
                a(C5620qe.a((C5532n5) this.a));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Bn
    public final void g() {
        this.e.executeDelayed(this.d, TimeUnit.SECONDS.toMillis(1L));
    }

    public final void h() {
        if (this.c.get()) {
            return;
        }
        this.e.remove(this.d);
        if (((C5804xh) ((C5532n5) this.a).k.a()).g > 0) {
            this.e.executeDelayed(this.d, TimeUnit.SECONDS.toMillis(((C5804xh) ((C5532n5) this.a).k.a()).g));
        }
    }
}
