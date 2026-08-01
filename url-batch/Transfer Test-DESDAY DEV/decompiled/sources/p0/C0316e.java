package p0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: p0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0316e extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f3374a;

    public C0316e(Drawable.ConstantState constantState) {
        this.f3374a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f3374a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f3374a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        f fVar = new f(null);
        Drawable newDrawable = this.f3374a.newDrawable();
        fVar.f3379a = newDrawable;
        newDrawable.setCallback(fVar.f3378f);
        return fVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        f fVar = new f(null);
        Drawable newDrawable = this.f3374a.newDrawable(resources);
        fVar.f3379a = newDrawable;
        newDrawable.setCallback(fVar.f3378f);
        return fVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        f fVar = new f(null);
        Drawable newDrawable = this.f3374a.newDrawable(resources, theme);
        fVar.f3379a = newDrawable;
        newDrawable.setCallback(fVar.f3378f);
        return fVar;
    }
}
