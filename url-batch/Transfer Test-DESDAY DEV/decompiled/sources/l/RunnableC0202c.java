package l;

import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0202c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2980a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f2981b;

    public /* synthetic */ RunnableC0202c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f2980a = i;
        this.f2981b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2980a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2981b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f1326w = actionBarOverlayLayout.d.animate().translationY(RecyclerView.f1570A0).setListener(actionBarOverlayLayout.f1327x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2981b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f1326w = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.f1327x);
                break;
        }
    }
}
