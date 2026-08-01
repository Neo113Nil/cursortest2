package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class t2 extends Drawable.ConstantState {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public t2(u7 u7Var) {
        this.b = u7Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.a) {
            case 0:
                return ((Drawable.ConstantState) this.b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.a) {
            case 0:
                return ((Drawable.ConstantState) this.b).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        switch (this.a) {
            case 0:
                u2 u2Var = new u2(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources);
                u2Var.f = newDrawable;
                newDrawable.setCallback(u2Var.k);
                return u2Var;
            default:
                return super.newDrawable(resources);
        }
    }

    public t2(Drawable.ConstantState constantState) {
        this.b = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                u2 u2Var = new u2(null);
                Drawable newDrawable = ((Drawable.ConstantState) obj).newDrawable();
                u2Var.f = newDrawable;
                newDrawable.setCallback(u2Var.k);
                return u2Var;
            default:
                return (u7) obj;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.a) {
            case 0:
                u2 u2Var = new u2(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources, theme);
                u2Var.f = newDrawable;
                newDrawable.setCallback(u2Var.k);
                return u2Var;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
