package p1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class l extends l1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f3436e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3437f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v1.f f3438g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, o oVar, int i, v1.f fVar, int i2, boolean z2) {
        super(str, true);
        this.f3436e = oVar;
        this.f3437f = i;
        this.f3438g = fVar;
        this.h = i2;
    }

    @Override // l1.a
    public final long a() {
        try {
            A a2 = this.f3436e.f3453k;
            v1.f fVar = this.f3438g;
            int i = this.h;
            a2.getClass();
            fVar.m(i);
            this.f3436e.f3465w.k(this.f3437f, 9);
            synchronized (this.f3436e) {
                this.f3436e.f3467y.remove(Integer.valueOf(this.f3437f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
