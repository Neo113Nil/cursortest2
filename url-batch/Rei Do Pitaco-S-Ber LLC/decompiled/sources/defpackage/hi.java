package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class hi implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View f;
    public final /* synthetic */ int g;
    public final /* synthetic */ ii h;
    public final /* synthetic */ ExpandableBehavior i;

    public hi(ExpandableBehavior expandableBehavior, View view, int i, ii iiVar) {
        this.i = expandableBehavior;
        this.f = view;
        this.g = i;
        this.h = iiVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.i;
        if (expandableBehavior.a == this.g) {
            Object obj = this.h;
            expandableBehavior.r((View) obj, view, ((FloatingActionButton) obj).t.a, false);
        }
        return false;
    }
}
