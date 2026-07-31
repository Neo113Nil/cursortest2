package com.google.android.recaptcha.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.1 */
/* loaded from: classes4.dex */
final class zzio extends ContinuationImpl {
    /* synthetic */ Object zza;
    final /* synthetic */ zzja zzb;
    int zzc;
    zzja zzd;
    String zze;
    String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzio(zzja zzjaVar, Continuation continuation) {
        super(continuation);
        this.zzb = zzjaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object zzF;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        zzF = this.zzb.zzF(null, this);
        return zzF;
    }
}
