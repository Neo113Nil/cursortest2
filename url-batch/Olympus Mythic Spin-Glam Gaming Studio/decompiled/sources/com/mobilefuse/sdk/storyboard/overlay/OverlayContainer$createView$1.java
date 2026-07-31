package com.mobilefuse.sdk.storyboard.overlay;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OverlayContainer.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 3})
/* loaded from: classes10.dex */
final /* synthetic */ class OverlayContainer$createView$1 extends FunctionReferenceImpl implements Function0 {
    OverlayContainer$createView$1(OverlayContainer overlayContainer) {
        super(0, overlayContainer, OverlayContainer.class, "removeView", "removeView()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo4828invoke() {
        invoke();
        return Unit.INSTANCE;
    }

    public final void invoke() {
        ((OverlayContainer) this.receiver).removeView();
    }
}
