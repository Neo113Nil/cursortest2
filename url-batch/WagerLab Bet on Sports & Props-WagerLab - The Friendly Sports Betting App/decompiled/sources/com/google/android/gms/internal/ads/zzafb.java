package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzafb extends zzafg {
    private static final int[] zzb = {5512, 11025, 22050, AudioConstants.AUDIO_SAMPLE_RATE};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzafb(zzaeb zzaebVar) {
        super(zzaebVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    protected final boolean zza(zzef zzefVar) throws zzaff {
        if (this.zzc) {
            zzefVar.zzk(1);
        } else {
            int zzs = zzefVar.zzs();
            int i = zzs >> 4;
            this.zze = i;
            if (i == 2) {
                int i2 = zzb[(zzs >> 2) & 3];
                zzs zzsVar = new zzs();
                zzsVar.zzl(MimeTypes.VIDEO_FLV);
                zzsVar.zzm(MimeTypes.AUDIO_MPEG);
                zzsVar.zzE(1);
                zzsVar.zzF(i2);
                this.zza.zzu(zzsVar.zzM());
                this.zzd = true;
            } else if (i == 7 || i == 8) {
                zzs zzsVar2 = new zzs();
                zzsVar2.zzl(MimeTypes.VIDEO_FLV);
                zzsVar2.zzm(i == 7 ? MimeTypes.AUDIO_ALAW : MimeTypes.AUDIO_MLAW);
                zzsVar2.zzE(1);
                zzsVar2.zzF(8000);
                this.zza.zzu(zzsVar2.zzM());
                this.zzd = true;
            } else if (i != 10) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 28);
                sb.append("Audio format not supported: ");
                sb.append(i);
                throw new zzaff(sb.toString());
            }
            this.zzc = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    protected final boolean zzb(zzef zzefVar, long j) throws zzas {
        if (this.zze == 2) {
            int zzd = zzefVar.zzd();
            zzaeb zzaebVar = this.zza;
            zzaebVar.zzz(zzefVar, zzd);
            zzaebVar.zzx(j, 1, zzd, 0, null);
            return true;
        }
        int zzs = zzefVar.zzs();
        if (zzs != 0 || this.zzd) {
            if (this.zze == 10 && zzs != 1) {
                return false;
            }
            int zzd2 = zzefVar.zzd();
            zzaeb zzaebVar2 = this.zza;
            zzaebVar2.zzz(zzefVar, zzd2);
            zzaebVar2.zzx(j, 1, zzd2, 0, null);
            return true;
        }
        int zzd3 = zzefVar.zzd();
        byte[] bArr = new byte[zzd3];
        zzefVar.zzm(bArr, 0, zzd3);
        zzabs zza = zzabt.zza(bArr);
        zzs zzsVar = new zzs();
        zzsVar.zzl(MimeTypes.VIDEO_FLV);
        zzsVar.zzm(MimeTypes.AUDIO_AAC);
        zzsVar.zzj(zza.zzc);
        zzsVar.zzE(zza.zzb);
        zzsVar.zzF(zza.zza);
        zzsVar.zzp(Collections.singletonList(bArr));
        this.zza.zzu(zzsVar.zzM());
        this.zzd = true;
        return false;
    }
}
