package com.meta.analytics.dsp.uinode;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdNativeComponentView;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class V6 extends RD {
    public static String[] A04 = {"oSoBkaWeyKsp", "KBeBF", "kSDces9j50gwfjS4QfNYnWgLw2iPkymV", "EJmszBWYtRUz1Vdq", "qn5qycmxyPd80aqzWiKeSrAoNfum3VnE", "21Cce2q6wYIDkABj", "e4Lw2G3U", "jRNkDTlKn5mABl6KQSYrYYCrXHx6B19g"};
    public final /* synthetic */ View A00;
    public final /* synthetic */ C1007bK A01;
    public final /* synthetic */ V2 A02;
    public final /* synthetic */ boolean A03;

    public V6(V2 v2, View view, boolean z, C1007bK c1007bK) {
        this.A02 = v2;
        this.A00 = view;
        this.A03 = z;
        this.A01 = c1007bK;
    }

    @Override // com.meta.analytics.dsp.uinode.RD
    public final void A00() {
        JZ jz;
        jz = this.A02.A0e;
        jz.A06();
    }

    @Override // com.meta.analytics.dsp.uinode.RD
    public final void A02() {
        JZ jz;
        jz = this.A02.A0e;
        jz.A0A();
    }

    @Override // com.meta.analytics.dsp.uinode.RD
    public final void A03() {
        JZ jz;
        JZ jz2;
        C0889Yn c0889Yn;
        RE re;
        WeakReference weakReference;
        C0548Lg c0548Lg;
        JZ jz3;
        C0997bA c0997bA;
        View view;
        View view2;
        C0997bA c0997bA2;
        View view3;
        C0997bA c0997bA3;
        View view4;
        C0997bA c0997bA4;
        JS js;
        C0997bA c0997bA5;
        boolean z;
        C0997bA c0997bA6;
        boolean z2;
        C0997bA c0997bA7;
        boolean z3;
        C0997bA c0997bA8;
        boolean A0p;
        C0997bA c0997bA9;
        AnonymousClass12 anonymousClass12;
        C0997bA c0997bA10;
        boolean z4;
        C0997bA c0997bA11;
        NativeAdLayout nativeAdLayout;
        C0997bA c0997bA12;
        String str;
        C0997bA c0997bA13;
        C0997bA c0997bA14;
        WeakReference weakReference2;
        WeakReference weakReference3;
        RE re2;
        Drawable drawable;
        RE re3;
        JZ jz4;
        RE re4;
        JZ jz5;
        jz = this.A02.A0e;
        jz.A0B();
        if (C0478Ih.A1o(this.A02.A11())) {
            View view5 = this.A00;
            if (view5 instanceof AdNativeComponentView) {
                View adContentsView = ((AdNativeComponentView) view5).getAdContentsView();
                if ((adContentsView instanceof QJ) && !((QJ) adContentsView).A02()) {
                    re4 = this.A02.A0R;
                    re4.A0T();
                    jz5 = this.A02.A0e;
                    jz5.A08();
                    return;
                }
            }
        }
        if (this.A03) {
            ImageView imageView = (ImageView) this.A00;
            if (A04[6].length() != 8) {
                throw new RuntimeException();
            }
            A04[4] = "kV1RqodiW8kqR1rQOQ4NCiAB35VpASKe";
            drawable = this.A02.A01;
            if (drawable == null) {
                re3 = this.A02.A0R;
                re3.A0T();
                jz4 = this.A02.A0e;
                jz4.A07();
                return;
            }
            V2.A0e(drawable, imageView);
        }
        jz2 = this.A02.A0e;
        c0889Yn = this.A02.A0c;
        jz2.A0C(c0889Yn, this.A01.A0G());
        re = this.A02.A0R;
        if (re != null) {
            re2 = this.A02.A0R;
            re2.A0V();
        }
        weakReference = this.A02.A0V;
        if (weakReference != null) {
            weakReference2 = this.A02.A0V;
            if (weakReference2.get() != null) {
                weakReference3 = this.A02.A0V;
                ((RD) weakReference3.get()).A03();
            }
        }
        c0548Lg = this.A02.A0f;
        if (c0548Lg.A07()) {
            jz3 = this.A02.A0e;
            jz3.A04();
            return;
        }
        this.A02.A0b();
        c0997bA = this.A02.A09;
        if (c0997bA != null) {
            view = this.A02.A04;
            if (view != null) {
                view2 = this.A02.A06;
                if (view2 != null) {
                    c0997bA2 = this.A02.A09;
                    view3 = this.A02.A04;
                    c0997bA2.A08(view3);
                    c0997bA3 = this.A02.A09;
                    view4 = this.A02.A06;
                    c0997bA3.A07(view4);
                    c0997bA4 = this.A02.A09;
                    js = this.A02.A0I;
                    c0997bA4.A0B(js);
                    c0997bA5 = this.A02.A09;
                    z = this.A02.A0W;
                    c0997bA5.A0E(z);
                    c0997bA6 = this.A02.A09;
                    z2 = this.A02.A0Z;
                    c0997bA6.A0I(z2);
                    c0997bA7 = this.A02.A09;
                    z3 = this.A02.A0Y;
                    c0997bA7.A0H(z3);
                    c0997bA8 = this.A02.A09;
                    A0p = this.A02.A0p();
                    c0997bA8.A0F(A0p);
                    c0997bA9 = this.A02.A09;
                    anonymousClass12 = this.A02.A08;
                    c0997bA9.A09(anonymousClass12);
                    c0997bA10 = this.A02.A09;
                    z4 = this.A02.A0X;
                    c0997bA10.A0G(z4);
                    c0997bA11 = this.A02.A09;
                    nativeAdLayout = this.A02.A07;
                    c0997bA11.A0A(AbstractC0583Mp.A00(nativeAdLayout));
                    c0997bA12 = this.A02.A09;
                    str = this.A02.A0S;
                    c0997bA12.A0C(str);
                    c0997bA13 = this.A02.A09;
                    c0997bA13.A0J(this.A03);
                    c0997bA14 = this.A02.A09;
                    c0997bA14.A02();
                }
            }
        }
    }
}
