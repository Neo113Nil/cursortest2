package E1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class n extends A1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f328e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f329f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ K1.f f330g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, q qVar, int i, K1.f fVar, int i2, boolean z2) {
        super(str, true);
        this.f328e = qVar;
        this.f329f = i;
        this.f330g = fVar;
        this.h = i2;
    }

    @Override // A1.a
    public final long a() {
        try {
            C c2 = this.f328e.f345k;
            K1.f fVar = this.f330g;
            int i = this.h;
            c2.getClass();
            fVar.G(i);
            this.f328e.f357w.E(this.f329f, 9);
            synchronized (this.f328e) {
                this.f328e.f359y.remove(Integer.valueOf(this.f329f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
