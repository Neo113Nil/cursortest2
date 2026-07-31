package com.inmobi.media;

/* renamed from: com.inmobi.media.gi, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4029gi implements InterfaceC4088j {
    public final /* synthetic */ GestureDetectorOnGestureListenerC4476xi a;

    public C4029gi(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi) {
        this.a = gestureDetectorOnGestureListenerC4476xi;
    }

    public final void a(Float f) {
        this.a.h("window.mraidview.broadcastEvent('audioVolumeChange', " + f + ");");
    }
}
