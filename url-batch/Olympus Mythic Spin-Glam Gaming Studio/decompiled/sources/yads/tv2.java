package yads;

import android.content.Context;
import android.widget.FrameLayout;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.List;

/* loaded from: classes4.dex */
public final class tv2 implements jn1 {
    public final yu2 a;
    public final t8 b;
    public final pn1 c;
    public final kn1 d;
    public final on1 e;
    public final mn1 f;

    public tv2(yu2 yu2Var, t8 t8Var) {
        pn1 pn1Var = new pn1(yu2Var, t8Var);
        kn1 kn1Var = new kn1(t8Var);
        on1 on1Var = new on1();
        mn1 mn1Var = new mn1();
        this.a = yu2Var;
        this.b = t8Var;
        this.c = pn1Var;
        this.d = kn1Var;
        this.e = on1Var;
        this.f = mn1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [yads.j03] */
    /* JADX WARN: Type inference failed for: r23v0, types: [android.view.View, android.view.ViewGroup, com.monetization.ads.nativeads.CustomizableMediaView] */
    /* JADX WARN: Type inference failed for: r5v4, types: [yads.j03] */
    /* JADX WARN: Type inference failed for: r9v3, types: [yads.xv2] */
    @Override // yads.jn1
    public final hn1 a(CustomizableMediaView customizableMediaView, v3 v3Var, ri2 ri2Var, sn3 sn3Var, t41 t41Var, p42 p42Var, x32 x32Var, sz1 sz1Var, rn1 rn1Var, bz2 bz2Var, dn1 dn1Var) {
        hn1 a;
        if (dn1Var == null) {
            return null;
        }
        j62 j62Var = p42Var.a;
        d82 d82Var = p42Var.b;
        ij1 ij1Var = dn1Var.a;
        Context context = customizableMediaView.getContext();
        Context context2 = customizableMediaView.getContext();
        sq0 sq0Var = sq0.e;
        boolean a2 = tq0.a(context2, sq0Var);
        if (a2) {
            customizableMediaView.removeAllViews();
        }
        if (j62Var != null) {
            de3 de3Var = dn1Var.b;
            pn1 pn1Var = this.c;
            pn1Var.getClass();
            Context context3 = customizableMediaView.getContext();
            c30 c30Var = pn1Var.e.a;
            gj3 videoScaleType = customizableMediaView.getVideoScaleType();
            if (videoScaleType == null) {
                videoScaleType = gj3.b;
            }
            p62 p62Var = pn1Var.f;
            kj3 kj3Var = de3Var != null ? de3Var.b : null;
            p62Var.getClass();
            ii3 ii3Var = new ii3(videoScaleType, kj3Var != null ? kj3Var.a : true, kj3Var != null ? kj3Var.b : false, kj3Var != null ? kj3Var.c : null);
            pn1Var.d.getClass();
            q72 a3 = pn1Var.g.a(context3, ii3Var, sn3Var, de3Var, customizableMediaView.getVideoControlsLayoutId());
            pn1Var.c.getClass();
            if (!tq0.a(customizableMediaView.getContext(), sq0Var)) {
                customizableMediaView.removeAllViews();
            }
            customizableMediaView.addView(a3, new FrameLayout.LayoutParams(-1, -1));
            ?? xv2Var = new xv2(customizableMediaView, new ak3(pn1Var.a, a3, ii3Var, v3Var, pn1Var.b, t41Var, j62Var, x32Var, sz1Var, ri2Var, bz2Var), rn1Var);
            r21 = bz2Var != null ? bz2Var.e : null;
            if (r21 == null || !a2 || (a = a(customizableMediaView, this.a, ri2Var, rn1Var, bz2Var, dn1Var)) == null) {
                r21 = xv2Var;
            } else {
                cw2.j.getClass();
                r21 = new cw2(customizableMediaView, xv2Var, a, rn1Var, r21);
            }
        } else if (d82Var != null && ij1Var != null && oa.a(context)) {
            try {
                r21 = this.f.a(customizableMediaView, ij1Var, t41Var, d82Var, rn1Var);
            } catch (zn3 unused) {
            }
        }
        return r21 == null ? a(customizableMediaView, this.a, ri2Var, rn1Var, bz2Var, dn1Var) : r21;
    }

    public final hn1 a(CustomizableMediaView customizableMediaView, yu2 yu2Var, ri2 ri2Var, rn1 rn1Var, bz2 bz2Var, dn1 dn1Var) {
        List list = dn1Var.c;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return this.d.a(customizableMediaView, ri2Var, rn1Var);
        }
        try {
            return this.e.a(this.b, yu2Var, customizableMediaView, ri2Var, list, rn1Var, bz2Var);
        } catch (Throwable unused) {
            return this.d.a(customizableMediaView, ri2Var, rn1Var);
        }
    }
}
