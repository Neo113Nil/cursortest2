package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.qi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4291qi implements B {
    public final /* synthetic */ GestureDetectorOnGestureListenerC4476xi a;

    public C4291qi(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi) {
        this.a = gestureDetectorOnGestureListenerC4476xi;
    }

    public final void a() {
        InterfaceC4466x9 interfaceC4466x9 = this.a.i;
        if (interfaceC4466x9 != null) {
            String str = GestureDetectorOnGestureListenerC4476xi.i1;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((C4493y9) interfaceC4466x9).a(str, "onAdScreenDisplayFailed");
        }
        this.a.getListener().c();
    }

    public final void b() {
        InterfaceC4466x9 interfaceC4466x9 = this.a.i;
        if (interfaceC4466x9 != null) {
            String str = GestureDetectorOnGestureListenerC4476xi.i1;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((C4493y9) interfaceC4466x9).a(str, "onAdScreenDisplayed");
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
        if (gestureDetectorOnGestureListenerC4476xi.b == 0) {
            gestureDetectorOnGestureListenerC4476xi.Q = false;
        }
        gestureDetectorOnGestureListenerC4476xi.getListener().f(this.a);
    }
}
