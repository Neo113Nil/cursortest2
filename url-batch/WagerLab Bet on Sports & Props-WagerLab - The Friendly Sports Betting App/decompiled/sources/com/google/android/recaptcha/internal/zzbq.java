package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.1 */
/* loaded from: classes4.dex */
public final class zzbq {
    public static final zzbq zza = new zzbq();

    private zzbq() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r7, r1) != r3) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00ae -> B:11:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(Function1 function1, long j, long j2, double d, Function1 function12, Continuation continuation) {
        zzbp zzbpVar;
        int i;
        long j3;
        long j4;
        double d2;
        Function1 function13;
        zzbp zzbpVar2;
        Function1 function14;
        Function1 function15;
        long j5;
        double d3;
        Exception e;
        if (continuation instanceof zzbp) {
            zzbpVar = (zzbp) continuation;
            int i2 = zzbpVar.zzh;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzbpVar.zzh = i2 - Integer.MIN_VALUE;
                Object obj = zzbpVar.zzf;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzbpVar.zzh;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    j3 = j;
                    j4 = j2;
                    d2 = d;
                    function13 = function12;
                    zzbpVar2 = zzbpVar;
                    function14 = function1;
                    zzbpVar2.zza = function14;
                    zzbpVar2.zzb = function13;
                    zzbpVar2.zzc = j4;
                    zzbpVar2.zze = d2;
                    zzbpVar2.zzd = j3;
                    zzbpVar2.zzh = 1;
                    Object invoke = function13.invoke(zzbpVar2);
                    if (invoke != coroutine_suspended) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j3 = zzbpVar.zzd;
                        d3 = zzbpVar.zze;
                        j5 = zzbpVar.zzc;
                        function13 = (Function1) zzbpVar.zzb;
                        function15 = (Function1) zzbpVar.zza;
                        ResultKt.throwOnFailure(obj);
                        Function1 function16 = function15;
                        zzbpVar2 = zzbpVar;
                        function14 = function16;
                        long j6 = j5;
                        d2 = d3;
                        j4 = j6;
                        try {
                        } catch (Exception e2) {
                            e = e2;
                            zzbp zzbpVar3 = zzbpVar2;
                            function15 = function14;
                            zzbpVar = zzbpVar3;
                            double d4 = d2;
                            j5 = j4;
                            d3 = d4;
                            if (((Boolean) function15.invoke(e)).booleanValue()) {
                            }
                        }
                        zzbpVar2.zza = function14;
                        zzbpVar2.zzb = function13;
                        zzbpVar2.zzc = j4;
                        zzbpVar2.zze = d2;
                        zzbpVar2.zzd = j3;
                        zzbpVar2.zzh = 1;
                        Object invoke2 = function13.invoke(zzbpVar2);
                        return invoke2 != coroutine_suspended ? coroutine_suspended : invoke2;
                    }
                    j3 = zzbpVar.zzd;
                    d3 = zzbpVar.zze;
                    j5 = zzbpVar.zzc;
                    function13 = (Function1) zzbpVar.zzb;
                    function15 = (Function1) zzbpVar.zza;
                    try {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    } catch (Exception e3) {
                        e = e3;
                        if (((Boolean) function15.invoke(e)).booleanValue()) {
                            throw e;
                        }
                        j3 = RangesKt.coerceAtMost((long) (j3 * d3), j5);
                        zzbpVar.zza = function15;
                        zzbpVar.zzb = function13;
                        zzbpVar.zzc = j5;
                        zzbpVar.zze = d3;
                        zzbpVar.zzd = j3;
                        zzbpVar.zzh = 2;
                    }
                }
            }
        }
        zzbpVar = new zzbp(this, continuation);
        Object obj2 = zzbpVar.zzf;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzbpVar.zzh;
        if (i != 0) {
        }
    }
}
