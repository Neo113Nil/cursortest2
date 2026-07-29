package com.unity3d.player;

import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.unity3d.player.a.AbstractC0104c;
import com.unity3d.player.a.AbstractC0120t;

/* renamed from: com.unity3d.player.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0123b0 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            ProgressBar progressBar = AbstractC0104c.b;
            if (progressBar != null) {
                if (AbstractC0104c.c != null) {
                    ViewGroup viewGroup = (ViewGroup) progressBar.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(AbstractC0104c.b);
                        viewGroup.removeView(AbstractC0104c.c);
                    }
                    AbstractC0104c.b = null;
                    AbstractC0104c.c = null;
                }
                AbstractC0104c.d = -1;
            }
        } catch (Exception e) {
            AbstractC0120t.Log(6, "Exception when hiding Activity Indicator " + e);
        }
    }
}
