package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class R5 {
    public final TextView a;
    public C0214Id b;
    public C0214Id c;
    public C0214Id d;
    public C0214Id e;
    public C0214Id f;
    public C0214Id g;
    public C0214Id h;
    public final C0688a6 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public R5(TextView textView) {
        this.a = textView;
        this.i = new C0688a6(textView);
    }

    public static C0214Id c(Context context, C1409l5 c1409l5, int i) {
        ColorStateList f;
        synchronized (c1409l5) {
            f = c1409l5.a.f(context, i);
        }
        if (f == null) {
            return null;
        }
        C0214Id c0214Id = new C0214Id();
        c0214Id.b = true;
        c0214Id.c = f;
        return c0214Id;
    }

    public final void a(Drawable drawable, C0214Id c0214Id) {
        if (drawable == null || c0214Id == null) {
            return;
        }
        C1409l5.d(drawable, c0214Id, this.a.getDrawableState());
    }

    public final void b() {
        C0214Id c0214Id = this.b;
        TextView textView = this.a;
        if (c0214Id != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final ColorStateList d() {
        C0214Id c0214Id = this.h;
        if (c0214Id != null) {
            return (ColorStateList) c0214Id.c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        C0214Id c0214Id = this.h;
        if (c0214Id != null) {
            return (PorterDuff.Mode) c0214Id.d;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        int i2;
        float f;
        int i3;
        ColorStateList colorStateList;
        int resourceId;
        int i4;
        int resourceId2;
        TextView textView = this.a;
        Context context = textView.getContext();
        C1409l5 a = C1409l5.a();
        int[] iArr = AbstractC1886sL.h;
        C0950e6 F = C0950e6.F(context, attributeSet, iArr, i);
        AZ.g(textView, textView.getContext(), iArr, attributeSet, (TypedArray) F.i, i);
        TypedArray typedArray = (TypedArray) F.i;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.b = c(context, a, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.c = c(context, a, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = c(context, a, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.e = c(context, a, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f = c(context, a, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.g = c(context, a, typedArray.getResourceId(6, 0));
        }
        F.L();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC1886sL.v;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C0950e6 c0950e6 = new C0950e6(context, obtainStyledAttributes);
            if (z3 || !obtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = obtainStyledAttributes.getBoolean(14, false);
                z = true;
            }
            m(context, c0950e6);
            int i5 = Build.VERSION.SDK_INT;
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = (i5 < 26 || !obtainStyledAttributes.hasValue(13)) ? null : obtainStyledAttributes.getString(13);
            c0950e6.L();
        } else {
            z = false;
            z2 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        C0950e6 c0950e62 = new C0950e6(context, obtainStyledAttributes2);
        if (!z3 && obtainStyledAttributes2.hasValue(14)) {
            z2 = obtainStyledAttributes2.getBoolean(14, false);
            z = true;
        }
        boolean z4 = z2;
        int i6 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        if (i6 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i6 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, c0950e62);
        c0950e62.L();
        if (!z3 && z) {
            textView.setAllCaps(z4);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            P5.d(textView, str);
        }
        if (str2 != null) {
            O5.b(textView, O5.a(str2));
        }
        C0688a6 c0688a6 = this.i;
        Context context2 = c0688a6.j;
        int[] iArr3 = AbstractC1886sL.i;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = c0688a6.i;
        AZ.g(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i);
        if (obtainStyledAttributes3.hasValue(5)) {
            c0688a6.a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i7 = 0; i7 < length; i7++) {
                    iArr4[i7] = obtainTypedArray.getDimensionPixelSize(i7, -1);
                }
                c0688a6.f = C0688a6.b(iArr4);
                c0688a6.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!c0688a6.j()) {
            c0688a6.a = 0;
        } else if (c0688a6.a == 1) {
            if (!c0688a6.g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i4 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i4 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i4, 112.0f, displayMetrics);
                }
                float f2 = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c0688a6.k(dimension2, f2, dimension);
            }
            c0688a6.h();
        }
        if (AbstractC1468m00.c && c0688a6.a != 0) {
            int[] iArr5 = c0688a6.f;
            if (iArr5.length > 0) {
                if (P5.a(textView) != -1.0f) {
                    P5.b(textView, Math.round(c0688a6.d), Math.round(c0688a6.e), Math.round(c0688a6.c), 0);
                } else {
                    P5.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable b = resourceId4 != -1 ? a.b(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable b2 = resourceId5 != -1 ? a.b(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable b3 = resourceId6 != -1 ? a.b(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable b4 = resourceId7 != -1 ? a.b(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable b5 = resourceId8 != -1 ? a.b(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable b6 = resourceId9 != -1 ? a.b(context, resourceId9) : null;
        if (b5 != null || b6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (b5 == null) {
                b5 = compoundDrawablesRelative[0];
            }
            if (b2 == null) {
                b2 = compoundDrawablesRelative[1];
            }
            if (b6 == null) {
                b6 = compoundDrawablesRelative[2];
            }
            if (b4 == null) {
                b4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(b5, b2, b6, b4);
        } else if (b != null || b2 != null || b3 != null || b4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (b == null) {
                    b = compoundDrawables[0];
                }
                if (b2 == null) {
                    b2 = compoundDrawables[1];
                }
                if (b3 == null) {
                    b3 = compoundDrawables[2];
                }
                if (b4 == null) {
                    b4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(b, b2, b3, b4);
            } else {
                if (b2 == null) {
                    b2 = compoundDrawablesRelative2[1];
                }
                if (b4 == null) {
                    b4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, b2, compoundDrawablesRelative2[2], b4);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = EB.s(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            AbstractC1962tV.f(textView, colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            AbstractC1962tV.g(textView, AbstractC1317jj.b(obtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (obtainStyledAttributes4.hasValue(19)) {
            TypedValue peekValue = obtainStyledAttributes4.peekValue(19);
            if (peekValue != null && peekValue.type == 5) {
                int i8 = peekValue.data;
                int i9 = i8 & 15;
                f = TypedValue.complexToFloat(i8);
                i3 = i9;
                i2 = -1;
                obtainStyledAttributes4.recycle();
                if (dimensionPixelSize != i2) {
                    PO.m(textView, dimensionPixelSize);
                }
                if (dimensionPixelSize2 != i2) {
                    PO.n(textView, dimensionPixelSize2);
                }
                if (f == -1.0f) {
                    if (i3 == i2) {
                        PO.o(textView, (int) f);
                        return;
                    } else if (Build.VERSION.SDK_INT >= 34) {
                        AbstractC2160wV.a(textView, i3, f);
                        return;
                    } else {
                        PO.o(textView, Math.round(TypedValue.applyDimension(i3, f, textView.getResources().getDisplayMetrics())));
                        return;
                    }
                }
                return;
            }
            i2 = -1;
            f = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
        } else {
            i2 = -1;
            f = -1.0f;
        }
        i3 = i2;
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i2) {
        }
        if (dimensionPixelSize2 != i2) {
        }
        if (f == -1.0f) {
        }
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC1886sL.v);
        C0950e6 c0950e6 = new C0950e6(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, c0950e6);
        if (i2 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            P5.d(textView, string);
        }
        c0950e6.L();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void h(int i, int i2, int i3, int i4) {
        C0688a6 c0688a6 = this.i;
        if (c0688a6.j()) {
            DisplayMetrics displayMetrics = c0688a6.j.getResources().getDisplayMetrics();
            c0688a6.k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (c0688a6.h()) {
                c0688a6.a();
            }
        }
    }

    public final void i(int[] iArr, int i) {
        C0688a6 c0688a6 = this.i;
        if (c0688a6.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0688a6.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                c0688a6.f = C0688a6.b(iArr2);
                if (!c0688a6.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0688a6.g = false;
            }
            if (c0688a6.h()) {
                c0688a6.a();
            }
        }
    }

    public final void j(int i) {
        C0688a6 c0688a6 = this.i;
        if (c0688a6.j()) {
            if (i == 0) {
                c0688a6.a = 0;
                c0688a6.d = -1.0f;
                c0688a6.e = -1.0f;
                c0688a6.c = -1.0f;
                c0688a6.f = new int[0];
                c0688a6.b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(AbstractC2188wx.g(i, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = c0688a6.j.getResources().getDisplayMetrics();
            c0688a6.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0688a6.h()) {
                c0688a6.a();
            }
        }
    }

    public final void k(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new C0214Id();
        }
        C0214Id c0214Id = this.h;
        c0214Id.c = colorStateList;
        c0214Id.b = colorStateList != null;
        this.b = c0214Id;
        this.c = c0214Id;
        this.d = c0214Id;
        this.e = c0214Id;
        this.f = c0214Id;
        this.g = c0214Id;
    }

    public final void l(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new C0214Id();
        }
        C0214Id c0214Id = this.h;
        c0214Id.d = mode;
        c0214Id.a = mode != null;
        this.b = c0214Id;
        this.c = c0214Id;
        this.d = c0214Id;
        this.e = c0214Id;
        this.f = c0214Id;
        this.g = c0214Id;
    }

    public final void m(Context context, C0950e6 c0950e6) {
        String string;
        int i = this.j;
        TypedArray typedArray = (TypedArray) c0950e6.i;
        this.j = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.k = i3;
            if (i3 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.k;
        int i7 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface z = c0950e6.z(i5, this.j, new M5(this, i6, i7, new WeakReference(this.a)));
                if (z != null) {
                    if (i2 < 28 || this.k == -1) {
                        this.l = z;
                    } else {
                        this.l = Q5.a(Typeface.create(z, 0), this.k, (this.j & 2) != 0);
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.l = Typeface.create(string, this.j);
        } else {
            this.l = Q5.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        }
    }
}
