package com.google.android.recaptcha.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.1 */
/* loaded from: classes4.dex */
final class zzdv extends ContinuationImpl {
    /* synthetic */ Object zza;
    final /* synthetic */ zzec zzb;
    int zzc;
    zzbn zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdv(zzec zzecVar, Continuation continuation) {
        super(continuation);
        this.zzb = zzecVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object zzl;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        zzl = this.zzb.zzl(null, this);
        return zzl;
    }
}
