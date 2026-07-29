package o;

import android.view.ViewParent;

/* loaded from: classes.dex */
public final class W10 {
    public static final W10 a = new W10();

    public final void a(S2 s2) {
        ViewParent parent = s2.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(s2, s2);
        }
    }
}
