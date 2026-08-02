package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeof implements zzdfv, zzdeo, zzddd, zzddu, com.google.android.gms.ads.internal.client.zza, zzdda, zzdfl, zzasf, zzddq, zzdkn {
    private final zzfir zzj;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicBoolean zzg = new AtomicBoolean(true);
    private final AtomicBoolean zzh = new AtomicBoolean(false);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    final BlockingQueue zza = new ArrayBlockingQueue(((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhB)).intValue());

    public zzeof(zzfir zzfirVar) {
        this.zzj = zzfirVar;
    }

    private final void zzt() {
        if (this.zzh.get() && this.zzi.get()) {
            for (final Pair pair : this.zza) {
                zzfan.zza(this.zzc, new zzfam() { // from class: com.google.android.gms.internal.ads.zzenw
                    @Override // com.google.android.gms.internal.ads.zzfam
                    public final void zza(Object obj) {
                        Pair pair2 = pair;
                        ((com.google.android.gms.ads.internal.client.zzbz) obj).zzc((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            this.zza.clear();
            this.zzg.set(false);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zziw)).booleanValue()) {
            return;
        }
        zzfan.zza(this.zzb, zzenx.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddd
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfan.zza(this.zzb, new zzfam() { // from class: com.google.android.gms.internal.ads.zzenz
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbf) obj).zzf(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzfan.zza(this.zzb, new zzfam() { // from class: com.google.android.gms.internal.ads.zzeoa
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbf) obj).zze(com.google.android.gms.ads.internal.client.zze.this.zza);
            }
        });
        zzfan.zza(this.zze, new zzfam() { // from class: com.google.android.gms.internal.ads.zzeob
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbi) obj).zzb(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        this.zzg.set(false);
        this.zza.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzdfv
    public final void zzb(zzfdw zzfdwVar) {
        this.zzg.set(true);
        this.zzi.set(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdfv
    public final void zzbE(zzcbc zzcbcVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzasf
    public final synchronized void zzbu(final String str, final String str2) {
        if (!this.zzg.get()) {
            zzfan.zza(this.zzc, new zzfam() { // from class: com.google.android.gms.internal.ads.zzens
                @Override // com.google.android.gms.internal.ads.zzfam
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.client.zzbz) obj).zzc(str, str2);
                }
            });
            return;
        }
        if (!this.zza.offer(new Pair(str, str2))) {
            com.google.android.gms.ads.internal.util.zze.zze("The queue for app events is full, dropping the new event.");
            zzfir zzfirVar = this.zzj;
            if (zzfirVar != null) {
                zzfiq zzb = zzfiq.zzb("dae_action");
                zzb.zza("dae_name", str);
                zzb.zza("dae_data", str2);
                zzfirVar.zzb(zzb);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzbv() {
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbf zzc() {
        return (com.google.android.gms.ads.internal.client.zzbf) this.zzb.get();
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbz zzd() {
        return (com.google.android.gms.ads.internal.client.zzbz) this.zzc.get();
    }

    public final void zze(com.google.android.gms.ads.internal.client.zzbf zzbfVar) {
        this.zzb.set(zzbfVar);
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzbi zzbiVar) {
        this.zze.set(zzbiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdfl
    public final void zzg(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzfan.zza(this.zzd, new zzfam() { // from class: com.google.android.gms.internal.ads.zzenu
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzde) obj).zze(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }

    public final void zzh(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        this.zzd.set(zzdeVar);
    }

    public final void zzi(com.google.android.gms.ads.internal.client.zzbz zzbzVar) {
        this.zzc.set(zzbzVar);
        this.zzh.set(true);
        zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzj() {
        zzfan.zza(this.zzb, new zzfam() { // from class: com.google.android.gms.internal.ads.zzeoe
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbf) obj).zzd();
            }
        });
        zzfan.zza(this.zzf, new zzfam() { // from class: com.google.android.gms.internal.ads.zzeno
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcg) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzk(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfan.zza(this.zzf, new zzfam() { // from class: com.google.android.gms.internal.ads.zzent
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcg) obj).zzd(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final void zzl() {
        zzfan.zza(this.zzb, new zzfam() { // from class: com.google.android.gms.internal.ads.zzenn
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbf) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzm() {
        zzfan.zza(this.zzb, new zzfam() { // from class: com.google.android.gms.internal.ads.zzenv
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbf) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final synchronized void zzn() {
        zzfan.zza(this.zzb, new zzfam() { // from class: com.google.android.gms.internal.ads.zzeoc
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbf) obj).zzi();
            }
        });
        zzfan.zza(this.zze, new zzfam() { // from class: com.google.android.gms.internal.ads.zzeod
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbi) obj).zzc();
            }
        });
        this.zzi.set(true);
        zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzo() {
        zzfan.zza(this.zzb, new zzfam() { // from class: com.google.android.gms.internal.ads.zzenp
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbf) obj).zzj();
            }
        });
        zzfan.zza(this.zzf, new zzfam() { // from class: com.google.android.gms.internal.ads.zzenq
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcg) obj).zzf();
            }
        });
        zzfan.zza(this.zzf, new zzfam() { // from class: com.google.android.gms.internal.ads.zzenr
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcg) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzp(zzcbs zzcbsVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdkn
    public final void zzq() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zziw)).booleanValue()) {
            zzfan.zza(this.zzb, zzenx.zza);
        }
        zzfan.zza(this.zzf, new zzfam() { // from class: com.google.android.gms.internal.ads.zzeny
            @Override // com.google.android.gms.internal.ads.zzfam
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcg) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzr() {
    }

    public final void zzs(com.google.android.gms.ads.internal.client.zzcg zzcgVar) {
        this.zzf.set(zzcgVar);
    }
}
