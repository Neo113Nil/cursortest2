package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfcn extends zzfmr implements zzdeo, zzddd, zzdda, zzddq, zzdfl, zzfaw, zzdkn {
    private final zzffm zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();

    public zzfcn(zzffm zzffmVar) {
        this.zza = zzffmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddd
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        final int i = zzeVar.zza;
        zzfan.zza(this.zzc, new zzfam() { // from class: com.google.android.gms.internal.ads.zzfbt
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((zzccs) obj).zzf(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzfan.zza(this.zzc, new zzfam() { // from class: com.google.android.gms.internal.ads.zzfbu
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((zzccs) obj).zze(i);
            }
        });
        zzfan.zza(this.zze, new zzfam() { // from class: com.google.android.gms.internal.ads.zzfbv
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((zzcby) obj).zzg(i);
            }
        });
    }

    public final void zzb(zzfmr zzfmrVar) {
        this.zzb.set(zzfmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfaw
    public final void zzbL(zzfaw zzfawVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzbv() {
        zzfan.zza(this.zze, new zzfam() { // from class: com.google.android.gms.internal.ads.zzfby
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((zzcby) obj).zzk();
            }
        });
    }

    public final void zzc(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        this.zzh.set(zzdeVar);
    }

    public final void zzd(zzcco zzccoVar) {
        this.zzd.set(zzccoVar);
    }

    public final void zze(zzccs zzccsVar) {
        this.zzc.set(zzccsVar);
    }

    @Deprecated
    public final void zzf(zzcby zzcbyVar) {
        this.zze.set(zzcbyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdfl
    public final void zzg(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzfan.zza(this.zzh, new zzfam() { // from class: com.google.android.gms.internal.ads.zzfbs
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzde) obj).zze(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }

    @Deprecated
    public final void zzh(zzcbt zzcbtVar) {
        this.zzg.set(zzcbtVar);
    }

    public final void zzi(zzcct zzcctVar) {
        this.zzf.set(zzcctVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzj() {
        this.zza.zza();
        zzfan.zza(this.zzd, new zzfam() { // from class: com.google.android.gms.internal.ads.zzfbz
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((zzcco) obj).zzg();
            }
        });
        zzfan.zza(this.zze, new zzfam() { // from class: com.google.android.gms.internal.ads.zzfca
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((zzcby) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzk(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfan.zza(this.zzd, new zzfam() { // from class: com.google.android.gms.internal.ads.zzfbw
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((zzcco) obj).zzi(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzfan.zza(this.zzd, new zzfam() { // from class: com.google.android.gms.internal.ads.zzfbx
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((zzcco) obj).zzh(com.google.android.gms.ads.internal.client.zze.this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzm() {
        zzfan.zza(this.zze, new zzfam() { // from class: com.google.android.gms.internal.ads.zzfci
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((zzcby) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final void zzn() {
        zzfan.zza(this.zzc, new zzfam() { // from class: com.google.android.gms.internal.ads.zzfcf
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((zzccs) obj).zzg();
            }
        });
        zzfan.zza(this.zze, new zzfam() { // from class: com.google.android.gms.internal.ads.zzfcg
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((zzcby) obj).zzi();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzo() {
        zzfan.zza(this.zzd, new zzfam() { // from class: com.google.android.gms.internal.ads.zzfcb
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((zzcco) obj).zzj();
            }
        });
        zzfan.zza(this.zze, new zzfam() { // from class: com.google.android.gms.internal.ads.zzfcd
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((zzcby) obj).zzj();
            }
        });
        zzfan.zza(this.zzd, new zzfam() { // from class: com.google.android.gms.internal.ads.zzfce
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((zzcco) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzp(final zzcbs zzcbsVar, final String str, final String str2) {
        zzfan.zza(this.zzd, new zzfam() { // from class: com.google.android.gms.internal.ads.zzfcj
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                zzcbs zzcbsVar2 = zzcbs.this;
                ((zzcco) obj).zzk(new zzcdc(zzcbsVar2.zzc(), zzcbsVar2.zzb()));
            }
        });
        zzfan.zza(this.zzf, new zzfam() { // from class: com.google.android.gms.internal.ads.zzfck
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                zzcbs zzcbsVar2 = zzcbs.this;
                ((zzcct) obj).zze(new zzcdc(zzcbsVar2.zzc(), zzcbsVar2.zzb()), str, str2);
            }
        });
        zzfan.zza(this.zze, new zzfam() { // from class: com.google.android.gms.internal.ads.zzfcl
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((zzcby) obj).zze(zzcbs.this);
            }
        });
        zzfan.zza(this.zzg, new zzfam() { // from class: com.google.android.gms.internal.ads.zzfcm
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((zzcbt) obj).zze(zzcbs.this, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdkn
    public final void zzq() {
        zzfan.zza(this.zzd, new zzfam() { // from class: com.google.android.gms.internal.ads.zzfbr
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((zzcco) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzr() {
        zzfan.zza(this.zze, new zzfam() { // from class: com.google.android.gms.internal.ads.zzfcc
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((zzcby) obj).zzl();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfmr
    public final void zzv() {
        zzfan.zza(this.zzb, new zzfam() { // from class: com.google.android.gms.internal.ads.zzfch
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((zzfmr) obj).zzv();
            }
        });
    }
}
