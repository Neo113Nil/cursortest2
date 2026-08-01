package l;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0227c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2943a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f2944b;

    public /* synthetic */ RunnableC0227c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f2943a = i;
        this.f2944b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2943a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2944b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f1179w = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1180x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2944b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f1179w = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.f1180x);
                break;
        }
    }
}
