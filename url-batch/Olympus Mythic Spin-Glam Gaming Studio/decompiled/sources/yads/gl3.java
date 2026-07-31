package yads;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* loaded from: classes4.dex */
public final class gl3 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ViewTreeObserver.OnPreDrawListener a;
    public final /* synthetic */ ViewGroup b;

    public gl3(ViewTreeObserver.OnPreDrawListener onPreDrawListener, ViewGroup viewGroup) {
        this.a = onPreDrawListener;
        this.b = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.onPreDraw();
        this.b.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
