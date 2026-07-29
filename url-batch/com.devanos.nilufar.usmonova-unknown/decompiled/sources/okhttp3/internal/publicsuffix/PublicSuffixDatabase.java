package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import kotlin.Metadata;
import o.AbstractC0048Bt;
import o.AbstractC0720ac;
import o.AbstractC0868ct;
import o.AbstractC0946e20;
import o.C0140Fh;
import o.C0897dI;
import o.C1063fr;
import o.C1318jk;
import o.JL;
import o.NV;
import o.OF;
import o.UT;
import o.W6;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "o/Fh", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PublicSuffixDatabase {
    public static final byte[] e = {42};
    public static final List f = AbstractC0868ct.J("*");
    public static final PublicSuffixDatabase g = new PublicSuffixDatabase();
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);
    public byte[] c;
    public byte[] d;

    public static List c(String str) {
        List N = UT.N(str, new char[]{'.'});
        return AbstractC0048Bt.h(AbstractC0720ac.v0(N), "") ? AbstractC0720ac.l0(N) : N;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
    
        if (r2 <= 1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
    
        r6 = (byte[][]) r5.clone();
        r10 = r6.length - 1;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
    
        if (r11 >= r10) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ac, code lost:
    
        r6[r11] = okhttp3.internal.publicsuffix.PublicSuffixDatabase.e;
        r12 = r13.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
    
        if (r12 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b4, code lost:
    
        r12 = o.C0140Fh.p(r12, r6, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b8, code lost:
    
        if (r12 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:
    
        if (r12 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c5, code lost:
    
        r2 = r2 - 1;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c7, code lost:
    
        if (r6 >= r2) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c9, code lost:
    
        r8 = r13.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cb, code lost:
    
        if (r8 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cd, code lost:
    
        r8 = o.C0140Fh.p(r8, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d1, code lost:
    
        if (r8 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d4, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e0, code lost:
    
        if (r8 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e2, code lost:
    
        r1 = o.UT.N("!".concat(r8), new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0123, code lost:
    
        if (r0.size() != r1.size()) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012f, code lost:
    
        if (((java.lang.String) r1.get(0)).charAt(0) == '!') goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0131, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013c, code lost:
    
        if (((java.lang.String) r1.get(0)).charAt(0) != '!') goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013e, code lost:
    
        r0 = r0.size();
        r1 = r1.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0152, code lost:
    
        r14 = o.PQ.u(o.AbstractC0720ac.i0(c(r14)), r0 - r1);
        r0 = new java.lang.StringBuilder();
        r0.append((java.lang.CharSequence) "");
        r14 = r14.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0170, code lost:
    
        if (r14.hasNext() == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0172, code lost:
    
        r2 = r14.next();
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0177, code lost:
    
        if (r3 <= 1) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0179, code lost:
    
        r0.append((java.lang.CharSequence) ".");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017e, code lost:
    
        o.AbstractC2219xO.c(r0, r2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0182, code lost:
    
        r0.append((java.lang.CharSequence) "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0189, code lost:
    
        return r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0148, code lost:
    
        r0 = r0.size();
        r1 = r1.size() + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f1, code lost:
    
        if (r9 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f3, code lost:
    
        if (r12 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f5, code lost:
    
        r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f8, code lost:
    
        if (r9 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00fa, code lost:
    
        r5 = o.UT.N(r9, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0104, code lost:
    
        if (r12 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0106, code lost:
    
        r1 = o.UT.N(r12, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0116, code lost:
    
        if (r5.size() <= r1.size()) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0118, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0103, code lost:
    
        r5 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00d7, code lost:
    
        o.AbstractC0048Bt.i0("publicSuffixExceptionListBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00dc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00dd, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00be, code lost:
    
        o.AbstractC0048Bt.i0("publicSuffixListBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00c1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00c2, code lost:
    
        r12 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(String str) {
        String str2;
        String unicode = IDN.toUnicode(str);
        AbstractC0048Bt.m(unicode, "unicodeDomain");
        List c = c(unicode);
        List list = C1318jk.h;
        int i = 0;
        if (this.a.get() || !this.a.compareAndSet(false, true)) {
            try {
                this.b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e2) {
                        C0897dI c0897dI = C0897dI.a;
                        C0897dI.a.getClass();
                        C0897dI.i("Failed to read public suffix list", 5, e2);
                        if (z) {
                        }
                    }
                } finally {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (this.c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = c.size();
        byte[][] bArr = new byte[size][];
        for (int i2 = 0; i2 < size; i2++) {
            String str3 = (String) c.get(i2);
            Charset charset = StandardCharsets.UTF_8;
            AbstractC0048Bt.m(charset, "UTF_8");
            byte[] bytes = str3.getBytes(charset);
            AbstractC0048Bt.m(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i2] = bytes;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                str2 = null;
                break;
            }
            byte[] bArr2 = this.c;
            if (bArr2 == null) {
                AbstractC0048Bt.i0("publicSuffixListBytes");
                throw null;
            }
            str2 = C0140Fh.p(bArr2, bArr, i3);
            if (str2 != null) {
                break;
            }
            i3++;
        }
    }

    public final void b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                Logger logger = OF.a;
                JL h = AbstractC0946e20.h(new C1063fr(new W6(resourceAsStream, 1, new NV())));
                try {
                    long readInt = h.readInt();
                    h.y(readInt);
                    byte[] B = h.i.B(readInt);
                    long readInt2 = h.readInt();
                    h.y(readInt2);
                    byte[] B2 = h.i.B(readInt2);
                    h.close();
                    synchronized (this) {
                        this.c = B;
                        this.d = B2;
                    }
                } finally {
                }
            }
        } finally {
            this.b.countDown();
        }
    }
}
