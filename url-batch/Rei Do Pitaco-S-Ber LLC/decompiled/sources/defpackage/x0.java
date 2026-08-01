package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class x0 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ ActionBarOverlayLayout g;

    public /* synthetic */ x0(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f = i;
        this.g = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        ActionBarOverlayLayout actionBarOverlayLayout = this.g;
        switch (i) {
            case 0:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.B = actionBarOverlayLayout.i.animate().translationY(0.0f).setListener(actionBarOverlayLayout.C);
                break;
            default:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.B = actionBarOverlayLayout.i.animate().translationY(-actionBarOverlayLayout.i.getHeight()).setListener(actionBarOverlayLayout.C);
                break;
        }
    }
}
