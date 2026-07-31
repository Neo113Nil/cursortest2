package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
final class zzals implements zzalp {
    private final int zza;
    private final int zzb;
    private final zzeu zzc;

    public zzals(zzga zzgaVar, zzv zzvVar) {
        zzeu zzeuVar = zzgaVar.zza;
        this.zzc = zzeuVar;
        zzeuVar.zzh(12);
        int zzH = zzeuVar.zzH();
        if ("audio/raw".equals(zzvVar.zzp)) {
            int zzI = zzfm.zzI(zzvVar.zzL) * zzvVar.zzI;
            if (zzH % zzI != 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(zzI).length() + 66 + String.valueOf(zzH).length());
                sb.append("Audio sample size mismatch. stsd sample size: ");
                sb.append(zzI);
                sb.append(", stsz sample size: ");
                sb.append(zzH);
                zzeh.zzc("BoxParsers", sb.toString());
                zzH = zzI;
            }
        }
        this.zza = zzH == 0 ? -1 : zzH;
        this.zzb = zzeuVar.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final int zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final int zzc() {
        int i = this.zza;
        return i == -1 ? this.zzc.zzH() : i;
    }
}
