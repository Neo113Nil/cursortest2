package yads;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes5.dex */
public final class fs implements dx0 {
    public final d8 a;
    public final /* synthetic */ ls b;

    public fs(ls lsVar, d8 d8Var) {
        this.b = lsVar;
        this.a = d8Var;
    }

    @Override // yads.dx0
    public final void onAdShown() {
        ls lsVar = this.b;
        BuildersKt__Builders_commonKt.launch$default(lsVar.f, Dispatchers.getMain().getImmediate(), null, new gn(lsVar, this.a, null), 2, null);
    }
}
