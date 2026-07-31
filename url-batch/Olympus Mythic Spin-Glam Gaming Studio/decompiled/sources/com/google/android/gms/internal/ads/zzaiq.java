package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzaiq extends zzaiv {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzaiq(zzaht zzahtVar) {
        super(zzahtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaiv
    protected final boolean zza(zzeu zzeuVar) throws zzaiu {
        if (this.zzc) {
            zzeuVar.zzk(1);
        } else {
            int zzs = zzeuVar.zzs();
            int i = zzs >> 4;
            this.zze = i;
            if (i == 2) {
                int i2 = zzb[(zzs >> 2) & 3];
                zzt zztVar = new zzt();
                zztVar.zzn("video/x-flv");
                zztVar.zzo("audio/mpeg");
                zztVar.zzH(1);
                zztVar.zzJ(i2);
                this.zza.zzA(zztVar.zzQ());
                this.zzd = true;
            } else if (i == 7 || i == 8) {
                zzt zztVar2 = new zzt();
                zztVar2.zzn("video/x-flv");
                zztVar2.zzo(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                zztVar2.zzH(1);
                zztVar2.zzJ(8000);
                this.zza.zzA(zztVar2.zzQ());
                this.zzd = true;
            } else if (i != 10) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 28);
                sb.append("Audio format not supported: ");
                sb.append(i);
                throw new zzaiu(sb.toString());
            }
            this.zzc = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaiv
    protected final boolean zzb(zzeu zzeuVar, long j) throws zzat {
        if (this.zze == 2) {
            int zzd = zzeuVar.zzd();
            zzaht zzahtVar = this.zza;
            zzahtVar.zzc(zzeuVar, zzd);
            zzahtVar.zze(j, 1, zzd, 0, null);
            return true;
        }
        int zzs = zzeuVar.zzs();
        if (zzs != 0 || this.zzd) {
            if (this.zze == 10 && zzs != 1) {
                return false;
            }
            int zzd2 = zzeuVar.zzd();
            zzaht zzahtVar2 = this.zza;
            zzahtVar2.zzc(zzeuVar, zzd2);
            zzahtVar2.zze(j, 1, zzd2, 0, null);
            return true;
        }
        int zzd3 = zzeuVar.zzd();
        byte[] bArr = new byte[zzd3];
        zzeuVar.zzm(bArr, 0, zzd3);
        zzafe zza = zzaff.zza(bArr);
        zzt zztVar = new zzt();
        zztVar.zzn("video/x-flv");
        zztVar.zzo("audio/mp4a-latm");
        zztVar.zzk(zza.zzc);
        zztVar.zzH(zza.zzb);
        zztVar.zzJ(zza.zza);
        zztVar.zzr(Collections.singletonList(bArr));
        this.zza.zzA(zztVar.zzQ());
        this.zzd = true;
        return false;
    }
}
