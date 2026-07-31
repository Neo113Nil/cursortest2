package com.google.android.gms.internal.ads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
final class zzgcu extends SuspendLambda implements Function2 {
    /* synthetic */ Object zza;
    final /* synthetic */ zzgbw zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgcu(zzgbw zzgbwVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzgbwVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzgcu zzgcuVar = new zzgcu(this.zzb, continuation);
        zzgcuVar.zza = obj;
        return zzgcuVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgcu) create((zzgca) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        zzgcc zza = zzgcb.zza((zzgby) ((zzgca) this.zza).zzcc());
        zziiq zzb = zza.zzb();
        zzgbw zzgbwVar = this.zzb;
        String zza2 = zzgbwVar.zza();
        Intrinsics.checkNotNullExpressionValue(zza2, "getGwsQueryId(...)");
        zza.zzc(zzb, zza2, zzgbwVar);
        return zza.zza();
    }
}
