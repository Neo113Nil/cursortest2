package yads;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

/* loaded from: classes9.dex */
public final class rz1 implements pz1 {
    @Override // yads.pz1
    public final View a(ViewGroup viewGroup) {
        return viewGroup.findViewWithTag("close");
    }

    @Override // yads.pz1
    public final ProgressBar b(ViewGroup viewGroup) {
        return (ProgressBar) viewGroup.findViewWithTag("close_progress_view");
    }
}
