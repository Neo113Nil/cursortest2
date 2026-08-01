package E1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class l extends A1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f323e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f324f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f325g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(String str, q qVar, int i, int i2, int i3) {
        super(str, true);
        this.f323e = i3;
        this.f324f = qVar;
        this.f325g = i;
        this.h = i2;
    }

    @Override // A1.a
    public final long a() {
        switch (this.f323e) {
            case 0:
                int i = this.f325g;
                int i2 = this.h;
                q qVar = this.f324f;
                qVar.getClass();
                try {
                    qVar.f357w.D(i, i2, true);
                    return -1L;
                } catch (IOException e2) {
                    qVar.a(2, 2, e2);
                    return -1L;
                }
            case 1:
                C c2 = this.f324f.f345k;
                int i3 = this.h;
                c2.getClass();
                AbstractC0001b.j("errorCode", i3);
                synchronized (this.f324f) {
                    this.f324f.f359y.remove(Integer.valueOf(this.f325g));
                }
                return -1L;
            default:
                q qVar2 = this.f324f;
                try {
                    int i4 = this.f325g;
                    int i5 = this.h;
                    qVar2.getClass();
                    AbstractC0001b.j("statusCode", i5);
                    qVar2.f357w.E(i4, i5);
                    return -1L;
                } catch (IOException e3) {
                    qVar2.a(2, 2, e3);
                    return -1L;
                }
        }
    }
}
