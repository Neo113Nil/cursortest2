package androidx.room;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class w implements j0.d, j0.c {

    /* renamed from: g, reason: collision with root package name */
    public static final TreeMap f1714g = new TreeMap();

    /* renamed from: a, reason: collision with root package name */
    public volatile String f1715a;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f1719f = new int[1];

    /* renamed from: b, reason: collision with root package name */
    public final long[] f1716b = new long[1];

    /* renamed from: c, reason: collision with root package name */
    public final double[] f1717c = new double[1];
    public final String[] d = new String[1];

    /* renamed from: e, reason: collision with root package name */
    public final byte[][] f1718e = new byte[1][];

    public static final w m(String str) {
        TreeMap treeMap = f1714g;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(0);
            if (ceilingEntry == null) {
                w wVar = new w();
                wVar.f1715a = str;
                return wVar;
            }
            treeMap.remove(ceilingEntry.getKey());
            w wVar2 = (w) ceilingEntry.getValue();
            wVar2.f1715a = str;
            return wVar2;
        }
    }

    @Override // j0.d
    public final void a(j0.c cVar) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // j0.c
    public final void e(int i, byte[] bArr) {
        this.f1719f[i] = 5;
        this.f1718e[i] = bArr;
    }

    @Override // j0.c
    public final void f(int i) {
        this.f1719f[i] = 1;
    }

    @Override // j0.c
    public final void g(String str, int i) {
        this.f1719f[i] = 4;
        this.d[i] = str;
    }

    @Override // j0.c
    public final void h(int i, double d) {
        this.f1719f[i] = 3;
        this.f1717c[i] = d;
    }

    @Override // j0.d
    public final String j() {
        String str = this.f1715a;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void n() {
        TreeMap treeMap = f1714g;
        synchronized (treeMap) {
            treeMap.put(0, this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                g1.f.d(it, "queryPool.descendingKeySet().iterator()");
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

    @Override // j0.c
    public final void p(int i, long j2) {
        this.f1719f[i] = 2;
        this.f1716b[i] = j2;
    }
}
