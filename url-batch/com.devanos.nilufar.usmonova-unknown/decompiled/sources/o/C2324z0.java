package o;

import android.graphics.Rect;
import android.opengl.Matrix;
import android.text.SpannableString;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2324z0 {
    public String A;
    public String B;
    public int C;
    public long F;
    public int G;
    public int H;
    public int I;
    public float J;
    public String K;
    public String L;
    public float M;
    public float N;
    public float O;
    public float P;
    public float[] Q;
    public float[] R;
    public C2324z0 S;
    public ArrayList V;
    public C2258y0 W;
    public C2258y0 X;
    public float[] Z;
    public final io.flutter.view.b a;
    public float[] b0;
    public long c;
    public Rect c0;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public float l;
    public float m;
    public float n;

    /* renamed from: o, reason: collision with root package name */
    public String f251o;
    public String p;
    public ArrayList q;
    public String r;
    public List s;
    public String t;
    public ArrayList u;
    public String v;
    public ArrayList w;
    public String x;
    public ArrayList y;
    public String z;
    public int b = -1;
    public int D = -1;
    public boolean E = false;
    public final ArrayList T = new ArrayList();
    public final ArrayList U = new ArrayList();
    public boolean Y = true;
    public boolean a0 = true;

    public C2324z0(io.flutter.view.b bVar) {
        this.a = bVar;
    }

    public static boolean a(C2324z0 c2324z0, EnumC2192x0 enumC2192x0) {
        return (c2324z0.d & enumC2192x0.h) != 0;
    }

    public static CharSequence b(C2324z0 c2324z0) {
        int i = 1;
        boolean z = false;
        C1334k c1334k = new C1334k(i, z);
        c1334k.i = c2324z0.r;
        c1334k.j = c2324z0.s;
        c1334k.k = c2324z0.d();
        SpannableString d = c1334k.d();
        C1334k c1334k2 = new C1334k(i, z);
        c1334k2.i = c2324z0.p;
        c1334k2.j = c2324z0.q;
        c1334k2.l = c2324z0.A;
        c1334k2.k = c2324z0.d();
        SpannableString d2 = c1334k2.d();
        C1334k c1334k3 = new C1334k(i, z);
        c1334k3.i = c2324z0.x;
        c1334k3.j = c2324z0.y;
        c1334k3.k = c2324z0.d();
        CharSequence[] charSequenceArr = {d, d2, c1334k3.d()};
        CharSequence charSequence = null;
        for (int i2 = 0; i2 < 3; i2++) {
            CharSequence charSequence2 = charSequenceArr[i2];
            if (charSequence2 != null && charSequence2.length() > 0) {
                charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
            }
        }
        return charSequence;
    }

    public static ArrayList f(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        int i = byteBuffer.getInt();
        if (i == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = byteBuffer.getInt();
            int i4 = byteBuffer.getInt();
            int i5 = AbstractC1888sN.x(2)[byteBuffer.getInt()];
            int v = AbstractC1888sN.v(i5);
            if (v == 0) {
                byteBuffer.getInt();
                U0 u0 = new U0();
                u0.a = i3;
                u0.b = i4;
                u0.c = i5;
                arrayList.add(u0);
            } else if (v == 1) {
                ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                T0 t0 = new T0();
                t0.a = i3;
                t0.b = i4;
                t0.c = i5;
                t0.d = StandardCharsets.UTF_8.decode(byteBuffer2).toString();
                arrayList.add(t0);
            }
        }
        return arrayList;
    }

    public static void j(float[] fArr, float[] fArr2, float[] fArr3) {
        Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
        float f = fArr[3];
        fArr[0] = fArr[0] / f;
        fArr[1] = fArr[1] / f;
        fArr[2] = fArr[2] / f;
        fArr[3] = 0.0f;
    }

    public final void c(ArrayList arrayList) {
        if (g(12)) {
            arrayList.add(this);
        }
        Iterator it = this.T.iterator();
        while (it.hasNext()) {
            ((C2324z0) it.next()).c(arrayList);
        }
    }

    public final String d() {
        String str = this.B;
        return (str == null || str.isEmpty()) ? this.a.l : this.B;
    }

    public final String e() {
        String str;
        if (g(13) && (str = this.p) != null && !str.isEmpty()) {
            return this.p;
        }
        Iterator it = this.T.iterator();
        while (it.hasNext()) {
            String e = ((C2324z0) it.next()).e();
            if (e != null && !e.isEmpty()) {
                return e;
            }
        }
        return null;
    }

    public final boolean g(int i) {
        return (this.c & ((long) AbstractC1888sN.d(i))) != 0;
    }

    public final C2324z0 h(float[] fArr, boolean z) {
        float f = fArr[3];
        boolean z2 = false;
        float f2 = fArr[0] / f;
        float f3 = fArr[1] / f;
        if (f2 < this.M || f2 >= this.O || f3 < this.N || f3 >= this.P) {
            return null;
        }
        float[] fArr2 = new float[4];
        Iterator it = this.U.iterator();
        while (it.hasNext()) {
            C2324z0 c2324z0 = (C2324z0) it.next();
            if (!c2324z0.g(14)) {
                if (c2324z0.Y) {
                    c2324z0.Y = false;
                    if (c2324z0.Z == null) {
                        c2324z0.Z = new float[16];
                    }
                    if (!Matrix.invertM(c2324z0.Z, 0, c2324z0.R, 0)) {
                        Arrays.fill(c2324z0.Z, 0.0f);
                    }
                }
                float[] fArr3 = fArr;
                Matrix.multiplyMV(fArr2, 0, c2324z0.Z, 0, fArr3, 0);
                C2324z0 h = c2324z0.h(fArr2, z);
                if (h != null) {
                    return h;
                }
                fArr = fArr3;
            }
        }
        if (z && this.i != -1) {
            z2 = true;
        }
        if (i() || z2) {
            return this;
        }
        return null;
    }

    public final boolean i() {
        if (g(12)) {
            return false;
        }
        if (g(22)) {
            return true;
        }
        if (g(32)) {
            return false;
        }
        int i = this.d;
        int i2 = io.flutter.view.b.x;
        if ((i & (-61)) != 0 || (this.c & 10682871) != 0) {
            return true;
        }
        String str = this.p;
        if (str != null && !str.isEmpty()) {
            return true;
        }
        String str2 = this.r;
        if (str2 != null && !str2.isEmpty()) {
            return true;
        }
        String str3 = this.x;
        return (str3 == null || str3.isEmpty()) ? false : true;
    }

    public final void k(float[] fArr, HashSet hashSet, boolean z) {
        hashSet.add(this);
        if (this.a0) {
            z = true;
        }
        if (z) {
            if (this.b0 == null) {
                this.b0 = new float[16];
            }
            if (this.Q == null) {
                this.Q = new float[16];
            }
            Matrix.multiplyMM(this.b0, 0, fArr, 0, this.Q, 0);
            float[] fArr2 = {this.M, this.N, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            j(fArr3, this.b0, fArr2);
            fArr2[0] = this.O;
            fArr2[1] = this.N;
            j(fArr4, this.b0, fArr2);
            fArr2[0] = this.O;
            fArr2[1] = this.P;
            j(fArr5, this.b0, fArr2);
            fArr2[0] = this.M;
            fArr2[1] = this.P;
            j(fArr6, this.b0, fArr2);
            if (this.c0 == null) {
                this.c0 = new Rect();
            }
            this.c0.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.a0 = false;
        }
        Iterator it = this.T.iterator();
        int i = -1;
        while (it.hasNext()) {
            C2324z0 c2324z0 = (C2324z0) it.next();
            c2324z0.D = i;
            i = c2324z0.b;
            c2324z0.k(this.b0, hashSet, z);
        }
    }
}
