package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class Ii {
    public final L4 a;
    public final InterfaceC4111jm b;
    public final Rc c;

    public Ii(L4 contextualDataHandler, InterfaceC4111jm videoAdEventsInterface, Rc nativeAdUnitComponent) {
        Intrinsics.checkNotNullParameter(contextualDataHandler, "contextualDataHandler");
        Intrinsics.checkNotNullParameter(videoAdEventsInterface, "videoAdEventsInterface");
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        this.a = contextualDataHandler;
        this.b = videoAdEventsInterface;
        this.c = nativeAdUnitComponent;
    }
}
