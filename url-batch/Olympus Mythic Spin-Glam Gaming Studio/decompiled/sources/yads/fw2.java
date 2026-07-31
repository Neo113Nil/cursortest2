package yads;

import android.content.Context;
import android.view.ViewTreeObserver;
import com.yandex.div.core.DivConfiguration;
import com.yandex.mobile.ads.R$layout;
import com.yandex.mobile.ads.banner.BannerAdView;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class fw2 implements b52 {
    public final /* synthetic */ hw2 a;

    public fw2(hw2 hw2Var) {
        this.a = hw2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(hw2 hw2Var) {
        m12 m12Var;
        pl plVar;
        BannerAdView bannerAdView;
        md1 md1Var;
        boolean z;
        hg0 d02Var;
        DivConfiguration divConfiguration;
        ri0 ri0Var;
        Object obj;
        if (hw2Var.r) {
            hw2Var.a.b(e8.f);
            return;
        }
        t8 t8Var = hw2Var.p;
        BannerAdView bannerAdView2 = hw2Var.a.D;
        if (t8Var == null || (m12Var = hw2Var.q) == null) {
            return;
        }
        Intrinsics.checkNotNull(m12Var, "null cannot be cast to non-null type com.monetization.ads.nativeads.NativeAdPrivate");
        vl vlVar = hw2Var.d;
        Context context = hw2Var.n;
        a32 a32Var = hw2Var.g;
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = hw2Var.o;
        vh3 vh3Var = hw2Var.a.F;
        fz fzVar = hw2Var.l;
        md1 a = vlVar.c.a(context, t8Var, vlVar.a, m12Var, a32Var, null, null);
        ql qlVar = vlVar.b;
        md1 md1Var2 = null;
        if (qlVar.c.a(context)) {
            List f = m12Var.f();
            if (f != null) {
                Iterator it = f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    String str = ((ri0) obj).a;
                    ng0[] ng0VarArr = ng0.b;
                    if (Intrinsics.areEqual(str, "ad")) {
                        break;
                    }
                }
                ri0Var = (ri0) obj;
            } else {
                ri0Var = null;
            }
            if (ri0Var != null) {
                plVar = new pl(ri0Var, qlVar.a, qlVar.b);
                if (plVar == null) {
                    ku kuVar = new ku(plVar.a.h);
                    ol olVar = new ol();
                    Context context2 = ((nt3) plVar.c).a;
                    mt1 a2 = pr.a(context2, context2);
                    plVar.d.getClass();
                    boolean z2 = m12Var instanceof k32;
                    if (z2) {
                        z = z2;
                        d02Var = new d13((k32) m12Var, fzVar, a32Var, kuVar, a2);
                    } else {
                        z = z2;
                        d02Var = new d02(m12Var, fzVar, a32Var, kuVar, a2);
                    }
                    ki0 ki0Var = new ki0(kuVar);
                    jh0 jh0Var = plVar.e;
                    ri0 ri0Var2 = plVar.a;
                    jh0Var.getClass();
                    if (z) {
                        mt1 mt1Var = jh0Var.a;
                        h13 h13Var = new h13(mt1Var);
                        h13Var.b.put(ri0Var2.e, new j13((k32) m12Var, mt1Var, ri0Var2.h));
                        divConfiguration = i13.a(context, h13Var, ki0Var);
                    } else {
                        divConfiguration = (DivConfiguration) LazyKt.lazy(new qi0(context, ki0Var)).getValue();
                    }
                    bannerAdView = bannerAdView2;
                    md1Var = a;
                    dy dyVar = new dy(new ji0(plVar.a.e, new zh0(context, plVar.b, plVar.c, t8Var, fzVar, olVar, ki0Var), divConfiguration, a2, new lu0(), 192), d02Var, new b32(m12Var.d(), vh3Var));
                    ui0 ui0Var = new ui0(t8Var);
                    pd1 pd1Var = plVar.f;
                    int i = R$layout.monetization_ads_internal_divkit;
                    pd1Var.getClass();
                    md1Var2 = new md1(i, dyVar, ui0Var);
                } else {
                    bannerAdView = bannerAdView2;
                    md1Var = a;
                }
                ul ulVar = new ul(new tl(context, bannerAdView, CollectionsKt.listOfNotNull((Object[]) new md1[]{md1Var, md1Var2}), onPreDrawListener));
                hw2Var.s = ulVar;
                ulVar.a(t8Var.c(), new gw2(hw2Var));
            }
        }
        plVar = null;
        if (plVar == null) {
        }
        ul ulVar2 = new ul(new tl(context, bannerAdView, CollectionsKt.listOfNotNull((Object[]) new md1[]{md1Var, md1Var2}), onPreDrawListener));
        hw2Var.s = ulVar2;
        ulVar2.a(t8Var.c(), new gw2(hw2Var));
    }

    @Override // yads.b52
    public final void a(m12 m12Var) {
        final hw2 hw2Var = this.a;
        if (hw2Var.r) {
            return;
        }
        hw2Var.q = m12Var;
        hw2Var.h.post(new Runnable() { // from class: yads.fw2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                fw2.a(hw2.this);
            }
        });
    }

    @Override // yads.b52
    public final void a(d4 d4Var) {
        hw2 hw2Var = this.a;
        if (hw2Var.r) {
            return;
        }
        hw2Var.p = null;
        hw2Var.q = null;
        hw2Var.a.b(d4Var);
    }
}
