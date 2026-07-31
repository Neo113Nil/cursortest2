package yads;

import android.content.Context;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapter;

/* loaded from: classes5.dex */
public final class hp1 implements xn1 {
    public final go1 a;

    public hp1(go1 go1Var) {
        this.a = go1Var;
    }

    @Override // yads.xn1
    public final tn1 a(Context context) {
        return this.a.a(context, MediatedNativeAdapter.class);
    }
}
