package androidx.room;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f1688a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f1689b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f1690c;
    public boolean d;

    public m(int i) {
        this.f1688a = new long[i];
        this.f1689b = new boolean[i];
        this.f1690c = new int[i];
    }

    public final int[] a() {
        synchronized (this) {
            try {
                if (!this.d) {
                    return null;
                }
                long[] jArr = this.f1688a;
                int length = jArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    int i4 = 1;
                    boolean z2 = jArr[i] > 0;
                    boolean[] zArr = this.f1689b;
                    if (z2 != zArr[i2]) {
                        int[] iArr = this.f1690c;
                        if (!z2) {
                            i4 = 2;
                        }
                        iArr[i2] = i4;
                    } else {
                        this.f1690c[i2] = 0;
                    }
                    zArr[i2] = z2;
                    i++;
                    i2 = i3;
                }
                this.d = false;
                return (int[]) this.f1690c.clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
