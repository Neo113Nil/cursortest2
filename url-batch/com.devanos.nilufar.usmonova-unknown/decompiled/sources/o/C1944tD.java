package o;

import java.util.List;
import java.util.regex.Pattern;

/* renamed from: o.tD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1944tD extends JN {
    public static final NB e;
    public static final NB f;
    public static final byte[] g;
    public static final byte[] h;
    public static final byte[] i;
    public final C1347k9 a;
    public final List b;
    public final NB c;
    public long d;

    static {
        Pattern pattern = NB.d;
        e = AbstractC0868ct.v("multipart/mixed");
        AbstractC0868ct.v("multipart/alternative");
        AbstractC0868ct.v("multipart/digest");
        AbstractC0868ct.v("multipart/parallel");
        f = AbstractC0868ct.v("multipart/form-data");
        g = new byte[]{58, 32};
        h = new byte[]{13, 10};
        i = new byte[]{45, 45};
    }

    public C1944tD(C1347k9 c1347k9, NB nb, List list) {
        AbstractC0048Bt.n(c1347k9, "boundaryByteString");
        AbstractC0048Bt.n(nb, "type");
        this.a = c1347k9;
        this.b = list;
        Pattern pattern = NB.d;
        this.c = AbstractC0868ct.v(nb + "; boundary=" + c1347k9.o());
        this.d = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a(M8 m8, boolean z) {
        G8 g8;
        M8 m82;
        if (z) {
            m82 = new G8();
            g8 = m82;
        } else {
            g8 = 0;
            m82 = m8;
        }
        List list = this.b;
        int size = list.size();
        long j = 0;
        int i2 = 0;
        while (true) {
            C1347k9 c1347k9 = this.a;
            byte[] bArr = i;
            byte[] bArr2 = h;
            if (i2 >= size) {
                AbstractC0048Bt.k(m82);
                m82.write(bArr);
                m82.r(c1347k9);
                m82.write(bArr);
                m82.write(bArr2);
                if (!z) {
                    return j;
                }
                AbstractC0048Bt.k(g8);
                long j2 = j + g8.i;
                g8.b();
                return j2;
            }
            C1878sD c1878sD = (C1878sD) list.get(i2);
            C1852rr c1852rr = c1878sD.a;
            JN jn = c1878sD.b;
            AbstractC0048Bt.k(m82);
            m82.write(bArr);
            m82.r(c1347k9);
            m82.write(bArr2);
            if (c1852rr != null) {
                int size2 = c1852rr.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    m82.z(c1852rr.k(i3)).write(g).z(c1852rr.m(i3)).write(bArr2);
                }
            }
            NB contentType = jn.contentType();
            if (contentType != null) {
                m82.z("Content-Type: ").z(contentType.a).write(bArr2);
            }
            long contentLength = jn.contentLength();
            if (contentLength != -1) {
                m82.z("Content-Length: ").A(contentLength).write(bArr2);
            } else if (z) {
                AbstractC0048Bt.k(g8);
                g8.b();
                return -1L;
            }
            m82.write(bArr2);
            if (z) {
                j += contentLength;
            } else {
                jn.writeTo(m82);
            }
            m82.write(bArr2);
            i2++;
        }
    }

    @Override // o.JN
    public final long contentLength() {
        long j = this.d;
        if (j != -1) {
            return j;
        }
        long a = a(null, true);
        this.d = a;
        return a;
    }

    @Override // o.JN
    public final NB contentType() {
        return this.c;
    }

    @Override // o.JN
    public final void writeTo(M8 m8) {
        AbstractC0048Bt.n(m8, "sink");
        a(m8, false);
    }
}
