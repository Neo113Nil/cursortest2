package defpackage;

import android.graphics.ColorSpace;
import android.os.Build;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.autofill.AutofillId;
import java.util.function.DoubleUnaryOperator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class oe {
    public static final ColorSpace a(me meVar) {
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        ColorSpace.Named named;
        ColorSpace.Named named2;
        if (nz.l(meVar, qe.e)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (nz.l(meVar, qe.q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (nz.l(meVar, qe.r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (nz.l(meVar, qe.o)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (nz.l(meVar, qe.j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (nz.l(meVar, qe.i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (nz.l(meVar, qe.t)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (nz.l(meVar, qe.s)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (nz.l(meVar, qe.k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (nz.l(meVar, qe.l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (nz.l(meVar, qe.g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (nz.l(meVar, qe.h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (nz.l(meVar, qe.f)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (nz.l(meVar, qe.m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (nz.l(meVar, qe.p)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else if (nz.l(meVar, qe.n)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        } else {
            if (Build.VERSION.SDK_INT >= 34) {
                if (nz.l(meVar, qe.v)) {
                    named2 = ColorSpace.Named.BT2020_HLG;
                    colorSpace2 = ColorSpace.get(named2);
                } else if (nz.l(meVar, qe.w)) {
                    named = ColorSpace.Named.BT2020_PQ;
                    colorSpace2 = ColorSpace.get(named);
                } else {
                    colorSpace2 = null;
                }
                if (colorSpace2 != null) {
                    return colorSpace2;
                }
            }
            if (meVar instanceof dl0) {
                String str = meVar.a;
                dl0 dl0Var = (dl0) meVar;
                float[] a = dl0Var.d.a();
                tw0 tw0Var = dl0Var.g;
                ColorSpace.Rgb.TransferParameters transferParameters = tw0Var != null ? new ColorSpace.Rgb.TransferParameters(tw0Var.b, tw0Var.c, tw0Var.d, tw0Var.e, tw0Var.f, tw0Var.g, tw0Var.a) : null;
                if (transferParameters != null) {
                    return new ColorSpace.Rgb(str, dl0Var.h, a, transferParameters);
                }
                float[] fArr = dl0Var.h;
                final cl0 cl0Var = dl0Var.l;
                final int i = 0;
                DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: ne
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d) {
                        int i2 = i;
                        mu muVar = cl0Var;
                        switch (i2) {
                        }
                        return ((Number) muVar.c(Double.valueOf(d))).doubleValue();
                    }
                };
                final cl0 cl0Var2 = dl0Var.o;
                final int i2 = 1;
                return new ColorSpace.Rgb(str, fArr, a, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: ne
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d) {
                        int i22 = i2;
                        mu muVar = cl0Var2;
                        switch (i22) {
                        }
                        return ((Number) muVar.c(Double.valueOf(d))).doubleValue();
                    }
                }, dl0Var.e, dl0Var.f);
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        return colorSpace;
    }

    public static AutofillId b(View view) {
        return view.getAutofillId();
    }

    public static float c(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float d(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }
}
