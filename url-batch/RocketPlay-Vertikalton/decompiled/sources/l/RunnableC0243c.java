package l;

import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0243c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3403a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f3404b;

    public /* synthetic */ RunnableC0243c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f3403a = i;
        this.f3404b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3403a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f3404b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f1715w = actionBarOverlayLayout.d.animate().translationY(RecyclerView.f1949A0).setListener(actionBarOverlayLayout.f1716x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3404b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f1715w = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.f1716x);
                break;
        }
    }
}
