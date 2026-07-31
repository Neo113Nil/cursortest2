package com.google.android.gms.internal.ads;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
final class zzgco extends ContinuationImpl {
    long zza;
    Object zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zzgdh zzd;
    int zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgco(zzgdh zzgdhVar, Continuation continuation) {
        super(continuation);
        this.zzd = zzgdhVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object zzB;
        this.zzc = obj;
        this.zze |= Integer.MIN_VALUE;
        zzB = this.zzd.zzB(0L, this);
        return zzB;
    }
}
