package o;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: o.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1403l1 implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ ActionBarOverlayLayout i;

    public /* synthetic */ RunnableC1403l1(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.h = i;
        this.i = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.h) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.i;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.D = actionBarOverlayLayout.k.animate().translationY(0.0f).setListener(actionBarOverlayLayout.E);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.i;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.D = actionBarOverlayLayout2.k.animate().translationY(-actionBarOverlayLayout2.k.getHeight()).setListener(actionBarOverlayLayout2.E);
                break;
        }
    }
}
