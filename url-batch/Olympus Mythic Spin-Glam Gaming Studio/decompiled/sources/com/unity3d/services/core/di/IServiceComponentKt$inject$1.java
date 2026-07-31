package com.unity3d.services.core.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: IServiceComponent.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes3.dex */
public final class IServiceComponentKt$inject$1 implements Function0 {
    final /* synthetic */ String $named;
    final /* synthetic */ IServiceComponent $this_inject;

    public IServiceComponentKt$inject$1(IServiceComponent iServiceComponent, String str) {
        this.$this_inject = iServiceComponent;
        this.$named = str;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final T mo4828invoke() {
        IServiceComponent iServiceComponent = this.$this_inject;
        String str = this.$named;
        IServicesRegistry registry = iServiceComponent.getServiceProvider().getRegistry();
        Intrinsics.reifiedOperationMarker(4, "T");
        return registry.getService(str, Reflection.getOrCreateKotlinClass(Object.class));
    }
}
