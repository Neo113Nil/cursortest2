package p1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class n extends l1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f3443e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3444f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f3445g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, o oVar, int i, long j2) {
        super(str, true);
        this.f3443e = oVar;
        this.f3444f = i;
        this.f3445g = j2;
    }

    @Override // l1.a
    public final long a() {
        o oVar = this.f3443e;
        try {
            oVar.f3466w.l(this.f3444f, this.f3445g);
            return -1L;
        } catch (IOException e2) {
            oVar.e(2, 2, e2);
            return -1L;
        }
    }
}
