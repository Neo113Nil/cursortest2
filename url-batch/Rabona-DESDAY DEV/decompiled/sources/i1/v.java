package i1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class v implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2535a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2536b;

    /* renamed from: c, reason: collision with root package name */
    public final v1.h f2537c;

    public /* synthetic */ v(long j2, v1.h hVar, int i) {
        this.f2535a = i;
        this.f2536b = j2;
        this.f2537c = hVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        j1.b.b(f());
    }

    public final long e() {
        switch (this.f2535a) {
        }
        return this.f2536b;
    }

    public final v1.h f() {
        switch (this.f2535a) {
            case 0:
                return (v1.f) this.f2537c;
            default:
                return (v1.p) this.f2537c;
        }
    }
}
