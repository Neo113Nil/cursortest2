package yads;

import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import java.nio.ByteBuffer;

/* loaded from: classes11.dex */
public final class iz2 extends dn {
    public final long i = SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
    public final long j = 20000;
    public final short k = 1024;
    public int l;
    public boolean m;
    public byte[] n;
    public byte[] o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public long t;

    public iz2() {
        byte[] bArr = sb3.f;
        this.n = bArr;
        this.o = bArr;
    }

    @Override // yads.zj
    public final void a(ByteBuffer byteBuffer) {
        int limit;
        int limit2;
        int position;
        while (byteBuffer.hasRemaining() && !this.g.hasRemaining()) {
            int i = this.p;
            if (i == 0) {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.n.length));
                int limit4 = byteBuffer.limit() - 2;
                while (true) {
                    if (limit4 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(limit4)) > this.k) {
                            int i2 = this.l;
                            position = ((limit4 / i2) * i2) + i2;
                            break;
                        }
                        limit4 -= 2;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.p = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    a(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.s = true;
                    }
                }
                byteBuffer.limit(limit3);
            } else if (i == 1) {
                int limit5 = byteBuffer.limit();
                int position2 = byteBuffer.position();
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit2 = byteBuffer.limit();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(position2)) > this.k) {
                            int i3 = this.l;
                            limit2 = (position2 / i3) * i3;
                            break;
                        }
                        position2 += 2;
                    }
                }
                int position3 = limit2 - byteBuffer.position();
                byte[] bArr = this.n;
                int length = bArr.length;
                int i4 = this.q;
                int i5 = length - i4;
                if (limit2 >= limit5 || position3 >= i5) {
                    int min = Math.min(position3, i5);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.n, this.q, min);
                    int i6 = this.q + min;
                    this.q = i6;
                    byte[] bArr2 = this.n;
                    if (i6 == bArr2.length) {
                        if (this.s) {
                            int i7 = this.r;
                            a(i7).put(bArr2, 0, i7).flip();
                            if (i7 > 0) {
                                this.s = true;
                            }
                            this.t += (this.q - (this.r * 2)) / this.l;
                        } else {
                            this.t += (i6 - this.r) / this.l;
                        }
                        byte[] bArr3 = this.n;
                        int i8 = this.q;
                        int min2 = Math.min(byteBuffer.remaining(), this.r);
                        int i9 = this.r - min2;
                        System.arraycopy(bArr3, i8 - i9, this.o, 0, i9);
                        byteBuffer.position(byteBuffer.limit() - min2);
                        byteBuffer.get(this.o, i9, min2);
                        this.q = 0;
                        this.p = 2;
                    }
                    byteBuffer.limit(limit5);
                } else {
                    a(i4).put(bArr, 0, i4).flip();
                    if (i4 > 0) {
                        this.s = true;
                    }
                    this.q = 0;
                    this.p = 0;
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int limit6 = byteBuffer.limit();
                int position4 = byteBuffer.position();
                while (true) {
                    if (position4 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(position4)) > this.k) {
                            int i10 = this.l;
                            limit = (position4 / i10) * i10;
                            break;
                        }
                        position4 += 2;
                    }
                }
                byteBuffer.limit(limit);
                this.t += byteBuffer.remaining() / this.l;
                byte[] bArr4 = this.o;
                int i11 = this.r;
                int min3 = Math.min(byteBuffer.remaining(), this.r);
                int i12 = this.r - min3;
                System.arraycopy(bArr4, i11 - i12, this.o, 0, i12);
                byteBuffer.position(byteBuffer.limit() - min3);
                byteBuffer.get(this.o, i12, min3);
                if (limit < limit6) {
                    byte[] bArr5 = this.o;
                    int i13 = this.r;
                    a(i13).put(bArr5, 0, i13).flip();
                    if (i13 > 0) {
                        this.s = true;
                    }
                    this.p = 0;
                    byteBuffer.limit(limit6);
                }
            }
        }
    }

    @Override // yads.dn
    public final xj b(xj xjVar) {
        if (xjVar.c == 2) {
            return this.m ? xjVar : xj.e;
        }
        throw new yj(xjVar);
    }

    @Override // yads.dn
    public final void e() {
        if (this.m) {
            xj xjVar = this.b;
            int i = xjVar.d;
            this.l = i;
            long j = this.i;
            long j2 = xjVar.a;
            int i2 = ((int) ((j * j2) / 1000000)) * i;
            if (this.n.length != i2) {
                this.n = new byte[i2];
            }
            int i3 = ((int) ((this.j * j2) / 1000000)) * i;
            this.r = i3;
            if (this.o.length != i3) {
                this.o = new byte[i3];
            }
        }
        this.p = 0;
        this.t = 0L;
        this.q = 0;
        this.s = false;
    }

    @Override // yads.dn
    public final void f() {
        int i = this.q;
        if (i > 0) {
            a(i).put(this.n, 0, i).flip();
            if (i > 0) {
                this.s = true;
            }
        }
        if (this.s) {
            return;
        }
        this.t += this.r / this.l;
    }

    @Override // yads.dn
    public final void g() {
        this.m = false;
        this.r = 0;
        byte[] bArr = sb3.f;
        this.n = bArr;
        this.o = bArr;
    }

    @Override // yads.dn, yads.zj
    public final boolean isActive() {
        return this.m;
    }
}
