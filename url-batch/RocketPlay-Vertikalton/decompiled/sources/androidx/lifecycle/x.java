package androidx.lifecycle;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final A1.d f1917a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1918b;

    /* renamed from: c, reason: collision with root package name */
    public int f1919c = -1;
    public final /* synthetic */ y d;

    public x(y yVar, A1.d dVar) {
        this.d = yVar;
        this.f1917a = dVar;
    }

    public final void a(boolean z2) {
        if (z2 == this.f1918b) {
            return;
        }
        this.f1918b = z2;
        int i = z2 ? 1 : -1;
        y yVar = this.d;
        int i2 = yVar.f1923c;
        yVar.f1923c = i + i2;
        if (!yVar.d) {
            yVar.d = true;
            while (true) {
                try {
                    int i3 = yVar.f1923c;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } finally {
                    yVar.d = false;
                }
            }
        }
        if (this.f1918b) {
            yVar.c(this);
        }
    }
}
