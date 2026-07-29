package com.unity3d.player;

import android.view.ViewGroup;
import com.unity3d.player.a.C0108g;

/* loaded from: classes.dex */
public final class K0 implements Runnable {
    public final /* synthetic */ float a;
    public final /* synthetic */ UnityPlayerForActivityOrService b;

    public K0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, float f) {
        this.b = unityPlayerForActivityOrService;
        this.a = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T view = this.b.getView();
        if (view != null) {
            float f = this.a;
            C0108g c0108g = view.a;
            c0108g.a = f;
            ViewGroup.LayoutParams layoutParams = c0108g.getLayoutParams();
            if (f <= 0.0f) {
                layoutParams.width = -1;
                layoutParams.height = -1;
            } else {
                layoutParams.width = -2;
                layoutParams.height = -2;
            }
            c0108g.setLayoutParams(layoutParams);
        }
    }
}
