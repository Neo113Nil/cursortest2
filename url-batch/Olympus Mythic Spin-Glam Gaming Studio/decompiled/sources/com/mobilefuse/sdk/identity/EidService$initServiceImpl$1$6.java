package com.mobilefuse.sdk.identity;

import com.mobilefuse.sdk.exception.BaseError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: EidService.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mobilefuse/sdk/exception/BaseError;", "p1", "", "invoke", "(Lcom/mobilefuse/sdk/exception/BaseError;)V", "<anonymous>"}, k = 3, mv = {1, 4, 3})
/* loaded from: classes9.dex */
final /* synthetic */ class EidService$initServiceImpl$1$6 extends FunctionReferenceImpl implements Function1 {
    EidService$initServiceImpl$1$6(EidService eidService) {
        super(1, eidService, EidService.class, "onNewEidDataError", "onNewEidDataError$mobilefuse_sdk_core_release(Lcom/mobilefuse/sdk/exception/BaseError;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BaseError) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull BaseError p1) {
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((EidService) this.receiver).onNewEidDataError$mobilefuse_sdk_core_release(p1);
    }
}
