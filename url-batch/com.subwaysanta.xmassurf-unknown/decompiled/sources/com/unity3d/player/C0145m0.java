package com.unity3d.player;

import com.unity3d.player.UnityPlayer;

/* renamed from: com.unity3d.player.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0145m0 extends UnityPlayer.b {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ C0147n0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0145m0(C0147n0 c0147n0, boolean z) {
        super();
        this.c = c0147n0;
        this.b = z;
    }

    @Override // com.unity3d.player.UnityPlayer.b
    public final void a() {
        UnityPlayer.permissionResponseToNative(this.c.a, this.b);
    }
}
