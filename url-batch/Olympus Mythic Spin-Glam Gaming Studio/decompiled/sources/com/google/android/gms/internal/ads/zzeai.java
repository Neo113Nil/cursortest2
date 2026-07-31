package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzeai {
    final /* synthetic */ zzeaj zza;
    private final Map zzb;

    @VisibleForTesting
    zzeai(zzeaj zzeajVar) {
        Objects.requireNonNull(zzeajVar);
        this.zza = zzeajVar;
        this.zzb = new ConcurrentHashMap();
    }

    public final zzeai zza(zzflg zzflgVar) {
        zzc("gqi", zzflgVar.zzb);
        return this;
    }

    public final zzeai zzb(zzfld zzfldVar) {
        zzc("aai", zzfldVar.zzw);
        zzc("request_id", zzfldVar.zzan);
        zzc("ad_format", zzfld.zza(zzfldVar.zzb));
        return this;
    }

    public final zzeai zzc(String str, @Nullable String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final void zzd() {
        this.zza.zzd().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeah
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzeai.this.zzh();
            }
        });
    }

    public final com.google.android.gms.ads.internal.util.client.zzt zze() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzqa)).booleanValue()) {
            zzd();
            return com.google.android.gms.ads.internal.util.client.zzt.SUCCESS;
        }
        zzeaj zzeajVar = this.zza;
        return zzeajVar.zzc().zze(this.zzb);
    }

    public final void zzf() {
        this.zza.zzd().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeag
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzeai.this.zzi();
            }
        });
    }

    public final String zzg() {
        return this.zza.zzc().zzc(this.zzb);
    }

    final /* synthetic */ void zzh() {
        this.zza.zzc().zzb(this.zzb);
    }

    final /* synthetic */ void zzi() {
        this.zza.zzc().zzf(this.zzb);
    }

    final /* synthetic */ zzeai zzj() {
        this.zzb.putAll(this.zza.zze());
        return this;
    }
}
