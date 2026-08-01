package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class td extends js {
    public final RectF q;

    public td(td tdVar) {
        super(tdVar);
        this.q = tdVar.q;
    }

    @Override // defpackage.js, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        ud udVar = new ud(this);
        udVar.L = this;
        udVar.invalidateSelf();
        return udVar;
    }

    public td(o10 o10Var, RectF rectF) {
        super(o10Var);
        this.q = rectF;
    }
}
