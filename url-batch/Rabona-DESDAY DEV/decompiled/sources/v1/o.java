package v1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class o implements g {

    /* renamed from: a, reason: collision with root package name */
    public final t f4090a;

    /* renamed from: b, reason: collision with root package name */
    public final f f4091b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4092c;

    public o(t tVar) {
        X0.d.e(tVar, "sink");
        this.f4090a = tVar;
        this.f4091b = new f();
    }

    @Override // v1.t
    public final x a() {
        return this.f4090a.a();
    }

    @Override // v1.t
    public final void c(f fVar, long j2) {
        X0.d.e(fVar, "source");
        if (this.f4092c) {
            throw new IllegalStateException("closed");
        }
        this.f4091b.c(fVar, j2);
        e();
    }

    @Override // v1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        t tVar = this.f4090a;
        if (this.f4092c) {
            return;
        }
        try {
            f fVar = this.f4091b;
            long j2 = fVar.f4076b;
            if (j2 > 0) {
                tVar.c(fVar, j2);
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
        this.f4092c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // v1.g
    public final g d(String str) {
        X0.d.e(str, "string");
        if (this.f4092c) {
            throw new IllegalStateException("closed");
        }
        this.f4091b.v(str);
        e();
        return this;
    }

    public final g e() {
        if (this.f4092c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f4091b;
        long j2 = fVar.f4076b;
        if (j2 == 0) {
            j2 = 0;
        } else {
            q qVar = fVar.f4075a;
            X0.d.b(qVar);
            q qVar2 = qVar.f4101g;
            X0.d.b(qVar2);
            if (qVar2.f4098c < 8192 && qVar2.f4099e) {
                j2 -= r6 - qVar2.f4097b;
            }
        }
        if (j2 > 0) {
            this.f4090a.c(fVar, j2);
        }
        return this;
    }

    public final g f(int i) {
        if (this.f4092c) {
            throw new IllegalStateException("closed");
        }
        this.f4091b.s(i);
        e();
        return this;
    }

    @Override // v1.t, java.io.Flushable
    public final void flush() {
        if (this.f4092c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f4091b;
        long j2 = fVar.f4076b;
        t tVar = this.f4090a;
        if (j2 > 0) {
            tVar.c(fVar, j2);
        }
        tVar.flush();
    }

    public final g g(int i) {
        if (this.f4092c) {
            throw new IllegalStateException("closed");
        }
        this.f4091b.u(i);
        e();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f4092c;
    }

    public final String toString() {
        return "buffer(" + this.f4090a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        X0.d.e(byteBuffer, "source");
        if (this.f4092c) {
            throw new IllegalStateException("closed");
        }
        int write = this.f4091b.write(byteBuffer);
        e();
        return write;
    }
}
