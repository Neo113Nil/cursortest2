package yads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes13.dex */
public final class o23 implements zj {
    public int b;
    public float c = 1.0f;
    public float d = 1.0f;
    public xj e;
    public xj f;
    public xj g;
    public xj h;
    public boolean i;
    public n23 j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    public o23() {
        xj xjVar = xj.e;
        this.e = xjVar;
        this.f = xjVar;
        this.g = xjVar;
        this.h = xjVar;
        ByteBuffer byteBuffer = zj.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
    }

    @Override // yads.zj
    public final xj a(xj xjVar) {
        if (xjVar.c != 2) {
            throw new yj(xjVar);
        }
        int i = this.b;
        if (i == -1) {
            i = xjVar.a;
        }
        this.e = xjVar;
        xj xjVar2 = new xj(i, xjVar.b, 2);
        this.f = xjVar2;
        this.i = true;
        return xjVar2;
    }

    @Override // yads.zj
    public final void b() {
        int i;
        n23 n23Var = this.j;
        if (n23Var != null) {
            int i2 = n23Var.k;
            float f = n23Var.c;
            float f2 = n23Var.d;
            int i3 = n23Var.m + ((int) ((((i2 / (f / f2)) + n23Var.o) / (n23Var.e * f2)) + 0.5f));
            n23Var.j = n23Var.b(n23Var.j, i2, (n23Var.h * 2) + i2);
            int i4 = 0;
            while (true) {
                i = n23Var.h * 2;
                int i5 = n23Var.b;
                if (i4 >= i * i5) {
                    break;
                }
                n23Var.j[(i5 * i2) + i4] = 0;
                i4++;
            }
            n23Var.k = i + n23Var.k;
            n23Var.a();
            if (n23Var.m > i3) {
                n23Var.m = i3;
            }
            n23Var.k = 0;
            n23Var.r = 0;
            n23Var.o = 0;
        }
        this.p = true;
    }

    @Override // yads.zj
    public final boolean c() {
        n23 n23Var;
        return this.p && ((n23Var = this.j) == null || (n23Var.m * n23Var.b) * 2 == 0);
    }

    @Override // yads.zj
    public final void d() {
        this.c = 1.0f;
        this.d = 1.0f;
        xj xjVar = xj.e;
        this.e = xjVar;
        this.f = xjVar;
        this.g = xjVar;
        this.h = xjVar;
        ByteBuffer byteBuffer = zj.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // yads.zj
    public final void flush() {
        if (isActive()) {
            xj xjVar = this.e;
            this.g = xjVar;
            xj xjVar2 = this.f;
            this.h = xjVar2;
            if (this.i) {
                this.j = new n23(xjVar.a, xjVar.b, this.c, this.d, xjVar2.a);
            } else {
                n23 n23Var = this.j;
                if (n23Var != null) {
                    n23Var.k = 0;
                    n23Var.m = 0;
                    n23Var.o = 0;
                    n23Var.p = 0;
                    n23Var.q = 0;
                    n23Var.r = 0;
                    n23Var.s = 0;
                    n23Var.t = 0;
                    n23Var.u = 0;
                    n23Var.v = 0;
                }
            }
        }
        this.m = zj.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // yads.zj
    public final boolean isActive() {
        return this.f.a != -1 && (Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a);
    }

    @Override // yads.zj
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            n23 n23Var = this.j;
            n23Var.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.n += remaining;
            int remaining2 = asShortBuffer.remaining();
            int i = n23Var.b;
            int i2 = remaining2 / i;
            short[] b = n23Var.b(n23Var.j, n23Var.k, i2);
            n23Var.j = b;
            asShortBuffer.get(b, n23Var.k * n23Var.b, ((i * i2) * 2) / 2);
            n23Var.k += i2;
            n23Var.a();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // yads.zj
    public final ByteBuffer a() {
        int i;
        n23 n23Var = this.j;
        if (n23Var != null && (i = n23Var.m * n23Var.b * 2) > 0) {
            if (this.k.capacity() < i) {
                ByteBuffer order = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
                this.k = order;
                this.l = order.asShortBuffer();
            } else {
                this.k.clear();
                this.l.clear();
            }
            ShortBuffer shortBuffer = this.l;
            int min = Math.min(shortBuffer.remaining() / n23Var.b, n23Var.m);
            shortBuffer.put(n23Var.l, 0, n23Var.b * min);
            int i2 = n23Var.m - min;
            n23Var.m = i2;
            short[] sArr = n23Var.l;
            int i3 = n23Var.b;
            System.arraycopy(sArr, min * i3, sArr, 0, i2 * i3);
            this.o += i;
            this.k.limit(i);
            this.m = this.k;
        }
        ByteBuffer byteBuffer = this.m;
        this.m = zj.a;
        return byteBuffer;
    }
}
