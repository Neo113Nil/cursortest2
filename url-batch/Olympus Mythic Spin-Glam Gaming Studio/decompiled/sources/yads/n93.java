package yads;

import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class n93 extends dn {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m = sb3.f;
    public int n;
    public long o;

    @Override // yads.zj
    public final void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.l);
        this.o += min / this.b.d;
        this.l -= min;
        byteBuffer.position(position + min);
        if (this.l > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.n + i2) - this.m.length;
        ByteBuffer a = a(length);
        int i3 = this.n;
        int i4 = sb3.a;
        int max = Math.max(0, Math.min(length, i3));
        a.put(this.m, 0, max);
        int max2 = Math.max(0, Math.min(length - max, i2));
        byteBuffer.limit(byteBuffer.position() + max2);
        a.put(byteBuffer);
        byteBuffer.limit(limit);
        int i5 = i2 - max2;
        int i6 = this.n - max;
        this.n = i6;
        byte[] bArr = this.m;
        System.arraycopy(bArr, max, bArr, 0, i6);
        byteBuffer.get(this.m, this.n, i5);
        this.n += i5;
        a.flip();
    }

    @Override // yads.dn
    public final xj b(xj xjVar) {
        if (xjVar.c != 2) {
            throw new yj(xjVar);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? xj.e : xjVar;
    }

    @Override // yads.dn, yads.zj
    public final boolean c() {
        return super.c() && this.n == 0;
    }

    @Override // yads.dn
    public final void e() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // yads.dn
    public final void f() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // yads.dn
    public final void g() {
        this.m = sb3.f;
    }

    @Override // yads.dn, yads.zj
    public final ByteBuffer a() {
        int i;
        if (super.c() && (i = this.n) > 0) {
            a(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        ByteBuffer byteBuffer = this.g;
        this.g = zj.a;
        return byteBuffer;
    }
}
