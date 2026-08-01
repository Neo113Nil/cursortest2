package l0;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* renamed from: l0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0267d extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public p f3120a;

    /* renamed from: b, reason: collision with root package name */
    public AnimatorSet f3121b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f3122c;
    public o.b d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
