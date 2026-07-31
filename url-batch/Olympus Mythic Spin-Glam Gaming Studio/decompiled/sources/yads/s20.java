package yads;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class s20 implements nq {
    public static final s20 s = new s20("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    public static final mq t = new mq() { // from class: yads.s20$$ExternalSyntheticLambda0
        @Override // yads.mq
        public final nq a(Bundle bundle) {
            return s20.a(bundle);
        }
    };
    public final CharSequence b;
    public final Layout.Alignment c;
    public final Layout.Alignment d;
    public final Bitmap e;
    public final float f;
    public final int g;
    public final int h;
    public final float i;
    public final int j;
    public final float k;
    public final float l;
    public final boolean m;
    public final int n;
    public final int o;
    public final float p;
    public final int q;
    public final float r;

    public s20(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            bitmap.getClass();
        } else if (bitmap != null) {
            throw new IllegalArgumentException();
        }
        if (charSequence instanceof Spanned) {
            this.b = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.b = charSequence.toString();
        } else {
            this.b = null;
        }
        this.c = alignment;
        this.d = alignment2;
        this.e = bitmap;
        this.f = f;
        this.g = i;
        this.h = i2;
        this.i = f2;
        this.j = i3;
        this.k = f4;
        this.l = f5;
        this.m = z;
        this.n = i5;
        this.o = i4;
        this.p = f3;
        this.q = i6;
        this.r = f6;
    }

    public static final s20 a(Bundle bundle) {
        int i;
        float f;
        int i2;
        float f2;
        boolean z;
        int i3;
        CharSequence charSequence = bundle.getCharSequence(Integer.toString(0, 36));
        CharSequence charSequence2 = charSequence != null ? charSequence : null;
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(Integer.toString(1, 36));
        Layout.Alignment alignment2 = alignment != null ? alignment : null;
        Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(Integer.toString(2, 36));
        Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
        Bitmap bitmap = (Bitmap) bundle.getParcelable(Integer.toString(3, 36));
        Bitmap bitmap2 = bitmap != null ? bitmap : null;
        if (bundle.containsKey(Integer.toString(4, 36)) && bundle.containsKey(Integer.toString(5, 36))) {
            f = bundle.getFloat(Integer.toString(4, 36));
            i = bundle.getInt(Integer.toString(5, 36));
        } else {
            i = Integer.MIN_VALUE;
            f = -3.4028235E38f;
        }
        int i4 = bundle.containsKey(Integer.toString(6, 36)) ? bundle.getInt(Integer.toString(6, 36)) : Integer.MIN_VALUE;
        float f3 = bundle.containsKey(Integer.toString(7, 36)) ? bundle.getFloat(Integer.toString(7, 36)) : -3.4028235E38f;
        int i5 = bundle.containsKey(Integer.toString(8, 36)) ? bundle.getInt(Integer.toString(8, 36)) : Integer.MIN_VALUE;
        if (bundle.containsKey(Integer.toString(10, 36)) && bundle.containsKey(Integer.toString(9, 36))) {
            float f4 = bundle.getFloat(Integer.toString(10, 36));
            i2 = bundle.getInt(Integer.toString(9, 36));
            f2 = f4;
        } else {
            i2 = Integer.MIN_VALUE;
            f2 = -3.4028235E38f;
        }
        float f5 = bundle.containsKey(Integer.toString(11, 36)) ? bundle.getFloat(Integer.toString(11, 36)) : -3.4028235E38f;
        float f6 = bundle.containsKey(Integer.toString(12, 36)) ? bundle.getFloat(Integer.toString(12, 36)) : -3.4028235E38f;
        if (bundle.containsKey(Integer.toString(13, 36))) {
            i3 = bundle.getInt(Integer.toString(13, 36));
            z = true;
        } else {
            z = false;
            i3 = -16777216;
        }
        return new s20(charSequence2, alignment2, alignment4, bitmap2, f, i, i4, f3, i5, i2, f2, f5, f6, bundle.getBoolean(Integer.toString(14, 36), false) ? z : false, i3, bundle.containsKey(Integer.toString(15, 36)) ? bundle.getInt(Integer.toString(15, 36)) : Integer.MIN_VALUE, bundle.containsKey(Integer.toString(16, 36)) ? bundle.getFloat(Integer.toString(16, 36)) : 0.0f);
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || s20.class != obj.getClass()) {
            return false;
        }
        s20 s20Var = (s20) obj;
        return TextUtils.equals(this.b, s20Var.b) && this.c == s20Var.c && this.d == s20Var.d && ((bitmap = this.e) != null ? !((bitmap2 = s20Var.e) == null || !bitmap.sameAs(bitmap2)) : s20Var.e == null) && this.f == s20Var.f && this.g == s20Var.g && this.h == s20Var.h && this.i == s20Var.i && this.j == s20Var.j && this.k == s20Var.k && this.l == s20Var.l && this.m == s20Var.m && this.n == s20Var.n && this.o == s20Var.o && this.p == s20Var.p && this.q == s20Var.q && this.r == s20Var.r;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, Float.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Float.valueOf(this.i), Integer.valueOf(this.j), Float.valueOf(this.k), Float.valueOf(this.l), Boolean.valueOf(this.m), Integer.valueOf(this.n), Integer.valueOf(this.o), Float.valueOf(this.p), Integer.valueOf(this.q), Float.valueOf(this.r)});
    }
}
