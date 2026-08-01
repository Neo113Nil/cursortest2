package q;

import java.util.Arrays;

/* renamed from: q.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0287f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3541a;

    /* renamed from: e, reason: collision with root package name */
    public float f3544e;

    /* renamed from: l, reason: collision with root package name */
    public int f3549l;

    /* renamed from: b, reason: collision with root package name */
    public int f3542b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f3543c = -1;
    public int d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3545f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3546g = new float[9];
    public final float[] h = new float[9];
    public C0283b[] i = new C0283b[16];

    /* renamed from: j, reason: collision with root package name */
    public int f3547j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3548k = 0;

    public C0287f(int i) {
        this.f3549l = i;
    }

    public final void a(C0283b c0283b) {
        int i = 0;
        while (true) {
            int i2 = this.f3547j;
            if (i >= i2) {
                C0283b[] c0283bArr = this.i;
                if (i2 >= c0283bArr.length) {
                    this.i = (C0283b[]) Arrays.copyOf(c0283bArr, c0283bArr.length * 2);
                }
                C0283b[] c0283bArr2 = this.i;
                int i3 = this.f3547j;
                c0283bArr2[i3] = c0283b;
                this.f3547j = i3 + 1;
                return;
            }
            if (this.i[i] == c0283b) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(C0283b c0283b) {
        int i = this.f3547j;
        int i2 = 0;
        while (i2 < i) {
            if (this.i[i2] == c0283b) {
                while (i2 < i - 1) {
                    C0283b[] c0283bArr = this.i;
                    int i3 = i2 + 1;
                    c0283bArr[i2] = c0283bArr[i3];
                    i2 = i3;
                }
                this.f3547j--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.f3549l = 5;
        this.d = 0;
        this.f3542b = -1;
        this.f3543c = -1;
        this.f3544e = 0.0f;
        this.f3545f = false;
        int i = this.f3547j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2] = null;
        }
        this.f3547j = 0;
        this.f3548k = 0;
        this.f3541a = false;
        Arrays.fill(this.h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3542b - ((C0287f) obj).f3542b;
    }

    public final void d(C0284c c0284c, float f2) {
        this.f3544e = f2;
        this.f3545f = true;
        int i = this.f3547j;
        this.f3543c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].h(c0284c, this, false);
        }
        this.f3547j = 0;
    }

    public final void e(C0284c c0284c, C0283b c0283b) {
        int i = this.f3547j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].i(c0284c, c0283b, false);
        }
        this.f3547j = 0;
    }

    public final String toString() {
        return "" + this.f3542b;
    }
}
