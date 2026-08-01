package E1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class p extends A1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f335f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f336g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, q qVar, int i, long j2) {
        super(str, true);
        this.f334e = qVar;
        this.f335f = i;
        this.f336g = j2;
    }

    @Override // A1.a
    public final long a() {
        q qVar = this.f334e;
        try {
            qVar.f357w.F(this.f335f, this.f336g);
            return -1L;
        } catch (IOException e2) {
            qVar.a(2, 2, e2);
            return -1L;
        }
    }
}
