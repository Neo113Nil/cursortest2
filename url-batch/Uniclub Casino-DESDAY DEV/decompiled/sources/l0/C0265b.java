package l0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import x0.C0340a;
import x0.C0342c;

/* renamed from: l0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0265b extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0340a f3118a;

    public C0265b(C0340a c0340a) {
        this.f3118a = c0340a;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f3118a.f4117b.f4131o;
        if (colorStateList != null) {
            D.a.h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        C0342c c0342c = this.f3118a.f4117b;
        ColorStateList colorStateList = c0342c.f4131o;
        if (colorStateList != null) {
            D.a.g(drawable, colorStateList.getColorForState(c0342c.f4135s, colorStateList.getDefaultColor()));
        }
    }
}
