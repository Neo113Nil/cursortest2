package com.unity3d.player;

import android.view.WindowInsets;
import com.unity3d.player.UnityPlayer;

/* renamed from: com.unity3d.player.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0149o0 extends UnityPlayer.b {
    public final /* synthetic */ WindowInsets b;
    public final /* synthetic */ B0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0149o0(B0 b0, WindowInsets windowInsets) {
        super();
        this.c = b0;
        this.b = windowInsets;
    }

    @Override // com.unity3d.player.UnityPlayer.b
    public final void a() {
        this.c.a.nativeOnApplyWindowInsets(this.b);
    }
}
