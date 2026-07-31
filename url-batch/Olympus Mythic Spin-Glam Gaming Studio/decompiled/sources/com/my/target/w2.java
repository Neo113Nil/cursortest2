package com.my.target;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.SparseIntArray;
import android.util.StateSet;
import com.my.target.nativeads.constants.NativeAdColor;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class w2 {
    private static int b;
    private final SparseIntArray a = new SparseIntArray();
    public static final int c = b();
    public static final int d = b();
    public static final int e = b();
    public static final int f = b();
    public static final int g = b();
    public static final int h = b();
    public static final int i = b();
    public static final int j = b();
    public static final int k = b();
    public static final int l = b();
    public static final int m = b();
    public static final int n = b();
    public static final int o = b();
    public static final int p = b();
    public static final int q = b();
    public static final int r = b();
    public static final int s = b();
    public static final int t = b();
    public static final int u = b();
    public static final int v = b();
    public static final int w = b();
    public static final int x = b();
    public static final int y = b();
    public static final int z = b();
    public static final int A = b();
    public static final int B = b();
    public static final int C = b();
    public static final int D = b();
    public static final int E = b();
    public static final int F = b();
    public static final int G = b();
    public static final int H = b();
    public static final int I = b();

    private w2(Context context) {
        a(qi.g(context).e());
    }

    public static w2 a(Context context) {
        return new w2(context);
    }

    private static int b() {
        int i2 = b;
        b = i2 + 1;
        return i2;
    }

    private static int b(boolean z2) {
        return z2 ? -1 : -14251797;
    }

    private static int c(boolean z2) {
        return z2 ? -15132390 : -1;
    }

    private static int d(boolean z2) {
        return z2 ? -14474460 : -657931;
    }

    private static int e(boolean z2) {
        return z2 ? -16119286 : -1315344;
    }

    private static int f(boolean z2) {
        if (z2) {
            return 352321535;
        }
        return DivSeparatorView.DEFAULT_DIVIDER_COLOR;
    }

    private static int g(boolean z2) {
        return z2 ? -16777216 : -1;
    }

    private static int h(boolean z2) {
        return z2 ? -9602939 : -6907233;
    }

    private int i(boolean z2) {
        return z2 ? 1711276032 : -1560281088;
    }

    private int j(boolean z2) {
        return z2 ? -1543503873 : -1557755669;
    }

    private int k(boolean z2) {
        return z2 ? -13224136 : -2631463;
    }

    private int l(boolean z2) {
        return z2 ? -11362572 : -14251797;
    }

    private int m(boolean z2) {
        return z2 ? -10657951 : -4668980;
    }

    private int n(boolean z2) {
        return z2 ? -1973274 : -13882066;
    }

    private static int o(boolean z2) {
        return z2 ? 452984831 : 167772160;
    }

    private static int p(boolean z2) {
        return z2 ? -9013126 : -6708563;
    }

    private static int q(boolean z2) {
        return z2 ? -9013126 : -8287079;
    }

    private static int r(boolean z2) {
        return z2 ? -6907233 : -9602939;
    }

    private static int s(boolean z2) {
        return z2 ? -1 : -16777216;
    }

    public int a(int i2) {
        return this.a.get(i2);
    }

    private void a(boolean z2) {
        a(c, 724315791);
        a(d, 1711276032);
        a(e, NativeAdColor.BACKGROUND_TOUCH);
        a(f, 724315791);
        a(g, 1040187391);
        a(h, -1711276033);
        a(l, -1555741356);
        a(i, -52409);
        a(n, -14251797);
        a(o, -1685946);
        a(k, DivSeparatorView.DEFAULT_DIVIDER_COLOR);
        int i2 = m;
        a(i2, -2144588498);
        a(j, -1315344);
        a(p, -1);
        int i3 = A;
        a(i3, -3158065);
        a(E, i(z2));
        a(B, b(z2));
        int i4 = C;
        a(i4, j(z2));
        a(i2, -2144588498);
        a(i3, -3158065);
        a(q, r(z2));
        a(w, o(z2));
        a(x, e(z2));
        a(r, c(z2));
        a(s, s(z2));
        a(v, q(z2));
        a(i4, j(z2));
        a(y, g(z2));
        a(z, h(z2));
        a(F, k(z2));
        int i5 = G;
        a(i5, l(z2));
        int i6 = H;
        a(i6, m(z2));
        a(D, f(z2));
        a(i5, l(z2));
        a(i6, m(z2));
        a(t, n(z2));
        a(u, p(z2));
        a(I, d(z2));
    }

    private void a(int i2, int i3) {
        this.a.put(i2, i3);
    }

    public Drawable a() {
        int a = a(r);
        int a2 = a(A);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{a, a});
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{a2, a2});
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable2);
        int[] iArr = StateSet.WILD_CARD;
        stateListDrawable.addState(iArr, gradientDrawable);
        return new RippleDrawable(new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, iArr}, new int[]{qi.a(a2), qi.a(a)}), stateListDrawable, null);
    }

    public StateListDrawable a(int i2, int i3, int i4, float f2) {
        GradientDrawable a = a(i4, f2);
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable a2 = a(-1, f2);
        stateListDrawable.addState(new int[]{android.R.attr.state_enabled}, new RippleDrawable(ColorStateList.valueOf(i3), a(i2, f2), a2));
        StateListDrawable stateListDrawable2 = new StateListDrawable();
        stateListDrawable2.addState(new int[]{-16842910}, a);
        stateListDrawable2.addState(new int[]{android.R.attr.state_enabled}, stateListDrawable);
        return stateListDrawable2;
    }

    private GradientDrawable a(int i2, float f2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i2);
        gradientDrawable.setCornerRadius(f2);
        return gradientDrawable;
    }

    public ShapeDrawable a(float f2) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(a(D));
        shapeDrawable.getPaint().setStrokeWidth(f2);
        return shapeDrawable;
    }
}
