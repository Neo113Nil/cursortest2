package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzezg implements zzddd, zzdez, zzfaw, com.google.android.gms.ads.internal.overlay.zzo, zzdfl, zzddq, zzdkn {
    private final zzffm zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private zzezg zzh = null;

    public zzezg(zzffm zzffmVar) {
        this.zza = zzffmVar;
    }

    public static zzezg zzi(zzezg zzezgVar) {
        zzezg zzezgVar2 = new zzezg(zzezgVar.zza);
        zzezgVar2.zzh = zzezgVar;
        return zzezgVar2;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        zzezg zzezgVar = this.zzh;
        if (zzezgVar != null) {
            zzezgVar.zzb();
            return;
        }
        zzfan.zza(this.zzf, new zzfam() { // from class: com.google.android.gms.internal.ads.zzeyz
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.overlay.zzo) obj).zzb();
            }
        });
        zzfan.zza(this.zzd, new zzfam() { // from class: com.google.android.gms.internal.ads.zzeza
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((zzbdq) obj).zzf();
            }
        });
        zzfan.zza(this.zzd, new zzfam() { // from class: com.google.android.gms.internal.ads.zzezb
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((zzbdq) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
        zzezg zzezgVar = this.zzh;
        if (zzezgVar != null) {
            zzezgVar.zzbC();
        } else {
            zzfan.zza(this.zzf, new zzfam() { // from class: com.google.android.gms.internal.ads.zzeyw
                @Override // com.google.android.gms.internal.ads.zzfam
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzo) obj).zzbC();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
    }

    @Override // com.google.android.gms.internal.ads.zzfaw
    public final void zzbL(zzfaw zzfawVar) {
        this.zzh = (zzezg) zzfawVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
        zzezg zzezgVar = this.zzh;
        if (zzezgVar != null) {
            zzezgVar.zze();
        } else {
            zzfan.zza(this.zzf, new zzfam() { // from class: com.google.android.gms.internal.ads.zzezd
                @Override // com.google.android.gms.internal.ads.zzfam
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzo) obj).zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(final int i) {
        zzezg zzezgVar = this.zzh;
        if (zzezgVar != null) {
            zzezgVar.zzf(i);
        } else {
            zzfan.zza(this.zzf, new zzfam() { // from class: com.google.android.gms.internal.ads.zzeyv
                @Override // com.google.android.gms.internal.ads.zzfam
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzo) obj).zzf(i);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfl
    public final void zzg(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzezg zzezgVar = this.zzh;
        if (zzezgVar != null) {
            zzezgVar.zzg(zzsVar);
        } else {
            zzfan.zza(this.zzg, new zzfam() { // from class: com.google.android.gms.internal.ads.zzeyu
                @Override // com.google.android.gms.internal.ads.zzfam
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.client.zzde) obj).zze(com.google.android.gms.ads.internal.client.zzs.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdez
    public final void zzh() {
        zzezg zzezgVar = this.zzh;
        if (zzezgVar != null) {
            zzezgVar.zzh();
        } else {
            zzfan.zza(this.zze, new zzfam() { // from class: com.google.android.gms.internal.ads.zzezf
                @Override // com.google.android.gms.internal.ads.zzfam
                public final void zza(Object obj) {
                    ((zzdez) obj).zzh();
                }
            });
        }
    }

    public final void zzj() {
        zzezg zzezgVar = this.zzh;
        if (zzezgVar != null) {
            zzezgVar.zzj();
            return;
        }
        this.zza.zza();
        zzfan.zza(this.zzc, new zzfam() { // from class: com.google.android.gms.internal.ads.zzeys
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((zzbdn) obj).zze();
            }
        });
        zzfan.zza(this.zzd, new zzfam() { // from class: com.google.android.gms.internal.ads.zzeyt
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((zzbdq) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzk(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzezg zzezgVar = this.zzh;
        if (zzezgVar != null) {
            zzezgVar.zzk(zzeVar);
        } else {
            zzfan.zza(this.zzd, new zzfam() { // from class: com.google.android.gms.internal.ads.zzezc
                @Override // com.google.android.gms.internal.ads.zzfam
                public final void zza(Object obj) {
                    ((zzbdq) obj).zzd(com.google.android.gms.ads.internal.client.zze.this);
                }
            });
        }
    }

    public final void zzn(zzdez zzdezVar) {
        this.zze.set(zzdezVar);
    }

    public final void zzo(com.google.android.gms.ads.internal.overlay.zzo zzoVar) {
        this.zzf.set(zzoVar);
    }

    public final void zzp(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        this.zzg.set(zzdeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdkn
    public final void zzq() {
        zzezg zzezgVar = this.zzh;
        if (zzezgVar != null) {
            zzezgVar.zzq();
        } else {
            zzfan.zza(this.zzd, new zzfam() { // from class: com.google.android.gms.internal.ads.zzeze
                @Override // com.google.android.gms.internal.ads.zzfam
                public final void zza(Object obj) {
                    ((zzbdq) obj).zzb();
                }
            });
        }
    }

    public final void zzr(zzbdm zzbdmVar) {
        this.zzb.set(zzbdmVar);
    }

    public final void zzs(zzbdq zzbdqVar) {
        this.zzd.set(zzbdqVar);
    }

    public final void zzt(zzbdn zzbdnVar) {
        this.zzc.set(zzbdnVar);
    }

    public final void zzl(final zzbdj zzbdjVar) {
        zzezg zzezgVar = this.zzh;
        if (zzezgVar != null) {
            zzezgVar.zzl(zzbdjVar);
        } else {
            zzfan.zza(this.zzb, new zzfam() { // from class: com.google.android.gms.internal.ads.zzeyy
                @Override // com.google.android.gms.internal.ads.zzfam
                public final void zza(Object obj) {
                    ((zzbdm) obj).zzd(zzbdj.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddd
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzezg zzezgVar = this.zzh;
        if (zzezgVar != null) {
            zzezgVar.zza(zzeVar);
        } else {
            zzfan.zza(this.zzb, new zzfam() { // from class: com.google.android.gms.internal.ads.zzeyr
                @Override // com.google.android.gms.internal.ads.zzfam
                public final void zza(Object obj) {
                    ((zzbdm) obj).zzc(com.google.android.gms.ads.internal.client.zze.this);
                }
            });
            zzfan.zza(this.zzb, new zzfam() { // from class: com.google.android.gms.internal.ads.zzeyx
                @Override // com.google.android.gms.internal.ads.zzfam
                public final void zza(Object obj) {
                    ((zzbdm) obj).zzb(com.google.android.gms.ads.internal.client.zze.this.zza);
                }
            });
        }
    }
}
