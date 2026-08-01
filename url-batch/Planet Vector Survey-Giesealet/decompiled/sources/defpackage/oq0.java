package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class oq0 extends CharacterStyle implements UpdateAppearance {
    public final nq0 d;
    public final float e;
    public final ce0 f = ud0.o(new fr0(9205357640488583168L));
    public final yl g = ud0.i(new ab0(7, this));

    public oq0(nq0 nq0Var, float f) {
        this.d = nq0Var;
        this.e = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        d31.H(textPaint, this.e);
        textPaint.setShader((Shader) this.g.getValue());
    }
}
