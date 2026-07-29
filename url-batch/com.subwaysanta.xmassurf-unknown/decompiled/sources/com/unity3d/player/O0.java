package com.unity3d.player;

import com.unity3d.player.UnityPlayer;

/* loaded from: classes.dex */
public final class O0 extends UnityPlayer.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ UnityPlayerForGameActivity d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(UnityPlayerForGameActivity unityPlayerForGameActivity, int i, int i2) {
        super();
        this.d = unityPlayerForGameActivity;
        this.b = i;
        this.c = i2;
    }

    @Override // com.unity3d.player.UnityPlayer.b
    public final void a() {
        this.d.nativeOrientationChanged(this.b, this.c);
    }
}
