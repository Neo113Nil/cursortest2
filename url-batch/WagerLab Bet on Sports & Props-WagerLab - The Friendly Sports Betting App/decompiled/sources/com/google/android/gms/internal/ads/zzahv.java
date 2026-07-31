package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzahv implements zzahs {
    private final int zza;
    private final int zzb;
    private final zzef zzc;

    public zzahv(zzeu zzeuVar, zzu zzuVar) {
        zzef zzefVar = zzeuVar.zza;
        this.zzc = zzefVar;
        zzefVar.zzh(12);
        int zzH = zzefVar.zzH();
        if (MimeTypes.AUDIO_RAW.equals(zzuVar.zzo)) {
            int zzE = zzeo.zzE(zzuVar.zzI) * zzuVar.zzG;
            if (zzH == 0 || zzH % zzE != 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(zzE).length() + 66 + String.valueOf(zzH).length());
                sb.append("Audio sample size mismatch. stsd sample size: ");
                sb.append(zzE);
                sb.append(", stsz sample size: ");
                sb.append(zzH);
                zzds.zzc("BoxParsers", sb.toString());
                zzH = zzE;
            }
        }
        this.zza = zzH == 0 ? -1 : zzH;
        this.zzb = zzefVar.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final int zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final int zzc() {
        int i = this.zza;
        return i == -1 ? this.zzc.zzH() : i;
    }
}
