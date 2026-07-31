package com.my.target;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class gg {
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

    private gg(Context context) {
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

    public static gg a(Context context) {
        return new gg(context);
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
        a(d, qiVar.b(200));
        a(e, qiVar.b(1));
        a(f, qiVar.b(4));
        a(g, 1);
        a(h, 18);
        a(i, qiVar.b(16));
        a(j, qiVar.b(8));
        a(k, qiVar.b(6));
        a(l, qiVar.b(2));
        a(m, qiVar.b(48));
        a(n, qiVar.b(6));
        a(o, qiVar.b(6));
        a(p, qiVar.b(14));
        a(q, qiVar.b(20));
        a(r, qiVar.b(27));
        a(s, 22);
        a(t, 2);
        a(u, 16);
        a(v, 3);
        a(w, 16);
        a(x, qiVar.b(6));
        a(y, qiVar.b(2));
        a(z, 1);
        a(A, qiVar.b(3));
        a(C, 16);
        a(X, 14);
        a(B, 1);
        a(D, 2);
        a(E, 2);
        a(F, qiVar.b(32));
        a(G, qiVar.b(16));
        a(I, qiVar.b(2));
        a(J, 16);
        a(L, 16);
        a(M, 2);
        a(N, 14);
        a(K, 22);
        a(Q, 16);
        a(R, 16);
        a(O, qiVar.b(4));
        a(P, qiVar.b(8));
        a(S, qiVar.b(100));
        a(T, qiVar.b(32));
        a(U, qiVar.b(136));
        a(V, qiVar.b(156));
        a(H, qiVar.b(24));
        a(W, qiVar.b(10));
        a(Y, qiVar.b(40));
    }

    private void a(int i2, int i3) {
        this.a.put(i2, (int) (i3 * this.b));
    }
}
