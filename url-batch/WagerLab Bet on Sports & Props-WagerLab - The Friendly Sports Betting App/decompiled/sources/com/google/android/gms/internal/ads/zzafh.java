package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzafh extends zzafg {
    private final zzef zzb;
    private final zzef zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzafh(zzaeb zzaebVar) {
        super(zzaebVar);
        this.zzb = new zzef(zzfl.zza);
        this.zzc = new zzef(4);
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    protected final boolean zza(zzef zzefVar) throws zzaff {
        int zzs = zzefVar.zzs();
        int i = zzs >> 4;
        int i2 = zzs & 15;
        if (i2 == 7) {
            this.zzg = i;
            return i != 5;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 28);
        sb.append("Video format not supported: ");
        sb.append(i2);
        throw new zzaff(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    protected final boolean zzb(zzef zzefVar, long j) throws zzas {
        int i;
        int zzs = zzefVar.zzs();
        long zzy = zzefVar.zzy();
        if (zzs == 0) {
            if (!this.zze) {
                zzef zzefVar2 = new zzef(new byte[zzefVar.zzd()]);
                zzefVar.zzm(zzefVar2.zzi(), 0, zzefVar.zzd());
                zzabz zza = zzabz.zza(zzefVar2);
                this.zzd = zza.zzb;
                zzs zzsVar = new zzs();
                zzsVar.zzl(MimeTypes.VIDEO_FLV);
                zzsVar.zzm(MimeTypes.VIDEO_H264);
                zzsVar.zzj(zza.zzl);
                zzsVar.zzt(zza.zzc);
                zzsVar.zzu(zza.zzd);
                zzsVar.zzz(zza.zzk);
                zzsVar.zzp(zza.zza);
                this.zza.zzu(zzsVar.zzM());
                this.zze = true;
                return false;
            }
        } else if (zzs == 1 && this.zze) {
            int i2 = this.zzg == 1 ? 1 : 0;
            if (this.zzf) {
                i = i2;
            } else if (i2 != 0) {
                i = 1;
            }
            zzef zzefVar3 = this.zzc;
            byte[] zzi = zzefVar3.zzi();
            zzi[0] = 0;
            zzi[1] = 0;
            zzi[2] = 0;
            int i3 = 4 - this.zzd;
            int i4 = 0;
            while (zzefVar.zzd() > 0) {
                zzefVar.zzm(zzefVar3.zzi(), i3, this.zzd);
                zzefVar3.zzh(0);
                zzef zzefVar4 = this.zzb;
                int zzH = zzefVar3.zzH();
                zzefVar4.zzh(0);
                zzaeb zzaebVar = this.zza;
                zzaebVar.zzz(zzefVar4, 4);
                zzaebVar.zzz(zzefVar, zzH);
                i4 = i4 + 4 + zzH;
            }
            this.zza.zzx(j + (zzy * 1000), i, i4, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
