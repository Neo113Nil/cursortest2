package com.my.target.nativeads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.my.target.common.BaseAd;
import com.my.target.common.MyTargetVersion;
import com.my.target.common.menu.MenuFactory;
import com.my.target.hd;
import com.my.target.mi;
import com.my.target.p;
import com.my.target.s;
import com.my.target.sc;
import com.my.target.t;
import com.my.target.tb;
import com.my.target.vb;
import com.my.target.x;
import com.my.target.zc;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes.dex */
public final class NativeBannerAdLoader extends BaseAd {
    private final Context f;
    private final MenuFactory g;
    private OnLoad h;
    private p i;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface OnLoad {
        void onLoad(@NonNull List<NativeBannerAd> list);
    }

    private NativeBannerAdLoader(int i, int i2, Context context, MenuFactory menuFactory) {
        super(i, "nativebanner", context);
        int max = Math.max(i2, 1);
        if (max != i2) {
            mi.a("NativeBannerAdLoader: Invalid bannersCount < 1, bannersCount set to " + max);
        }
        this.a.a(max);
        this.a.a(false);
        this.f = context.getApplicationContext();
        this.g = menuFactory;
        mi.c("Native banner ad loader created. Version - " + MyTargetVersion.VERSION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(t tVar, p pVar, hd hdVar, s sVar) {
        if (this.h != null && hdVar != null && (sVar.b() || !hdVar.c().isEmpty())) {
            tVar.b(0, 3);
        }
        if (pVar == this.i) {
            this.i = null;
            a(hdVar, sVar);
        }
    }

    @NonNull
    public static NativeBannerAdLoader newLoader(int i, int i2, @NonNull Context context) {
        return new NativeBannerAdLoader(i, i2, context, null);
    }

    public int getCachePolicy() {
        return this.a.g();
    }

    @NonNull
    @UiThread
    public NativeBannerAdLoader load() {
        final t a = t.a(this.d, this.a.j(), 0, vb.b());
        this.a.a(a);
        a.b(0, 0);
        tb a2 = this.b.a();
        final p a3 = zc.a(new zc.b(), this.a, this.b);
        this.i = a3;
        a3.a(new p.b() { // from class: com.my.target.nativeads.NativeBannerAdLoader$$ExternalSyntheticLambda0
            @Override // com.my.target.p.b
            public final void a(x xVar, s sVar) {
                NativeBannerAdLoader.this.a(a, a3, (hd) xVar, sVar);
            }
        }).a(a2, this.f);
        return this;
    }

    public void setCachePolicy(int i) {
        this.a.b(i);
    }

    @NonNull
    @UiThread
    public NativeBannerAdLoader setOnLoad(@Nullable OnLoad onLoad) {
        this.h = onLoad;
        return this;
    }

    @NonNull
    public static NativeBannerAdLoader newLoader(int i, int i2, @NonNull Context context, @NonNull MenuFactory menuFactory) {
        return new NativeBannerAdLoader(i, i2, context, menuFactory);
    }

    private void a(hd hdVar, s sVar) {
        if (this.h == null) {
            return;
        }
        List<sc> c = hdVar == null ? null : hdVar.c();
        if (c != null && c.size() >= 1) {
            ArrayList arrayList = new ArrayList();
            for (sc scVar : c) {
                NativeBannerAd nativeBannerAd = new NativeBannerAd(this.a.j(), this.g, this.f);
                nativeBannerAd.a(this.a, scVar);
                arrayList.add(nativeBannerAd);
            }
            this.h.onLoad(arrayList);
            return;
        }
        this.h.onLoad(new ArrayList());
    }
}
