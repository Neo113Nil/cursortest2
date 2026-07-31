package com.inmobi.media;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;

/* loaded from: classes10.dex */
public final class Aa implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout a;
    public final InterfaceC4466x9 b;
    public int c;
    public int d;
    public final CompletableDeferred e;

    public Aa(FrameLayout view, InterfaceC4466x9 interfaceC4466x9) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.a = view;
        this.b = interfaceC4466x9;
        this.e = CompletableDeferredKt.CompletableDeferred(Unit.INSTANCE);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        try {
            InterfaceC4466x9 interfaceC4466x9 = this.b;
            if (interfaceC4466x9 != null) {
                String str = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x9).a(str, "close called");
            }
            this.c = N3.b(this.a.getWidth() / R5.b());
            this.d = N3.b(this.a.getHeight() / R5.b());
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            BuildersKt__Builders_commonKt.launch$default(L9.c, null, null, new C4520za(this, null), 3, null);
        } catch (Exception e) {
            InterfaceC4466x9 interfaceC4466x92 = this.b;
            if (interfaceC4466x92 != null) {
                String str2 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).b(str2, "SDK encountered unexpected error in JavaScriptBridge$1.onGlobalLayout(); " + e.getMessage());
            }
        }
    }
}
