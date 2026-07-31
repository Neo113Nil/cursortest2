package yads;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public final class rs implements dx0 {
    public final d8 a;
    public final /* synthetic */ ts b;

    public rs(ts tsVar, d8 d8Var) {
        this.b = tsVar;
        this.a = d8Var;
    }

    @Override // yads.dx0
    public final void onAdShown() {
        ts tsVar = this.b;
        BuildersKt__Builders_commonKt.launch$default(tsVar.f, Dispatchers.getMain().getImmediate(), null, new gn(tsVar, this.a, null), 2, null);
    }
}
