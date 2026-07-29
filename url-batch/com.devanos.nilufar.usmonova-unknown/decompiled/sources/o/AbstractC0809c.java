package o;

import java.util.ArrayList;

/* renamed from: o.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0809c {
    public static final C1347k9 a;
    public static final C1347k9 b;
    public static final C1347k9 c;
    public static final C1347k9 d;
    public static final C1347k9 e;

    static {
        C1347k9 c1347k9 = C1347k9.k;
        a = C1097gL.d0("/");
        b = C1097gL.d0("\\");
        c = C1097gL.d0("/\\");
        d = C1097gL.d0(".");
        e = C1097gL.d0("..");
    }

    public static final int a(CH ch) {
        C1347k9 c1347k9 = ch.h;
        if (c1347k9.b() != 0) {
            if (c1347k9.g(0) != 47) {
                if (c1347k9.g(0) == 92) {
                    if (c1347k9.b() > 2 && c1347k9.g(1) == 92) {
                        C1347k9 c1347k92 = b;
                        AbstractC0048Bt.n(c1347k92, "other");
                        int d2 = c1347k9.d(c1347k92.f(), 2);
                        return d2 == -1 ? c1347k9.b() : d2;
                    }
                } else if (c1347k9.b() > 2 && c1347k9.g(1) == 58 && c1347k9.g(2) == 92) {
                    char g = (char) c1347k9.g(0);
                    if ('a' <= g && g < '{') {
                        return 3;
                    }
                    if ('A' <= g && g < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final CH b(CH ch, CH ch2, boolean z) {
        AbstractC0048Bt.n(ch2, "child");
        if (a(ch2) != -1) {
            return ch2;
        }
        if (ch2.g() != null) {
            return ch2;
        }
        C1347k9 c2 = c(ch);
        if (c2 == null && (c2 = c(ch2)) == null) {
            c2 = f(CH.i);
        }
        G8 g8 = new G8();
        g8.M(ch.h);
        if (g8.i > 0) {
            g8.M(c2);
        }
        g8.M(ch2.h);
        return d(g8, z);
    }

    public static final C1347k9 c(CH ch) {
        C1347k9 c1347k9 = ch.h;
        C1347k9 c1347k92 = a;
        if (C1347k9.e(c1347k9, c1347k92) != -1) {
            return c1347k92;
        }
        C1347k9 c1347k93 = ch.h;
        C1347k9 c1347k94 = b;
        if (C1347k9.e(c1347k93, c1347k94) != -1) {
            return c1347k94;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011b A[EDGE_INSN: B:72:0x011b->B:73:0x011b BREAK  A[LOOP:1: B:20:0x00ab->B:36:0x00ab], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CH d(G8 g8, boolean z) {
        C1347k9 c1347k9;
        long j;
        char q;
        boolean m;
        C1347k9 c1347k92;
        int size;
        int i;
        C1347k9 i2;
        G8 g82 = new G8();
        C1347k9 c1347k93 = null;
        int i3 = 0;
        while (true) {
            if (!g8.d(a)) {
                c1347k9 = b;
                if (!g8.d(c1347k9)) {
                    break;
                }
            }
            byte readByte = g8.readByte();
            if (c1347k93 == null) {
                c1347k93 = e(readByte);
            }
            i3++;
        }
        boolean z2 = i3 >= 2 && AbstractC0048Bt.h(c1347k93, c1347k9);
        C1347k9 c1347k94 = c;
        if (z2) {
            AbstractC0048Bt.k(c1347k93);
            g82.M(c1347k93);
            g82.M(c1347k93);
        } else if (i3 > 0) {
            AbstractC0048Bt.k(c1347k93);
            g82.M(c1347k93);
        } else {
            long f = g8.f(c1347k94);
            if (c1347k93 == null) {
                c1347k93 = f == -1 ? f(CH.i) : e(g8.q(f));
            }
            if (AbstractC0048Bt.h(c1347k93, c1347k9) && g8.i >= 2) {
                j = -1;
                if (g8.q(1L) == 58 && (('a' <= (q = (char) g8.q(0L)) && q < '{') || ('A' <= q && q < '['))) {
                    if (f == 2) {
                        g82.write(g8, 3L);
                    } else {
                        g82.write(g8, 2L);
                    }
                }
                boolean z3 = g82.i <= 0;
                ArrayList arrayList = new ArrayList();
                while (true) {
                    m = g8.m();
                    c1347k92 = d;
                    if (!m) {
                        break;
                    }
                    long f2 = g8.f(c1347k94);
                    if (f2 == j) {
                        i2 = g8.i(g8.i);
                    } else {
                        i2 = g8.i(f2);
                        g8.readByte();
                    }
                    C1347k9 c1347k95 = e;
                    if (AbstractC0048Bt.h(i2, c1347k95)) {
                        if (!z3 || !arrayList.isEmpty()) {
                            if (!z || (!z3 && (arrayList.isEmpty() || AbstractC0048Bt.h(AbstractC0720ac.v0(arrayList), c1347k95)))) {
                                arrayList.add(i2);
                            } else if (!z2 || arrayList.size() != 1) {
                                if (!arrayList.isEmpty()) {
                                    arrayList.remove(AbstractC0868ct.w(arrayList));
                                }
                            }
                        }
                    } else if (!AbstractC0048Bt.h(i2, c1347k92) && !AbstractC0048Bt.h(i2, C1347k9.k)) {
                        arrayList.add(i2);
                    }
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    if (i > 0) {
                        g82.M(c1347k93);
                    }
                    g82.M((C1347k9) arrayList.get(i));
                }
                if (g82.i == 0) {
                    g82.M(c1347k92);
                }
                return new CH(g82.i(g82.i));
            }
        }
        j = -1;
        if (g82.i <= 0) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            m = g8.m();
            c1347k92 = d;
            if (!m) {
            }
        }
        size = arrayList2.size();
        while (i < size) {
        }
        if (g82.i == 0) {
        }
        return new CH(g82.i(g82.i));
    }

    public static final C1347k9 e(byte b2) {
        if (b2 == 47) {
            return a;
        }
        if (b2 == 92) {
            return b;
        }
        throw new IllegalArgumentException(AbstractC2188wx.g(b2, "not a directory separator: "));
    }

    public static final C1347k9 f(String str) {
        if (AbstractC0048Bt.h(str, "/")) {
            return a;
        }
        if (AbstractC0048Bt.h(str, "\\")) {
            return b;
        }
        throw new IllegalArgumentException(AbstractC1888sN.s("not a directory separator: ", str));
    }
}
