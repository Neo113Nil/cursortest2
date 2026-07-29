package o;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CH implements Comparable {
    public static final String i;
    public final C1347k9 h;

    static {
        String str = File.separator;
        AbstractC0048Bt.m(str, "separator");
        i = str;
    }

    public CH(C1347k9 c1347k9) {
        AbstractC0048Bt.n(c1347k9, "bytes");
        this.h = c1347k9;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a = AbstractC0809c.a(this);
        C1347k9 c1347k9 = this.h;
        if (a == -1) {
            a = 0;
        } else if (a < c1347k9.b() && c1347k9.g(a) == 92) {
            a++;
        }
        int b = c1347k9.b();
        int i2 = a;
        while (a < b) {
            if (c1347k9.g(a) == 47 || c1347k9.g(a) == 92) {
                arrayList.add(c1347k9.l(i2, a));
                i2 = a + 1;
            }
            a++;
        }
        if (i2 < c1347k9.b()) {
            arrayList.add(c1347k9.l(i2, c1347k9.b()));
        }
        return arrayList;
    }

    public final String b() {
        C1347k9 c1347k9 = AbstractC0809c.a;
        C1347k9 c1347k92 = this.h;
        int i2 = C1347k9.i(c1347k92, c1347k9);
        if (i2 == -1) {
            i2 = C1347k9.i(c1347k92, AbstractC0809c.b);
        }
        if (i2 != -1) {
            c1347k92 = C1347k9.m(c1347k92, i2 + 1, 0, 2);
        } else if (g() != null && c1347k92.b() == 2) {
            c1347k92 = C1347k9.k;
        }
        return c1347k92.o();
    }

    public final CH c() {
        C1347k9 c1347k9 = AbstractC0809c.d;
        C1347k9 c1347k92 = this.h;
        if (AbstractC0048Bt.h(c1347k92, c1347k9)) {
            return null;
        }
        C1347k9 c1347k93 = AbstractC0809c.a;
        if (AbstractC0048Bt.h(c1347k92, c1347k93)) {
            return null;
        }
        C1347k9 c1347k94 = AbstractC0809c.b;
        if (AbstractC0048Bt.h(c1347k92, c1347k94)) {
            return null;
        }
        C1347k9 c1347k95 = AbstractC0809c.e;
        c1347k92.getClass();
        AbstractC0048Bt.n(c1347k95, "suffix");
        int b = c1347k92.b();
        byte[] bArr = c1347k95.h;
        if (c1347k92.k(b - bArr.length, c1347k95, bArr.length) && (c1347k92.b() == 2 || c1347k92.k(c1347k92.b() - 3, c1347k93, 1) || c1347k92.k(c1347k92.b() - 3, c1347k94, 1))) {
            return null;
        }
        int i2 = C1347k9.i(c1347k92, c1347k93);
        if (i2 == -1) {
            i2 = C1347k9.i(c1347k92, c1347k94);
        }
        if (i2 == 2 && g() != null) {
            if (c1347k92.b() == 3) {
                return null;
            }
            return new CH(C1347k9.m(c1347k92, 0, 3, 1));
        }
        if (i2 == 1) {
            AbstractC0048Bt.n(c1347k94, "prefix");
            if (c1347k92.k(0, c1347k94, c1347k94.b())) {
                return null;
            }
        }
        if (i2 != -1 || g() == null) {
            return i2 == -1 ? new CH(c1347k9) : i2 == 0 ? new CH(C1347k9.m(c1347k92, 0, 1, 1)) : new CH(C1347k9.m(c1347k92, 0, i2, 1));
        }
        if (c1347k92.b() == 2) {
            return null;
        }
        return new CH(C1347k9.m(c1347k92, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        CH ch = (CH) obj;
        AbstractC0048Bt.n(ch, "other");
        return this.h.compareTo(ch.h);
    }

    public final CH d(CH ch) {
        AbstractC0048Bt.n(ch, "other");
        C1347k9 c1347k9 = ch.h;
        int a = AbstractC0809c.a(this);
        C1347k9 c1347k92 = this.h;
        CH ch2 = a == -1 ? null : new CH(c1347k92.l(0, a));
        int a2 = AbstractC0809c.a(ch);
        if (!AbstractC0048Bt.h(ch2, a2 != -1 ? new CH(c1347k9.l(0, a2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + ch).toString());
        }
        ArrayList a3 = a();
        ArrayList a4 = ch.a();
        int min = Math.min(a3.size(), a4.size());
        int i2 = 0;
        while (i2 < min && AbstractC0048Bt.h(a3.get(i2), a4.get(i2))) {
            i2++;
        }
        if (i2 == min && c1347k92.b() == c1347k9.b()) {
            return C0218Ih.r(".", false);
        }
        if (a4.subList(i2, a4.size()).indexOf(AbstractC0809c.e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + ch).toString());
        }
        G8 g8 = new G8();
        C1347k9 c = AbstractC0809c.c(ch);
        if (c == null && (c = AbstractC0809c.c(this)) == null) {
            c = AbstractC0809c.f(i);
        }
        int size = a4.size();
        for (int i3 = i2; i3 < size; i3++) {
            g8.M(AbstractC0809c.e);
            g8.M(c);
        }
        int size2 = a3.size();
        while (i2 < size2) {
            g8.M((C1347k9) a3.get(i2));
            g8.M(c);
            i2++;
        }
        return AbstractC0809c.d(g8, false);
    }

    public final CH e(String str) {
        AbstractC0048Bt.n(str, "child");
        G8 g8 = new G8();
        g8.S(str);
        return AbstractC0809c.b(this, AbstractC0809c.d(g8, false), false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof CH) && AbstractC0048Bt.h(((CH) obj).h, this.h);
    }

    public final Path f() {
        Path path;
        path = Paths.get(this.h.o(), new String[0]);
        AbstractC0048Bt.m(path, "get(...)");
        return path;
    }

    public final Character g() {
        C1347k9 c1347k9 = AbstractC0809c.a;
        C1347k9 c1347k92 = this.h;
        if (C1347k9.e(c1347k92, c1347k9) != -1 || c1347k92.b() < 2 || c1347k92.g(1) != 58) {
            return null;
        }
        char g = (char) c1347k92.g(0);
        if (('a' > g || g >= '{') && ('A' > g || g >= '[')) {
            return null;
        }
        return Character.valueOf(g);
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final File toFile() {
        return new File(this.h.o());
    }

    public final String toString() {
        return this.h.o();
    }
}
