package yads;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* loaded from: classes13.dex */
public final class ie1 implements hg0 {
    public final m12 a;
    public final x00 b;
    public final ku c;
    public final ae1 d;
    public final oe1 e;
    public final xe1 f;
    public final String g;
    public final mt1 h;
    public final d2 i;
    public final s3 j;
    public xw1 k;
    public lw1 l;

    public ie1(m12 m12Var, x00 x00Var, ku kuVar, ae1 ae1Var, oe1 oe1Var, xe1 xe1Var, String str, mt1 mt1Var, d2 d2Var, s3 s3Var) {
        this.a = m12Var;
        this.b = x00Var;
        this.c = kuVar;
        this.d = ae1Var;
        this.e = oe1Var;
        this.f = xe1Var;
        this.g = str;
        this.h = mt1Var;
        this.i = d2Var;
        this.j = s3Var;
    }

    public static final String b(ie1 ie1Var) {
        Object runBlocking$default;
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new ce1(ie1Var, null), 1, null);
        return (String) runBlocking$default;
    }

    @Override // yads.hg0
    public final void c() {
        this.a.a((x00) null);
        lw1 lw1Var = this.l;
        if (lw1Var != null) {
            mp0 mp0Var = lw1Var.j;
            mp0Var.d.removeCallbacksAndMessages(null);
            mp0Var.e = null;
            sw1 sw1Var = lw1Var.c;
            lw1Var.a.getContext();
            String str = lw1Var.k;
            sw1Var.getClass();
            if (zo2.b == null) {
                synchronized (zo2.a) {
                    if (zo2.b == null) {
                        zo2.b = new zo2();
                    }
                }
            }
            zo2.a(str);
            lw1Var.l = null;
            lw1Var.m = null;
            lw1Var.n = null;
            lw1Var.o = null;
            lw1Var.p = null;
            lw1Var.q = null;
        }
        this.l = null;
        xw1 xw1Var = this.k;
        if (xw1Var != null) {
            ViewParent parent = xw1Var.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(xw1Var);
            }
            xw1Var.c();
        }
        this.k = null;
    }

    @Override // yads.hg0
    public final void a(ViewGroup viewGroup) {
        ExtendedNativeAdView extendedNativeAdView = (ExtendedNativeAdView) viewGroup;
        try {
            this.a.a(new mi(null, 3).a(extendedNativeAdView, new wy1()), this.c);
            this.a.a(this.b);
        } catch (v02 e) {
            this.h.reportError("Failed to bind LightBundle Native Ad", e);
        }
        a(extendedNativeAdView);
    }

    public final void a(ExtendedNativeAdView extendedNativeAdView) {
        Context context = extendedNativeAdView.getContext();
        int i = xw1.$r8$clinit;
        xw1 xw1Var = new xw1(context, new vn3(), null);
        this.k = xw1Var;
        lw1 lw1Var = new lw1(xw1Var, CollectionsKt.listOf(new ft2("lightBundle.js", new gt2() { // from class: yads.ie1$$ExternalSyntheticLambda0
            @Override // yads.gt2
            public final String a() {
                return ie1.b(ie1.this);
            }
        })), 126);
        this.l = lw1Var;
        a(lw1Var, xw1Var);
        xw1Var.setHtmlWebViewListener(new be1(lw1Var, this, xw1Var));
        extendedNativeAdView.addView(xw1Var, new ViewGroup.LayoutParams(-1, -1));
        lw1Var.a(this.g);
    }

    public final void a(lw1 lw1Var, final xw1 xw1Var) {
        lw1Var.o = new de1(this);
        lw1Var.l = new ee1(this);
        lw1Var.q = new jw1() { // from class: yads.ie1$$ExternalSyntheticLambda1
            @Override // yads.jw1
            public final void a() {
                ie1.a(xw1.this);
            }
        };
        lw1Var.m = new fe1(this);
        lw1Var.n = new ge1();
        lw1Var.p = new he1();
    }

    public static final void a(xw1 xw1Var) {
        xw1Var.a();
    }
}
