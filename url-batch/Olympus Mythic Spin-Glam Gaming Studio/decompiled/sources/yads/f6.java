package yads;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class f6 implements lx0 {
    public final RelativeLayout a;
    public final r2 b;
    public final d2 c;
    public final b6 d;
    public final ExtendedNativeAdView e;
    public final q2 f;
    public final yj2 g;
    public final gw h;
    public final ar2 i;
    public final ArrayList j;
    public final List k;
    public final long l;
    public int m;
    public boolean n;

    public f6(Activity activity, m12 m12Var, y32 y32Var, pr2 pr2Var, ArrayList arrayList, ri0 ri0Var, RelativeLayout relativeLayout, r2 r2Var, d2 d2Var, sd1 sd1Var, b6 b6Var) {
        b6 b6Var2;
        long j;
        f6 f6Var;
        ArrayList arrayList2;
        ArrayList arrayList3;
        gw gwVar;
        long j2;
        b6 b6Var3;
        ri0 ri0Var2;
        ExtendedNativeAdView extendedNativeAdView = new ExtendedNativeAdView(activity);
        q2 q2Var = new q2(m12Var, d2Var, y32Var);
        yj2 yj2Var = new yj2();
        gw gwVar2 = new gw();
        ar2 ar2Var = new ar2(new l73());
        this.a = relativeLayout;
        this.b = r2Var;
        this.c = d2Var;
        this.d = b6Var;
        this.e = extendedNativeAdView;
        this.f = q2Var;
        this.g = yj2Var;
        this.h = gwVar2;
        this.i = ar2Var;
        List list = b6Var.a;
        this.k = list;
        Iterator it = list.iterator();
        long j3 = 0;
        while (it.hasNext()) {
            j3 += ((i6) it.next()).a;
        }
        this.l = j3;
        ExtendedNativeAdView extendedNativeAdView2 = this.e;
        e6 e6Var = new e6(this);
        yj2 yj2Var2 = this.g;
        h6 h6Var = new h6(this);
        b6 b6Var4 = this.d;
        gw gwVar3 = this.h;
        sd1Var.a(m12Var);
        if (m12Var instanceof k32) {
            k32 k32Var = (k32) m12Var;
            List list2 = b6Var4.a;
            ArrayList k = k32Var.k();
            ArrayList arrayList4 = new ArrayList();
            int size = k.size();
            int i = 0;
            while (i < size) {
                int i2 = size;
                i6 i6Var = (i6) CollectionsKt.getOrNull(list2, i);
                ArrayList arrayList5 = k;
                c6 c6Var = new c6(list2);
                List list3 = list2;
                if (i6Var != null) {
                    gwVar = gwVar3;
                    j2 = i6Var.a;
                } else {
                    gwVar = gwVar3;
                    j2 = 0;
                }
                ArrayList arrayList6 = arrayList4;
                int i3 = i;
                k32 k32Var2 = k32Var;
                yj2 yj2Var3 = yj2Var2;
                gw gwVar4 = gwVar;
                x63 x63Var = new x63(yj2Var2, c6Var, new g6(j2), new d6(b6Var4, i), gwVar4);
                m12 m12Var2 = (m12) arrayList5.get(i3);
                z43 z43Var = new z43(y32Var);
                if (arrayList != null) {
                    ri0Var2 = (ri0) CollectionsKt.getOrNull(arrayList, i3);
                    b6Var3 = b6Var4;
                } else {
                    b6Var3 = b6Var4;
                    ri0Var2 = null;
                }
                h6 h6Var2 = h6Var;
                arrayList6.add(sd1Var.a(activity, extendedNativeAdView2, m12Var2, z43Var, e6Var, pr2Var, x63Var, h6Var2, ri0Var2, i6Var));
                i = i3 + 1;
                size = i2;
                list2 = list3;
                b6Var4 = b6Var3;
                arrayList4 = arrayList6;
                k = arrayList5;
                gwVar3 = gwVar4;
                h6Var = h6Var2;
                yj2Var2 = yj2Var3;
                k32Var = k32Var2;
            }
            List list4 = list2;
            gw gwVar5 = gwVar3;
            yj2 yj2Var4 = yj2Var2;
            k32 k32Var3 = k32Var;
            h6 h6Var3 = h6Var;
            ArrayList arrayList7 = arrayList4;
            i6 i6Var2 = (i6) CollectionsKt.getOrNull(list4, k.size());
            x63 x63Var2 = new x63(yj2Var4, new c6(list4), new g6(i6Var2 != null ? i6Var2.a : 0L), new tb2(), gwVar5);
            if (ri0Var != null) {
                arrayList3 = arrayList7;
                r27 = sd1Var.a(activity, extendedNativeAdView2, k32Var3, y32Var, e6Var, pr2Var, x63Var2, h6Var3, ri0Var, i6Var2);
            } else {
                arrayList3 = arrayList7;
            }
            rd1 rd1Var = r27;
            if (rd1Var != null) {
                arrayList3.add(rd1Var);
            }
            f6Var = this;
            arrayList2 = arrayList3;
        } else {
            List list5 = b6Var4.a;
            ArrayList arrayList8 = new ArrayList();
            c6 c6Var2 = new c6(list5);
            i6 i6Var3 = (i6) CollectionsKt.firstOrNull(list5);
            if (i6Var3 != null) {
                b6Var2 = b6Var4;
                j = i6Var3.a;
            } else {
                b6Var2 = b6Var4;
                j = 0;
            }
            arrayList8.add(sd1Var.a(activity, extendedNativeAdView2, m12Var, y32Var, e6Var, pr2Var, new x63(yj2Var2, c6Var2, new g6(j), new d6(b6Var2, 0), gwVar3), h6Var, arrayList != null ? (ri0) CollectionsKt.firstOrNull((List) arrayList) : null, (i6) CollectionsKt.firstOrNull(list5)));
            i6 i6Var4 = (i6) CollectionsKt.getOrNull(list5, 1);
            rd1 a = ri0Var != null ? sd1Var.a(activity, extendedNativeAdView2, m12Var, y32Var, e6Var, pr2Var, new x63(yj2Var2, new c6(list5), new g6(i6Var4 != null ? i6Var4.a : 0L), new tb2()), h6Var, ri0Var, i6Var4) : null;
            if (a != null) {
                arrayList8.add(a);
            }
            f6Var = this;
            arrayList2 = arrayList8;
        }
        f6Var.j = arrayList2;
    }

    public final void a() {
        this.a.setContentDescription("pageIndex: " + this.m);
    }

    public final void b() {
        i6 i6Var = (i6) CollectionsKt.getOrNull(this.k, this.m - 1);
        long j = i6Var != null ? i6Var.a : 0L;
        this.g.a += j;
        gw gwVar = this.h;
        gwVar.a += gwVar.b;
        gwVar.b = 0L;
        if (this.m < this.j.size()) {
            int i = this.m;
            this.m = i + 1;
            if (((rd1) this.j.get(i)).a()) {
                a();
                this.i.a(this.e, this.l, this.g.a);
            } else if (this.m >= this.j.size()) {
                this.c.e();
            } else {
                b();
            }
        }
    }

    @Override // yads.lx0
    public final void c() {
        RelativeLayout relativeLayout = this.a;
        ExtendedNativeAdView extendedNativeAdView = this.e;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        relativeLayout.removeAllViews();
        relativeLayout.addView(extendedNativeAdView, layoutParams);
        q2 q2Var = this.f;
        ExtendedNativeAdView extendedNativeAdView2 = this.e;
        q2Var.getClass();
        try {
            if (q2Var.a instanceof k32) {
                ((k32) q2Var.a).b(q2Var.e.a(extendedNativeAdView2, q2Var.d));
                ((k32) q2Var.a).b(q2Var.c);
            }
            this.m = 1;
            this.n = false;
            rd1 rd1Var = (rd1) CollectionsKt.firstOrNull((List) this.j);
            if (rd1Var != null ? rd1Var.a() : false) {
                a();
                this.i.a(this.e, this.l, this.g.a);
            } else if (this.m >= this.j.size()) {
                this.c.e();
            } else {
                b();
            }
        } catch (v02 unused) {
            q2Var.b.e();
        }
    }

    @Override // yads.lx0
    public final void invalidate() {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((rd1) it.next()).b();
        }
        m12 m12Var = this.f.a;
        if (m12Var instanceof k32) {
            ((k32) m12Var).b((x00) null);
        }
    }
}
