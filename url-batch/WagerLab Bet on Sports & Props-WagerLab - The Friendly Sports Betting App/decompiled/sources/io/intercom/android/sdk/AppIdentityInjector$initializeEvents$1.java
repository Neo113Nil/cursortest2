package io.intercom.android.sdk;

import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.utilities.NexusClientUtilsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AppIdentityInjector.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.AppIdentityInjector$initializeEvents$1", f = "AppIdentityInjector.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class AppIdentityInjector$initializeEvents$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AppIdentityInjector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppIdentityInjector$initializeEvents$1(AppIdentityInjector appIdentityInjector, Continuation<? super AppIdentityInjector$initializeEvents$1> continuation) {
        super(2, continuation);
        this.this$0 = appIdentityInjector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppIdentityInjector$initializeEvents$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppIdentityInjector$initializeEvents$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Injector injector;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            injector = this.this$0.getInjector();
            IntercomDataLayer dataLayer = injector.getDataLayer();
            Intrinsics.checkNotNullExpressionValue(dataLayer, "getDataLayer(...)");
            NexusClient nexusClient = this.this$0.getNexusClient();
            Intrinsics.checkNotNull(nexusClient, "null cannot be cast to non-null type io.intercom.android.sdk.NexusWrapper");
            this.label = 1;
            if (NexusClientUtilsKt.handleNexusClientLifecycle(dataLayer, (NexusWrapper) nexusClient, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
