package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.UUID;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Deferred;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.1 */
/* loaded from: classes4.dex */
public final class zzdc implements RecaptchaClient, RecaptchaTasksClient {
    private static final Regex zza = new Regex("^[a-zA-Z0-9/_]{0,100}$");
    private final zzcn zzb;
    private final String zzc;
    private final zzek zzd;
    private final zzbi zze;

    public zzdc(zzcn zzcnVar, String str, zzbi zzbiVar, zzek zzekVar) {
        this.zzb = zzcnVar;
        this.zzc = str;
        this.zze = zzbiVar;
        this.zzd = zzekVar;
    }

    public static final /* synthetic */ void zze(zzdc zzdcVar, long j, RecaptchaAction recaptchaAction) {
        zzbd zzbdVar = !zza.matches(recaptchaAction.getAction()) ? new zzbd(zzbb.zzg, zzba.zzh, null) : null;
        if (j < 5000) {
            zzbdVar = new zzbd(zzbb.zzb, zzba.zzI, null);
        }
        if (zzbdVar != null) {
            throw zzbdVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.recaptcha.internal.zzen] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzg(String str, Function2 function2, Continuation continuation) throws zzbd {
        zzdb zzdbVar;
        int i;
        try {
            if (continuation instanceof zzdb) {
                zzdbVar = (zzdb) continuation;
                int i2 = zzdbVar.zzc;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzdbVar.zzc = i2 - Integer.MIN_VALUE;
                    Object obj = zzdbVar.zza;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzdbVar.zzc;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        zzek zza2 = this.zzd.zza();
                        zza2.zzc(str);
                        zzen zzf = zza2.zzf(9);
                        zzdbVar.zzd = zzf;
                        zzdbVar.zzc = 1;
                        obj = function2.invoke(zza2, zzdbVar);
                        str = zzf;
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zzen zzenVar = zzdbVar.zzd;
                        ResultKt.throwOnFailure(obj);
                        str = zzenVar;
                    }
                    str.zza();
                    return obj;
                }
            }
            if (i != 0) {
            }
            str.zza();
            return obj;
        } catch (zzbd e) {
            str.zzb(e);
            throw e;
        } catch (Exception e2) {
            zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzX, e2.getMessage());
            str.zzb(zzbdVar);
            throw zzbdVar;
        }
        zzdbVar = new zzdb(this, continuation);
        Object obj2 = zzdbVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzdbVar.zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* renamed from: execute-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo10146execute0E7RQCE(RecaptchaAction recaptchaAction, long j, Continuation<? super Result<String>> continuation) {
        zzcw zzcwVar;
        int i;
        if (continuation instanceof zzcw) {
            zzcwVar = (zzcw) continuation;
            int i2 = zzcwVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzcwVar.zzc = i2 - Integer.MIN_VALUE;
                Object obj = zzcwVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzcwVar.zzc;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((Result) obj).getValue();
                }
                ResultKt.throwOnFailure(obj);
                zzcwVar.zzc = 1;
                Object zzf = zzf(recaptchaAction, j, zzcwVar);
                return zzf == coroutine_suspended ? coroutine_suspended : zzf;
            }
        }
        zzcwVar = new zzcw(this, continuation);
        Object obj2 = zzcwVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzcwVar.zzc;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* renamed from: execute-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo10147executegIAlus(RecaptchaAction recaptchaAction, Continuation<? super Result<String>> continuation) {
        zzcx zzcxVar;
        int i;
        if (continuation instanceof zzcx) {
            zzcxVar = (zzcx) continuation;
            int i2 = zzcxVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzcxVar.zzc = i2 - Integer.MIN_VALUE;
                Object obj = zzcxVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzcxVar.zzc;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((Result) obj).getValue();
                }
                ResultKt.throwOnFailure(obj);
                zzcxVar.zzc = 1;
                Object mo10146execute0E7RQCE = mo10146execute0E7RQCE(recaptchaAction, 10000L, zzcxVar);
                return mo10146execute0E7RQCE == coroutine_suspended ? coroutine_suspended : mo10146execute0E7RQCE;
            }
        }
        zzcxVar = new zzcx(this, continuation);
        Object obj2 = zzcxVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzcxVar.zzc;
        if (i == 0) {
        }
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        Deferred async$default;
        async$default = BuildersKt__Builders_commonKt.async$default(this.zze.zzb(), null, null, new zzda(this, recaptchaAction, 10000L, null), 3, null);
        return zzas.zza(async$default);
    }

    public final String zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction, long j) {
        Deferred async$default;
        async$default = BuildersKt__Builders_commonKt.async$default(this.zze.zzb(), null, null, new zzda(this, recaptchaAction, j, null), 3, null);
        return zzas.zza(async$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzf(RecaptchaAction recaptchaAction, long j, Continuation continuation) {
        zzcy zzcyVar;
        int i;
        String uuid;
        zzbd zzbdVar;
        if (continuation instanceof zzcy) {
            zzcyVar = (zzcy) continuation;
            int i2 = zzcyVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzcyVar.zzc = i2 - Integer.MIN_VALUE;
                Object obj = zzcyVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzcyVar.zzc;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        uuid = UUID.randomUUID().toString();
                    } catch (zzbd e) {
                        e = e;
                        zzbdVar = e;
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m12363constructorimpl(ResultKt.createFailure(zzbdVar.zzc()));
                    }
                    try {
                        Function2 zzczVar = new zzcz(this, j, recaptchaAction, uuid, null);
                        zzcyVar.zzc = 1;
                        obj = zzg(uuid, zzczVar, zzcyVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (zzbd e2) {
                        e = e2;
                        zzbdVar = e;
                        Result.Companion companion2 = Result.INSTANCE;
                        return Result.m12363constructorimpl(ResultKt.createFailure(zzbdVar.zzc()));
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (zzbd e3) {
                        zzbdVar = e3;
                        Result.Companion companion22 = Result.INSTANCE;
                        return Result.m12363constructorimpl(ResultKt.createFailure(zzbdVar.zzc()));
                    }
                }
                return ((Result) obj).getValue();
            }
        }
        zzcyVar = new zzcy(this, continuation);
        Object obj2 = zzcyVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzcyVar.zzc;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
