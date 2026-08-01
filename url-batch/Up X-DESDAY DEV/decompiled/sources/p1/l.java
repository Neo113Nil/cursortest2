package p1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class l extends l1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f3415e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3416f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v1.f f3417g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, o oVar, int i, v1.f fVar, int i2, boolean z2) {
        super(str, true);
        this.f3415e = oVar;
        this.f3416f = i;
        this.f3417g = fVar;
        this.h = i2;
    }

    @Override // l1.a
    public final long a() {
        try {
            A a2 = this.f3415e.f3432k;
            v1.f fVar = this.f3417g;
            int i = this.h;
            a2.getClass();
            fVar.m(i);
            this.f3415e.f3444w.k(this.f3416f, 9);
            synchronized (this.f3415e) {
                this.f3415e.f3446y.remove(Integer.valueOf(this.f3416f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
