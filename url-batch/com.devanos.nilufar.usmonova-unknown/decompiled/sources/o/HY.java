package o;

import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class HY {
    public static final byte[] a;
    public static final C1852rr b = AbstractC0048Bt.N(new String[0]);
    public static final SL c;
    public static final NG d;
    public static final TimeZone e;
    public static final C0705aN f;
    public static final String g;

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        AbstractC1166hO.Companion.getClass();
        c = C1100gO.c(bArr, null);
        IN.c(JN.Companion, bArr, null, 0, 7);
        C1347k9 c1347k9 = C1347k9.k;
        d = AbstractC0022At.B(C1097gL.c0("efbbbf"), C1097gL.c0("feff"), C1097gL.c0("fffe"), C1097gL.c0("0000ffff"), C1097gL.c0("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        AbstractC0048Bt.k(timeZone);
        e = timeZone;
        f = new C0705aN("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String M = UT.M(EF.class.getName(), "okhttp3.");
        if (AbstractC0778bU.v(M, "Client", false)) {
            M = M.substring(0, M.length() - 6);
            AbstractC0048Bt.m(M, "substring(...)");
        }
        g = M;
    }

    public static final boolean a(C0932ds c0932ds, C0932ds c0932ds2) {
        AbstractC0048Bt.n(c0932ds, "<this>");
        AbstractC0048Bt.n(c0932ds2, "other");
        return AbstractC0048Bt.h(c0932ds.d, c0932ds2.d) && c0932ds.e == c0932ds2.e && AbstractC0048Bt.h(c0932ds.a, c0932ds2.a);
    }

    public static final int b() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(3L);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large.").toString());
        }
        if (millis != 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout".concat(" too small.").toString());
    }

    public static final void c(Closeable closeable) {
        AbstractC0048Bt.n(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        AbstractC0048Bt.n(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!AbstractC0048Bt.h(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(int i, int i2, String str, String str2) {
        AbstractC0048Bt.n(str, "<this>");
        while (i < i2) {
            if (UT.D(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int f(String str, char c2, int i, int i2) {
        AbstractC0048Bt.n(str, "<this>");
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final String g(String str, Object... objArr) {
        AbstractC0048Bt.n(str, "format");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final boolean h(String[] strArr, String[] strArr2, Comparator comparator) {
        AbstractC0048Bt.n(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                C2257y z = AbstractC1305jX.z(strArr2);
                while (z.hasNext()) {
                    if (comparator.compare(str, (String) z.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long i(C0968eO c0968eO) {
        String j = c0968eO.m.j("Content-Length");
        if (j == null) {
            return -1L;
        }
        try {
            return Long.parseLong(j);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List j(Object... objArr) {
        AbstractC0048Bt.n(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List unmodifiableList = Collections.unmodifiableList(AbstractC0868ct.K(Arrays.copyOf(objArr2, objArr2.length)));
        AbstractC0048Bt.m(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int k(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (AbstractC0048Bt.t(charAt, 31) <= 0 || AbstractC0048Bt.t(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int l(String str, int i, int i2) {
        AbstractC0048Bt.n(str, "<this>");
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int m(String str, int i, int i2) {
        AbstractC0048Bt.n(str, "<this>");
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final String[] n(String[] strArr, String[] strArr2, Comparator comparator) {
        AbstractC0048Bt.n(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean o(String str) {
        AbstractC0048Bt.n(str, "name");
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int p(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' > c2 || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    public static final Charset q(N8 n8, Charset charset) {
        AbstractC0048Bt.n(n8, "<this>");
        AbstractC0048Bt.n(charset, "default");
        int w = n8.w(d);
        if (w == -1) {
            return charset;
        }
        if (w == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            AbstractC0048Bt.m(charset2, "UTF_8");
            return charset2;
        }
        if (w == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            AbstractC0048Bt.m(charset3, "UTF_16BE");
            return charset3;
        }
        if (w == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            AbstractC0048Bt.m(charset4, "UTF_16LE");
            return charset4;
        }
        if (w == 3) {
            Charset charset5 = AbstractC0470Sa.a;
            Charset charset6 = AbstractC0470Sa.c;
            if (charset6 != null) {
                return charset6;
            }
            Charset forName = Charset.forName("UTF-32BE");
            AbstractC0048Bt.m(forName, "forName(...)");
            AbstractC0470Sa.c = forName;
            return forName;
        }
        if (w != 4) {
            throw new AssertionError();
        }
        Charset charset7 = AbstractC0470Sa.a;
        Charset charset8 = AbstractC0470Sa.b;
        if (charset8 != null) {
            return charset8;
        }
        Charset forName2 = Charset.forName("UTF-32LE");
        AbstractC0048Bt.m(forName2, "forName(...)");
        AbstractC0470Sa.b = forName2;
        return forName2;
    }

    public static final int r(N8 n8) {
        AbstractC0048Bt.n(n8, "<this>");
        return (n8.readByte() & 255) | ((n8.readByte() & 255) << 16) | ((n8.readByte() & 255) << 8);
    }

    public static final boolean s(HS hs, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AbstractC0048Bt.n(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c2 = hs.timeout().e() ? hs.timeout().c() - nanoTime : Long.MAX_VALUE;
        hs.timeout().d(Math.min(c2, timeUnit.toNanos(i)) + nanoTime);
        try {
            G8 g8 = new G8();
            while (hs.read(g8, 8192L) != -1) {
                g8.b();
            }
            if (c2 == Long.MAX_VALUE) {
                hs.timeout().a();
                return true;
            }
            hs.timeout().d(nanoTime + c2);
            return true;
        } catch (InterruptedIOException unused) {
            if (c2 == Long.MAX_VALUE) {
                hs.timeout().a();
                return false;
            }
            hs.timeout().d(nanoTime + c2);
            return false;
        } catch (Throwable th) {
            if (c2 == Long.MAX_VALUE) {
                hs.timeout().a();
            } else {
                hs.timeout().d(nanoTime + c2);
            }
            throw th;
        }
    }

    public static final C1852rr t(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1721pr c1721pr = (C1721pr) it.next();
            C1347k9 c1347k9 = c1721pr.a;
            C1347k9 c1347k92 = c1721pr.b;
            String o2 = c1347k9.o();
            String o3 = c1347k92.o();
            arrayList.add(o2);
            arrayList.add(UT.T(o3).toString());
        }
        return new C1852rr((String[]) arrayList.toArray(new String[0]));
    }

    public static final String u(C0932ds c0932ds, boolean z) {
        AbstractC0048Bt.n(c0932ds, "<this>");
        int i = c0932ds.e;
        String str = c0932ds.d;
        if (UT.E(str, ":")) {
            str = "[" + str + ']';
        }
        if (!z) {
            String str2 = c0932ds.a;
            AbstractC0048Bt.n(str2, "scheme");
            if (i == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    public static final List v(List list) {
        AbstractC0048Bt.n(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(AbstractC0720ac.K0(list));
        AbstractC0048Bt.m(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final int w(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static final String x(String str, int i, int i2) {
        int l = l(str, i, i2);
        String substring = str.substring(l, m(str, l, i2));
        AbstractC0048Bt.m(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
