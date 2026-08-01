package v;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int[] f4297a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f4298b;

    /* renamed from: c, reason: collision with root package name */
    public int f4299c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f4300e;

    /* renamed from: f, reason: collision with root package name */
    public int f4301f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f4302g;
    public String[] h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f4303j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f4304k;

    /* renamed from: l, reason: collision with root package name */
    public int f4305l;

    public final void a(int i, float f2) {
        int i2 = this.f4301f;
        int[] iArr = this.d;
        if (i2 >= iArr.length) {
            this.d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f4300e;
            this.f4300e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.d;
        int i3 = this.f4301f;
        iArr2[i3] = i;
        float[] fArr2 = this.f4300e;
        this.f4301f = i3 + 1;
        fArr2[i3] = f2;
    }

    public final void b(int i, int i2) {
        int i3 = this.f4299c;
        int[] iArr = this.f4297a;
        if (i3 >= iArr.length) {
            this.f4297a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f4298b;
            this.f4298b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f4297a;
        int i4 = this.f4299c;
        iArr3[i4] = i;
        int[] iArr4 = this.f4298b;
        this.f4299c = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void c(int i, boolean z2) {
        int i2 = this.f4305l;
        int[] iArr = this.f4303j;
        if (i2 >= iArr.length) {
            this.f4303j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f4304k;
            this.f4304k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f4303j;
        int i3 = this.f4305l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f4304k;
        this.f4305l = i3 + 1;
        zArr2[i3] = z2;
    }

    public final void d(String str, int i) {
        int i2 = this.i;
        int[] iArr = this.f4302g;
        if (i2 >= iArr.length) {
            this.f4302g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f4302g;
        int i3 = this.i;
        iArr2[i3] = i;
        String[] strArr2 = this.h;
        this.i = i3 + 1;
        strArr2[i3] = str;
    }
}
