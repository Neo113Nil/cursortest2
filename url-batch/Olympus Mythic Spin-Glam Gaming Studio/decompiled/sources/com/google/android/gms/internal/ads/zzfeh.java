package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzfeh implements zzfdi {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzcfn zzg;

    zzfeh(zzcfn zzcfnVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2) {
        this.zzg = zzcfnVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i;
        this.zze = z;
        this.zzf = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        zzhcq zzw = zzhcq.zzw(this.zzg.zza(this.zza, this.zzd));
        zzgub zzgubVar = new zzgub() { // from class: com.google.android.gms.internal.ads.zzfeg
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                return zzfeh.this.zzc((AdvertisingIdClient.Info) obj);
            }
        };
        Executor executor = this.zzc;
        return (zzhcq) zzhcy.zzg((zzhcq) zzhcy.zzi((zzhcq) zzhcy.zzk(zzw, zzgubVar, executor), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbM)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzgub() { // from class: com.google.android.gms.internal.ads.zzfef
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                return zzfeh.this.zzd((Throwable) obj);
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 40;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbjg.zzej)).booleanValue() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbjg.zzei)).booleanValue() == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ zzfei zzc(AdvertisingIdClient.Info info) {
        zzgdj zzgdjVar = new zzgdj();
        if (this.zze) {
        }
        try {
            Context context = this.zza;
            zzgdn zzh = zzgdn.zzh(context);
            Objects.requireNonNull(info);
            String id = info.getId();
            Objects.requireNonNull(id);
            zzgdjVar = zzh.zzj(id, context.getPackageName(), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeo)).longValue(), this.zzf);
        } catch (IOException | IllegalArgumentException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdIdInfoSignalSource.getPaidV1");
            zzgdjVar = new zzgdj();
        }
        return new zzfei(info, null, zzgdjVar);
    }

    final /* synthetic */ zzfei zzd(Throwable th) {
        com.google.android.gms.ads.internal.client.zzay.zza();
        ContentResolver contentResolver = this.zza.getContentResolver();
        return new zzfei(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new zzgdj());
    }
}
