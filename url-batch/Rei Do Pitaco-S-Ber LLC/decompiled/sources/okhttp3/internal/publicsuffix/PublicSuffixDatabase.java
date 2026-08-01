package okhttp3.internal.publicsuffix;

import defpackage.bb;
import defpackage.cg;
import defpackage.e50;
import defpackage.gv;
import defpackage.h10;
import defpackage.im;
import defpackage.iw;
import defpackage.jw;
import defpackage.l8;
import defpackage.m30;
import defpackage.oo;
import defpackage.px;
import defpackage.r6;
import defpackage.ua;
import defpackage.uh;
import defpackage.vv;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class PublicSuffixDatabase {
    public static final byte[] e = {42};
    public static final List f = oo.x("*");
    public static final PublicSuffixDatabase g = new PublicSuffixDatabase();
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);
    public byte[] c;
    public byte[] d;

    public static List c(String str) {
        List v0 = m30.v0(str, new char[]{'.'});
        if (!oo.b(ua.b0(v0), "")) {
            return v0;
        }
        int size = v0.size() - 1;
        if (size < 0) {
            size = 0;
        }
        if (size < 0) {
            l8.r(size, " is less than zero.", "Requested element count ");
            return null;
        }
        uh uhVar = uh.f;
        if (size == 0) {
            return uhVar;
        }
        if (size >= v0.size()) {
            return ua.c0(v0);
        }
        if (size == 1) {
            if (v0.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            return oo.x(v0.get(0));
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = v0.iterator();
        int i = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i++;
            if (i == size) {
                break;
            }
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : oo.x(arrayList.get(0)) : uhVar;
    }

    public final String a(String str) {
        String str2;
        String str3;
        String str4;
        List list;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List c = c(unicode);
        List list2 = uh.f;
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
                        jw jwVar = jw.a;
                        jw.a.getClass();
                        jw.i("Failed to read public suffix list", 5, e2);
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
            l8.u("Unable to load publicsuffixes.gz resource from the classpath.");
            return null;
        }
        int size3 = c.size();
        byte[][] bArr = new byte[size3][];
        for (int i2 = 0; i2 < size3; i2++) {
            String str5 = (String) c.get(i2);
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            byte[] bytes = str5.getBytes(charset);
            bytes.getClass();
            bArr[i2] = bytes;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                str2 = null;
                break;
            }
            byte[] bArr2 = this.c;
            if (bArr2 == null) {
                oo.P("publicSuffixListBytes");
                throw null;
            }
            str2 = iw.a(bArr2, bArr, i3);
            if (str2 != null) {
                break;
            }
            i3++;
        }
        if (size3 > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i4 = 0; i4 < length; i4++) {
                bArr3[i4] = e;
                byte[] bArr4 = this.c;
                if (bArr4 == null) {
                    oo.P("publicSuffixListBytes");
                    throw null;
                }
                str3 = iw.a(bArr4, bArr3, i4);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            int i5 = size3 - 1;
            for (int i6 = 0; i6 < i5; i6++) {
                byte[] bArr5 = this.d;
                if (bArr5 == null) {
                    oo.P("publicSuffixExceptionListBytes");
                    throw null;
                }
                str4 = iw.a(bArr5, bArr, i6);
                if (str4 != null) {
                    break;
                }
            }
        }
        str4 = null;
        if (str4 != null) {
            list = m30.v0("!".concat(str4), new char[]{'.'});
        } else if (str2 == null && str3 == null) {
            list = f;
        } else {
            List v0 = str2 != null ? m30.v0(str2, new char[]{'.'}) : list2;
            if (str3 != null) {
                list2 = m30.v0(str3, new char[]{'.'});
            }
            list = v0.size() > list2.size() ? v0 : list2;
        }
        if (c.size() == list.size() && ((String) list.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) list.get(0)).charAt(0) == '!') {
            size = c.size();
            size2 = list.size();
        } else {
            size = c.size();
            size2 = list.size() + 1;
        }
        int i7 = size - size2;
        h10 bbVar = new bb(c(str));
        if (i7 < 0) {
            l8.r(i7, " is less than zero.", "Requested element count ");
            return null;
        }
        if (i7 != 0) {
            bbVar = new cg(bbVar, i7);
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        for (Object obj : bbVar) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) ".");
            }
            vv.c(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public final void b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                Logger logger = gv.a;
                px pxVar = new px(new im(new r6(resourceAsStream, new e50(), 1)));
                try {
                    long readInt = pxVar.readInt();
                    pxVar.h(readInt);
                    byte[] q = pxVar.g.q(readInt);
                    long readInt2 = pxVar.readInt();
                    pxVar.h(readInt2);
                    byte[] q2 = pxVar.g.q(readInt2);
                    pxVar.close();
                    synchronized (this) {
                        this.c = q;
                        this.d = q2;
                    }
                } finally {
                }
            }
        } finally {
            this.b.countDown();
        }
    }
}
