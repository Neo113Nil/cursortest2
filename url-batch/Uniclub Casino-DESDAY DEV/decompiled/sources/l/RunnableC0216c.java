package l;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0216c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2968a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f2969b;

    public /* synthetic */ RunnableC0216c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f2968a = i;
        this.f2969b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2968a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2969b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f1181w = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1182x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2969b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f1181w = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.f1182x);
                break;
        }
    }
}
