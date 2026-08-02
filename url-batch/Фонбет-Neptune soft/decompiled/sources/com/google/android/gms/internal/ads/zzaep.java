package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzaep extends zzaet {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzaep(zzadp zzadpVar) {
        super(zzadpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    protected final boolean zza(zzek zzekVar) throws zzaes {
        if (this.zzc) {
            zzekVar.zzL(1);
        } else {
            int zzm = zzekVar.zzm();
            int i = zzm >> 4;
            this.zze = i;
            if (i == 2) {
                int i2 = zzb[(zzm >> 2) & 3];
                zzad zzadVar = new zzad();
                zzadVar.zzX("audio/mpeg");
                zzadVar.zzy(1);
                zzadVar.zzY(i2);
                this.zza.zzl(zzadVar.zzad());
                this.zzd = true;
            } else if (i == 7 || i == 8) {
                zzad zzadVar2 = new zzad();
                zzadVar2.zzX(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                zzadVar2.zzy(1);
                zzadVar2.zzY(8000);
                this.zza.zzl(zzadVar2.zzad());
                this.zzd = true;
            } else if (i != 10) {
                throw new zzaes("Audio format not supported: " + i);
            }
            this.zzc = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    protected final boolean zzb(zzek zzekVar, long j) throws zzbo {
        if (this.zze == 2) {
            int zzb2 = zzekVar.zzb();
            this.zza.zzq(zzekVar, zzb2);
            this.zza.zzs(j, 1, zzb2, 0, null);
            return true;
        }
        int zzm = zzekVar.zzm();
        if (zzm != 0 || this.zzd) {
            if (this.zze == 10 && zzm != 1) {
                return false;
            }
            int zzb3 = zzekVar.zzb();
            this.zza.zzq(zzekVar, zzb3);
            this.zza.zzs(j, 1, zzb3, 0, null);
            return true;
        }
        int zzb4 = zzekVar.zzb();
        byte[] bArr = new byte[zzb4];
        zzekVar.zzG(bArr, 0, zzb4);
        zzabf zza = zzabg.zza(bArr);
        zzad zzadVar = new zzad();
        zzadVar.zzX("audio/mp4a-latm");
        zzadVar.zzz(zza.zzc);
        zzadVar.zzy(zza.zzb);
        zzadVar.zzY(zza.zza);
        zzadVar.zzL(Collections.singletonList(bArr));
        this.zza.zzl(zzadVar.zzad());
        this.zzd = true;
        return false;
    }
}
