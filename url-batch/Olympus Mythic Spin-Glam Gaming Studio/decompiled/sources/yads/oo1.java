package yads;

import android.content.Context;
import com.monetization.ads.mediation.base.initialize.MediatedAdapterInitializer;

/* loaded from: classes13.dex */
public final class oo1 {
    public final zp1 a;

    public oo1(zp1 zp1Var) {
        this.a = zp1Var;
    }

    public final MediatedAdapterInitializer a(Context context, er1 er1Var, yu2 yu2Var) {
        e00 a = this.a.a(er1Var);
        if (a == null) {
            return null;
        }
        Object a2 = new lo1(new so1(new v3(a), yu2Var, null)).a(context, er1Var, com.monetization.ads.mediation.base.a.class);
        if (a2 instanceof MediatedAdapterInitializer) {
            return (MediatedAdapterInitializer) a2;
        }
        return null;
    }
}
