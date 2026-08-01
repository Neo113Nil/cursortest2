package o0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o.b f3688a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f3689b;

    public o(p pVar, o.b bVar) {
        this.f3689b = pVar;
        this.f3688a = bVar;
    }

    @Override // o0.k
    public final void d(m mVar) {
        ((ArrayList) this.f3688a.getOrDefault(this.f3689b.f3691b, null)).remove(mVar);
        mVar.x(this);
    }
}
