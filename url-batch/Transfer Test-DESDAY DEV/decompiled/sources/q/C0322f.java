package q;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: q.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0322f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3458a;

    /* renamed from: e, reason: collision with root package name */
    public float f3461e;

    /* renamed from: l, reason: collision with root package name */
    public int f3466l;

    /* renamed from: b, reason: collision with root package name */
    public int f3459b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f3460c = -1;
    public int d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3462f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3463g = new float[9];
    public final float[] h = new float[9];
    public C0318b[] i = new C0318b[16];

    /* renamed from: j, reason: collision with root package name */
    public int f3464j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3465k = 0;

    public C0322f(int i) {
        this.f3466l = i;
    }

    public final void a(C0318b c0318b) {
        int i = 0;
        while (true) {
            int i2 = this.f3464j;
            if (i >= i2) {
                C0318b[] c0318bArr = this.i;
                if (i2 >= c0318bArr.length) {
                    this.i = (C0318b[]) Arrays.copyOf(c0318bArr, c0318bArr.length * 2);
                }
                C0318b[] c0318bArr2 = this.i;
                int i3 = this.f3464j;
                c0318bArr2[i3] = c0318b;
                this.f3464j = i3 + 1;
                return;
            }
            if (this.i[i] == c0318b) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(C0318b c0318b) {
        int i = this.f3464j;
        int i2 = 0;
        while (i2 < i) {
            if (this.i[i2] == c0318b) {
                while (i2 < i - 1) {
                    C0318b[] c0318bArr = this.i;
                    int i3 = i2 + 1;
                    c0318bArr[i2] = c0318bArr[i3];
                    i2 = i3;
                }
                this.f3464j--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.f3466l = 5;
        this.d = 0;
        this.f3459b = -1;
        this.f3460c = -1;
        this.f3461e = RecyclerView.f1570A0;
        this.f3462f = false;
        int i = this.f3464j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2] = null;
        }
        this.f3464j = 0;
        this.f3465k = 0;
        this.f3458a = false;
        Arrays.fill(this.h, RecyclerView.f1570A0);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3459b - ((C0322f) obj).f3459b;
    }

    public final void d(C0319c c0319c, float f2) {
        this.f3461e = f2;
        this.f3462f = true;
        int i = this.f3464j;
        this.f3460c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].h(c0319c, this, false);
        }
        this.f3464j = 0;
    }

    public final void e(C0319c c0319c, C0318b c0318b) {
        int i = this.f3464j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].i(c0319c, c0318b, false);
        }
        this.f3464j = 0;
    }

    public final String toString() {
        return "" + this.f3459b;
    }
}
