package com.unity3d.player;

import com.unity3d.player.UnityPlayer;

/* renamed from: com.unity3d.player.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0171z0 extends UnityPlayer.b {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ UnityPlayerForActivityOrService c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0171z0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, boolean z) {
        super();
        this.c = unityPlayerForActivityOrService;
        this.b = z;
    }

    @Override // com.unity3d.player.UnityPlayer.b
    public final void a() {
        this.c.nativeSetKeyboardIsVisible(this.b);
    }
}
