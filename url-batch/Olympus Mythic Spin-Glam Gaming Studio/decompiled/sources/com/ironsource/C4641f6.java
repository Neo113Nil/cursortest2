package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.f6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4641f6 {
    @NotNull
    public final C4623e6 a(@NotNull InterfaceC4659g6 listener, @NotNull C4814p0 adTools, @NotNull C4671h0 adProperties, @NotNull InterfaceC4873s6 fullscreenAdUnitFactory) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
        return new C4623e6(listener, adTools, adProperties, null, fullscreenAdUnitFactory, 8, null);
    }
}
