package yads;

import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class rt extends dn {
    public int[] i;
    public int[] j;

    @Override // yads.zj
    public final void a(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer a = a(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i : iArr) {
                a.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        a.flip();
    }

    @Override // yads.dn
    public final xj b(xj xjVar) {
        int[] iArr = this.i;
        if (iArr == null) {
            return xj.e;
        }
        if (xjVar.c != 2) {
            throw new yj(xjVar);
        }
        boolean z = xjVar.b != iArr.length;
        int i = 0;
        while (i < iArr.length) {
            int i2 = iArr[i];
            if (i2 >= xjVar.b) {
                throw new yj(xjVar);
            }
            z |= i2 != i;
            i++;
        }
        return z ? new xj(xjVar.a, iArr.length, 2) : xj.e;
    }

    @Override // yads.dn
    public final void e() {
        this.j = this.i;
    }

    @Override // yads.dn
    public final void g() {
        this.j = null;
        this.i = null;
    }
}
