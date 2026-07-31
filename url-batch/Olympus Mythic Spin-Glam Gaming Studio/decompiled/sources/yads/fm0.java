package yads;

import android.view.View;

/* loaded from: classes14.dex */
public final class fm0 {
    public final void a(View view) {
        view.setAlpha(0.4f);
        view.setEnabled(false);
    }

    public final void b(View view) {
        view.animate().alpha(1.0f).setDuration(200L);
        view.setEnabled(true);
    }
}
