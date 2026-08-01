package K1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class o implements g {

    /* renamed from: a, reason: collision with root package name */
    public final t f761a;

    /* renamed from: b, reason: collision with root package name */
    public final f f762b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f763c;

    public o(t tVar) {
        i1.f.e(tVar, "sink");
        this.f761a = tVar;
        this.f762b = new f();
    }

    public final g a() {
        if (this.f763c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f762b;
        long j2 = fVar.f746b;
        if (j2 == 0) {
            j2 = 0;
        } else {
            q qVar = fVar.f745a;
            i1.f.b(qVar);
            q qVar2 = qVar.f772g;
            i1.f.b(qVar2);
            if (qVar2.f769c < 8192 && qVar2.f770e) {
                j2 -= r6 - qVar2.f768b;
            }
        }
        if (j2 > 0) {
            this.f761a.u(fVar, j2);
        }
        return this;
    }

    @Override // K1.t
    public final x b() {
        return this.f761a.b();
    }

    @Override // K1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        t tVar = this.f761a;
        if (this.f763c) {
            return;
        }
        try {
            f fVar = this.f762b;
            long j2 = fVar.f746b;
            if (j2 > 0) {
                tVar.u(fVar, j2);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            tVar.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f763c = true;
        if (th != null) {
            throw th;
        }
    }

    public final g f(int i) {
        if (this.f763c) {
            throw new IllegalStateException("closed");
        }
        this.f762b.M(i);
        a();
        return this;
    }

    @Override // K1.t, java.io.Flushable
    public final void flush() {
        if (this.f763c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f762b;
        long j2 = fVar.f746b;
        t tVar = this.f761a;
        if (j2 > 0) {
            tVar.u(fVar, j2);
        }
        tVar.flush();
    }

    public final g h(int i) {
        if (this.f763c) {
            throw new IllegalStateException("closed");
        }
        this.f762b.O(i);
        a();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f763c;
    }

    @Override // K1.g
    public final g o(String str) {
        i1.f.e(str, "string");
        if (this.f763c) {
            throw new IllegalStateException("closed");
        }
        this.f762b.P(str);
        a();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f761a + ')';
    }

    @Override // K1.t
    public final void u(f fVar, long j2) {
        i1.f.e(fVar, "source");
        if (this.f763c) {
            throw new IllegalStateException("closed");
        }
        this.f762b.u(fVar, j2);
        a();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        i1.f.e(byteBuffer, "source");
        if (this.f763c) {
            throw new IllegalStateException("closed");
        }
        int write = this.f762b.write(byteBuffer);
        a();
        return write;
    }
}
