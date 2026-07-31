package yads;

import android.view.View;

/* loaded from: classes3.dex */
public final class wl3 implements p03 {
    @Override // yads.p03
    public final void a(View view) {
        view.setVisibility(0);
        view.setAlpha(0.4f);
        view.setEnabled(false);
    }

    @Override // yads.p03
    public final void b(View view) {
        view.setVisibility(0);
        view.animate().alpha(1.0f).setDuration(200L);
        view.setEnabled(true);
    }
}
