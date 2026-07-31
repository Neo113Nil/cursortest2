package com.google.android.gms.internal.ads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
final class zzgdb extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzgdh zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgdb(zzgdh zzgdhVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzgdhVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzgdb(this.zzb, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgdb) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object zzs;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        ResultKt.throwOnFailure(obj);
        if (i == 0) {
            zzgdh zzgdhVar = this.zzb;
            this.zza = 1;
            zzs = zzgdhVar.zzs(this);
            if (zzs == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
