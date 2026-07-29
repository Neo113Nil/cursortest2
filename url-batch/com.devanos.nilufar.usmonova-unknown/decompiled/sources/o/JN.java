package o;

import java.io.File;

/* loaded from: classes.dex */
public abstract class JN {
    public static final IN Companion = new IN();

    public static final JN create(String str, NB nb) {
        Companion.getClass();
        return IN.a(str, nb);
    }

    public abstract long contentLength();

    public abstract NB contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(M8 m8);

    @InterfaceC1315jh
    public static final JN create(NB nb, File file) {
        Companion.getClass();
        AbstractC0048Bt.n(file, "file");
        return new GN(nb, file, 0);
    }

    @InterfaceC1315jh
    public static final JN create(NB nb, String str) {
        Companion.getClass();
        AbstractC0048Bt.n(str, "content");
        return IN.a(str, nb);
    }

    @InterfaceC1315jh
    public static final JN create(NB nb, C1347k9 c1347k9) {
        Companion.getClass();
        AbstractC0048Bt.n(c1347k9, "content");
        return new GN(nb, c1347k9, 1);
    }

    @InterfaceC1315jh
    public static final JN create(NB nb, byte[] bArr) {
        Companion.getClass();
        AbstractC0048Bt.n(bArr, "content");
        return IN.b(nb, bArr, 0, bArr.length);
    }

    @InterfaceC1315jh
    public static final JN create(NB nb, byte[] bArr, int i) {
        Companion.getClass();
        AbstractC0048Bt.n(bArr, "content");
        return IN.b(nb, bArr, i, bArr.length);
    }

    public static final JN create(byte[] bArr) {
        IN in = Companion;
        in.getClass();
        AbstractC0048Bt.n(bArr, "<this>");
        return IN.c(in, bArr, null, 0, 7);
    }

    public static final JN create(byte[] bArr, NB nb) {
        IN in = Companion;
        in.getClass();
        AbstractC0048Bt.n(bArr, "<this>");
        return IN.c(in, bArr, nb, 0, 6);
    }

    public static final JN create(byte[] bArr, NB nb, int i) {
        IN in = Companion;
        in.getClass();
        AbstractC0048Bt.n(bArr, "<this>");
        return IN.c(in, bArr, nb, i, 4);
    }

    public static final JN create(byte[] bArr, NB nb, int i, int i2) {
        Companion.getClass();
        return IN.b(nb, bArr, i, i2);
    }

    public static final JN create(C1347k9 c1347k9, NB nb) {
        Companion.getClass();
        AbstractC0048Bt.n(c1347k9, "<this>");
        return new GN(nb, c1347k9, 1);
    }

    public static final JN create(File file, NB nb) {
        Companion.getClass();
        AbstractC0048Bt.n(file, "<this>");
        return new GN(nb, file, 0);
    }

    @InterfaceC1315jh
    public static final JN create(NB nb, byte[] bArr, int i, int i2) {
        Companion.getClass();
        AbstractC0048Bt.n(bArr, "content");
        return IN.b(nb, bArr, i, i2);
    }
}
