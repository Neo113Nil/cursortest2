package v;

import java.util.Arrays;

/* renamed from: v.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0324h {

    /* renamed from: a, reason: collision with root package name */
    public int[] f3904a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f3905b;

    /* renamed from: c, reason: collision with root package name */
    public int f3906c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f3907e;

    /* renamed from: f, reason: collision with root package name */
    public int f3908f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f3909g;
    public String[] h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f3910j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f3911k;

    /* renamed from: l, reason: collision with root package name */
    public int f3912l;

    public final void a(int i, float f2) {
        int i2 = this.f3908f;
        int[] iArr = this.d;
        if (i2 >= iArr.length) {
            this.d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f3907e;
            this.f3907e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.d;
        int i3 = this.f3908f;
        iArr2[i3] = i;
        float[] fArr2 = this.f3907e;
        this.f3908f = i3 + 1;
        fArr2[i3] = f2;
    }

    public final void b(int i, int i2) {
        int i3 = this.f3906c;
        int[] iArr = this.f3904a;
        if (i3 >= iArr.length) {
            this.f3904a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f3905b;
            this.f3905b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f3904a;
        int i4 = this.f3906c;
        iArr3[i4] = i;
        int[] iArr4 = this.f3905b;
        this.f3906c = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void c(int i, boolean z2) {
        int i2 = this.f3912l;
        int[] iArr = this.f3910j;
        if (i2 >= iArr.length) {
            this.f3910j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f3911k;
            this.f3911k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f3910j;
        int i3 = this.f3912l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f3911k;
        this.f3912l = i3 + 1;
        zArr2[i3] = z2;
    }

    public final void d(String str, int i) {
        int i2 = this.i;
        int[] iArr = this.f3909g;
        if (i2 >= iArr.length) {
            this.f3909g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f3909g;
        int i3 = this.i;
        iArr2[i3] = i;
        String[] strArr2 = this.h;
        this.i = i3 + 1;
        strArr2[i3] = str;
    }
}
