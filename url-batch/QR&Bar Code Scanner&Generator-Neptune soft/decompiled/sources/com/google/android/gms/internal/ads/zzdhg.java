package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdhg extends zzfmr implements zzdda, com.google.android.gms.ads.internal.client.zza, zzasf, zzdfl, zzddu, zzdez, com.google.android.gms.ads.internal.overlay.zzo, zzddq, zzdkn {
    private final zzdhe zza = new zzdhe(this, null);

    @Nullable
    private zzeof zzb;

    @Nullable
    private zzeoj zzc;

    @Nullable
    private zzezg zzd;

    @Nullable
    private zzfcn zze;

    private static void zzw(Object obj, zzdhf zzdhfVar) {
        if (obj != null) {
            zzdhfVar.zza(obj);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzw(this.zzb, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzdgu
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(Object obj) {
                ((zzeof) obj).onAdClicked();
            }
        });
        zzw(this.zzc, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzdgv
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(Object obj) {
                ((zzeoj) obj).onAdClicked();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        zzw(this.zzd, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzdha
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(Object obj) {
                ((zzezg) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
        zzw(this.zzd, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzdgd
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(Object obj) {
                ((zzezg) obj).zzbC();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
        zzw(this.zzd, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzdgt
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
        zzw(this.zzd, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzdga
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzasf
    public final void zzbu(final String str, final String str2) {
        zzw(this.zzb, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzdfx
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(Object obj) {
                ((zzeof) obj).zzbu(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzbv() {
        zzw(this.zzb, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzdfy
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(Object obj) {
            }
        });
        zzw(this.zze, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzdfz
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(Object obj) {
                ((zzfcn) obj).zzbv();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
        zzw(this.zzd, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzdfw
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(Object obj) {
                ((zzezg) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(final int i) {
        zzw(this.zzd, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzdgr
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(Object obj) {
                ((zzezg) obj).zzf(i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdfl
    public final void zzg(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzw(this.zzb, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzdgx
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(Object obj) {
                ((zzeof) obj).zzg(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
        zzw(this.zze, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzdgy
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(Object obj) {
                ((zzfcn) obj).zzg(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
        zzw(this.zzd, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzdgz
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(Object obj) {
                ((zzezg) obj).zzg(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdez
    public final void zzh() {
        zzw(this.zzd, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzdgj
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(Object obj) {
                ((zzezg) obj).zzh();
            }
        });
    }

    public final zzdhe zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzj() {
        zzw(this.zzb, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzdgp
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(Object obj) {
                ((zzeof) obj).zzj();
            }
        });
        zzw(this.zze, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzdgq
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(Object obj) {
                ((zzfcn) obj).zzj();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzk(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzw(this.zze, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzdge
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(Object obj) {
                ((zzfcn) obj).zzk(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzw(this.zzb, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzdgf
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(Object obj) {
                ((zzeof) obj).zzk(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final void zzl() {
        zzw(this.zzb, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzdgh
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(Object obj) {
                ((zzeof) obj).zzl();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzm() {
        zzw(this.zzb, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzdgs
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(Object obj) {
                ((zzeof) obj).zzm();
            }
        });
        zzw(this.zze, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzdgw
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(Object obj) {
                ((zzfcn) obj).zzm();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzo() {
        zzw(this.zzb, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzdhb
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(Object obj) {
                ((zzeof) obj).zzo();
            }
        });
        zzw(this.zze, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzdhc
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(Object obj) {
                ((zzfcn) obj).zzo();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzp(final zzcbs zzcbsVar, final String str, final String str2) {
        zzw(this.zzb, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzdgg
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(Object obj) {
            }
        });
        zzw(this.zze, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzdgi
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(Object obj) {
                ((zzfcn) obj).zzp(zzcbs.this, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdkn
    public final void zzq() {
        zzw(this.zzb, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzdgk
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(Object obj) {
                ((zzeof) obj).zzq();
            }
        });
        zzw(this.zzc, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzdgl
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(Object obj) {
                ((zzeoj) obj).zzq();
            }
        });
        zzw(this.zze, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzdgm
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(Object obj) {
                ((zzfcn) obj).zzq();
            }
        });
        zzw(this.zzd, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzdgn
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(Object obj) {
                ((zzezg) obj).zzq();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzr() {
        zzw(this.zzb, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzdgb
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(Object obj) {
            }
        });
        zzw(this.zze, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzdgc
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(Object obj) {
                ((zzfcn) obj).zzr();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfmr
    public final void zzv() {
        zzw(this.zze, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzdgo
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(Object obj) {
                ((zzfcn) obj).zzv();
            }
        });
    }
}
