package com.google.android.gms.internal.ads;

import androidx.datastore.core.DataStore;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzgdh implements zzgbx {

    @NotNull
    private final CoroutineScope zza;

    @NotNull
    private final zzgtm zzb;

    @NotNull
    private final Mutex zzc;

    @NotNull
    private final Mutex zzd;

    @NotNull
    private final Mutex zze;
    private boolean zzf;
    private zzgbv zzg;
    private boolean zzh;

    @NotNull
    private final DataStore zzi;

    @NotNull
    private final zzdxu zzj;

    public zzgdh(@NotNull DataStore adQualityDataStore, @NotNull zzgcj coroutineScopeProvider, @NotNull zzdxu dataPinger, @NotNull zzgcg clock) {
        Intrinsics.checkNotNullParameter(adQualityDataStore, "adQualityDataStore");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        Intrinsics.checkNotNullParameter(dataPinger, "dataPinger");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.zzj = dataPinger;
        this.zza = coroutineScopeProvider.zza();
        this.zzb = new zzgtm();
        this.zzc = MutexKt.Mutex$default(false, 1, null);
        this.zzd = MutexKt.Mutex$default(false, 1, null);
        this.zze = MutexKt.Mutex$default(false, 1, null);
        this.zzi = adQualityDataStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0051, code lost:
    
        if (r8.lock(null, r0) != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzA(Continuation continuation) {
        zzgcp zzgcpVar;
        Object coroutine_suspended;
        int i;
        Mutex mutex;
        Mutex mutex2;
        Throwable th;
        Object updateData;
        try {
            if (continuation instanceof zzgcp) {
                zzgcpVar = (zzgcp) continuation;
                int i2 = zzgcpVar.zzd;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgcpVar.zzd = i2 - Integer.MIN_VALUE;
                    Object obj = zzgcpVar.zzb;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgcpVar.zzd;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zze;
                        zzgcpVar.zza = mutex;
                        zzgcpVar.zzd = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex2 = (Mutex) zzgcpVar.zza;
                            try {
                                ResultKt.throwOnFailure(obj);
                                mutex2.unlock(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        Mutex mutex3 = (Mutex) zzgcpVar.zza;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex3;
                    }
                    DataStore dataStore = this.zzi;
                    zzgcq zzgcqVar = new zzgcq(null);
                    zzgcpVar.zza = mutex;
                    zzgcpVar.zzd = 2;
                    updateData = dataStore.updateData(zzgcqVar, zzgcpVar);
                    if (updateData != coroutine_suspended) {
                        mutex2 = mutex;
                        obj = updateData;
                        mutex2.unlock(null);
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
            }
            DataStore dataStore2 = this.zzi;
            zzgcq zzgcqVar2 = new zzgcq(null);
            zzgcpVar.zza = mutex;
            zzgcpVar.zzd = 2;
            updateData = dataStore2.updateData(zzgcqVar2, zzgcpVar);
            if (updateData != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
        zzgcpVar = new zzgcp(this, continuation);
        Object obj2 = zzgcpVar.zzb;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgcpVar.zzd;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[Catch: all -> 0x0055, TRY_ENTER, TryCatch #0 {all -> 0x0055, blocks: (B:11:0x004a, B:14:0x0050, B:15:0x0057, B:17:0x005b, B:18:0x005f, B:20:0x0068, B:21:0x006c), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:11:0x004a, B:14:0x0050, B:15:0x0057, B:17:0x005b, B:18:0x005f, B:20:0x0068, B:21:0x006c), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:11:0x004a, B:14:0x0050, B:15:0x0057, B:17:0x005b, B:18:0x005f, B:20:0x0068, B:21:0x006c), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzB(long j, Continuation continuation) {
        zzgco zzgcoVar;
        int i;
        Mutex mutex;
        zzgbv zzgbvVar;
        zzgbv zzgbvVar2;
        zzgbv zzgbvVar3;
        try {
            if (continuation instanceof zzgco) {
                zzgcoVar = (zzgco) continuation;
                int i2 = zzgcoVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgcoVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzgcoVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgcoVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.zzc;
                        zzgcoVar.zzb = mutex2;
                        zzgcoVar.zza = j;
                        zzgcoVar.zze = 1;
                        if (mutex2.lock(null, zzgcoVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = zzgcoVar.zza;
                        mutex = (Mutex) zzgcoVar.zzb;
                        ResultKt.throwOnFailure(obj);
                    }
                    zzgbvVar = this.zzg;
                    if (zzgbvVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgbvVar = null;
                    }
                    zzgbvVar2 = this.zzg;
                    if (zzgbvVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgbvVar2 = null;
                    }
                    long zzi = j - zzgbvVar2.zzi();
                    zzgbvVar3 = this.zzg;
                    if (zzgbvVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgbvVar3 = null;
                    }
                    zzgbvVar.zzb(zzi - zzgbvVar3.zzg());
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            zzgbvVar = this.zzg;
            if (zzgbvVar == null) {
            }
            zzgbvVar2 = this.zzg;
            if (zzgbvVar2 == null) {
            }
            long zzi2 = j - zzgbvVar2.zzi();
            zzgbvVar3 = this.zzg;
            if (zzgbvVar3 == null) {
            }
            zzgbvVar.zzb(zzi2 - zzgbvVar3.zzg());
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        zzgcoVar = new zzgco(this, continuation);
        Object obj2 = zzgcoVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgcoVar.zze;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0061, code lost:
    
        if (r2.lock(null, r0) != r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067 A[Catch: all -> 0x006e, TryCatch #2 {all -> 0x006e, blocks: (B:35:0x0063, B:37:0x0067, B:38:0x0070), top: B:34:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzC(Continuation continuation) {
        zzgct zzgctVar;
        Object coroutine_suspended;
        int i;
        Mutex mutex;
        zzgbv zzgbvVar;
        Mutex mutex2;
        zzgbw zzgbwVar;
        Mutex mutex3;
        try {
            if (continuation instanceof zzgct) {
                zzgctVar = (zzgct) continuation;
                int i2 = zzgctVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgctVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzgctVar.zzc;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgctVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zzc;
                        zzgctVar.zza = mutex;
                        zzgctVar.zze = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                mutex3 = (Mutex) zzgctVar.zza;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    mutex3.unlock(null);
                                    return Unit.INSTANCE;
                                } catch (Throwable th) {
                                    th = th;
                                    mutex3.unlock(null);
                                    throw th;
                                }
                            }
                            mutex2 = (Mutex) zzgctVar.zzb;
                            zzgbwVar = (zzgbw) zzgctVar.zza;
                            ResultKt.throwOnFailure(obj);
                            try {
                                DataStore dataStore = this.zzi;
                                zzgcu zzgcuVar = new zzgcu(zzgbwVar, null);
                                zzgctVar.zza = mutex2;
                                zzgctVar.zzb = null;
                                zzgctVar.zze = 3;
                                obj = dataStore.updateData(zzgcuVar, zzgctVar);
                                if (obj != coroutine_suspended) {
                                    mutex3 = mutex2;
                                    mutex3.unlock(null);
                                    return Unit.INSTANCE;
                                }
                                return coroutine_suspended;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex3 = mutex2;
                                mutex3.unlock(null);
                                throw th;
                            }
                        }
                        mutex = (Mutex) zzgctVar.zza;
                        ResultKt.throwOnFailure(obj);
                    }
                    zzgbvVar = this.zzg;
                    if (zzgbvVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgbvVar = null;
                    }
                    zzgbw zzgbwVar2 = (zzgbw) zzgbvVar.zzbu();
                    mutex.unlock(null);
                    Intrinsics.checkNotNull(zzgbwVar2);
                    mutex2 = this.zze;
                    zzgctVar.zza = zzgbwVar2;
                    zzgctVar.zzb = mutex2;
                    zzgctVar.zze = 2;
                    if (mutex2.lock(null, zzgctVar) != coroutine_suspended) {
                        zzgbwVar = zzgbwVar2;
                        DataStore dataStore2 = this.zzi;
                        zzgcu zzgcuVar2 = new zzgcu(zzgbwVar, null);
                        zzgctVar.zza = mutex2;
                        zzgctVar.zzb = null;
                        zzgctVar.zze = 3;
                        obj = dataStore2.updateData(zzgcuVar2, zzgctVar);
                        if (obj != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
            }
            zzgbvVar = this.zzg;
            if (zzgbvVar == null) {
            }
            zzgbw zzgbwVar22 = (zzgbw) zzgbvVar.zzbu();
            mutex.unlock(null);
            Intrinsics.checkNotNull(zzgbwVar22);
            mutex2 = this.zze;
            zzgctVar.zza = zzgbwVar22;
            zzgctVar.zzb = mutex2;
            zzgctVar.zze = 2;
            if (mutex2.lock(null, zzgctVar) != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            mutex.unlock(null);
            throw th3;
        }
        zzgctVar = new zzgct(this, continuation);
        Object obj2 = zzgctVar.zzc;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgctVar.zze;
        if (i != 0) {
        }
    }

    private static final boolean zzD(zzgbw zzgbwVar) {
        boolean z;
        List zzk = zzgbwVar.zzk();
        Long l = zzk != null ? (Long) CollectionsKt.lastOrNull(zzk) : null;
        boolean z2 = zzgbwVar.zzl() > zzgbwVar.zzm() && !zzgbwVar.zzd();
        if (l != null) {
            if (zzgbwVar.zzi() - l.longValue() > 5000) {
                z = true;
                return !z2 || z;
            }
        }
        z = false;
        if (z2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d0, code lost:
    
        if (zzA(r0) == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006a, code lost:
    
        if (r9 == r1) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.internal.ads.zzgdh] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzs(Continuation continuation) {
        zzgdc zzgdcVar;
        ?? r2;
        Mutex mutex;
        try {
            if (continuation instanceof zzgdc) {
                zzgdcVar = (zzgdc) continuation;
                int i = zzgdcVar.zzd;
                if ((i & Integer.MIN_VALUE) != 0) {
                    zzgdcVar.zzd = i - Integer.MIN_VALUE;
                    Object obj = zzgdcVar.zzb;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r2 = zzgdcVar.zzd;
                    if (r2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.zze;
                        zzgdcVar.zza = mutex2;
                        zzgdcVar.zzd = 1;
                        if (mutex2.lock(null, zzgdcVar) != coroutine_suspended) {
                            mutex = mutex2;
                        }
                        return coroutine_suspended;
                    }
                    if (r2 == 1) {
                        Mutex mutex3 = (Mutex) zzgdcVar.zza;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex3;
                    } else {
                        if (r2 != 2) {
                            if (r2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        Mutex mutex4 = (Mutex) zzgdcVar.zza;
                        ResultKt.throwOnFailure(obj);
                        r2 = mutex4;
                        zzgca zzgcaVar = (zzgca) obj;
                        if (zzgcaVar == null || zzgcaVar.zza() == 0) {
                            return Unit.INSTANCE;
                        }
                        for (Map.Entry entry : zzgcaVar.zzb().entrySet()) {
                            zzifg zzcc = ((zzgbw) entry.getValue()).zzcc();
                            Intrinsics.checkNotNullExpressionValue(zzcc, "toBuilder(...)");
                            zzgbv zzgbvVar = (zzgbv) zzcc;
                            Object value = entry.getValue();
                            Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
                            if (zzD((zzgbw) value)) {
                                zzgbvVar.zzf(true);
                            }
                            zzdxu zzdxuVar = this.zzj;
                            zzifm zzbu = zzgbvVar.zzbu();
                            Intrinsics.checkNotNullExpressionValue(zzbu, "build(...)");
                            zzdxuVar.zza((zzgbw) zzbu);
                        }
                        zzgdcVar.zza = null;
                        zzgdcVar.zzd = 3;
                    }
                    Flow data = this.zzi.getData();
                    zzgdcVar.zza = mutex;
                    zzgdcVar.zzd = 2;
                    obj = FlowKt.firstOrNull(data, zzgdcVar);
                    r2 = mutex;
                }
            }
            if (r2 != 0) {
            }
            Flow data2 = this.zzi.getData();
            zzgdcVar.zza = mutex;
            zzgdcVar.zzd = 2;
            obj = FlowKt.firstOrNull(data2, zzgdcVar);
            r2 = mutex;
        } finally {
            r2.unlock(null);
        }
        zzgdcVar = new zzgdc(this, continuation);
        Object obj2 = zzgdcVar.zzb;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = zzgdcVar.zzd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0058 A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #0 {all -> 0x005e, blocks: (B:11:0x0054, B:13:0x0058, B:17:0x0060, B:19:0x0075, B:20:0x007b), top: B:10:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060 A[Catch: all -> 0x005e, TRY_ENTER, TryCatch #0 {all -> 0x005e, blocks: (B:11:0x0054, B:13:0x0058, B:17:0x0060, B:19:0x0075, B:20:0x007b), top: B:10:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzt(String str, Continuation continuation) {
        zzgcw zzgcwVar;
        int i;
        String str2;
        Mutex mutex;
        long j;
        try {
            if (continuation instanceof zzgcw) {
                zzgcwVar = (zzgcw) continuation;
                int i2 = zzgcwVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgcwVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzgcwVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgcwVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.zzc;
                        long currentTimeMillis = System.currentTimeMillis();
                        zzgcwVar.zzf = str;
                        zzgcwVar.zza = mutex2;
                        zzgcwVar.zzb = currentTimeMillis;
                        zzgcwVar.zze = 1;
                        if (mutex2.lock(null, zzgcwVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str2 = str;
                        mutex = mutex2;
                        j = currentTimeMillis;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = zzgcwVar.zzb;
                        mutex = (Mutex) zzgcwVar.zza;
                        str2 = zzgcwVar.zzf;
                        ResultKt.throwOnFailure(obj);
                    }
                    if (!this.zzf) {
                        return Unit.INSTANCE;
                    }
                    this.zzf = true;
                    zzifg zzcc = zzgbw.zzp().zzcc();
                    Intrinsics.checkNotNullExpressionValue(zzcc, "toBuilder(...)");
                    zzgbv zzgbvVar = (zzgbv) zzcc;
                    this.zzg = zzgbvVar;
                    if (zzgbvVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgbvVar = null;
                    }
                    zzgbvVar.zza(str2);
                    zzgbvVar.zzj(j);
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            if (!this.zzf) {
            }
        } finally {
            mutex.unlock(null);
        }
        zzgcwVar = new zzgcw(this, continuation);
        Object obj2 = zzgcwVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgcwVar.zze;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ab, code lost:
    
        if (zzC(r0) != r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
    
        if (zzB(r5, r0) != r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x005f, code lost:
    
        if (r2.lock(null, r0) != r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:24:0x0087, B:26:0x008b, B:27:0x0094), top: B:23:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065 A[Catch: all -> 0x006b, TRY_LEAVE, TryCatch #1 {all -> 0x006b, blocks: (B:37:0x0061, B:39:0x0065, B:42:0x006d), top: B:36:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006d A[Catch: all -> 0x006b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x006b, blocks: (B:37:0x0061, B:39:0x0065, B:42:0x006d), top: B:36:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzu(Continuation continuation) {
        zzgcs zzgcsVar;
        int i;
        Mutex mutex;
        Mutex mutex2;
        long j;
        zzgbv zzgbvVar;
        try {
            if (continuation instanceof zzgcs) {
                zzgcsVar = (zzgcs) continuation;
                int i2 = zzgcsVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgcsVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzgcsVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgcsVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zzd;
                        zzgcsVar.zza = mutex;
                        zzgcsVar.zze = 1;
                    } else if (i == 1) {
                        mutex = (Mutex) zzgcsVar.zza;
                        ResultKt.throwOnFailure(obj);
                    } else if (i == 2) {
                        j = zzgcsVar.zzb;
                        mutex2 = (Mutex) zzgcsVar.zza;
                        ResultKt.throwOnFailure(obj);
                        try {
                            zzgbvVar = this.zzg;
                            if (zzgbvVar == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                zzgbvVar = null;
                            }
                            zzgbvVar.zzo(j);
                            mutex.unlock(null);
                            zzgcsVar.zza = null;
                            zzgcsVar.zze = 3;
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else {
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        ResultKt.throwOnFailure(obj);
                        zzgcsVar.zze = 4;
                    }
                    if (!this.zzh) {
                        return Unit.INSTANCE;
                    }
                    this.zzh = true;
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock(null);
                    mutex2 = this.zzc;
                    long currentTimeMillis = System.currentTimeMillis();
                    zzgcsVar.zza = mutex2;
                    zzgcsVar.zzb = currentTimeMillis;
                    zzgcsVar.zze = 2;
                    if (mutex2.lock(null, zzgcsVar) != coroutine_suspended) {
                        j = currentTimeMillis;
                        zzgbvVar = this.zzg;
                        if (zzgbvVar == null) {
                        }
                        zzgbvVar.zzo(j);
                        mutex.unlock(null);
                        zzgcsVar.zza = null;
                        zzgcsVar.zze = 3;
                    }
                    return coroutine_suspended;
                }
            }
            if (!this.zzh) {
            }
        } finally {
            mutex.unlock(null);
        }
        zzgcsVar = new zzgcs(this, continuation);
        Object obj2 = zzgcsVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgcsVar.zze;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0050, code lost:
    
        if (r2.lock(null, r0) != r1) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0081 A[Catch: all -> 0x0086, TRY_ENTER, TryCatch #0 {all -> 0x0086, blocks: (B:12:0x007b, B:15:0x0081, B:16:0x0089, B:19:0x0091, B:21:0x0095, B:22:0x0099, B:24:0x00b5, B:25:0x00b9, B:27:0x00c2, B:29:0x00c6, B:30:0x00ca, B:31:0x00d2, B:33:0x00d6, B:34:0x00da, B:36:0x00e0, B:38:0x00e4, B:39:0x00e8, B:41:0x0104, B:42:0x0108, B:43:0x0110, B:45:0x0114, B:46:0x0118), top: B:11:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0091 A[Catch: all -> 0x0086, TRY_ENTER, TryCatch #0 {all -> 0x0086, blocks: (B:12:0x007b, B:15:0x0081, B:16:0x0089, B:19:0x0091, B:21:0x0095, B:22:0x0099, B:24:0x00b5, B:25:0x00b9, B:27:0x00c2, B:29:0x00c6, B:30:0x00ca, B:31:0x00d2, B:33:0x00d6, B:34:0x00da, B:36:0x00e0, B:38:0x00e4, B:39:0x00e8, B:41:0x0104, B:42:0x0108, B:43:0x0110, B:45:0x0114, B:46:0x0118), top: B:11:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:12:0x007b, B:15:0x0081, B:16:0x0089, B:19:0x0091, B:21:0x0095, B:22:0x0099, B:24:0x00b5, B:25:0x00b9, B:27:0x00c2, B:29:0x00c6, B:30:0x00ca, B:31:0x00d2, B:33:0x00d6, B:34:0x00da, B:36:0x00e0, B:38:0x00e4, B:39:0x00e8, B:41:0x0104, B:42:0x0108, B:43:0x0110, B:45:0x0114, B:46:0x0118), top: B:11:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e0 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:12:0x007b, B:15:0x0081, B:16:0x0089, B:19:0x0091, B:21:0x0095, B:22:0x0099, B:24:0x00b5, B:25:0x00b9, B:27:0x00c2, B:29:0x00c6, B:30:0x00ca, B:31:0x00d2, B:33:0x00d6, B:34:0x00da, B:36:0x00e0, B:38:0x00e4, B:39:0x00e8, B:41:0x0104, B:42:0x0108, B:43:0x0110, B:45:0x0114, B:46:0x0118), top: B:11:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0114 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:12:0x007b, B:15:0x0081, B:16:0x0089, B:19:0x0091, B:21:0x0095, B:22:0x0099, B:24:0x00b5, B:25:0x00b9, B:27:0x00c2, B:29:0x00c6, B:30:0x00ca, B:31:0x00d2, B:33:0x00d6, B:34:0x00da, B:36:0x00e0, B:38:0x00e4, B:39:0x00e8, B:41:0x0104, B:42:0x0108, B:43:0x0110, B:45:0x0114, B:46:0x0118), top: B:11:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0056 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #1 {all -> 0x005c, blocks: (B:59:0x0052, B:61:0x0056, B:65:0x0060), top: B:58:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzv(Continuation continuation) {
        zzgdg zzgdgVar;
        int i;
        Mutex mutex;
        Mutex mutex2;
        long j;
        zzgbv zzgbvVar;
        zzgbv zzgbvVar2;
        zzgbv zzgbvVar3;
        try {
            if (continuation instanceof zzgdg) {
                zzgdgVar = (zzgdg) continuation;
                int i2 = zzgdgVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgdgVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzgdgVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgdgVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zzd;
                        zzgdgVar.zza = mutex;
                        zzgdgVar.zze = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j = zzgdgVar.zzb;
                            mutex2 = (Mutex) zzgdgVar.zza;
                            ResultKt.throwOnFailure(obj);
                            try {
                                zzgbvVar = this.zzg;
                                if (zzgbvVar == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgbvVar = null;
                                }
                                if (zzgbvVar.zzr() > 0) {
                                    zzgbv zzgbvVar4 = this.zzg;
                                    if (zzgbvVar4 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                        zzgbvVar4 = null;
                                    }
                                    List zzq = zzgbvVar4.zzq();
                                    Intrinsics.checkNotNullExpressionValue(zzq, "getAdClickTimestampsMsList(...)");
                                    Object last = CollectionsKt.last(zzq);
                                    Intrinsics.checkNotNullExpressionValue(last, "last(...)");
                                    long longValue = j - ((Number) last).longValue();
                                    zzgbv zzgbvVar5 = this.zzg;
                                    if (zzgbvVar5 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                        zzgbvVar5 = null;
                                    }
                                    zzgbvVar5.zzt();
                                    if (longValue < 5000) {
                                        zzgbv zzgbvVar6 = this.zzg;
                                        if (zzgbvVar6 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                            zzgbvVar6 = null;
                                        }
                                        zzgbvVar6.zzd(zzgbvVar6.zzc() + 1);
                                    }
                                }
                                zzgbvVar2 = this.zzg;
                                if (zzgbvVar2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgbvVar2 = null;
                                }
                                if (zzgbvVar2.zzn() > 0) {
                                    zzgbv zzgbvVar7 = this.zzg;
                                    if (zzgbvVar7 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                        zzgbvVar7 = null;
                                    }
                                    List zzm = zzgbvVar7.zzm();
                                    Intrinsics.checkNotNullExpressionValue(zzm, "getAppBackgroundTimestampsMsList(...)");
                                    Object last2 = CollectionsKt.last(zzm);
                                    Intrinsics.checkNotNullExpressionValue(last2, "last(...)");
                                    long longValue2 = j - ((Number) last2).longValue();
                                    zzgbv zzgbvVar8 = this.zzg;
                                    if (zzgbvVar8 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                        zzgbvVar8 = null;
                                    }
                                    zzgbvVar8.zzh(zzgbvVar8.zzg() + longValue2);
                                }
                                zzgbvVar3 = this.zzg;
                                if (zzgbvVar3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgbvVar3 = null;
                                }
                                zzgbvVar3.zzp(j);
                                mutex.unlock(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        mutex = (Mutex) zzgdgVar.zza;
                        ResultKt.throwOnFailure(obj);
                    }
                    if (this.zzh) {
                        return Unit.INSTANCE;
                    }
                    this.zzh = false;
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock(null);
                    Mutex mutex3 = this.zzc;
                    long currentTimeMillis = System.currentTimeMillis();
                    zzgdgVar.zza = mutex3;
                    zzgdgVar.zzb = currentTimeMillis;
                    zzgdgVar.zze = 2;
                    if (mutex3.lock(null, zzgdgVar) != coroutine_suspended) {
                        mutex2 = mutex3;
                        j = currentTimeMillis;
                        zzgbvVar = this.zzg;
                        if (zzgbvVar == null) {
                        }
                        if (zzgbvVar.zzr() > 0) {
                        }
                        zzgbvVar2 = this.zzg;
                        if (zzgbvVar2 == null) {
                        }
                        if (zzgbvVar2.zzn() > 0) {
                        }
                        zzgbvVar3 = this.zzg;
                        if (zzgbvVar3 == null) {
                        }
                        zzgbvVar3.zzp(j);
                        mutex.unlock(null);
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
            }
            if (this.zzh) {
            }
        } finally {
            mutex.unlock(null);
        }
        zzgdgVar = new zzgdg(this, continuation);
        Object obj2 = zzgdgVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgdgVar.zze;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00fc, code lost:
    
        if (zzz(r14, r0) == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0064, code lost:
    
        if (r2.lock(null, r0) != r1) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094 A[Catch: all -> 0x0099, TRY_ENTER, TryCatch #1 {all -> 0x0099, blocks: (B:26:0x008e, B:29:0x0094, B:30:0x009b, B:32:0x009f, B:33:0x00a3, B:35:0x00ad, B:36:0x00b1, B:38:0x00bd, B:39:0x00c1, B:41:0x00c8, B:42:0x00cc), top: B:25:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f A[Catch: all -> 0x0099, TryCatch #1 {all -> 0x0099, blocks: (B:26:0x008e, B:29:0x0094, B:30:0x009b, B:32:0x009f, B:33:0x00a3, B:35:0x00ad, B:36:0x00b1, B:38:0x00bd, B:39:0x00c1, B:41:0x00c8, B:42:0x00cc), top: B:25:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad A[Catch: all -> 0x0099, TryCatch #1 {all -> 0x0099, blocks: (B:26:0x008e, B:29:0x0094, B:30:0x009b, B:32:0x009f, B:33:0x00a3, B:35:0x00ad, B:36:0x00b1, B:38:0x00bd, B:39:0x00c1, B:41:0x00c8, B:42:0x00cc), top: B:25:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd A[Catch: all -> 0x0099, TryCatch #1 {all -> 0x0099, blocks: (B:26:0x008e, B:29:0x0094, B:30:0x009b, B:32:0x009f, B:33:0x00a3, B:35:0x00ad, B:36:0x00b1, B:38:0x00bd, B:39:0x00c1, B:41:0x00c8, B:42:0x00cc), top: B:25:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8 A[Catch: all -> 0x0099, TryCatch #1 {all -> 0x0099, blocks: (B:26:0x008e, B:29:0x0094, B:30:0x009b, B:32:0x009f, B:33:0x00a3, B:35:0x00ad, B:36:0x00b1, B:38:0x00bd, B:39:0x00c1, B:41:0x00c8, B:42:0x00cc), top: B:25:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x006a A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:53:0x0066, B:55:0x006a, B:59:0x0074), top: B:52:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzw(Continuation continuation) {
        zzgda zzgdaVar;
        int i;
        Mutex mutex;
        Mutex mutex2;
        long j;
        zzgbv zzgbvVar;
        zzgbv zzgbvVar2;
        zzgbv zzgbvVar3;
        zzgbv zzgbvVar4;
        zzgbv zzgbvVar5;
        zzgbw zzgbwVar;
        try {
            if (continuation instanceof zzgda) {
                zzgdaVar = (zzgda) continuation;
                int i2 = zzgdaVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgdaVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzgdaVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgdaVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zzc;
                        zzgdaVar.zza = mutex;
                        zzgdaVar.zze = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                    return Unit.INSTANCE;
                                }
                                zzgbwVar = (zzgbw) zzgdaVar.zza;
                                ResultKt.throwOnFailure(obj);
                                if (this.zzj.zza(zzgbwVar)) {
                                    String zza = zzgbwVar.zza();
                                    Intrinsics.checkNotNullExpressionValue(zza, "getGwsQueryId(...)");
                                    zzgdaVar.zza = null;
                                    zzgdaVar.zze = 4;
                                }
                                return Unit.INSTANCE;
                            }
                            j = zzgdaVar.zzb;
                            mutex2 = (Mutex) zzgdaVar.zza;
                            ResultKt.throwOnFailure(obj);
                            try {
                                zzgbvVar = this.zzg;
                                if (zzgbvVar == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgbvVar = null;
                                }
                                zzgbvVar2 = this.zzg;
                                if (zzgbvVar2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgbvVar2 = null;
                                }
                                long zzi = j - zzgbvVar2.zzi();
                                zzgbvVar3 = this.zzg;
                                if (zzgbvVar3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgbvVar3 = null;
                                }
                                zzgbvVar.zzb(zzi - zzgbvVar3.zzg());
                                zzgbvVar4 = this.zzg;
                                if (zzgbvVar4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgbvVar4 = null;
                                }
                                zzgbvVar4.zzl(j);
                                zzgbvVar5 = this.zzg;
                                if (zzgbvVar5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgbvVar5 = null;
                                }
                                zzgbw zzgbwVar2 = (zzgbw) zzgbvVar5.zzbu();
                                mutex.unlock(null);
                                Intrinsics.checkNotNull(zzgbwVar2);
                                zzgdaVar.zza = zzgbwVar2;
                                zzgdaVar.zze = 3;
                                if (zzC(zzgdaVar) != coroutine_suspended) {
                                    zzgbwVar = zzgbwVar2;
                                    if (this.zzj.zza(zzgbwVar)) {
                                    }
                                    return Unit.INSTANCE;
                                }
                                return coroutine_suspended;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        mutex = (Mutex) zzgdaVar.zza;
                        ResultKt.throwOnFailure(obj);
                    }
                    if (this.zzf) {
                        return Unit.INSTANCE;
                    }
                    this.zzf = false;
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock(null);
                    mutex2 = this.zzc;
                    long currentTimeMillis = System.currentTimeMillis();
                    zzgdaVar.zza = mutex2;
                    zzgdaVar.zzb = currentTimeMillis;
                    zzgdaVar.zze = 2;
                    if (mutex2.lock(null, zzgdaVar) != coroutine_suspended) {
                        j = currentTimeMillis;
                        zzgbvVar = this.zzg;
                        if (zzgbvVar == null) {
                        }
                        zzgbvVar2 = this.zzg;
                        if (zzgbvVar2 == null) {
                        }
                        long zzi2 = j - zzgbvVar2.zzi();
                        zzgbvVar3 = this.zzg;
                        if (zzgbvVar3 == null) {
                        }
                        zzgbvVar.zzb(zzi2 - zzgbvVar3.zzg());
                        zzgbvVar4 = this.zzg;
                        if (zzgbvVar4 == null) {
                        }
                        zzgbvVar4.zzl(j);
                        zzgbvVar5 = this.zzg;
                        if (zzgbvVar5 == null) {
                        }
                        zzgbw zzgbwVar22 = (zzgbw) zzgbvVar5.zzbu();
                        mutex.unlock(null);
                        Intrinsics.checkNotNull(zzgbwVar22);
                        zzgdaVar.zza = zzgbwVar22;
                        zzgdaVar.zze = 3;
                        if (zzC(zzgdaVar) != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
            }
            if (this.zzf) {
            }
        } finally {
            mutex.unlock(null);
        }
        zzgdaVar = new zzgda(this, continuation);
        Object obj2 = zzgdaVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgdaVar.zze;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0107, code lost:
    
        if (zzz(r15, r0) == r1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x008b, code lost:
    
        if (r2.lock(null, r0) != r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0064, code lost:
    
        if (r2.lock(null, r0) != r1) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x006a A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:56:0x0066, B:58:0x006a, B:62:0x0074), top: B:55:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzx(Continuation continuation) {
        zzgde zzgdeVar;
        int i;
        Mutex mutex;
        Mutex mutex2;
        long currentTimeMillis;
        zzgbw zzgbwVar;
        try {
            if (continuation instanceof zzgde) {
                zzgdeVar = (zzgde) continuation;
                int i2 = zzgdeVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgdeVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzgdeVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgdeVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zzc;
                        zzgdeVar.zza = mutex;
                        zzgdeVar.zze = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                    return Unit.INSTANCE;
                                }
                                zzgbwVar = (zzgbw) zzgdeVar.zza;
                                ResultKt.throwOnFailure(obj);
                                if (this.zzj.zza(zzgbwVar)) {
                                    String zza = zzgbwVar.zza();
                                    Intrinsics.checkNotNullExpressionValue(zza, "getGwsQueryId(...)");
                                    zzgdeVar.zza = null;
                                    zzgdeVar.zze = 4;
                                }
                                return Unit.INSTANCE;
                            }
                            currentTimeMillis = zzgdeVar.zzb;
                            mutex2 = (Mutex) zzgdeVar.zza;
                            ResultKt.throwOnFailure(obj);
                            try {
                                zzgbv zzgbvVar = this.zzg;
                                if (zzgbvVar == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgbvVar = null;
                                }
                                zzgbv zzgbvVar2 = this.zzg;
                                if (zzgbvVar2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgbvVar2 = null;
                                }
                                long zzi = currentTimeMillis - zzgbvVar2.zzi();
                                zzgbv zzgbvVar3 = this.zzg;
                                if (zzgbvVar3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgbvVar3 = null;
                                }
                                zzgbvVar.zzb(zzi - zzgbvVar3.zzg());
                                zzgbv zzgbvVar4 = this.zzg;
                                if (zzgbvVar4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgbvVar4 = null;
                                }
                                zzgbvVar4.zzk(currentTimeMillis);
                                zzgbv zzgbvVar5 = this.zzg;
                                if (zzgbvVar5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgbvVar5 = null;
                                }
                                zzgbvVar5.zze(true);
                                zzgbv zzgbvVar6 = this.zzg;
                                if (zzgbvVar6 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgbvVar6 = null;
                                }
                                zzgbw zzgbwVar2 = (zzgbw) zzgbvVar6.zzbu();
                                mutex.unlock(null);
                                Intrinsics.checkNotNull(zzgbwVar2);
                                zzgdeVar.zza = zzgbwVar2;
                                zzgdeVar.zze = 3;
                                if (zzC(zzgdeVar) != coroutine_suspended) {
                                    zzgbwVar = zzgbwVar2;
                                    if (this.zzj.zza(zzgbwVar)) {
                                    }
                                    return Unit.INSTANCE;
                                }
                                return coroutine_suspended;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        mutex = (Mutex) zzgdeVar.zza;
                        ResultKt.throwOnFailure(obj);
                    }
                    if (this.zzf) {
                        return Unit.INSTANCE;
                    }
                    this.zzf = false;
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock(null);
                    mutex2 = this.zzc;
                    currentTimeMillis = System.currentTimeMillis();
                    zzgdeVar.zza = mutex2;
                    zzgdeVar.zzb = currentTimeMillis;
                    zzgdeVar.zze = 2;
                }
            }
            if (this.zzf) {
            }
        } finally {
            mutex.unlock(null);
        }
        zzgdeVar = new zzgde(this, continuation);
        Object obj2 = zzgdeVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgdeVar.zze;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:11:0x004f, B:13:0x0053, B:14:0x005c), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzy(Continuation continuation) {
        zzgcy zzgcyVar;
        int i;
        Mutex mutex;
        long j;
        zzgbv zzgbvVar;
        try {
            if (continuation instanceof zzgcy) {
                zzgcyVar = (zzgcy) continuation;
                int i2 = zzgcyVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgcyVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzgcyVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgcyVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.zzc;
                        long currentTimeMillis = System.currentTimeMillis();
                        zzgcyVar.zzb = mutex2;
                        zzgcyVar.zza = currentTimeMillis;
                        zzgcyVar.zze = 1;
                        if (mutex2.lock(null, zzgcyVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                        j = currentTimeMillis;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = zzgcyVar.zza;
                        mutex = (Mutex) zzgcyVar.zzb;
                        ResultKt.throwOnFailure(obj);
                    }
                    zzgbvVar = this.zzg;
                    if (zzgbvVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgbvVar = null;
                    }
                    zzgbvVar.zzs(j);
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            zzgbvVar = this.zzg;
            if (zzgbvVar == null) {
            }
            zzgbvVar.zzs(j);
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        zzgcyVar = new zzgcy(this, continuation);
        Object obj2 = zzgcyVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgcyVar.zze;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
    
        if (r9.lock(null, r0) != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzz(String str, Continuation continuation) {
        zzgcm zzgcmVar;
        Object coroutine_suspended;
        int i;
        Mutex mutex;
        Throwable th;
        Mutex mutex2;
        Object updateData;
        try {
            if (continuation instanceof zzgcm) {
                zzgcmVar = (zzgcm) continuation;
                int i2 = zzgcmVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgcmVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzgcmVar.zzc;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgcmVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zze;
                        zzgcmVar.zza = str;
                        zzgcmVar.zzb = mutex;
                        zzgcmVar.zze = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex2 = (Mutex) zzgcmVar.zza;
                            try {
                                ResultKt.throwOnFailure(obj);
                                mutex2.unlock(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        Mutex mutex3 = (Mutex) zzgcmVar.zzb;
                        String str2 = (String) zzgcmVar.zza;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex3;
                        str = str2;
                    }
                    DataStore dataStore = this.zzi;
                    zzgcn zzgcnVar = new zzgcn(str, null);
                    zzgcmVar.zza = mutex;
                    zzgcmVar.zzb = null;
                    zzgcmVar.zze = 2;
                    updateData = dataStore.updateData(zzgcnVar, zzgcmVar);
                    if (updateData != coroutine_suspended) {
                        Mutex mutex4 = mutex;
                        obj = updateData;
                        mutex2 = mutex4;
                        mutex2.unlock(null);
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
            }
            DataStore dataStore2 = this.zzi;
            zzgcn zzgcnVar2 = new zzgcn(str, null);
            zzgcmVar.zza = mutex;
            zzgcmVar.zzb = null;
            zzgcmVar.zze = 2;
            updateData = dataStore2.updateData(zzgcnVar2, zzgcmVar);
            if (updateData != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            Mutex mutex5 = mutex;
            th = th3;
            mutex2 = mutex5;
            mutex2.unlock(null);
            throw th;
        }
        zzgcmVar = new zzgcm(this, continuation);
        Object obj2 = zzgcmVar.zzc;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgcmVar.zze;
        if (i != 0) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbx
    public final void zza() {
        BuildersKt__Builders_commonKt.launch$default(this.zza, null, null, new zzgdb(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgbx
    public final void zzb(@NotNull String gwsQueryId) {
        Intrinsics.checkNotNullParameter(gwsQueryId, "gwsQueryId");
        zzgtp.zza(this.zza, this.zzb, new zzgcv(this, gwsQueryId, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgbx
    public final void zzc() {
        zzgtp.zza(this.zza, this.zzb, new zzgcr(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgbx
    public final void zzd() {
        zzgtp.zza(this.zza, this.zzb, new zzgdf(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgbx
    public final void zze() {
        zzgtp.zza(this.zza, this.zzb, new zzgcz(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgbx
    public final void zzf() {
        zzgtp.zza(this.zza, this.zzb, new zzgdd(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgbx
    public final void zzg() {
        zzgtp.zza(this.zza, this.zzb, new zzgcx(this, null));
    }
}
