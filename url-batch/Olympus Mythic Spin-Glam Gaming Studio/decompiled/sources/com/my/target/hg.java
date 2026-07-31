package com.my.target;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class hg {
    private static int c;
    private final SparseIntArray a = new SparseIntArray();
    private final float b;
    public static final int d = a();
    public static final int e = a();
    public static final int f = a();
    public static final int g = a();
    public static final int h = a();
    public static final int i = a();
    public static final int j = a();
    public static final int k = a();
    public static final int l = a();
    public static final int m = a();
    public static final int n = a();
    public static final int o = a();
    public static final int p = a();
    public static final int q = a();
    public static final int r = a();
    public static final int s = a();
    public static final int t = a();
    public static final int u = a();
    public static final int v = a();
    public static final int w = a();
    public static final int x = a();
    public static final int y = a();
    public static final int z = a();
    public static final int A = a();
    public static final int B = a();
    public static final int C = a();
    public static final int D = a();
    public static final int E = a();
    public static final int F = a();
    public static final int G = a();
    public static final int H = a();
    public static final int I = a();
    public static final int J = a();
    public static final int K = a();
    public static final int L = a();
    public static final int M = a();
    public static final int N = a();
    public static final int O = a();
    public static final int P = a();
    public static final int Q = a();
    public static final int R = a();
    public static final int S = a();
    public static final int T = a();
    public static final int U = a();
    public static final int V = a();
    public static final int W = a();
    public static final int X = a();
    public static final int Y = a();

    private hg(Context context) {
        int i2;
        qi g2 = qi.g(context);
        DisplayMetrics a = qi.a(context);
        int i3 = a.heightPixels;
        if (i3 <= 0 || (i2 = a.widthPixels) <= 0) {
            this.b = 1.0f;
            a(g2);
            return;
        }
        float f2 = a.density;
        float min = Math.min(i2 / f2, i3 / f2);
        if (min >= 720.0f) {
            this.b = 2.0f;
        } else if (min >= 600.0f) {
            this.b = 1.2f;
        } else {
            this.b = 1.0f;
        }
        a(g2);
    }

    public static hg a(Context context) {
        return new hg(context);
    }

    private static int a() {
        int i2 = c;
        c = i2 + 1;
        return i2;
    }

    public int a(int i2) {
        return this.a.get(i2);
    }

    private void a(qi qiVar) {
        a(d, qiVar.b(1));
        a(e, qiVar.b(2));
        a(f, qiVar.b(3));
        a(g, qiVar.b(4));
        a(h, qiVar.b(5));
        a(i, qiVar.b(6));
        a(j, qiVar.b(7));
        a(k, qiVar.b(8));
        a(l, qiVar.b(9));
        a(m, qiVar.b(10));
        a(n, qiVar.b(12));
        a(o, qiVar.b(13));
        a(p, qiVar.b(14));
        a(q, qiVar.b(15));
        a(r, qiVar.b(16));
        a(s, qiVar.b(17));
        a(t, qiVar.b(18));
        a(u, qiVar.b(20));
        a(v, qiVar.b(24));
        a(w, qiVar.b(28));
        a(x, qiVar.b(30));
        a(z, qiVar.b(36));
        a(A, qiVar.b(37));
        a(B, qiVar.b(38));
        a(C, qiVar.b(40));
        a(D, qiVar.b(44));
        a(E, qiVar.b(48));
        a(F, qiVar.b(56));
        a(y, qiVar.b(32));
        a(G, qiVar.b(72));
        a(H, qiVar.b(100));
        a(I, qiVar.b(105));
        a(J, qiVar.b(179));
        a(K, qiVar.b(184));
        a(L, qiVar.b(200));
        a(M, qiVar.b(276));
        a(N, 18);
        a(Q, 12);
        a(R, 11);
        a(P, 13);
        a(O, 14);
        a(U, 15);
        int i2 = S;
        a(i2, 16);
        a(T, 17);
        a(i2, 16);
        a(X, 20);
        a(Y, 10);
        a(V, 22);
        a(W, 24);
    }

    private void a(int i2, int i3) {
        this.a.put(i2, (int) (i3 * this.b));
    }
}
