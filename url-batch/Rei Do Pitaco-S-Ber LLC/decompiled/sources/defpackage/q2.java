package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class q2 extends Animatable2.AnimationCallback {
    public final /* synthetic */ bs a;

    public q2(bs bsVar) {
        this.a = bsVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.a.b.t;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        ds dsVar = this.a.b;
        ColorStateList colorStateList = dsVar.t;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(dsVar.x, colorStateList.getDefaultColor()));
        }
    }
}
