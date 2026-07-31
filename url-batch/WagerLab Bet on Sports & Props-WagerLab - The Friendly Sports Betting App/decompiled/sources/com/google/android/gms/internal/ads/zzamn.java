package com.google.android.gms.internal.ads;

import androidx.media3.common.C;
import androidx.media3.common.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzamn implements zzamd {
    private zzaeb zzc;
    private boolean zzd;
    private int zzf;
    private int zzg;
    private final String zza = MimeTypes.VIDEO_MP2T;
    private final zzef zzb = new zzef(10);
    private long zze = C.TIME_UNSET;

    public zzamn(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza() {
        this.zzd = false;
        this.zze = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzb(zzacx zzacxVar, zzanr zzanrVar) {
        zzanrVar.zza();
        zzaeb zzu = zzacxVar.zzu(zzanrVar.zzb(), 5);
        this.zzc = zzu;
        zzs zzsVar = new zzs();
        zzsVar.zza(zzanrVar.zzc());
        zzsVar.zzl(this.zza);
        zzsVar.zzm(MimeTypes.APPLICATION_ID3);
        zzu.zzu(zzsVar.zzM());
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzd = true;
        this.zze = j;
        this.zzf = 0;
        this.zzg = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzd(zzef zzefVar) {
        this.zzc.getClass();
        if (this.zzd) {
            int zzd = zzefVar.zzd();
            int i = this.zzg;
            if (i < 10) {
                int min = Math.min(zzd, 10 - i);
                byte[] zzi = zzefVar.zzi();
                int zzg = zzefVar.zzg();
                zzef zzefVar2 = this.zzb;
                System.arraycopy(zzi, zzg, zzefVar2.zzi(), this.zzg, min);
                if (this.zzg + min == 10) {
                    zzefVar2.zzh(0);
                    if (zzefVar2.zzs() != 73 || zzefVar2.zzs() != 68 || zzefVar2.zzs() != 51) {
                        zzds.zzc("Id3Reader", "Discarding invalid ID3 tag");
                        this.zzd = false;
                        return;
                    } else {
                        zzefVar2.zzk(3);
                        this.zzf = zzefVar2.zzG() + 10;
                    }
                }
            }
            int min2 = Math.min(zzd, this.zzf - this.zzg);
            this.zzc.zzz(zzefVar, min2);
            this.zzg += min2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zze(boolean z) {
        int i;
        this.zzc.getClass();
        if (this.zzd && (i = this.zzf) != 0 && this.zzg == i) {
            zzghc.zzh(this.zze != C.TIME_UNSET);
            this.zzc.zzx(this.zze, 1, this.zzf, 0, null);
            this.zzd = false;
        }
    }
}
