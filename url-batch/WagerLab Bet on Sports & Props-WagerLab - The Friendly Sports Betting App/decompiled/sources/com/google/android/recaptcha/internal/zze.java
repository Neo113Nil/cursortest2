package com.google.android.recaptcha.internal;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.TimeoutKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.1 */
/* loaded from: classes4.dex */
public abstract class zze {
    private boolean zza;

    protected zzen zza(String str) {
        throw null;
    }

    protected zzen zzb() {
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|(1:(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(4:21|22|23|24))(5:44|45|46|(1:48)|20)|25|26|(1:28)|29|30))|52|6|(0)(0)|25|26|(0)|29|30|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e4, code lost:
    
        if (r0 != r5) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a8, code lost:
    
        r16 = r3;
        r4 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f A[Catch: Exception -> 0x00a7, TryCatch #2 {Exception -> 0x00a7, blocks: (B:26:0x0092, B:28:0x009f, B:29:0x00a2), top: B:25:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(String str, long j, Continuation continuation) throws zzbd {
        zza zzaVar;
        int i;
        zzen zza;
        Exception exc;
        long j2;
        zzen zzenVar;
        zze zzeVar;
        zze zzeVar2;
        String str2;
        zze zzeVar3;
        String str3;
        String str4 = str;
        long j3 = j;
        if (continuation instanceof zza) {
            zzaVar = (zza) continuation;
            int i2 = zzaVar.zze;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzaVar.zze = i2 - Integer.MIN_VALUE;
                zza zzaVar2 = zzaVar;
                Object obj = zzaVar2.zzc;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzaVar2.zze;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    zza = zza(str);
                    try {
                        zzb zzbVar = new zzb(this, str4, null);
                        zzaVar2.zza = this;
                        zzaVar2.zzf = str4;
                        zzaVar2.zzg = zza;
                        zzaVar2.zzb = j3;
                        zzaVar2.zze = 1;
                        obj = TimeoutKt.withTimeout(j3, zzbVar, zzaVar2);
                        if (obj != coroutine_suspended) {
                            zzeVar2 = this;
                        }
                    } catch (Exception e) {
                        exc = e;
                        j2 = j3;
                        zzenVar = zza;
                        zzeVar = this;
                        zzbd zza2 = zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzaa, exc.getMessage()));
                        if (zzenVar != null) {
                            zzenVar.zzb(zza2);
                        }
                        zzaVar2.zza = zzeVar;
                        zzaVar2.zzf = str4;
                        zzaVar2.zzg = null;
                        zzaVar2.zze = 2;
                        str2 = str4;
                        if (zzeVar.zzi(str2, j2, exc, zzaVar2) != coroutine_suspended) {
                            zzeVar3 = zzeVar;
                            str3 = str2;
                            Result.Companion companion = Result.INSTANCE;
                            zzaVar2.zza = null;
                            zzaVar2.zzf = null;
                            zzaVar2.zze = 3;
                            obj = zzeVar3.zzd(str3, zzaVar2);
                        }
                        return coroutine_suspended;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    long j4 = zzaVar2.zzb;
                    zzenVar = zzaVar2.zzg;
                    String str5 = zzaVar2.zzf;
                    zzeVar2 = (zze) zzaVar2.zza;
                    try {
                        ResultKt.throwOnFailure(obj);
                        zza = zzenVar;
                        j3 = j4;
                        str4 = str5;
                    } catch (Exception e2) {
                        Exception e3 = e2;
                        long j5 = j4;
                        str4 = str5;
                        zzeVar = zzeVar2;
                        j2 = j5;
                        exc = e3;
                        zzbd zza22 = zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzaa, exc.getMessage()));
                        if (zzenVar != null) {
                        }
                        zzaVar2.zza = zzeVar;
                        zzaVar2.zzf = str4;
                        zzaVar2.zzg = null;
                        zzaVar2.zze = 2;
                        str2 = str4;
                        if (zzeVar.zzi(str2, j2, exc, zzaVar2) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Result.m12363constructorimpl(obj);
                    }
                    str3 = zzaVar2.zzf;
                    zzeVar3 = (zze) zzaVar2.zza;
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion2 = Result.INSTANCE;
                    zzaVar2.zza = null;
                    zzaVar2.zzf = null;
                    zzaVar2.zze = 3;
                    obj = zzeVar3.zzd(str3, zzaVar2);
                }
                Object value = ((Result) obj).getValue();
                ResultKt.throwOnFailure(value);
                zzsi zzsiVar = (zzsi) value;
                if (zza != null) {
                    zza.zza();
                }
                return Result.m12363constructorimpl(zzsiVar);
            }
        }
        zzaVar = new zza(this, continuation);
        zza zzaVar22 = zzaVar;
        Object obj2 = zzaVar22.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzaVar22.zze;
        if (i != 0) {
        }
        Object value2 = ((Result) obj2).getValue();
        ResultKt.throwOnFailure(value2);
        zzsi zzsiVar2 = (zzsi) value2;
        if (zza != null) {
        }
        return Result.m12363constructorimpl(zzsiVar2);
    }

    protected abstract Object zzd(String str, Continuation continuation);

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b0, code lost:
    
        if (r11 != r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097 A[Catch: Exception -> 0x0058, TryCatch #1 {Exception -> 0x0058, blocks: (B:27:0x0054, B:28:0x0088, B:30:0x0097, B:31:0x009a), top: B:26:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zze(long j, zzsc zzscVar, Continuation continuation) throws zzbd {
        zzc zzcVar;
        int i;
        Exception e;
        zze zzeVar;
        zzen zzenVar;
        Object obj;
        Object obj2;
        zzbd zzbdVar;
        if (continuation instanceof zzc) {
            zzcVar = (zzc) continuation;
            int i2 = zzcVar.zzd;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzcVar.zzd = i2 - Integer.MIN_VALUE;
                Object obj3 = zzcVar.zzb;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzcVar.zzd;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj3);
                    zzen zzb = zzb();
                    if (this.zza) {
                        zzb.zza();
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m12363constructorimpl(Unit.INSTANCE);
                    }
                    try {
                        zzd zzdVar = new zzd(this, zzscVar, null);
                        zzcVar.zza = this;
                        zzcVar.zze = zzb;
                        zzcVar.zzd = 1;
                        Object withTimeout = TimeoutKt.withTimeout(j, zzdVar, zzcVar);
                        if (withTimeout != coroutine_suspended) {
                            obj = withTimeout;
                            zzenVar = zzb;
                            zzeVar = this;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        zzeVar = this;
                        zzenVar = zzb;
                        zzeVar.zza = false;
                        zzcVar.zza = zzeVar;
                        zzcVar.zze = zzenVar;
                        zzcVar.zzd = 2;
                        Object zzj = zzeVar.zzj(e, zzcVar);
                        obj2 = zzj;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zzbdVar = (zzbd) zzcVar.zza;
                        ResultKt.throwOnFailure(obj3);
                        Result.Companion companion2 = Result.INSTANCE;
                        return Result.m12363constructorimpl(ResultKt.createFailure(zzbdVar));
                    }
                    zzenVar = zzcVar.zze;
                    zzeVar = (zze) zzcVar.zza;
                    ResultKt.throwOnFailure(obj3);
                    obj2 = obj3;
                    zzbd zzbdVar2 = (zzbd) obj2;
                    if (zzenVar != null) {
                        zzenVar.zzb(zzbdVar2);
                    }
                    zzcVar.zza = zzbdVar2;
                    zzcVar.zze = null;
                    zzcVar.zzd = 3;
                    if (zzeVar.zzg(zzbdVar2, zzcVar) != coroutine_suspended) {
                        zzbdVar = zzbdVar2;
                        Result.Companion companion22 = Result.INSTANCE;
                        return Result.m12363constructorimpl(ResultKt.createFailure(zzbdVar));
                    }
                    return coroutine_suspended;
                }
                zzenVar = zzcVar.zze;
                zzeVar = (zze) zzcVar.zza;
                try {
                    ResultKt.throwOnFailure(obj3);
                    obj = obj3;
                } catch (Exception e3) {
                    e = e3;
                    zzeVar.zza = false;
                    zzcVar.zza = zzeVar;
                    zzcVar.zze = zzenVar;
                    zzcVar.zzd = 2;
                    Object zzj2 = zzeVar.zzj(e, zzcVar);
                    obj2 = zzj2;
                }
                ResultKt.throwOnFailure(((Result) obj).getValue());
                Unit unit = Unit.INSTANCE;
                zzeVar.zza = true;
                if (zzenVar != null) {
                    zzenVar.zza();
                }
                return Result.m12363constructorimpl(unit);
            }
        }
        zzcVar = new zzc(this, continuation);
        Object obj32 = zzcVar.zzb;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzcVar.zzd;
        if (i != 0) {
        }
        ResultKt.throwOnFailure(((Result) obj).getValue());
        Unit unit2 = Unit.INSTANCE;
        zzeVar.zza = true;
        if (zzenVar != null) {
        }
        return Result.m12363constructorimpl(unit2);
    }

    protected abstract Object zzf(String str, Continuation continuation) throws zzbd;

    protected Object zzg(zzbd zzbdVar, Continuation continuation) {
        return Unit.INSTANCE;
    }

    protected abstract Object zzh(zzsc zzscVar, Continuation continuation) throws zzbd;

    protected Object zzi(String str, long j, Exception exc, Continuation continuation) {
        return Unit.INSTANCE;
    }

    protected Object zzj(Exception exc, Continuation continuation) {
        return zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzap, exc.getMessage()));
    }

    protected void zzk(zzsr zzsrVar) {
    }

    public final boolean zzl() {
        return this.zza;
    }
}
