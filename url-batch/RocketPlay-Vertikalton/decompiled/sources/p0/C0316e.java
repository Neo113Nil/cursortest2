package p0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: p0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0316e extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f3748a;

    public C0316e(Drawable.ConstantState constantState) {
        this.f3748a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f3748a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f3748a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0317f c0317f = new C0317f(null);
        Drawable newDrawable = this.f3748a.newDrawable();
        c0317f.f3753a = newDrawable;
        newDrawable.setCallback(c0317f.f3752f);
        return c0317f;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0317f c0317f = new C0317f(null);
        Drawable newDrawable = this.f3748a.newDrawable(resources);
        c0317f.f3753a = newDrawable;
        newDrawable.setCallback(c0317f.f3752f);
        return c0317f;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0317f c0317f = new C0317f(null);
        Drawable newDrawable = this.f3748a.newDrawable(resources, theme);
        c0317f.f3753a = newDrawable;
        newDrawable.setCallback(c0317f.f3752f);
        return c0317f;
    }
}
