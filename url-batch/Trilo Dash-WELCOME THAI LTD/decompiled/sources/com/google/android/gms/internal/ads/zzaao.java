package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzaao extends zzaat {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzaao(zzzz zzzzVar) {
        super(zzzzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaat
    protected final boolean zza(zzdy zzdyVar) throws zzaas {
        if (this.zzc) {
            zzdyVar.zzG(1);
        } else {
            int zzk = zzdyVar.zzk();
            int i = zzk >> 4;
            this.zze = i;
            if (i == 2) {
                int i2 = zzb[(zzk >> 2) & 3];
                zzab zzabVar = new zzab();
                zzabVar.zzS("audio/mpeg");
                zzabVar.zzw(1);
                zzabVar.zzT(i2);
                this.zza.zzk(zzabVar.zzY());
                this.zzd = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                zzab zzabVar2 = new zzab();
                zzabVar2.zzS(str);
                zzabVar2.zzw(1);
                zzabVar2.zzT(8000);
                this.zza.zzk(zzabVar2.zzY());
                this.zzd = true;
            } else if (i != 10) {
                throw new zzaas("Audio format not supported: " + i);
            }
            this.zzc = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaat
    protected final boolean zzb(zzdy zzdyVar, long j) throws zzbp {
        if (this.zze == 2) {
            int zza = zzdyVar.zza();
            this.zza.zzq(zzdyVar, zza);
            this.zza.zzs(j, 1, zza, 0, null);
            return true;
        }
        int zzk = zzdyVar.zzk();
        if (zzk != 0 || this.zzd) {
            if (this.zze == 10 && zzk != 1) {
                return false;
            }
            int zza2 = zzdyVar.zza();
            this.zza.zzq(zzdyVar, zza2);
            this.zza.zzs(j, 1, zza2, 0, null);
            return true;
        }
        int zza3 = zzdyVar.zza();
        byte[] bArr = new byte[zza3];
        zzdyVar.zzB(bArr, 0, zza3);
        zzxt zza4 = zzxu.zza(bArr);
        zzab zzabVar = new zzab();
        zzabVar.zzS("audio/mp4a-latm");
        zzabVar.zzx(zza4.zzc);
        zzabVar.zzw(zza4.zzb);
        zzabVar.zzT(zza4.zza);
        zzabVar.zzI(Collections.singletonList(bArr));
        this.zza.zzk(zzabVar.zzY());
        this.zzd = true;
        return false;
    }
}
