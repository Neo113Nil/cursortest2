package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdwk implements zzdfv, zzdeo, zzddd, zzddu, com.google.android.gms.ads.internal.client.zza, zzdig {
    private final zzbep zza;
    private boolean zzb = false;

    public zzdwk(zzbep zzbepVar, @Nullable zzfbf zzfbfVar) {
        this.zza = zzbepVar;
        zzbepVar.zzc(2);
        if (zzfbfVar != null) {
            zzbepVar.zzc(1101);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (this.zzb) {
            this.zza.zzc(8);
        } else {
            this.zza.zzc(7);
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddd
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        switch (zzeVar.zza) {
            case 1:
                this.zza.zzc(101);
                break;
            case 2:
                this.zza.zzc(102);
                break;
            case 3:
                this.zza.zzc(5);
                break;
            case 4:
                this.zza.zzc(103);
                break;
            case 5:
                this.zza.zzc(104);
                break;
            case 6:
                this.zza.zzc(105);
                break;
            case 7:
                this.zza.zzc(106);
                break;
            default:
                this.zza.zzc(4);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfv
    public final void zzb(final zzfdw zzfdwVar) {
        this.zza.zzb(new zzbeo() { // from class: com.google.android.gms.internal.ads.zzdwg
            @Override // com.google.android.gms.internal.ads.zzbeo
            public final void zza(zzbge zzbgeVar) {
                zzfdw zzfdwVar2 = zzfdw.this;
                zzbfa zzbfaVar = (zzbfa) zzbgeVar.zza().zzaA();
                zzbfs zzbfsVar = (zzbfs) zzbgeVar.zza().zzd().zzaA();
                zzbfsVar.zza(zzfdwVar2.zzb.zzb.zzb);
                zzbfaVar.zzb(zzbfsVar);
                zzbgeVar.zze(zzbfaVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdfv
    public final void zzbE(zzcbc zzcbcVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdig
    public final void zzd() {
        this.zza.zzc(1109);
    }

    @Override // com.google.android.gms.internal.ads.zzdig
    public final void zze(final zzbfk zzbfkVar) {
        this.zza.zzb(new zzbeo() { // from class: com.google.android.gms.internal.ads.zzdwj
            @Override // com.google.android.gms.internal.ads.zzbeo
            public final void zza(zzbge zzbgeVar) {
                zzbgeVar.zzf(zzbfk.this);
            }
        });
        this.zza.zzc(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzdig
    public final void zzf(final zzbfk zzbfkVar) {
        this.zza.zzb(new zzbeo() { // from class: com.google.android.gms.internal.ads.zzdwi
            @Override // com.google.android.gms.internal.ads.zzbeo
            public final void zza(zzbge zzbgeVar) {
                zzbgeVar.zzf(zzbfk.this);
            }
        });
        this.zza.zzc(1102);
    }

    @Override // com.google.android.gms.internal.ads.zzdig
    public final void zzh(boolean z) {
        this.zza.zzc(true != z ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.zzdig
    public final void zzi(final zzbfk zzbfkVar) {
        this.zza.zzb(new zzbeo() { // from class: com.google.android.gms.internal.ads.zzdwh
            @Override // com.google.android.gms.internal.ads.zzbeo
            public final void zza(zzbge zzbgeVar) {
                zzbgeVar.zzf(zzbfk.this);
            }
        });
        this.zza.zzc(1104);
    }

    @Override // com.google.android.gms.internal.ads.zzdig
    public final void zzk(boolean z) {
        this.zza.zzc(true != z ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final synchronized void zzl() {
        this.zza.zzc(6);
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final void zzn() {
        this.zza.zzc(3);
    }
}
