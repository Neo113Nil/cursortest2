package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ox implements n8 {
    public final f20 f;
    public final m8 g;
    public boolean h;

    public ox(f20 f20Var) {
        f20Var.getClass();
        this.f = f20Var;
        this.g = new m8();
    }

    @Override // defpackage.f20
    public final e50 a() {
        return this.f.a();
    }

    @Override // defpackage.f20, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f20 f20Var = this.f;
        if (this.h) {
            return;
        }
        try {
            m8 m8Var = this.g;
            long j = m8Var.g;
            if (j > 0) {
                f20Var.e(j, m8Var);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            f20Var.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.h = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.f20
    public final void e(long j, m8 m8Var) {
        m8Var.getClass();
        if (this.h) {
            l8.u("closed");
        } else {
            this.g.e(j, m8Var);
            m();
        }
    }

    @Override // defpackage.n8, defpackage.f20, java.io.Flushable
    public final void flush() {
        if (this.h) {
            l8.u("closed");
            return;
        }
        m8 m8Var = this.g;
        long j = m8Var.g;
        f20 f20Var = this.f;
        if (j > 0) {
            f20Var.e(j, m8Var);
        }
        f20Var.flush();
    }

    @Override // defpackage.n8
    public final n8 i(String str) {
        str.getClass();
        if (this.h) {
            l8.u("closed");
            return null;
        }
        this.g.A(str);
        m();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.h;
    }

    @Override // defpackage.n8
    public final n8 j(r8 r8Var) {
        r8Var.getClass();
        if (this.h) {
            l8.u("closed");
            return null;
        }
        r8Var.i(this.g, r8Var.a());
        m();
        return this;
    }

    public final n8 m() {
        if (this.h) {
            l8.u("closed");
            return null;
        }
        m8 m8Var = this.g;
        long j = m8Var.g;
        if (j == 0) {
            j = 0;
        } else {
            e10 e10Var = m8Var.f;
            e10Var.getClass();
            e10 e10Var2 = e10Var.g;
            e10Var2.getClass();
            if (e10Var2.c < 8192 && e10Var2.e) {
                j -= r6 - e10Var2.b;
            }
        }
        if (j > 0) {
            this.f.e(j, m8Var);
        }
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (this.h) {
            l8.u("closed");
            return 0;
        }
        int write = this.g.write(byteBuffer);
        m();
        return write;
    }

    @Override // defpackage.n8
    public final n8 writeByte(int i) {
        if (this.h) {
            l8.u("closed");
            return null;
        }
        this.g.w(i);
        m();
        return this;
    }

    @Override // defpackage.n8
    public final n8 writeInt(int i) {
        if (this.h) {
            l8.u("closed");
            return null;
        }
        this.g.y(i);
        m();
        return this;
    }

    @Override // defpackage.n8
    public final n8 writeShort(int i) {
        if (this.h) {
            l8.u("closed");
            return null;
        }
        this.g.z(i);
        m();
        return this;
    }

    @Override // defpackage.n8
    public final n8 write(byte[] bArr) {
        if (!this.h) {
            this.g.u(bArr, bArr.length);
            m();
            return this;
        }
        l8.u("closed");
        return null;
    }
}
