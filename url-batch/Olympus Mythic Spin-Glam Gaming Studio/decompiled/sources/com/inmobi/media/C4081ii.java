package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ii, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4081ii {
    public final /* synthetic */ GestureDetectorOnGestureListenerC4476xi a;

    public C4081ii(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi) {
        this.a = gestureDetectorOnGestureListenerC4476xi;
    }

    public final void a(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        InterfaceC4466x9 interfaceC4466x9 = this.a.i;
        if (interfaceC4466x9 != null) {
            String str = GestureDetectorOnGestureListenerC4476xi.i1;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((C4493y9) interfaceC4466x9).a(str, "onCCTLifeCycleEvent");
        }
        this.a.c(jsonObject);
    }
}
