package yads;

import android.text.Layout;

/* loaded from: classes5.dex */
public final class qo3 {
    public CharSequence c;
    public long a = 0;
    public long b = 0;
    public int d = 2;
    public float e = -3.4028235E38f;
    public int f = 1;
    public int g = 0;
    public float h = -3.4028235E38f;
    public int i = Integer.MIN_VALUE;
    public float j = 1.0f;
    public int k = Integer.MIN_VALUE;

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0070, code lost:
    
        if (r6 == 0) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r20 a() {
        Layout.Alignment alignment;
        float f;
        CharSequence charSequence;
        float f2 = this.h;
        float f3 = -3.4028235E38f;
        if (f2 == -3.4028235E38f) {
            int i = this.d;
            f2 = i != 4 ? i != 5 ? 0.5f : 1.0f : 0.0f;
        }
        int i2 = this.i;
        if (i2 == Integer.MIN_VALUE) {
            int i3 = this.d;
            if (i3 != 1) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            i2 = 1;
                        }
                    }
                }
                i2 = 2;
            }
            i2 = 0;
        }
        r20 r20Var = new r20();
        int i4 = this.d;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        if (i4 != 5) {
                            mf1.a(i4, "Unknown textAlignment: ", "WebvttCueParser");
                            alignment = null;
                        }
                    }
                }
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            r20Var.c = alignment;
            f = this.e;
            int i5 = this.f;
            if (f != -3.4028235E38f || i5 != 0 || (f >= 0.0f && f <= 1.0f)) {
                if (f == -3.4028235E38f) {
                    f3 = f;
                }
                r20Var.e = f3;
                r20Var.f = i5;
                r20Var.g = this.g;
                r20Var.h = f2;
                r20Var.i = i2;
                float f4 = this.j;
                if (i2 == 0) {
                    f2 = 1.0f - f2;
                } else if (i2 == 1) {
                    f2 = f2 <= 0.5f ? f2 * 2.0f : (1.0f - f2) * 2.0f;
                } else if (i2 != 2) {
                    throw new IllegalStateException(String.valueOf(i2));
                }
                r20Var.l = Math.min(f4, f2);
                r20Var.p = this.k;
                charSequence = this.c;
                if (charSequence != null) {
                    r20Var.a = charSequence;
                }
                return r20Var;
            }
            f3 = 1.0f;
            r20Var.e = f3;
            r20Var.f = i5;
            r20Var.g = this.g;
            r20Var.h = f2;
            r20Var.i = i2;
            float f42 = this.j;
            if (i2 == 0) {
            }
            r20Var.l = Math.min(f42, f2);
            r20Var.p = this.k;
            charSequence = this.c;
            if (charSequence != null) {
            }
            return r20Var;
        }
        alignment = Layout.Alignment.ALIGN_NORMAL;
        r20Var.c = alignment;
        f = this.e;
        int i52 = this.f;
        if (f != -3.4028235E38f) {
        }
        if (f == -3.4028235E38f) {
        }
        r20Var.e = f3;
        r20Var.f = i52;
        r20Var.g = this.g;
        r20Var.h = f2;
        r20Var.i = i2;
        float f422 = this.j;
        if (i2 == 0) {
        }
        r20Var.l = Math.min(f422, f2);
        r20Var.p = this.k;
        charSequence = this.c;
        if (charSequence != null) {
        }
        return r20Var;
    }
}
