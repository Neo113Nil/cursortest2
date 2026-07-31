package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.pi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4265pi {
    public final /* synthetic */ GestureDetectorOnGestureListenerC4476xi a;

    public C4265pi(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi) {
        this.a = gestureDetectorOnGestureListenerC4476xi;
    }

    public final void a(C4097j8 obj) {
        Intrinsics.checkNotNullParameter(obj, "error");
        InterfaceC4466x9 interfaceC4466x9 = this.a.i;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).b("HtmlVideoPlayer", "onVideoLoadFailed " + ((int) obj.b));
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
        EnumC4465x8 enumC4465x8 = EnumC4465x8.d;
        Intrinsics.checkNotNullParameter(obj, "obj");
        gestureDetectorOnGestureListenerC4476xi.a(enumC4465x8, AbstractC4494ya.a(obj, obj.getClass()));
    }
}
