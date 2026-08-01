package q;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: q.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0333f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3843a;

    /* renamed from: e, reason: collision with root package name */
    public float f3846e;

    /* renamed from: l, reason: collision with root package name */
    public int f3851l;

    /* renamed from: b, reason: collision with root package name */
    public int f3844b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f3845c = -1;
    public int d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3847f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3848g = new float[9];
    public final float[] h = new float[9];
    public C0329b[] i = new C0329b[16];

    /* renamed from: j, reason: collision with root package name */
    public int f3849j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3850k = 0;

    public C0333f(int i) {
        this.f3851l = i;
    }

    public final void a(C0329b c0329b) {
        int i = 0;
        while (true) {
            int i2 = this.f3849j;
            if (i >= i2) {
                C0329b[] c0329bArr = this.i;
                if (i2 >= c0329bArr.length) {
                    this.i = (C0329b[]) Arrays.copyOf(c0329bArr, c0329bArr.length * 2);
                }
                C0329b[] c0329bArr2 = this.i;
                int i3 = this.f3849j;
                c0329bArr2[i3] = c0329b;
                this.f3849j = i3 + 1;
                return;
            }
            if (this.i[i] == c0329b) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(C0329b c0329b) {
        int i = this.f3849j;
        int i2 = 0;
        while (i2 < i) {
            if (this.i[i2] == c0329b) {
                while (i2 < i - 1) {
                    C0329b[] c0329bArr = this.i;
                    int i3 = i2 + 1;
                    c0329bArr[i2] = c0329bArr[i3];
                    i2 = i3;
                }
                this.f3849j--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.f3851l = 5;
        this.d = 0;
        this.f3844b = -1;
        this.f3845c = -1;
        this.f3846e = RecyclerView.f1949A0;
        this.f3847f = false;
        int i = this.f3849j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2] = null;
        }
        this.f3849j = 0;
        this.f3850k = 0;
        this.f3843a = false;
        Arrays.fill(this.h, RecyclerView.f1949A0);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3844b - ((C0333f) obj).f3844b;
    }

    public final void d(C0330c c0330c, float f2) {
        this.f3846e = f2;
        this.f3847f = true;
        int i = this.f3849j;
        this.f3845c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].h(c0330c, this, false);
        }
        this.f3849j = 0;
    }

    public final void e(C0330c c0330c, C0329b c0329b) {
        int i = this.f3849j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].i(c0330c, c0329b, false);
        }
        this.f3849j = 0;
    }

    public final String toString() {
        return "" + this.f3844b;
    }
}
