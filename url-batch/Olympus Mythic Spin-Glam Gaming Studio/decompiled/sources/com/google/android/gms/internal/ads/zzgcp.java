package com.google.android.gms.internal.ads;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
final class zzgcp extends ContinuationImpl {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzgdh zzc;
    int zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgcp(zzgdh zzgdhVar, Continuation continuation) {
        super(continuation);
        this.zzc = zzgdhVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object zzA;
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        zzA = this.zzc.zzA(this);
        return zzA;
    }
}
