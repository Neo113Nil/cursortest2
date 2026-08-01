package p0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* renamed from: p0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0313b extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A0.a f3743a;

    public C0313b(A0.a aVar) {
        this.f3743a = aVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f3743a.f1b.f16o;
        if (colorStateList != null) {
            D.a.h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        A0.d dVar = this.f3743a.f1b;
        ColorStateList colorStateList = dVar.f16o;
        if (colorStateList != null) {
            D.a.g(drawable, colorStateList.getColorForState(dVar.f20s, colorStateList.getDefaultColor()));
        }
    }
}
