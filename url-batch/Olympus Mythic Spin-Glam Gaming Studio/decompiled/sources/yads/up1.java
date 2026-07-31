package yads;

import android.content.Context;
import com.monetization.ads.mediation.banner.MediatedBannerAdapter;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapter;

/* loaded from: classes6.dex */
public final class up1 implements xo1 {
    public final lo1 a;
    public final wp1 b;

    public up1(lo1 lo1Var, wp1 wp1Var) {
        this.a = lo1Var;
        this.b = wp1Var;
    }

    @Override // yads.xo1
    public final boolean a(er1 er1Var, Class cls) {
        ds2 ds2Var = er1Var.i;
        return ds2Var != null && ds2Var.b == rq1.e && MediatedBannerAdapter.class.isAssignableFrom(cls);
    }

    @Override // yads.xo1
    public final com.monetization.ads.mediation.base.a a(Context context, er1 er1Var) {
        MediatedNativeAdapter mediatedNativeAdapter = (MediatedNativeAdapter) this.a.a(context, er1Var, MediatedNativeAdapter.class);
        if (mediatedNativeAdapter == null) {
            return null;
        }
        return new tp1(mediatedNativeAdapter, this.b);
    }
}
