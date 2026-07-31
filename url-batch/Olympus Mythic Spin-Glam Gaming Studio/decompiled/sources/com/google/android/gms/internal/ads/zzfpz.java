package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzfpz {
    final /* synthetic */ zzfqa zza;
    private final Object zzb;

    @Nullable
    private final String zzc;
    private final ListenableFuture zzd;
    private final List zze;
    private final ListenableFuture zzf;

    private zzfpz(zzfqa zzfqaVar, Object obj, String str, ListenableFuture listenableFuture, List list, ListenableFuture listenableFuture2) {
        Objects.requireNonNull(zzfqaVar);
        this.zza = zzfqaVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = listenableFuture;
        this.zze = list;
        this.zzf = listenableFuture2;
    }

    /* synthetic */ zzfpz(zzfqa zzfqaVar, Object obj, String str, ListenableFuture listenableFuture, List list, ListenableFuture listenableFuture2, byte[] bArr) {
        this(zzfqaVar, obj, null, listenableFuture, list, listenableFuture2);
    }

    public final zzfpz zza(String str) {
        return new zzfpz(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfpz zzb(final zzfpi zzfpiVar) {
        return zzc(new zzhcg() { // from class: com.google.android.gms.internal.ads.zzfpy
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzhcy.zza(zzfpi.this.zza(obj));
            }
        });
    }

    public final zzfpz zzc(zzhcg zzhcgVar) {
        return zzd(zzhcgVar, this.zza.zze());
    }

    public final zzfpz zzd(zzhcg zzhcgVar, Executor executor) {
        return new zzfpz(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzhcy.zzj(this.zzf, zzhcgVar, executor));
    }

    public final zzfpz zze(final ListenableFuture listenableFuture) {
        return zzd(new zzhcg() { // from class: com.google.android.gms.internal.ads.zzfpv
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return ListenableFuture.this;
            }
        }, zzcgj.zzh);
    }

    public final zzfpz zzf(Class cls, final zzfpi zzfpiVar) {
        return zzg(cls, new zzhcg(zzfpiVar) { // from class: com.google.android.gms.internal.ads.zzfpw
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzhcy.zza("");
            }
        });
    }

    public final zzfpz zzg(Class cls, zzhcg zzhcgVar) {
        zzfqa zzfqaVar = this.zza;
        zzhdi zze = zzfqaVar.zze();
        return new zzfpz(zzfqaVar, this.zzb, this.zzc, this.zzd, this.zze, zzhcy.zzh(this.zzf, cls, zzhcgVar, zze));
    }

    public final zzfpz zzh(long j, TimeUnit timeUnit) {
        zzfqa zzfqaVar = this.zza;
        ScheduledExecutorService zzf = zzfqaVar.zzf();
        return new zzfpz(zzfqaVar, this.zzb, this.zzc, this.zzd, this.zze, zzhcy.zzi(this.zzf, j, timeUnit, zzf));
    }

    public final zzfpp zzi() {
        Object obj = this.zzb;
        String str = this.zzc;
        if (str == null) {
            str = this.zza.zzc(obj);
        }
        final zzfpp zzfppVar = new zzfpp(obj, str, this.zzf);
        this.zza.zzg().zza(zzfppVar);
        ListenableFuture listenableFuture = this.zzd;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfpx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfpz.this.zza.zzg().zzb(zzfppVar);
            }
        };
        zzhdi zzhdiVar = zzcgj.zzh;
        listenableFuture.addListener(runnable, zzhdiVar);
        zzhcy.zzr(zzfppVar, new zzfpu(this, zzfppVar), zzhdiVar);
        return zzfppVar;
    }

    public final zzfpz zzj(Object obj) {
        return this.zza.zza(obj, zzi());
    }
}
