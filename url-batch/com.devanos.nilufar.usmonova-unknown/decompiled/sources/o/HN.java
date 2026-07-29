package o;

/* loaded from: classes.dex */
public final class HN extends JN {
    public final /* synthetic */ NB a;
    public final /* synthetic */ int b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ int d;

    public HN(NB nb, byte[] bArr, int i, int i2) {
        this.a = nb;
        this.b = i;
        this.c = bArr;
        this.d = i2;
    }

    @Override // o.JN
    public final long contentLength() {
        return this.b;
    }

    @Override // o.JN
    public final NB contentType() {
        return this.a;
    }

    @Override // o.JN
    public final void writeTo(M8 m8) {
        AbstractC0048Bt.n(m8, "sink");
        m8.write(this.c, this.d, this.b);
    }
}
