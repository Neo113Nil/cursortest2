package o;

import com.google.firebase.messaging.Constants;

/* renamed from: o.pQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1694pQ {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public C1694pQ f;
    public C1694pQ g;

    public C1694pQ() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final C1694pQ a() {
        C1694pQ c1694pQ = this.f;
        if (c1694pQ == this) {
            c1694pQ = null;
        }
        C1694pQ c1694pQ2 = this.g;
        AbstractC0048Bt.k(c1694pQ2);
        c1694pQ2.f = this.f;
        C1694pQ c1694pQ3 = this.f;
        AbstractC0048Bt.k(c1694pQ3);
        c1694pQ3.g = this.g;
        this.f = null;
        this.g = null;
        return c1694pQ;
    }

    public final void b(C1694pQ c1694pQ) {
        AbstractC0048Bt.n(c1694pQ, "segment");
        c1694pQ.g = this;
        c1694pQ.f = this.f;
        C1694pQ c1694pQ2 = this.f;
        AbstractC0048Bt.k(c1694pQ2);
        c1694pQ2.g = c1694pQ;
        this.f = c1694pQ;
    }

    public final C1694pQ c() {
        this.d = true;
        return new C1694pQ(this.a, this.b, this.c, true);
    }

    public final void d(C1694pQ c1694pQ, int i) {
        AbstractC0048Bt.n(c1694pQ, "sink");
        byte[] bArr = c1694pQ.a;
        if (!c1694pQ.e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = c1694pQ.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (c1694pQ.d) {
                throw new IllegalArgumentException();
            }
            int i4 = c1694pQ.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            P6.Z(0, i4, i2, bArr, bArr);
            c1694pQ.c -= c1694pQ.b;
            c1694pQ.b = 0;
        }
        int i5 = c1694pQ.c;
        int i6 = this.b;
        P6.Z(i5, i6, i6 + i, this.a, bArr);
        c1694pQ.c += i;
        this.b += i;
    }

    public C1694pQ(byte[] bArr, int i, int i2, boolean z) {
        AbstractC0048Bt.n(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }
}
