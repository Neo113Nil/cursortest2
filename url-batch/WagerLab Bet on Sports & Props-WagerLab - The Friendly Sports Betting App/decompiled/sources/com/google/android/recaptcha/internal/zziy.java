package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.1 */
/* loaded from: classes4.dex */
final class zziy extends SuspendLambda implements Function2 {
    Object zza;
    Object zzb;
    Object zzc;
    Object zzd;
    int zze;
    final /* synthetic */ zzja zzf;
    final /* synthetic */ zzen zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zziy(zzja zzjaVar, zzen zzenVar, Continuation continuation) {
        super(2, continuation);
        this.zzf = zzjaVar;
        this.zzg = zzenVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zziy(this.zzf, this.zzg, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zziy) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00dd, code lost:
    
        r9.zzg.zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00e4, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c6, code lost:
    
        if (r9.zzf.zzA().await(r9) != r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a8, code lost:
    
        if (r10 != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r1 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00c8, code lost:
    
        r9.zze = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00da, code lost:
    
        if (r9.zzf.zzm().zzc(com.google.android.recaptcha.internal.zzje.zzc, r9) != r0) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzja zzjaVar;
        zzsc zzscVar;
        zzsc zzscVar2;
        zzsc zzscVar3;
        zzcg zzcgVar;
        zzja zzjaVar2;
        zzjh zzjhVar;
        zzjh zzjhVar2;
        zzsc zzscVar4;
        Object zzE;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zze;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            zzjaVar = this.zzf;
            zzscVar = zzjaVar.zzf;
            if (zzscVar == null) {
                zzscVar = null;
            }
            zzscVar2 = this.zzf.zzf;
            if (zzscVar2 == null) {
                zzscVar2 = null;
            }
            zzcg zzcgVar2 = new zzcg(zzscVar2.zzf());
            this.zza = zzjaVar;
            this.zzb = zzjaVar;
            this.zzc = zzscVar;
            this.zzd = zzcgVar2;
            this.zze = 1;
            Object zzw = this.zzf.zzw(this);
            if (zzw != coroutine_suspended) {
                zzscVar3 = zzscVar;
                obj = zzw;
                zzcgVar = zzcgVar2;
                zzjaVar2 = zzjaVar;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            ResultKt.throwOnFailure(obj);
            if (i != 2) {
            }
            Boxing.boxInt(this.zzf.zzA().hashCode());
            this.zze = 3;
        } else {
            zzcgVar = (zzcg) this.zzd;
            zzscVar3 = (zzsc) this.zzc;
            zzjaVar = (zzja) this.zzb;
            zzjaVar2 = (zzja) this.zza;
            ResultKt.throwOnFailure(obj);
        }
        zzjaVar2.zzb = zzjaVar.zzC(zzscVar3, zzcgVar, (WebView) obj);
        Boxing.boxInt(this.zzf.zzA().hashCode());
        zzjhVar = this.zzf.zzh;
        zzjhVar.zzd();
        zzjhVar2 = this.zzf.zzh;
        zzjhVar2.zze();
        zzja zzjaVar3 = this.zzf;
        zzscVar4 = zzjaVar3.zzf;
        if (zzscVar4 == null) {
            zzscVar4 = null;
        }
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = 2;
        zzE = zzjaVar3.zzE(zzscVar4, this);
    }
}
