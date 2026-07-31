package yads;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.yandex.mobile.ads.banner.BannerAdView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public abstract class hb1 extends dj2 {
    private final v3 b;
    private final nt3 c;
    private final lh1 d;
    private final qh1 e;
    private final vw2 f;
    private final fl g;
    private final ib1 h;
    private final ArrayList i;
    private int j;
    private int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb1(Context context, AttributeSet attributeSet, int i, v3 v3Var, nt3 nt3Var) {
        super(context, attributeSet, i);
        vw2 vw2Var;
        au2.a.getClass();
        lh1 a = n51.a();
        qh1 qh1Var = new qh1(context);
        i5 i5Var = new i5();
        el elVar = new el(context, v3Var, nt3Var, i5Var);
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        this.b = v3Var;
        this.c = nt3Var;
        this.d = a;
        this.e = qh1Var;
        this.f = vw2Var2;
        this.i = new ArrayList();
        qh1Var.a();
        fl flVar = new fl(context, v3Var, (BannerAdView) this, elVar, i5Var);
        this.g = flVar;
        elVar.b.e = new g8(v3Var);
        ib1 a2 = lb1.a(this, flVar);
        this.h = a2;
        a2.a(context, this);
    }

    protected final void a(i00 i00Var) {
        this.e.a();
        this.g.a(i00Var.a);
    }

    public final void addVisibilityChangeListener(@NotNull il3 il3Var) {
        this.i.add(il3Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r1 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final i00 b() {
        l03 l03Var;
        this.e.a();
        fl flVar = this.g;
        t8 t8Var = flVar.w;
        if (t8Var != null) {
            ju0 c = t8Var.c();
            int i = c.c;
            l03Var = c;
            if (i == 0) {
                int i2 = c.d;
                l03Var = c;
                if (i2 == 0) {
                    l03Var = null;
                }
            }
        }
        l03Var = flVar.c.d.a;
        if (l03Var != null) {
            return new i00(l03Var);
        }
        return null;
    }

    protected final zz c() {
        this.e.a();
        this.e.a();
        ml mlVar = this.g.M;
        String c = mlVar != null ? mlVar.c() : null;
        if (c == null) {
            c = "";
        }
        this.e.a();
        ml mlVar2 = this.g.M;
        String adInfo = mlVar2 != null ? mlVar2.getAdInfo() : null;
        this.e.a();
        ml mlVar3 = this.g.M;
        String a = mlVar3 != null ? mlVar3.a() : null;
        this.e.a();
        ml mlVar4 = this.g.M;
        List b = mlVar4 != null ? mlVar4.b() : null;
        if (b == null) {
            b = CollectionsKt.emptyList();
        }
        return new zz(c, adInfo, a, b);
    }

    protected final vh3 d() {
        this.e.a();
        return this.g.F;
    }

    protected void destroy() {
        this.e.a();
        this.d.a();
        this.i.clear();
        int i = oa.$r8$clinit;
        if (oa.a(this.g)) {
            return;
        }
        this.g.c();
    }

    @Override // yads.dj2, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @NotNull
    public final v3 getAdConfiguration$mobileads_externalRelease() {
        return this.b;
    }

    public final int getHeightMeasureSpec$mobileads_externalRelease() {
        return this.k;
    }

    @NotNull
    public final yu2 getSdkEnvironmentModule$mobileads_externalRelease() {
        return this.c;
    }

    public final int getWidthMeasureSpec$mobileads_externalRelease() {
        return this.j;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getClass().toString();
        boolean z = ob1.a;
        ib1 ib1Var = this.h;
        getContext();
        ib1Var.onAttachedToWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void onConfigurationChanged(Configuration configuration) {
        boolean z;
        super.onConfigurationChanged(configuration);
        int i = oa.$r8$clinit;
        if (!oa.a(this.g)) {
            fl flVar = this.g;
            t8 t8Var = flVar.w;
            ju0 c = t8Var != null ? t8Var.c() : null;
            int i2 = 0;
            if (c != null) {
                l03 l03Var = flVar.c.d.a;
                t8 t8Var2 = flVar.w;
                if ((t8Var2 == null || l03Var == null) ? false : n03.a(flVar.a, t8Var2, c, flVar.G, l03Var)) {
                    z = true;
                    if (!z) {
                        d8 d8Var = this.b.e;
                        if (d8Var != null) {
                            a(d8Var);
                        }
                        i2 = 8;
                    }
                    setVisibility(i2);
                }
            }
            z = false;
            if (!z) {
            }
            setVisibility(i2);
        }
        Objects.toString(configuration);
        boolean z2 = ob1.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getClass().toString();
        boolean z = ob1.a;
        ib1 ib1Var = this.h;
        getContext();
        ib1Var.onDetachedFromWindow();
    }

    @Override // yads.dj2, android.widget.RelativeLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.j = i;
        this.k = i2;
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.f == null) {
            return;
        }
        Objects.toString(view);
        boolean z = ob1.a;
        bu2 a = this.f.a(getContext());
        if (a == null || !a.A0()) {
            a(i);
        } else if (this == view) {
            a(i);
        }
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        getVisibility();
        boolean z = ob1.a;
        a((i == 0 && getVisibility() == 0) ? 0 : 8);
    }

    public final void removeVisibilityChangeListener(@NotNull il3 il3Var) {
        this.i.remove(il3Var);
    }

    protected final void a(final d8 d8Var) {
        this.e.a();
        this.d.a(new Runnable() { // from class: yads.hb1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                hb1.a(hb1.this, d8Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(hb1 hb1Var, d8 d8Var) {
        fl flVar = hb1Var.g;
        flVar.c.a(d8Var.a);
        hb1Var.g.b(d8Var);
    }

    protected final void a(sq3 sq3Var) {
        this.e.a();
        fl flVar = this.g;
        el elVar = flVar.E;
        flVar.v = elVar;
        elVar.c = sq3Var;
        elVar.b.a(sq3Var);
    }

    private final void a(int i) {
        boolean z = ob1.a;
        int i2 = oa.$r8$clinit;
        if (oa.a(this.g)) {
            return;
        }
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((fl) ((il3) it.next())).k();
        }
    }
}
