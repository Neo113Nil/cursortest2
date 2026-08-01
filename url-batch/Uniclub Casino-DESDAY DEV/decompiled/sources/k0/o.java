package k0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o.b f2831a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f2832b;

    public o(p pVar, o.b bVar) {
        this.f2832b = pVar;
        this.f2831a = bVar;
    }

    @Override // k0.k
    public final void b(m mVar) {
        ((ArrayList) this.f2831a.getOrDefault(this.f2832b.f2834b, null)).remove(mVar);
        mVar.x(this);
    }
}
