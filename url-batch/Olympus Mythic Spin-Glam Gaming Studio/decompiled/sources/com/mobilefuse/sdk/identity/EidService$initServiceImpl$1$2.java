package com.mobilefuse.sdk.identity;

import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: EidService.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/mobilefuse/sdk/identity/EidSdkData;", "p1", "", "Lcom/mobilefuse/sdk/identity/IdentifierUpdateSignal;", "p2", "", "invoke", "(Lcom/mobilefuse/sdk/identity/EidSdkData;Ljava/util/Set;)V", "<anonymous>"}, k = 3, mv = {1, 4, 3})
/* loaded from: classes9.dex */
final /* synthetic */ class EidService$initServiceImpl$1$2 extends FunctionReferenceImpl implements Function2 {
    EidService$initServiceImpl$1$2(EidService eidService) {
        super(2, eidService, EidService.class, "onEidRequest", "onEidRequest$mobilefuse_sdk_core_release(Lcom/mobilefuse/sdk/identity/EidSdkData;Ljava/util/Set;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((EidSdkData) obj, (Set<? extends IdentifierUpdateSignal>) obj2);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull EidSdkData p1, @NotNull Set<? extends IdentifierUpdateSignal> p2) {
        Intrinsics.checkNotNullParameter(p1, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        ((EidService) this.receiver).onEidRequest$mobilefuse_sdk_core_release(p1, p2);
    }
}
