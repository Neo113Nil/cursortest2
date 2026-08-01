package androidx.room;

import j0.InterfaceC0180c;
import j0.InterfaceC0181d;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class w implements InterfaceC0181d, InterfaceC0180c {
    public static final TreeMap h = new TreeMap();

    /* renamed from: a, reason: collision with root package name */
    public volatile String f2091a;

    /* renamed from: g, reason: collision with root package name */
    public int f2096g;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f2095f = new int[3];

    /* renamed from: b, reason: collision with root package name */
    public final long[] f2092b = new long[3];

    /* renamed from: c, reason: collision with root package name */
    public final double[] f2093c = new double[3];
    public final String[] d = new String[3];

    /* renamed from: e, reason: collision with root package name */
    public final byte[][] f2094e = new byte[3][];

    public static final w h(String str) {
        TreeMap treeMap = h;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(2);
            if (ceilingEntry == null) {
                w wVar = new w();
                wVar.f2091a = str;
                wVar.f2096g = 2;
                return wVar;
            }
            treeMap.remove(ceilingEntry.getKey());
            w wVar2 = (w) ceilingEntry.getValue();
            wVar2.f2091a = str;
            wVar2.f2096g = 2;
            return wVar2;
        }
    }

    @Override // j0.InterfaceC0181d
    public final void a(InterfaceC0180c interfaceC0180c) {
        int i = this.f2096g;
        if (1 > i) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.f2095f[i2];
            if (i3 == 1) {
                interfaceC0180c.k(i2);
            } else if (i3 == 2) {
                interfaceC0180c.s(i2, this.f2092b[i2]);
            } else if (i3 == 3) {
                interfaceC0180c.m(i2, this.f2093c[i2]);
            } else if (i3 == 4) {
                String str = this.d[i2];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                interfaceC0180c.l(str, i2);
            } else if (i3 == 5) {
                byte[] bArr = this.f2094e[i2];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                interfaceC0180c.j(i2, bArr);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // j0.InterfaceC0181d
    public final String f() {
        String str = this.f2091a;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void i() {
        TreeMap treeMap = h;
        synchronized (treeMap) {
            treeMap.put(2, this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                i1.f.d(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // j0.InterfaceC0180c
    public final void j(int i, byte[] bArr) {
        this.f2095f[i] = 5;
        this.f2094e[i] = bArr;
    }

    @Override // j0.InterfaceC0180c
    public final void k(int i) {
        this.f2095f[i] = 1;
    }

    @Override // j0.InterfaceC0180c
    public final void l(String str, int i) {
        this.f2095f[i] = 4;
        this.d[i] = str;
    }

    @Override // j0.InterfaceC0180c
    public final void m(int i, double d) {
        this.f2095f[i] = 3;
        this.f2093c[i] = d;
    }

    @Override // j0.InterfaceC0180c
    public final void s(int i, long j2) {
        this.f2095f[i] = 2;
        this.f2092b[i] = j2;
    }
}
