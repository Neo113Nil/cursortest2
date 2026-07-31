package com.mobilefuse.sdk.ad.rendering.splashad;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SplashAdController.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 3})
/* loaded from: classes8.dex */
final /* synthetic */ class SplashAdController$onAdCloseRequested$1$2$1 extends FunctionReferenceImpl implements Function0 {
    SplashAdController$onAdCloseRequested$1$2$1(SplashAdController splashAdController) {
        super(0, splashAdController, SplashAdController.class, "onAdReadyToClose", "onAdReadyToClose()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo4828invoke() {
        invoke();
        return Unit.INSTANCE;
    }

    public final void invoke() {
        ((SplashAdController) this.receiver).onAdReadyToClose();
    }
}
