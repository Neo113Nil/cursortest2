package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* compiled from: AndroidSessionRepository.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "", "sdkConfig", "isInit"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$persistedNativeConfiguration$1", f = "AndroidSessionRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class AndroidSessionRepository$persistedNativeConfiguration$1 extends SuspendLambda implements Function3 {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    AndroidSessionRepository$persistedNativeConfiguration$1(Continuation continuation) {
        super(3, continuation);
    }

    public final Object invoke(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, boolean z, Continuation continuation) {
        AndroidSessionRepository$persistedNativeConfiguration$1 androidSessionRepository$persistedNativeConfiguration$1 = new AndroidSessionRepository$persistedNativeConfiguration$1(continuation);
        androidSessionRepository$persistedNativeConfiguration$1.L$0 = nativeConfiguration;
        androidSessionRepository$persistedNativeConfiguration$1.Z$0 = z;
        return androidSessionRepository$persistedNativeConfiguration$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((NativeConfigurationOuterClass.NativeConfiguration) obj, ((Boolean) obj2).booleanValue(), (Continuation) obj3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return TuplesKt.to((NativeConfigurationOuterClass.NativeConfiguration) this.L$0, Boxing.boxBoolean(this.Z$0));
    }
}
