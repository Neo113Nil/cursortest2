package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzabp extends zzabu {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzabp(zzaap zzaapVar) {
        super(zzaapVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabu
    protected final boolean zza(zzef zzefVar) throws zzabt {
        if (this.zzc) {
            zzefVar.zzG(1);
        } else {
            int zzk = zzefVar.zzk();
            int i = zzk >> 4;
            this.zze = i;
            if (i == 2) {
                int i2 = zzb[(zzk >> 2) & 3];
                zzad zzadVar = new zzad();
                zzadVar.zzS("audio/mpeg");
                zzadVar.zzw(1);
                zzadVar.zzT(i2);
                this.zza.zzk(zzadVar.zzY());
                this.zzd = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                zzad zzadVar2 = new zzad();
                zzadVar2.zzS(str);
                zzadVar2.zzw(1);
                zzadVar2.zzT(8000);
                this.zza.zzk(zzadVar2.zzY());
                this.zzd = true;
            } else if (i != 10) {
                throw new zzabt("Audio format not supported: " + i);
            }
            this.zzc = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzabu
    protected final boolean zzb(zzef zzefVar, long j) throws zzbu {
        if (this.zze == 2) {
            int zza = zzefVar.zza();
            this.zza.zzq(zzefVar, zza);
            this.zza.zzs(j, 1, zza, 0, null);
            return true;
        }
        int zzk = zzefVar.zzk();
        if (zzk != 0 || this.zzd) {
            if (this.zze == 10 && zzk != 1) {
                return false;
            }
            int zza2 = zzefVar.zza();
            this.zza.zzq(zzefVar, zza2);
            this.zza.zzs(j, 1, zza2, 0, null);
            return true;
        }
        int zza3 = zzefVar.zza();
        byte[] bArr = new byte[zza3];
        zzefVar.zzB(bArr, 0, zza3);
        zzyf zza4 = zzyg.zza(bArr);
        zzad zzadVar = new zzad();
        zzadVar.zzS("audio/mp4a-latm");
        zzadVar.zzx(zza4.zzc);
        zzadVar.zzw(zza4.zzb);
        zzadVar.zzT(zza4.zza);
        zzadVar.zzI(Collections.singletonList(bArr));
        this.zza.zzk(zzadVar.zzY());
        this.zzd = true;
        return false;
    }
}
