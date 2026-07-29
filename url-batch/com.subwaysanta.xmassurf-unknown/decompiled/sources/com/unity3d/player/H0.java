package com.unity3d.player;

import com.unity3d.player.a.AbstractC0120t;

/* loaded from: classes.dex */
public final class H0 implements Runnable {
    public final /* synthetic */ UnityPlayerForActivityOrService a;

    public H0(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        this.a = unityPlayerForActivityOrService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        UnityPlayerForActivityOrService unityPlayerForActivityOrService = this.a;
        z = unityPlayerForActivityOrService.mMainDisplayOverride;
        if (z) {
            unityPlayerForActivityOrService.getFrameLayout().removeView(this.a.getView());
        } else if (unityPlayerForActivityOrService.getView().getParent() == null) {
            this.a.getFrameLayout().addView(this.a.getView());
        } else {
            AbstractC0120t.Log(5, "Couldn't add view, because it's already assigned to another parent");
        }
    }
}
