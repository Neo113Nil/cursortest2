package C1;

import K1.p;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class h implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259a;

    /* renamed from: b, reason: collision with root package name */
    public final long f260b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f261c;
    public final K1.h d;

    public /* synthetic */ h(Object obj, long j2, K1.h hVar, int i) {
        this.f259a = i;
        this.f261c = obj;
        this.f260b = j2;
        this.d = hVar;
    }

    public final long a() {
        switch (this.f259a) {
        }
        return this.f260b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        y1.b.b(f());
    }

    public final K1.h f() {
        switch (this.f259a) {
            case 0:
                return (p) this.d;
            default:
                return (K1.f) this.d;
        }
    }
}
