package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import androidx.lifecycle.SavedStateHandleController;
import androidx.lifecycle.a;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.ionia.reidopitaco.libya.R;
import defpackage.fp;
import defpackage.lp;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class m60 {
    public static final float[][] f = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] g = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] h = {95.047f, 100.0f, 108.883f};
    public static final float[][] i = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final String[] j = {"standard", "accelerate", "decelerate", "linear"};
    public static final iw k = new iw(14);
    public static final byte[] l = {48, 49, 53, 0};
    public static final byte[] m = {48, 49, 48, 0};
    public static final byte[] n = {48, 48, 57, 0};
    public static final byte[] o = {48, 48, 53, 0};
    public static final byte[] p = {48, 48, 49, 0};
    public static final byte[] q = {48, 48, 49, 0};
    public static final byte[] r = {48, 48, 50, 0};
    public static final int[] s = {R.attr.colorPrimary};
    public static final int[] t = {R.attr.colorPrimaryVariant};

    public m60() {
        new ConcurrentHashMap();
    }

    public static final int E(n6 n6Var, Object obj, int i2) {
        int i3 = n6Var.h;
        if (i3 == 0) {
            return -1;
        }
        try {
            int d = oo.d(i3, i2, n6Var.f);
            if (d < 0 || oo.b(obj, n6Var.g[d])) {
                return d;
            }
            int i4 = d + 1;
            while (i4 < i3 && n6Var.f[i4] == i2) {
                if (oo.b(obj, n6Var.g[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = d - 1; i5 >= 0 && n6Var.f[i5] == i2; i5--) {
                if (oo.b(obj, n6Var.g[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static int F(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = h;
        return eb.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static final boolean G(AssertionError assertionError) {
        Logger logger = gv.a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? m30.n0(message, "getsockname failed") : false) {
                return true;
            }
        }
        return false;
    }

    public static boolean H(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static float I(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static TypedArray J(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        i(context, attributeSet, i2, i3);
        k(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }

    public static y5 K(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        i(context, attributeSet, i2, i3);
        k(context, attributeSet, iArr, i2, i3, iArr2);
        return new y5(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }

    public static float N(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return kg.c(edgeEffect, f2, f3);
        }
        edgeEffect.onPull(f2, f3);
        return f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s8 O(nm nmVar) {
        int i2;
        int i3;
        int i4;
        String str;
        nm nmVar2 = nmVar;
        int size = nmVar2.size();
        int i5 = 0;
        boolean z = true;
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        int i6 = -1;
        int i7 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i8 = -1;
        int i9 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (i5 < size) {
            String b = nmVar2.b(i5);
            String d = nmVar2.d(i5);
            if (u30.i0(b, "Cache-Control")) {
                if (str2 == null) {
                    str2 = d;
                    i2 = 0;
                    while (i2 < d.length()) {
                        int length = d.length();
                        int i10 = i2;
                        while (true) {
                            if (i10 >= length) {
                                i3 = size;
                                i10 = d.length();
                                break;
                            }
                            i3 = size;
                            if (m30.m0("=,;", d.charAt(i10))) {
                                break;
                            }
                            i10++;
                            size = i3;
                        }
                        String obj = m30.x0(d.substring(i2, i10)).toString();
                        if (i10 == d.length() || d.charAt(i10) == ',' || d.charAt(i10) == ';') {
                            i4 = i10 + 1;
                            str = null;
                        } else {
                            int i11 = i10 + 1;
                            byte[] bArr = z60.a;
                            int length2 = d.length();
                            while (true) {
                                if (i11 < length2) {
                                    char charAt = d.charAt(i11);
                                    if (charAt != ' ' && charAt != '\t') {
                                        break;
                                    }
                                    i11++;
                                } else {
                                    i11 = d.length();
                                    break;
                                }
                            }
                            if (i11 >= d.length() || d.charAt(i11) != '\"') {
                                int length3 = d.length();
                                int i12 = i11;
                                while (true) {
                                    if (i12 >= length3) {
                                        i12 = d.length();
                                        break;
                                    }
                                    int i13 = length3;
                                    if (m30.m0(",;", d.charAt(i12))) {
                                        break;
                                    }
                                    i12++;
                                    length3 = i13;
                                }
                                int i14 = i12;
                                str = m30.x0(d.substring(i11, i12)).toString();
                                i4 = i14;
                            } else {
                                int i15 = i11 + 1;
                                int q0 = m30.q0(d, '\"', i15, 4);
                                str = d.substring(i15, q0);
                                i4 = q0 + 1;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(obj)) {
                            i2 = i4;
                            z2 = true;
                        } else if ("no-store".equalsIgnoreCase(obj)) {
                            i2 = i4;
                            z3 = true;
                        } else {
                            if ("max-age".equalsIgnoreCase(obj)) {
                                i6 = z60.v(str, -1);
                            } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                i7 = z60.v(str, -1);
                            } else if ("private".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z4 = true;
                            } else if ("public".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z5 = true;
                            } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z6 = true;
                            } else if ("max-stale".equalsIgnoreCase(obj)) {
                                i8 = z60.v(str, Integer.MAX_VALUE);
                            } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                i9 = z60.v(str, -1);
                            } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z7 = true;
                            } else if ("no-transform".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z8 = true;
                            } else if ("immutable".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z9 = true;
                            }
                            i2 = i4;
                        }
                        size = i3;
                    }
                    i5++;
                    nmVar2 = nmVar;
                    size = size;
                }
            } else if (!u30.i0(b, "Pragma")) {
                i5++;
                nmVar2 = nmVar;
                size = size;
            }
            z = false;
            i2 = 0;
            while (i2 < d.length()) {
            }
            i5++;
            nmVar2 = nmVar;
            size = size;
        }
        return new s8(z2, z3, i6, i7, z4, z5, z6, i8, i9, z7, z8, z9, !z ? null : str2);
    }

    public static void Q(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        mutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public static TypedValue R(Resources.Theme theme, int i2) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean S(Resources.Theme theme, int i2, boolean z) {
        TypedValue R = R(theme, i2);
        return (R == null || R.type != 18) ? z : R.data != 0;
    }

    public static int T(Context context, int i2, int i3) {
        TypedValue R = R(context.getTheme(), i2);
        return (R == null || R.type != 16) ? i3 : R.data;
    }

    public static TimeInterpolator U(Context context, int i2, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            l8.l("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            return null;
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!H(valueOf, "cubic-bezier") && !H(valueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (H(valueOf, "cubic-bezier")) {
            String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
            if (split.length == 4) {
                return new PathInterpolator(z(split, 0), z(split, 1), z(split, 2), z(split, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
        }
        if (!H(valueOf, "path")) {
            l8.l("Invalid motion easing type: ".concat(valueOf));
            return null;
        }
        String substring = valueOf.substring(5, valueOf.length() - 1);
        Path path = new Path();
        try {
            ew.b(oo.k(substring), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(substring), e);
        }
    }

    public static TypedValue V(Context context, int i2, String str) {
        TypedValue R = R(context.getTheme(), i2);
        if (R != null) {
            return R;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    public static TypedValue W(View view, int i2) {
        return V(view.getContext(), i2, view.getClass().getCanonicalName());
    }

    public static void X(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = hasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    public static ko Z(mo moVar, int i2) {
        moVar.getClass();
        boolean z = i2 > 0;
        Integer valueOf = Integer.valueOf(i2);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
        }
        int i3 = moVar.f;
        int i4 = moVar.g;
        if (moVar.h <= 0) {
            i2 = -i2;
        }
        return new ko(i3, i4, i2);
    }

    public static void a0(Serializable serializable, String str) {
        ClassCastException classCastException = new ClassCastException((serializable == null ? "null" : serializable.getClass().getName()) + " cannot be cast to " + str);
        oo.L(classCastException, m60.class.getName());
        throw classCastException;
    }

    public static mo b0(int i2, int i3) {
        if (i3 > Integer.MIN_VALUE) {
            return new mo(i2, i3 - 1, 1);
        }
        mo moVar = mo.i;
        return mo.i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x028a, code lost:
    
        if (r7.d == r6) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0112, code lost:
    
        if (r4.d == r12) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(uc ucVar, vp vpVar, ArrayList arrayList, int i2) {
        int i3;
        k9[] k9VarArr;
        int i4;
        int i5;
        ec[] ecVarArr;
        boolean z;
        tc tcVar;
        float f2;
        boolean z2;
        boolean z3;
        int i6;
        tc tcVar2;
        vp vpVar2;
        tc tcVar3;
        o20 o20Var;
        ec ecVar;
        o20 o20Var2;
        tc tcVar4;
        int i7;
        ec[] ecVarArr2;
        ec ecVar2;
        o20 o20Var3;
        tc tcVar5;
        tc tcVar6;
        int i8;
        ec ecVar3;
        ec[] ecVarArr3;
        int i9;
        ec ecVar4;
        o20 o20Var4;
        o20 o20Var5;
        int size;
        ArrayList arrayList2;
        int i10;
        tc tcVar7;
        int i11;
        float f3;
        int i12;
        float f4;
        tc tcVar8;
        int i13;
        int i14;
        int i15;
        tc tcVar9;
        ec ecVar5;
        tc tcVar10;
        uc ucVar2 = ucVar;
        vp vpVar3 = vpVar;
        ArrayList arrayList3 = arrayList;
        if (i2 == 0) {
            i3 = ucVar2.z0;
            k9VarArr = ucVar2.C0;
            i4 = 0;
        } else {
            i3 = ucVar2.A0;
            k9VarArr = ucVar2.B0;
            i4 = 2;
        }
        int i16 = i3;
        k9[] k9VarArr2 = k9VarArr;
        int i17 = 0;
        while (i17 < i16) {
            k9 k9Var = k9VarArr2[i17];
            boolean z4 = k9Var.q;
            tc tcVar11 = k9Var.a;
            ec[] ecVarArr4 = tcVar11.Q;
            int i18 = 3;
            int i19 = 8;
            float f5 = 0.0f;
            if (z4) {
                i5 = i17;
            } else {
                int i20 = k9Var.l;
                int i21 = i20 * 2;
                tc tcVar12 = tcVar11;
                tc tcVar13 = tcVar12;
                boolean z5 = false;
                while (!z5) {
                    k9Var.i++;
                    tc[] tcVarArr = tcVar12.m0;
                    ec[] ecVarArr5 = tcVar12.Q;
                    tcVarArr[i20] = null;
                    tcVar12.l0[i20] = null;
                    if (tcVar12.g0 != i19) {
                        tcVar12.j(i20);
                        ecVarArr5[i21].e();
                        int i22 = i21 + 1;
                        ecVarArr5[i22].e();
                        ecVarArr5[i21].e();
                        ecVarArr5[i22].e();
                        if (k9Var.b == null) {
                            k9Var.b = tcVar12;
                        }
                        k9Var.d = tcVar12;
                        int i23 = tcVar12.p0[i20];
                        if (i23 == i18) {
                            int i24 = tcVar12.t[i20];
                            if (i24 == 0 || i24 == i18 || i24 == 2) {
                                k9Var.j++;
                                float f6 = tcVar12.k0[i20];
                                if (f6 > 0.0f) {
                                    i14 = i17;
                                    k9Var.k += f6;
                                } else {
                                    i14 = i17;
                                }
                                i15 = i20;
                                if (tcVar12.g0 != 8 && i23 == 3 && (i24 == 0 || i24 == 3)) {
                                    if (f6 < 0.0f) {
                                        k9Var.n = true;
                                    } else {
                                        k9Var.o = true;
                                    }
                                    if (k9Var.h == null) {
                                        k9Var.h = new ArrayList();
                                    }
                                    k9Var.h.add(tcVar12);
                                }
                                if (k9Var.f == null) {
                                    k9Var.f = tcVar12;
                                }
                                tc tcVar14 = k9Var.g;
                                if (tcVar14 != null) {
                                    tcVar14.l0[i15] = tcVar12;
                                }
                                k9Var.g = tcVar12;
                            } else {
                                i14 = i17;
                                i15 = i20;
                            }
                            if (i15 == 0) {
                                if (tcVar12.r == 0 && tcVar12.u == 0) {
                                    int i25 = tcVar12.v;
                                }
                            } else if (tcVar12.s == 0 && tcVar12.x == 0) {
                                int i26 = tcVar12.y;
                            }
                            tcVar9 = tcVar13;
                            if (tcVar9 != tcVar12) {
                                tcVar9.m0[i15] = tcVar12;
                            }
                            ecVar5 = ecVarArr5[i21 + 1].f;
                            if (ecVar5 != null) {
                                tcVar10 = ecVar5.d;
                                ec ecVar6 = tcVar10.Q[i21].f;
                                if (ecVar6 != null) {
                                }
                            }
                            tcVar10 = null;
                            if (tcVar10 != null) {
                                tcVar10 = tcVar12;
                                z5 = true;
                            }
                            tcVar13 = tcVar12;
                            i20 = i15;
                            i18 = 3;
                            i19 = 8;
                            tcVar12 = tcVar10;
                            i17 = i14;
                        }
                    }
                    i14 = i17;
                    i15 = i20;
                    tcVar9 = tcVar13;
                    if (tcVar9 != tcVar12) {
                    }
                    ecVar5 = ecVarArr5[i21 + 1].f;
                    if (ecVar5 != null) {
                    }
                    tcVar10 = null;
                    if (tcVar10 != null) {
                    }
                    tcVar13 = tcVar12;
                    i20 = i15;
                    i18 = 3;
                    i19 = 8;
                    tcVar12 = tcVar10;
                    i17 = i14;
                }
                i5 = i17;
                int i27 = i20;
                tc tcVar15 = k9Var.b;
                if (tcVar15 != null) {
                    tcVar15.Q[i21].e();
                }
                tc tcVar16 = k9Var.d;
                if (tcVar16 != null) {
                    tcVar16.Q[i21 + 1].e();
                }
                k9Var.c = tcVar12;
                if (i27 == 0 && k9Var.m) {
                    k9Var.e = tcVar12;
                } else {
                    k9Var.e = tcVar11;
                }
                k9Var.p = k9Var.o && k9Var.n;
            }
            k9Var.q = true;
            if (arrayList3 == null || arrayList3.contains(tcVar11)) {
                tc tcVar17 = k9Var.c;
                tc tcVar18 = k9Var.b;
                tc tcVar19 = k9Var.d;
                tc tcVar20 = k9Var.e;
                float f7 = k9Var.k;
                int[] iArr = ucVar2.p0;
                ec[] ecVarArr6 = ucVar2.Q;
                boolean z6 = iArr[i2] == 2;
                if (i2 == 0) {
                    int i28 = tcVar20.i0;
                    boolean z7 = i28 == 0;
                    ecVarArr = ecVarArr4;
                    boolean z8 = i28 == 1;
                    z = i28 == 2;
                    tcVar = tcVar11;
                    f2 = f7;
                    z3 = z8;
                    z2 = z7;
                } else {
                    ecVarArr = ecVarArr4;
                    int i29 = tcVar20.j0;
                    boolean z9 = i29 == 0;
                    boolean z10 = i29 == 1;
                    z = i29 == 2;
                    tcVar = tcVar11;
                    f2 = f7;
                    z2 = z9;
                    z3 = z10;
                }
                boolean z11 = false;
                while (!z11) {
                    ec[] ecVarArr7 = tcVar.Q;
                    int[] iArr2 = tcVar.p0;
                    ec ecVar7 = ecVarArr7[i4];
                    int i30 = z ? 1 : 4;
                    int e = ecVar7.e();
                    boolean z12 = z6;
                    boolean z13 = z;
                    boolean z14 = iArr2[i2] == 3 && tcVar.t[i2] == 0;
                    ec ecVar8 = ecVar7.f;
                    if (ecVar8 != null && tcVar != tcVar11) {
                        e = ecVar8.e() + e;
                    }
                    int i31 = e;
                    if (z13 && tcVar != tcVar11 && tcVar != tcVar18) {
                        i30 = 8;
                    }
                    tc tcVar21 = tcVar11;
                    ec ecVar9 = ecVar7.f;
                    if (ecVar9 != null) {
                        boolean z15 = z14;
                        o20 o20Var6 = ecVar7.i;
                        o20 o20Var7 = ecVar9.i;
                        if (tcVar == tcVar18) {
                            vpVar3.f(o20Var6, o20Var7, i31, 6);
                        } else {
                            vpVar3.f(o20Var6, o20Var7, i31, 8);
                        }
                        if (z15 && !z13) {
                            i30 = 5;
                        }
                        vpVar3.e(ecVar7.i, ecVar7.f.i, i31, (tcVar == tcVar18 && z13 && tcVar.S[i2]) ? 5 : i30);
                    }
                    if (z12) {
                        if (tcVar.g0 == 8 || iArr2[i2] != 3) {
                            i13 = 0;
                        } else {
                            i13 = 0;
                            vpVar3.f(ecVarArr7[i4 + 1].i, ecVarArr7[i4].i, 0, 5);
                        }
                        vpVar3.f(ecVarArr7[i4].i, ecVarArr6[i4].i, i13, 8);
                    }
                    ec ecVar10 = ecVarArr7[i4 + 1].f;
                    if (ecVar10 != null) {
                        tcVar8 = ecVar10.d;
                        ec ecVar11 = tcVar8.Q[i4].f;
                        if (ecVar11 != null) {
                        }
                    }
                    tcVar8 = null;
                    if (tcVar8 != null) {
                        tcVar = tcVar8;
                    } else {
                        z11 = true;
                    }
                    tcVar11 = tcVar21;
                    z6 = z12;
                    z = z13;
                }
                boolean z16 = z6;
                boolean z17 = z;
                if (tcVar19 != null) {
                    int i32 = i4 + 1;
                    if (tcVar17.Q[i32].f != null) {
                        ec ecVar12 = tcVar19.Q[i32];
                        if (tcVar19.p0[i2] == 3 && tcVar19.t[i2] == 0 && !z17) {
                            ec ecVar13 = ecVar12.f;
                            if (ecVar13.d == ucVar2) {
                                vpVar3.e(ecVar12.i, ecVar13.i, -ecVar12.e(), 5);
                                vpVar3.g(ecVar12.i, tcVar17.Q[i32].f.i, -ecVar12.e(), 6);
                            }
                        }
                        if (z17) {
                            ec ecVar14 = ecVar12.f;
                            if (ecVar14.d == ucVar2) {
                                vpVar3.e(ecVar12.i, ecVar14.i, -ecVar12.e(), 4);
                            }
                        }
                        vpVar3.g(ecVar12.i, tcVar17.Q[i32].f.i, -ecVar12.e(), 6);
                    }
                }
                if (z16) {
                    int i33 = i4 + 1;
                    o20 o20Var8 = ecVarArr6[i33].i;
                    ec ecVar15 = tcVar17.Q[i33];
                    vpVar3.f(o20Var8, ecVar15.i, ecVar15.e(), 8);
                }
                ArrayList arrayList4 = k9Var.h;
                if (arrayList4 != null && (size = arrayList4.size()) > 1) {
                    if (k9Var.n && !k9Var.p) {
                        f2 = k9Var.j;
                    }
                    tc tcVar22 = null;
                    float f8 = 0.0f;
                    int i34 = 0;
                    while (i34 < size) {
                        tc tcVar23 = (tc) arrayList4.get(i34);
                        float[] fArr = tcVar23.k0;
                        ec[] ecVarArr8 = tcVar23.Q;
                        float f9 = fArr[i2];
                        if (f9 < f5) {
                            if (k9Var.p) {
                                arrayList2 = arrayList4;
                                i10 = size;
                                vpVar3.e(ecVarArr8[i4 + 1].i, ecVarArr8[i4].i, 0, 4);
                                f4 = f8;
                                i11 = i16;
                                f3 = f5;
                                f8 = f4;
                                i12 = i34;
                                i34 = i12 + 1;
                                i16 = i11;
                                arrayList4 = arrayList2;
                                size = i10;
                                f5 = f3;
                            } else {
                                f9 = 1.0f;
                            }
                        }
                        arrayList2 = arrayList4;
                        i10 = size;
                        if (f9 == f5) {
                            f4 = f8;
                            vpVar3.e(ecVarArr8[i4 + 1].i, ecVarArr8[i4].i, 0, 8);
                            i11 = i16;
                            f3 = f5;
                            f8 = f4;
                            i12 = i34;
                            i34 = i12 + 1;
                            i16 = i11;
                            arrayList4 = arrayList2;
                            size = i10;
                            f5 = f3;
                        } else {
                            float f10 = f8;
                            if (tcVar22 != null) {
                                ec[] ecVarArr9 = tcVar22.Q;
                                o20 o20Var9 = ecVarArr9[i4].i;
                                int i35 = i4 + 1;
                                o20 o20Var10 = ecVarArr9[i35].i;
                                o20 o20Var11 = ecVarArr8[i4].i;
                                o20 o20Var12 = ecVarArr8[i35].i;
                                m6 l2 = vpVar3.l();
                                tcVar7 = tcVar23;
                                float f11 = f5;
                                l2.b = f11;
                                f3 = f11;
                                if (f2 == f11 || f10 == f9) {
                                    i12 = i34;
                                    i11 = i16;
                                    l2.d.g(o20Var9, 1.0f);
                                    l2.d.g(o20Var10, -1.0f);
                                    l2.d.g(o20Var12, 1.0f);
                                    l2.d.g(o20Var11, -1.0f);
                                } else {
                                    f6 f6Var = l2.d;
                                    if (f10 == f3) {
                                        i12 = i34;
                                        f6Var.g(o20Var9, 1.0f);
                                        l2.d.g(o20Var10, -1.0f);
                                        i11 = i16;
                                    } else {
                                        i12 = i34;
                                        i11 = i16;
                                        if (f9 == f5) {
                                            f6Var.g(o20Var11, 1.0f);
                                            l2.d.g(o20Var12, -1.0f);
                                        } else {
                                            float f12 = (f10 / f2) / (f9 / f2);
                                            f6Var.g(o20Var9, 1.0f);
                                            l2.d.g(o20Var10, -1.0f);
                                            l2.d.g(o20Var12, f12);
                                            l2.d.g(o20Var11, -f12);
                                        }
                                    }
                                }
                                vpVar3.c(l2);
                            } else {
                                tcVar7 = tcVar23;
                                i11 = i16;
                                f3 = f5;
                                i12 = i34;
                            }
                            f8 = f9;
                            tcVar22 = tcVar7;
                            i34 = i12 + 1;
                            i16 = i11;
                            arrayList4 = arrayList2;
                            size = i10;
                            f5 = f3;
                        }
                    }
                }
                i6 = i16;
                if (tcVar18 == null || !(tcVar18 == tcVar19 || z17)) {
                    tcVar2 = tcVar19;
                    if (z2 && tcVar18 != null) {
                        int i36 = k9Var.j;
                        boolean z18 = i36 > 0 && k9Var.i == i36;
                        tc tcVar24 = tcVar18;
                        tc tcVar25 = tcVar24;
                        while (true) {
                            ec[] ecVarArr10 = tcVar25.Q;
                            if (tcVar24 == null) {
                                break;
                            }
                            ec[] ecVarArr11 = tcVar24.Q;
                            tc tcVar26 = tcVar24.m0[i2];
                            while (true) {
                                if (tcVar26 == null) {
                                    i7 = 8;
                                    break;
                                }
                                i7 = 8;
                                if (tcVar26.g0 != 8) {
                                    break;
                                } else {
                                    tcVar26 = tcVar26.m0[i2];
                                }
                            }
                            if (tcVar26 != null || tcVar24 == tcVar2) {
                                ec ecVar16 = ecVarArr11[i4];
                                o20 o20Var13 = ecVar16.i;
                                ec ecVar17 = ecVar16.f;
                                o20 o20Var14 = ecVar17 != null ? ecVar17.i : null;
                                if (tcVar25 != tcVar24) {
                                    o20Var14 = ecVarArr10[i4 + 1].i;
                                } else if (tcVar24 == tcVar18) {
                                    ec ecVar18 = ecVarArr[i4].f;
                                    o20Var14 = ecVar18 != null ? ecVar18.i : null;
                                }
                                int e2 = ecVar16.e();
                                int i37 = i4 + 1;
                                int e3 = ecVarArr11[i37].e();
                                if (tcVar26 != null) {
                                    ecVar2 = tcVar26.Q[i4];
                                    ecVarArr2 = ecVarArr10;
                                    o20Var3 = ecVar2.i;
                                } else {
                                    ecVarArr2 = ecVarArr10;
                                    ecVar2 = tcVar17.Q[i37].f;
                                    o20Var3 = ecVar2 != null ? ecVar2.i : null;
                                }
                                o20 o20Var15 = ecVarArr11[i37].i;
                                if (ecVar2 != null) {
                                    e3 += ecVar2.e();
                                }
                                int e4 = ecVarArr2[i37].e() + e2;
                                if (o20Var13 == null || o20Var14 == null || o20Var3 == null || o20Var15 == null) {
                                    tcVar5 = tcVar26;
                                    tcVar6 = tcVar25;
                                    i8 = 8;
                                } else {
                                    if (tcVar24 == tcVar18) {
                                        e4 = tcVar18.Q[i4].e();
                                    }
                                    int i38 = e4;
                                    if (tcVar24 == tcVar2) {
                                        e3 = tcVar2.Q[i37].e();
                                    }
                                    tcVar5 = tcVar26;
                                    tcVar6 = tcVar25;
                                    i8 = 8;
                                    vpVar.b(o20Var13, o20Var14, i38, 0.5f, o20Var3, o20Var15, e3, z18 ? 8 : 5);
                                }
                            } else {
                                tcVar5 = tcVar26;
                                tcVar6 = tcVar25;
                                i8 = i7;
                            }
                            if (tcVar24.g0 != i8) {
                                tcVar6 = tcVar24;
                            }
                            tcVar24 = tcVar5;
                            tcVar25 = tcVar6;
                        }
                    } else {
                        int i39 = 8;
                        if (z3 && tcVar18 != null) {
                            int i40 = k9Var.j;
                            boolean z19 = i40 > 0 && k9Var.i == i40;
                            tc tcVar27 = tcVar18;
                            tc tcVar28 = tcVar27;
                            while (true) {
                                ec[] ecVarArr12 = tcVar27.Q;
                                if (tcVar28 == null) {
                                    break;
                                }
                                ec[] ecVarArr13 = tcVar28.Q;
                                tc tcVar29 = tcVar28.m0[i2];
                                while (tcVar29 != null && tcVar29.g0 == i39) {
                                    tcVar29 = tcVar29.m0[i2];
                                }
                                if (tcVar28 == tcVar18 || tcVar28 == tcVar2 || tcVar29 == null) {
                                    tcVar3 = tcVar27;
                                } else {
                                    if (tcVar29 == tcVar2) {
                                        tcVar29 = null;
                                    }
                                    ec ecVar19 = ecVarArr13[i4];
                                    o20 o20Var16 = ecVar19.i;
                                    int i41 = i4 + 1;
                                    o20 o20Var17 = ecVarArr12[i41].i;
                                    int e5 = ecVar19.e();
                                    int e6 = ecVarArr13[i41].e();
                                    if (tcVar29 != null) {
                                        ecVar = tcVar29.Q[i4];
                                        o20Var = ecVar.i;
                                        tcVar3 = tcVar27;
                                        ec ecVar20 = ecVar.f;
                                        o20Var2 = ecVar20 != null ? ecVar20.i : null;
                                    } else {
                                        tcVar3 = tcVar27;
                                        ec ecVar21 = tcVar2.Q[i4];
                                        o20Var = ecVar21 != null ? ecVar21.i : null;
                                        o20 o20Var18 = ecVarArr13[i41].i;
                                        ecVar = ecVar21;
                                        o20Var2 = o20Var18;
                                    }
                                    if (ecVar != null) {
                                        e6 += ecVar.e();
                                    }
                                    int e7 = ecVarArr12[i41].e() + e5;
                                    tc tcVar30 = tcVar29;
                                    int i42 = e6;
                                    int i43 = z19 ? 8 : 4;
                                    if (o20Var16 == null || o20Var17 == null || o20Var == null || o20Var2 == null) {
                                        tcVar4 = tcVar30;
                                    } else {
                                        o20 o20Var19 = o20Var;
                                        tcVar4 = tcVar30;
                                        vpVar.b(o20Var16, o20Var17, e7, 0.5f, o20Var19, o20Var2, i42, i43);
                                    }
                                    tcVar29 = tcVar4;
                                }
                                if (tcVar28.g0 != 8) {
                                    tcVar3 = tcVar28;
                                }
                                tcVar28 = tcVar29;
                                i39 = 8;
                                tcVar27 = tcVar3;
                            }
                            vpVar2 = vpVar;
                            ec ecVar22 = tcVar18.Q[i4];
                            ec ecVar23 = ecVarArr[i4].f;
                            int i44 = i4 + 1;
                            ec ecVar24 = tcVar2.Q[i44];
                            ec ecVar25 = tcVar17.Q[i44].f;
                            if (ecVar23 != null) {
                                if (tcVar18 != tcVar2) {
                                    vpVar2.e(ecVar22.i, ecVar23.i, ecVar22.e(), 5);
                                } else if (ecVar25 != null) {
                                    vpVar2.b(ecVar22.i, ecVar23.i, ecVar22.e(), 0.5f, ecVar24.i, ecVar25.i, ecVar24.e(), 5);
                                }
                            }
                            if (ecVar25 != null && tcVar18 != tcVar2) {
                                vpVar2.e(ecVar24.i, ecVar25.i, -ecVar24.e(), 5);
                            }
                            if ((!z2 || z3) && tcVar18 != null && tcVar18 != tcVar2) {
                                ec[] ecVarArr14 = tcVar18.Q;
                                ecVar3 = ecVarArr14[i4];
                                if (tcVar2 == null) {
                                    tcVar2 = tcVar18;
                                }
                                ecVarArr3 = tcVar2.Q;
                                i9 = i4 + 1;
                                ecVar4 = ecVarArr3[i9];
                                ec ecVar26 = ecVar3.f;
                                o20Var4 = ecVar26 == null ? ecVar26.i : null;
                                ec ecVar27 = ecVar4.f;
                                o20Var5 = ecVar27 == null ? ecVar27.i : null;
                                if (tcVar17 != tcVar2) {
                                    ec ecVar28 = tcVar17.Q[i9].f;
                                    o20Var5 = ecVar28 != null ? ecVar28.i : null;
                                }
                                if (tcVar18 == tcVar2) {
                                    ecVar4 = ecVarArr14[i9];
                                }
                                if (o20Var4 != null && o20Var5 != null) {
                                    vpVar2.b(ecVar3.i, o20Var4, ecVar3.e(), 0.5f, o20Var5, ecVar4.i, ecVarArr3[i9].e(), 5);
                                }
                            }
                        }
                    }
                } else {
                    ec ecVar29 = ecVarArr[i4];
                    int i45 = i4 + 1;
                    ec ecVar30 = tcVar17.Q[i45];
                    ec ecVar31 = ecVar29.f;
                    o20 o20Var20 = ecVar31 != null ? ecVar31.i : null;
                    ec ecVar32 = ecVar30.f;
                    o20 o20Var21 = ecVar32 != null ? ecVar32.i : null;
                    ec ecVar33 = tcVar18.Q[i4];
                    if (tcVar19 != null) {
                        ecVar30 = tcVar19.Q[i45];
                    }
                    if (o20Var20 == null || o20Var21 == null) {
                        tcVar2 = tcVar19;
                    } else {
                        float f13 = i2 == 0 ? tcVar20.d0 : tcVar20.e0;
                        int e8 = ecVar33.e();
                        int e9 = ecVar30.e();
                        o20 o20Var22 = ecVar33.i;
                        o20 o20Var23 = ecVar30.i;
                        o20 o20Var24 = o20Var20;
                        tcVar2 = tcVar19;
                        vpVar3.b(o20Var22, o20Var24, e8, f13, o20Var21, o20Var23, e9, 7);
                    }
                }
                vpVar2 = vpVar;
                if (!z2) {
                }
                ec[] ecVarArr142 = tcVar18.Q;
                ecVar3 = ecVarArr142[i4];
                if (tcVar2 == null) {
                }
                ecVarArr3 = tcVar2.Q;
                i9 = i4 + 1;
                ecVar4 = ecVarArr3[i9];
                ec ecVar262 = ecVar3.f;
                if (ecVar262 == null) {
                }
                ec ecVar272 = ecVar4.f;
                if (ecVar272 == null) {
                }
                if (tcVar17 != tcVar2) {
                }
                if (tcVar18 == tcVar2) {
                }
                if (o20Var4 != null) {
                    vpVar2.b(ecVar3.i, o20Var4, ecVar3.e(), 0.5f, o20Var5, ecVar4.i, ecVarArr3[i9].e(), 5);
                }
            } else {
                i6 = i16;
            }
            i17 = i5 + 1;
            ucVar2 = ucVar;
            vpVar3 = vpVar;
            arrayList3 = arrayList;
            i16 = i6;
        }
    }

    public static void c0(CheckableImageButton checkableImageButton, CharSequence charSequence) {
        if (!checkableImageButton.isFocusable()) {
            charSequence = null;
        }
        checkableImageButton.setTooltipText(charSequence);
    }

    public static float d0() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static void f(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static final void g(p80 p80Var, final h3 h3Var, final a aVar) {
        Object obj;
        h3Var.getClass();
        aVar.getClass();
        HashMap hashMap = p80Var.a;
        if (hashMap == null) {
            obj = null;
        } else {
            synchronized (hashMap) {
                obj = p80Var.a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController == null || savedStateHandleController.a) {
            return;
        }
        h3Var.getClass();
        aVar.getClass();
        if (savedStateHandleController.a) {
            l8.u("Already attached to lifecycleOwner");
        } else {
            savedStateHandleController.a = true;
            aVar.a(savedStateHandleController);
            h3Var.e(null, null);
        }
        gp gpVar = aVar.c;
        if (gpVar == gp.g || gpVar.compareTo(gp.i) >= 0) {
            h3Var.f();
        } else {
            aVar.a(new jp() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // defpackage.jp
                public final void b(lp lpVar, fp fpVar) {
                    if (fpVar == fp.ON_START) {
                        a.this.f(this);
                        h3Var.f();
                    }
                }
            });
        }
    }

    public static final void h(View view) {
        view.getClass();
        i10 i10Var = new i10();
        o80 o80Var = new o80(view, i10Var);
        o80Var.h = i10Var;
        i10Var.i = o80Var;
        while (i10Var.hasNext()) {
            View view2 = (View) i10Var.next();
            mw mwVar = (mw) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (mwVar == null) {
                mwVar = new mw();
                view2.setTag(R.id.pooling_container_listener_holder_tag, mwVar);
            }
            ArrayList arrayList = mwVar.a;
            arrayList.getClass();
            int size = arrayList.size() - 1;
            if (-1 < size) {
                arrayList.get(size).getClass();
                l8.c();
                return;
            }
        }
    }

    public static void i(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jx.L, i2, i3);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                l(context, t, "Theme.MaterialComponents");
            }
        }
        l(context, s, "Theme.AppCompat");
    }

    public static void j(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 <= i3) {
                return;
            }
            l8.l(n20.d(i2, i3, "fromIndex: ", " > toIndex: "));
        } else {
            throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void k(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jx.L, i2, i3);
        boolean z = false;
        if (!obtainStyledAttributes.getBoolean(2, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
            for (int i4 : iArr2) {
                if (obtainStyledAttributes2.getResourceId(i4, -1) == -1) {
                    obtainStyledAttributes2.recycle();
                    break;
                }
            }
            obtainStyledAttributes2.recycle();
            z = true;
            obtainStyledAttributes.recycle();
            if (z) {
                return;
            }
            l8.l("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static void l(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (!obtainStyledAttributes.hasValue(i2)) {
                obtainStyledAttributes.recycle();
                throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static int m(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    public static int n(zy zyVar, xg xgVar, View view, View view2, ny nyVar, boolean z) {
        if (nyVar.v() == 0 || zyVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(ny.G(view) - ny.G(view2)) + 1;
        }
        return Math.min(xgVar.l(), xgVar.b(view2) - xgVar.e(view));
    }

    public static int o(zy zyVar, xg xgVar, View view, View view2, ny nyVar, boolean z, boolean z2) {
        if (nyVar.v() == 0 || zyVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (zyVar.b() - Math.max(ny.G(view), ny.G(view2))) - 1) : Math.max(0, Math.min(ny.G(view), ny.G(view2)));
        if (z) {
            return Math.round((max * (Math.abs(xgVar.b(view2) - xgVar.e(view)) / (Math.abs(ny.G(view) - ny.G(view2)) + 1))) + (xgVar.k() - xgVar.e(view)));
        }
        return max;
    }

    public static int p(zy zyVar, xg xgVar, View view, View view2, ny nyVar, boolean z) {
        if (nyVar.v() == 0 || zyVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return zyVar.b();
        }
        return (int) (((xgVar.b(view2) - xgVar.e(view)) / (Math.abs(ny.G(view) - ny.G(view2)) + 1)) * zyVar.b());
    }

    public static ImageView.ScaleType q(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 5 ? i2 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static i50 v(String str) {
        str.getClass();
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return i50.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return i50.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return i50.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return i50.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return i50.SSL_3_0;
        }
        l8.l("Unexpected TLS version: ".concat(str));
        return null;
    }

    public static float x(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return kg.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Set y() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static float z(String[] strArr, int i2) {
        float parseFloat = Float.parseFloat(strArr[i2]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public abstract int A(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float B(z10 z10Var);

    public abstract int C();

    public abstract ViewPropertyAnimator D(View view, int i2);

    public abstract View L(int i2);

    public abstract boolean M();

    public abstract Object P(Intent intent, int i2);

    public abstract void Y(z10 z10Var, float f2);

    public abstract Typeface r(Context context, rj rjVar, Resources resources, int i2);

    public abstract Typeface s(Context context, uj[] ujVarArr, int i2);

    public Typeface t(Context context, List list, int i2) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public abstract Typeface u(Context context, Resources resources, int i2, String str);

    public abstract void w(y10 y10Var, float f2, float f3);
}
