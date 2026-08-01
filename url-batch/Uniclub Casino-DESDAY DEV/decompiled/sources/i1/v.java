package i1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class v implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2538a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2539b;

    /* renamed from: c, reason: collision with root package name */
    public final v1.h f2540c;

    public /* synthetic */ v(long j2, v1.h hVar, int i) {
        this.f2538a = i;
        this.f2539b = j2;
        this.f2540c = hVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        j1.b.b(f());
    }

    public final long e() {
        switch (this.f2538a) {
        }
        return this.f2539b;
    }

    public final v1.h f() {
        switch (this.f2538a) {
            case 0:
                return (v1.f) this.f2540c;
            default:
                return (v1.p) this.f2540c;
        }
    }
}
