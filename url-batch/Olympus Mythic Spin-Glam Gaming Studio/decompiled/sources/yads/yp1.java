package yads;

import android.content.Context;
import android.view.View;
import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import com.monetization.ads.mediation.nativeads.MediatedNativeAd;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class yp1 implements v72 {
    public final v72 a;
    public final MediatedNativeAd b;
    public final xp1 c;
    public final r7 d;
    public boolean e;

    public yp1(v72 v72Var, MediatedNativeAd mediatedNativeAd, xp1 xp1Var, r7 r7Var) {
        this.a = v72Var;
        this.b = mediatedNativeAd;
        this.c = xp1Var;
        this.d = r7Var;
    }

    @Override // yads.v72
    public final void a(a22 a22Var) {
        this.a.a(a22Var);
        n22 n22Var = a22Var.c;
        View a = n22Var.a();
        if (a != null) {
            this.b.unbindNativeAd(new jp1(a, n22Var));
        }
        if (this.e) {
            this.d.a();
        }
    }

    @Override // yads.v72
    public final void a(a22 a22Var, cv cvVar) {
        MediatedAdapterInfo b;
        this.a.a(a22Var, cvVar);
        n22 n22Var = a22Var.c;
        View a = n22Var.a();
        if (a != null) {
            this.b.bindNativeAd(new jp1(a, n22Var));
        }
        r7 r7Var = this.d;
        if (r7Var.b()) {
            ((y7) r7Var.h.getValue()).onAdDisplayed();
        }
        if (a22Var.c.a() == null || this.e) {
            return;
        }
        this.e = true;
        xp1 xp1Var = this.c;
        wn1 wn1Var = xp1Var.b;
        Context context = xp1Var.a;
        LinkedHashMap linkedHashMap = xp1Var.c;
        tn1 tn1Var = wn1Var.o;
        String str = null;
        er1 er1Var = tn1Var != null ? tn1Var.b : null;
        if (er1Var != null) {
            so1 so1Var = wn1Var.f;
            if (tn1Var != null && (b = tn1Var.c.b()) != null) {
                str = b.getNetworkName();
            }
            String str2 = str;
            so1Var.getClass();
            Iterator it = so1.g.iterator();
            while (it.hasNext()) {
                so1Var.a(context, (fo2) it.next(), er1Var, str2, linkedHashMap);
            }
        }
    }

    @Override // yads.v72
    public final void a() {
        this.a.a();
    }
}
