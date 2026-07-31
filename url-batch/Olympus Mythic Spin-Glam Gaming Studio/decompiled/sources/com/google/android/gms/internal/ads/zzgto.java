package com.google.android.gms.internal.ads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzgto extends SuspendLambda implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzgtm zzc;
    final /* synthetic */ Function2 zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgto(zzgtm zzgtmVar, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzgtmVar;
        this.zzd = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzgto zzgtoVar = new zzgto(this.zzc, this.zzd, continuation);
        zzgtoVar.zze = obj;
        return zzgtoVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgto) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
    
        if (r4 != r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Function2 function2;
        Mutex zza;
        Object zze;
        Mutex mutex;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zzb;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScopeKt.ensureActive((CoroutineScope) this.zze);
                zzgtm zzgtmVar = this.zzc;
                function2 = this.zzd;
                zza = zzgtmVar.zza();
                this.zze = zza;
                this.zza = function2;
                this.zzb = 1;
                zze = zzgtp.zze(zza, this);
            } else {
                if (i != 1) {
                    mutex = (Mutex) this.zze;
                    try {
                        ResultKt.throwOnFailure(obj);
                        Mutex.DefaultImpls.unlock$default(mutex, null, 1, null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        Mutex.DefaultImpls.unlock$default(mutex, null, 1, null);
                        throw th;
                    }
                }
                function2 = (Function2) this.zza;
                Mutex mutex2 = (Mutex) this.zze;
                ResultKt.throwOnFailure(obj);
                zza = mutex2;
            }
            this.zze = zza;
            this.zza = null;
            this.zzb = 2;
            Object coroutineScope = CoroutineScopeKt.coroutineScope(function2, this);
            if (coroutineScope != coroutine_suspended) {
                mutex = zza;
                obj = coroutineScope;
                Mutex.DefaultImpls.unlock$default(mutex, null, 1, null);
                return obj;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            mutex = zza;
            th = th3;
            Mutex.DefaultImpls.unlock$default(mutex, null, 1, null);
            throw th;
        }
    }
}
