package defpackage;

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
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class z60 {
    public static final byte[] a;
    public static final nm b = vv.A(new String[0]);
    public static final a00 c;
    public static final xv d;
    public static final TimeZone e;
    public static final gz f;
    public static final String g;

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0179, code lost:
    
        continue;
     */
    static {
        int i;
        byte[] bArr = new byte[0];
        a = bArr;
        m8 m8Var = new m8();
        m8Var.u(bArr, 0);
        c = new a00(0L, m8Var);
        r8 r8Var = r8.i;
        r8[] r8VarArr = {tg.k("efbbbf"), tg.k("feff"), tg.k("fffe"), tg.k("0000ffff"), tg.k("ffff0000")};
        ArrayList arrayList = new ArrayList(new d6(r8VarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i2 = 0; i2 < 5; i2++) {
            r8 r8Var2 = r8VarArr[i2];
            arrayList2.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
        Object[] copyOf = Arrays.copyOf(numArr, numArr.length);
        ArrayList arrayList3 = copyOf.length == 0 ? new ArrayList() : new ArrayList(new d6(copyOf, true));
        int i3 = 0;
        int i4 = 0;
        while (i3 < 5) {
            r8 r8Var3 = r8VarArr[i3];
            int i5 = i4 + 1;
            int size = arrayList.size();
            int size2 = arrayList.size();
            if (size < 0) {
                l8.d(size, ").", "fromIndex (0) is greater than toIndex (");
                return;
            }
            if (size > size2) {
                throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
            }
            int i6 = size - 1;
            int i7 = 0;
            while (true) {
                if (i7 > i6) {
                    i = -(i7 + 1);
                    break;
                }
                i = (i7 + i6) >>> 1;
                Comparable comparable = (Comparable) arrayList.get(i);
                int compareTo = comparable == r8Var3 ? 0 : comparable == null ? -1 : r8Var3 == null ? 1 : comparable.compareTo(r8Var3);
                if (compareTo < 0) {
                    i7 = i + 1;
                } else if (compareTo > 0) {
                    i6 = i - 1;
                }
            }
            arrayList3.set(i, Integer.valueOf(i4));
            i3++;
            i4 = i5;
        }
        if (((r8) arrayList.get(0)).a() <= 0) {
            l8.l("the empty byte string is not a supported option");
            return;
        }
        int i8 = 0;
        while (i8 < arrayList.size()) {
            r8 r8Var4 = (r8) arrayList.get(i8);
            int i9 = i8 + 1;
            int i10 = i9;
            while (i10 < arrayList.size()) {
                r8 r8Var5 = (r8) arrayList.get(i10);
                r8Var5.getClass();
                r8Var4.getClass();
                if (r8Var5.f(r8Var4, r8Var4.a())) {
                    if (r8Var5.a() == r8Var4.a()) {
                        throw new IllegalArgumentException(("duplicate option: " + r8Var5).toString());
                    }
                    if (((Number) arrayList3.get(i10)).intValue() > ((Number) arrayList3.get(i8)).intValue()) {
                        arrayList.remove(i10);
                        arrayList3.remove(i10);
                    } else {
                        i10++;
                    }
                }
            }
            i8 = i9;
        }
        m8 m8Var2 = new m8();
        g8.g(0L, m8Var2, 0, arrayList, 0, arrayList.size(), arrayList3);
        int[] iArr = new int[(int) (m8Var2.g / 4)];
        int i11 = 0;
        while (!m8Var2.n()) {
            iArr[i11] = m8Var2.readInt();
            i11++;
        }
        d = new xv((r8[]) Arrays.copyOf(r8VarArr, 5), iArr);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        e = timeZone;
        f = new gz(1);
        String u0 = m30.u0(fv.class.getName(), "okhttp3.");
        if (u0.endsWith("Client")) {
            u0 = u0.substring(0, u0.length() - 6);
        }
        g = u0;
    }

    public static final boolean a(xn xnVar, xn xnVar2) {
        xnVar.getClass();
        xnVar2.getClass();
        return oo.b(xnVar.d, xnVar2.d) && xnVar.e == xnVar2.e && oo.b(xnVar.a, xnVar2.a);
    }

    public static final void b(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void c(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!oo.b(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final int d(int i, int i2, String str, String str2) {
        while (i < i2) {
            if (m30.m0(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int e(String str, char c2, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final String f(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0036, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean g(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str = strArr[i];
                int i2 = 0;
                while (true) {
                    if (i2 < strArr2.length) {
                        int i3 = i2 + 1;
                        try {
                            if (comparator.compare(str, strArr2[i2]) == 0) {
                                return true;
                            }
                            i2 = i3;
                        } catch (ArrayIndexOutOfBoundsException e2) {
                            throw new NoSuchElementException(e2.getMessage());
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long h(zz zzVar) {
        String a2 = zzVar.k.a("Content-Length");
        if (a2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(a2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List i(Object... objArr) {
        Object[] objArr2 = (Object[]) objArr.clone();
        List unmodifiableList = Collections.unmodifiableList(va.V(Arrays.copyOf(objArr2, objArr2.length)));
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public static final int j(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (oo.h(charAt, 31) <= 0 || oo.h(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int k(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int l(String str, int i, int i2) {
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

    public static final String[] m(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr2.getClass();
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

    public static final boolean n(String str) {
        str.getClass();
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int o(char c2) {
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

    public static final Charset p(o8 o8Var, Charset charset) {
        o8Var.getClass();
        charset.getClass();
        int g2 = o8Var.g(d);
        if (g2 == -1) {
            return charset;
        }
        if (g2 == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            charset2.getClass();
            return charset2;
        }
        if (g2 == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            charset3.getClass();
            return charset3;
        }
        if (g2 == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            charset4.getClass();
            return charset4;
        }
        if (g2 == 3) {
            Charset charset5 = r9.a;
            Charset charset6 = r9.c;
            if (charset6 != null) {
                return charset6;
            }
            Charset forName = Charset.forName("UTF-32BE");
            forName.getClass();
            r9.c = forName;
            return forName;
        }
        if (g2 != 4) {
            throw new AssertionError();
        }
        Charset charset7 = r9.a;
        Charset charset8 = r9.b;
        if (charset8 != null) {
            return charset8;
        }
        Charset forName2 = Charset.forName("UTF-32LE");
        forName2.getClass();
        r9.b = forName2;
        return forName2;
    }

    public static final int q(o8 o8Var) {
        o8Var.getClass();
        return (o8Var.readByte() & 255) | ((o8Var.readByte() & 255) << 16) | ((o8Var.readByte() & 255) << 8);
    }

    public static final boolean r(p20 p20Var, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long nanoTime = System.nanoTime();
        long c2 = p20Var.a().e() ? p20Var.a().c() - nanoTime : Long.MAX_VALUE;
        p20Var.a().d(Math.min(c2, timeUnit.toNanos(i)) + nanoTime);
        try {
            m8 m8Var = new m8();
            while (p20Var.b(8192L, m8Var) != -1) {
                m8Var.skip(m8Var.g);
            }
            if (c2 == Long.MAX_VALUE) {
                p20Var.a().a();
                return true;
            }
            p20Var.a().d(nanoTime + c2);
            return true;
        } catch (InterruptedIOException unused) {
            if (c2 == Long.MAX_VALUE) {
                p20Var.a().a();
                return false;
            }
            p20Var.a().d(nanoTime + c2);
            return false;
        } catch (Throwable th) {
            if (c2 == Long.MAX_VALUE) {
                p20Var.a().a();
            } else {
                p20Var.a().d(nanoTime + c2);
            }
            throw th;
        }
    }

    public static final nm s(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mm mmVar = (mm) it.next();
            r8 r8Var = mmVar.a;
            r8 r8Var2 = mmVar.b;
            String h = r8Var.h();
            String h2 = r8Var2.h();
            arrayList.add(h);
            arrayList.add(m30.x0(h2).toString());
        }
        return new nm((String[]) arrayList.toArray(new String[0]));
    }

    public static final String t(xn xnVar, boolean z) {
        xnVar.getClass();
        int i = xnVar.e;
        String str = xnVar.d;
        if (m30.n0(str, ":")) {
            str = "[" + str + ']';
        }
        if (!z) {
            String str2 = xnVar.a;
            str2.getClass();
            if (i == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    public static final List u(List list) {
        list.getClass();
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public static final int v(String str, int i) {
        if (str != null) {
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
            }
        }
        return i;
    }
}
