package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbil;
import io.bidmachine.protobuf.EventTypeExtended;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzdyz implements zzdgv, zzdfd, zzdds, zzdej, com.google.android.gms.ads.internal.client.zza, zzdjg {
    private final zzbif zza;
    private boolean zzb = false;

    public zzdyz(zzbif zzbifVar, zzfiy zzfiyVar) {
        this.zza = zzbifVar;
        zzbifVar.zzc(2);
        if (zzfiyVar != null) {
            zzbifVar.zzc(EventTypeExtended.EVENT_TYPE_CLICK_BY_SOURCE_VALUE);
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

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzdJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
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

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zzdP(zzcbv zzcbvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zzdQ(final zzflo zzfloVar) {
        this.zza.zzb(new zzbie() { // from class: com.google.android.gms.internal.ads.zzdyy
            @Override // com.google.android.gms.internal.ads.zzbie
            public final /* synthetic */ void zza(zzbil.zzt.zza zzaVar) {
                zzbil.zza.zzb zzcc = zzaVar.zzY().zzcc();
                zzbil.zzi.zza zzcc2 = zzaVar.zzY().zzp().zzcc();
                zzcc2.zzd(zzflo.this.zzb.zzb.zzb);
                zzcc.zzr(zzcc2);
                zzaVar.zzaa(zzcc);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final synchronized void zzdr() {
        this.zza.zzc(6);
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzg() {
        this.zza.zzc(3);
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzj(final zzbil.zzb zzbVar) {
        zzbie zzbieVar = new zzbie() { // from class: com.google.android.gms.internal.ads.zzdyv
            @Override // com.google.android.gms.internal.ads.zzbie
            public final /* synthetic */ void zza(zzbil.zzt.zza zzaVar) {
                zzaVar.zzar(zzbil.zzb.this);
            }
        };
        zzbif zzbifVar = this.zza;
        zzbifVar.zzb(zzbieVar);
        zzbifVar.zzc(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzk(final zzbil.zzb zzbVar) {
        zzbie zzbieVar = new zzbie() { // from class: com.google.android.gms.internal.ads.zzdyw
            @Override // com.google.android.gms.internal.ads.zzbie
            public final /* synthetic */ void zza(zzbil.zzt.zza zzaVar) {
                zzaVar.zzar(zzbil.zzb.this);
            }
        };
        zzbif zzbifVar = this.zza;
        zzbifVar.zzb(zzbieVar);
        zzbifVar.zzc(1102);
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzl(final zzbil.zzb zzbVar) {
        zzbie zzbieVar = new zzbie() { // from class: com.google.android.gms.internal.ads.zzdyx
            @Override // com.google.android.gms.internal.ads.zzbie
            public final /* synthetic */ void zza(zzbil.zzt.zza zzaVar) {
                zzaVar.zzar(zzbil.zzb.this);
            }
        };
        zzbif zzbifVar = this.zza;
        zzbifVar.zzb(zzbieVar);
        zzbifVar.zzc(1104);
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzm(boolean z) {
        this.zza.zzc(true != z ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzn(boolean z) {
        this.zza.zzc(true != z ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzo() {
        this.zza.zzc(1109);
    }
}
