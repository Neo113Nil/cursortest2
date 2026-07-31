package com.google.android.recaptcha.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.1 */
/* loaded from: classes4.dex */
public final class zzfj {
    private final Lazy zza;

    public zzfj() {
        int i = zzav.zza;
        this.zza = LazyKt.lazy(zzfi.zza);
    }

    public static final /* synthetic */ zzex zza(zzfj zzfjVar) {
        return (zzex) zzfjVar.zza.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object zzc(zzfj zzfjVar, zzbr zzbrVar, zzsp zzspVar, Continuation continuation) {
        zzfg zzfgVar;
        int i;
        if (continuation instanceof zzfg) {
            zzfgVar = (zzfg) continuation;
            int i2 = zzfgVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzfgVar.zzc = i2 - Integer.MIN_VALUE;
                Object obj = zzfgVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzfgVar.zzc;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                zzfh zzfhVar = new zzfh(zzfjVar, zzbrVar, zzspVar, null);
                zzfgVar.zzc = 1;
                Object coroutineScope = CoroutineScopeKt.coroutineScope(zzfhVar, zzfgVar);
                return coroutineScope == coroutine_suspended ? coroutine_suspended : coroutineScope;
            }
        }
        zzfgVar = new zzfg(zzfjVar, continuation);
        Object obj2 = zzfgVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzfgVar.zzc;
        if (i == 0) {
        }
    }

    public final Object zzb(zzbr zzbrVar, zzsp zzspVar, Continuation continuation) {
        return zzc(this, zzbrVar, zzspVar, continuation);
    }
}
