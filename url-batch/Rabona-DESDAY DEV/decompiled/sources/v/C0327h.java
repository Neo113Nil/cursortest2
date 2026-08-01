package v;

import java.util.Arrays;

/* renamed from: v.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0327h {

    /* renamed from: a, reason: collision with root package name */
    public int[] f3926a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f3927b;

    /* renamed from: c, reason: collision with root package name */
    public int f3928c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f3929e;

    /* renamed from: f, reason: collision with root package name */
    public int f3930f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f3931g;
    public String[] h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f3932j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f3933k;

    /* renamed from: l, reason: collision with root package name */
    public int f3934l;

    public final void a(int i, float f2) {
        int i2 = this.f3930f;
        int[] iArr = this.d;
        if (i2 >= iArr.length) {
            this.d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f3929e;
            this.f3929e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.d;
        int i3 = this.f3930f;
        iArr2[i3] = i;
        float[] fArr2 = this.f3929e;
        this.f3930f = i3 + 1;
        fArr2[i3] = f2;
    }

    public final void b(int i, int i2) {
        int i3 = this.f3928c;
        int[] iArr = this.f3926a;
        if (i3 >= iArr.length) {
            this.f3926a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f3927b;
            this.f3927b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f3926a;
        int i4 = this.f3928c;
        iArr3[i4] = i;
        int[] iArr4 = this.f3927b;
        this.f3928c = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void c(int i, boolean z2) {
        int i2 = this.f3934l;
        int[] iArr = this.f3932j;
        if (i2 >= iArr.length) {
            this.f3932j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f3933k;
            this.f3933k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f3932j;
        int i3 = this.f3934l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f3933k;
        this.f3934l = i3 + 1;
        zArr2[i3] = z2;
    }

    public final void d(String str, int i) {
        int i2 = this.i;
        int[] iArr = this.f3931g;
        if (i2 >= iArr.length) {
            this.f3931g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f3931g;
        int i3 = this.i;
        iArr2[i3] = i;
        String[] strArr2 = this.h;
        this.i = i3 + 1;
        strArr2[i3] = str;
    }
}
