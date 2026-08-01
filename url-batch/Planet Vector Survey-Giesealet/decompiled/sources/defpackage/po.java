package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class po extends CharacterStyle implements UpdateAppearance {
    public final nz d;

    public po(nz nzVar) {
        this.d = nzVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            ar arVar = ar.o;
            nz nzVar = this.d;
            if (nz.l(nzVar, arVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(nzVar instanceof ut0)) {
                g8.c();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            ut0 ut0Var = (ut0) nzVar;
            textPaint.setStrokeWidth(ut0Var.o);
            textPaint.setStrokeMiter(ut0Var.p);
            int i = ut0Var.r;
            textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i2 = ut0Var.q;
            textPaint.setStrokeCap(i2 == 0 ? Paint.Cap.BUTT : i2 == 1 ? Paint.Cap.ROUND : i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            textPaint.setPathEffect(null);
        }
    }
}
