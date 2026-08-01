package q;

import java.util.Arrays;

/* renamed from: q.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0292f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3520a;

    /* renamed from: e, reason: collision with root package name */
    public float f3523e;

    /* renamed from: l, reason: collision with root package name */
    public int f3528l;

    /* renamed from: b, reason: collision with root package name */
    public int f3521b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f3522c = -1;
    public int d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3524f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3525g = new float[9];
    public final float[] h = new float[9];
    public C0288b[] i = new C0288b[16];

    /* renamed from: j, reason: collision with root package name */
    public int f3526j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3527k = 0;

    public C0292f(int i) {
        this.f3528l = i;
    }

    public final void a(C0288b c0288b) {
        int i = 0;
        while (true) {
            int i2 = this.f3526j;
            if (i >= i2) {
                C0288b[] c0288bArr = this.i;
                if (i2 >= c0288bArr.length) {
                    this.i = (C0288b[]) Arrays.copyOf(c0288bArr, c0288bArr.length * 2);
                }
                C0288b[] c0288bArr2 = this.i;
                int i3 = this.f3526j;
                c0288bArr2[i3] = c0288b;
                this.f3526j = i3 + 1;
                return;
            }
            if (this.i[i] == c0288b) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(C0288b c0288b) {
        int i = this.f3526j;
        int i2 = 0;
        while (i2 < i) {
            if (this.i[i2] == c0288b) {
                while (i2 < i - 1) {
                    C0288b[] c0288bArr = this.i;
                    int i3 = i2 + 1;
                    c0288bArr[i2] = c0288bArr[i3];
                    i2 = i3;
                }
                this.f3526j--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.f3528l = 5;
        this.d = 0;
        this.f3521b = -1;
        this.f3522c = -1;
        this.f3523e = 0.0f;
        this.f3524f = false;
        int i = this.f3526j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2] = null;
        }
        this.f3526j = 0;
        this.f3527k = 0;
        this.f3520a = false;
        Arrays.fill(this.h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3521b - ((C0292f) obj).f3521b;
    }

    public final void d(C0289c c0289c, float f2) {
        this.f3523e = f2;
        this.f3524f = true;
        int i = this.f3526j;
        this.f3522c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].h(c0289c, this, false);
        }
        this.f3526j = 0;
    }

    public final void e(C0289c c0289c, C0288b c0288b) {
        int i = this.f3526j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].i(c0289c, c0288b, false);
        }
        this.f3526j = 0;
    }

    public final String toString() {
        return "" + this.f3521b;
    }
}
