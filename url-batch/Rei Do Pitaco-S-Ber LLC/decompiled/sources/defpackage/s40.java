package defpackage;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class s40 {
    public float c;
    public float d;
    public final WeakReference f;
    public p40 g;
    public final TextPaint a = new TextPaint(1);
    public final y9 b = new y9(1, this);
    public boolean e = true;

    public s40(r40 r40Var) {
        this.f = new WeakReference(null);
        this.f = new WeakReference(r40Var);
    }

    public final void a(String str) {
        TextPaint textPaint = this.a;
        this.c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.e = false;
    }

    public final void b(p40 p40Var, Context context) {
        if (this.g != p40Var) {
            this.g = p40Var;
            WeakReference weakReference = this.f;
            if (p40Var != null) {
                TextPaint textPaint = this.a;
                y9 y9Var = this.b;
                p40Var.e(context, textPaint, y9Var);
                r40 r40Var = (r40) weakReference.get();
                if (r40Var != null) {
                    textPaint.drawableState = r40Var.getState();
                }
                p40Var.d(context, textPaint, y9Var);
                this.e = true;
            }
            r40 r40Var2 = (r40) weakReference.get();
            if (r40Var2 != null) {
                r40Var2.a();
                r40Var2.onStateChange(r40Var2.getState());
            }
        }
    }
}
