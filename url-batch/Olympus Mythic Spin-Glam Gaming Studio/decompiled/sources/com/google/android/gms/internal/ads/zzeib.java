package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzeib {
    private final zzhdi zza;
    private final zzehg zzb;
    private final zzinq zzc;

    public zzeib(zzhdi zzhdiVar, zzehg zzehgVar, zzinq zzinqVar) {
        this.zza = zzhdiVar;
        this.zzb = zzehgVar;
        this.zzc = zzinqVar;
    }

    private final ListenableFuture zzg(final zzcbv zzcbvVar, zzehr zzehrVar, final zzehr zzehrVar2, final zzhcg zzhcgVar) {
        ListenableFuture zzh;
        String str = zzcbvVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzF(str)) {
            zzh = zzhcy.zzc(new zzehp(1));
        } else {
            zzh = zzhcy.zzh(zzehrVar.zza(zzcbvVar), ExecutionException.class, zzeia.zza, this.zza);
        }
        zzhdi zzhdiVar = this.zza;
        return (zzhcq) zzhcy.zzh((zzhcq) zzhcy.zzj((zzhcq) zzhcy.zzj(zzhcq.zzw(zzh), zzeht.zza, zzhdiVar), zzhcgVar, zzhdiVar), zzehp.class, new zzhcg() { // from class: com.google.android.gms.internal.ads.zzehu
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzeib.this.zzc(zzehrVar2, zzcbvVar, zzhcgVar, (zzehp) obj);
            }
        }, zzhdiVar);
    }

    public final ListenableFuture zza(final zzcbv zzcbvVar) {
        zzhcg zzhcgVar = new zzhcg() { // from class: com.google.android.gms.internal.ads.zzehv
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                String str = new String(zzham.zza((InputStream) obj), StandardCharsets.UTF_8);
                zzcbv zzcbvVar2 = zzcbv.this;
                zzcbvVar2.zzj = str;
                return zzhcy.zza(zzcbvVar2);
            }
        };
        final zzehg zzehgVar = this.zzb;
        Objects.requireNonNull(zzehgVar);
        return zzg(zzcbvVar, new zzehr() { // from class: com.google.android.gms.internal.ads.zzehs
            @Override // com.google.android.gms.internal.ads.zzehr
            public final /* synthetic */ ListenableFuture zza(zzcbv zzcbvVar2) {
                return zzehg.this.zza(zzcbvVar2);
            }
        }, new zzehr() { // from class: com.google.android.gms.internal.ads.zzehw
            @Override // com.google.android.gms.internal.ads.zzehr
            public final /* synthetic */ ListenableFuture zza(zzcbv zzcbvVar2) {
                return zzeib.this.zzd(zzcbvVar2);
            }
        }, zzhcgVar);
    }

    public final ListenableFuture zzb(zzcbv zzcbvVar) {
        return zzg(zzcbvVar, new zzehr() { // from class: com.google.android.gms.internal.ads.zzehy
            @Override // com.google.android.gms.internal.ads.zzehr
            public final /* synthetic */ ListenableFuture zza(zzcbv zzcbvVar2) {
                return zzeib.this.zze(zzcbvVar2);
            }
        }, new zzehr() { // from class: com.google.android.gms.internal.ads.zzehz
            @Override // com.google.android.gms.internal.ads.zzehr
            public final /* synthetic */ ListenableFuture zza(zzcbv zzcbvVar2) {
                return zzeib.this.zzf(zzcbvVar2);
            }
        }, zzehx.zza);
    }

    final /* synthetic */ ListenableFuture zzc(zzehr zzehrVar, zzcbv zzcbvVar, zzhcg zzhcgVar, zzehp zzehpVar) {
        return zzhcy.zzj(zzehrVar.zza(zzcbvVar), zzhcgVar, this.zza);
    }

    final /* synthetic */ ListenableFuture zzd(zzcbv zzcbvVar) {
        return ((zzejg) this.zzc.zzb()).zzb(zzcbvVar, Binder.getCallingUid());
    }

    final /* synthetic */ ListenableFuture zze(zzcbv zzcbvVar) {
        return this.zzb.zzd(zzcbvVar.zzh);
    }

    final /* synthetic */ ListenableFuture zzf(zzcbv zzcbvVar) {
        return ((zzejg) this.zzc.zzb()).zzc(zzcbvVar.zzh);
    }
}
