package p0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: p0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0326o extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f3795a;

    public C0326o(Drawable.ConstantState constantState) {
        this.f3795a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f3795a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3795a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0327p c0327p = new C0327p();
        c0327p.f3753a = (VectorDrawable) this.f3795a.newDrawable();
        return c0327p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0327p c0327p = new C0327p();
        c0327p.f3753a = (VectorDrawable) this.f3795a.newDrawable(resources);
        return c0327p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0327p c0327p = new C0327p();
        c0327p.f3753a = (VectorDrawable) this.f3795a.newDrawable(resources, theme);
        return c0327p;
    }
}
