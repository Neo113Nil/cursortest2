package com.unity3d.player;

import android.content.Context;
import android.widget.FrameLayout;
import com.unity3d.player.a.C0108g;

/* loaded from: classes.dex */
public final class T extends FrameLayout {
    public final C0108g a;
    public final UnityPlayerForActivityOrService b;
    public final com.unity3d.player.a.C c;

    public T(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(unityPlayerForActivityOrService.getContext());
        Context context = unityPlayerForActivityOrService.getContext();
        this.c = new com.unity3d.player.a.C(context);
        this.b = unityPlayerForActivityOrService;
        C0108g c0108g = new C0108g(unityPlayerForActivityOrService);
        this.a = c0108g;
        c0108g.setId(context.getResources().getIdentifier("unitySurfaceView", "id", context.getPackageName()));
        unityPlayerForActivityOrService.applySurfaceViewSettings(c0108g);
        c0108g.getHolder().addCallback(new S(this));
        c0108g.setFocusable(true);
        c0108g.setFocusableInTouchMode(true);
        c0108g.setContentDescription(context.getResources().getString(context.getResources().getIdentifier("game_view_content_description", "string", context.getPackageName())));
        addView(c0108g, new FrameLayout.LayoutParams(-1, -1, 17));
    }
}
