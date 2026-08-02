package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzedt {
    private final zzfzq zza;
    private final zzeda zzb;
    private final zzgxc zzc;

    public zzedt(zzfzq zzfzqVar, zzeda zzedaVar, zzgxc zzgxcVar) {
        this.zza = zzfzqVar;
        this.zzb = zzedaVar;
        this.zzc = zzgxcVar;
    }

    private final zzfzp zzg(final zzcbc zzcbcVar, zzeds zzedsVar, final zzeds zzedsVar2, final zzfyn zzfynVar) {
        String str = zzcbcVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzp();
        return zzfzg.zzg(zzfzg.zzn(zzfyx.zzv(com.google.android.gms.ads.internal.util.zzs.zzy(str) ? zzfzg.zzh(new zzedj(1)) : zzfzg.zzg(zzedsVar.zza(zzcbcVar), ExecutionException.class, new zzfyn() { // from class: com.google.android.gms.internal.ads.zzedk
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzfzg.zzh(((ExecutionException) obj).getCause());
            }
        }, this.zza)), zzfynVar, this.zza), zzedj.class, new zzfyn() { // from class: com.google.android.gms.internal.ads.zzedr
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzedt.this.zzb(zzedsVar2, zzcbcVar, zzfynVar, (zzedj) obj);
            }
        }, this.zza);
    }

    public final zzfzp zza(final zzcbc zzcbcVar) {
        zzfyn zzfynVar = new zzfyn() { // from class: com.google.android.gms.internal.ads.zzedo
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                zzcbc zzcbcVar2 = zzcbc.this;
                zzcbcVar2.zzj = new String(zzfxp.zza((InputStream) obj), zzfsk.zzc);
                return zzfzg.zzi(zzcbcVar2);
            }
        };
        final zzeda zzedaVar = this.zzb;
        return zzg(zzcbcVar, new zzeds() { // from class: com.google.android.gms.internal.ads.zzedp
            @Override // com.google.android.gms.internal.ads.zzeds
            public final zzfzp zza(zzcbc zzcbcVar2) {
                return zzeda.this.zzb(zzcbcVar2);
            }
        }, new zzeds() { // from class: com.google.android.gms.internal.ads.zzedq
            @Override // com.google.android.gms.internal.ads.zzeds
            public final zzfzp zza(zzcbc zzcbcVar2) {
                return zzedt.this.zzc(zzcbcVar2);
            }
        }, zzfynVar);
    }

    final /* synthetic */ zzfzp zzb(zzeds zzedsVar, zzcbc zzcbcVar, zzfyn zzfynVar, zzedj zzedjVar) throws Exception {
        return zzfzg.zzn(zzedsVar.zza(zzcbcVar), zzfynVar, this.zza);
    }

    final /* synthetic */ zzfzp zzc(zzcbc zzcbcVar) {
        return ((zzeek) this.zzc.zzb()).zzb(zzcbcVar, Binder.getCallingUid());
    }

    final /* synthetic */ zzfzp zzd(zzcbc zzcbcVar) {
        return this.zzb.zzc(((Boolean) zzbky.zzd.zze()).booleanValue() ? zzcbcVar.zzh : zzcbcVar.zzj);
    }

    final /* synthetic */ zzfzp zze(zzcbc zzcbcVar) {
        return ((zzeek) this.zzc.zzb()).zzi(((Boolean) zzbky.zzd.zze()).booleanValue() ? zzcbcVar.zzh : zzcbcVar.zzj);
    }

    public final zzfzp zzf(zzcbc zzcbcVar) {
        if (zzaqh.zzg(zzcbcVar.zzj)) {
            return zzfzg.zzh(new zzebh(2, "Pool key missing from removeUrl call."));
        }
        return zzg(zzcbcVar, new zzeds() { // from class: com.google.android.gms.internal.ads.zzedm
            @Override // com.google.android.gms.internal.ads.zzeds
            public final zzfzp zza(zzcbc zzcbcVar2) {
                return zzedt.this.zzd(zzcbcVar2);
            }
        }, new zzeds() { // from class: com.google.android.gms.internal.ads.zzedn
            @Override // com.google.android.gms.internal.ads.zzeds
            public final zzfzp zza(zzcbc zzcbcVar2) {
                return zzedt.this.zze(zzcbcVar2);
            }
        }, new zzfyn() { // from class: com.google.android.gms.internal.ads.zzedl
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzfzg.zzi(null);
            }
        });
    }
}
