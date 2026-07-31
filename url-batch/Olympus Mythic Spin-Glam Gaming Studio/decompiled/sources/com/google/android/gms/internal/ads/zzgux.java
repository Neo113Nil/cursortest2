package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes5.dex */
abstract class zzgux extends zzgtr {
    final CharSequence zzb;
    final zzgty zzc;
    final boolean zzd;
    int zze = 0;
    int zzf = Integer.MAX_VALUE;

    zzgux(zzguz zzguzVar, CharSequence charSequence) {
        this.zzc = zzguzVar.zzi();
        this.zzd = zzguzVar.zzj();
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.zzgtr
    protected final /* bridge */ /* synthetic */ Object zza() {
        int zzc;
        int zzd;
        int i = this.zze;
        while (true) {
            int i2 = this.zze;
            if (i2 == -1) {
                zzb();
                return null;
            }
            zzc = zzc(i2);
            if (zzc == -1) {
                zzc = this.zzb.length();
                this.zze = -1;
                zzd = -1;
            } else {
                zzd = zzd(zzc);
                this.zze = zzd;
            }
            if (zzd == i) {
                int i3 = zzd + 1;
                this.zze = i3;
                if (i3 > this.zzb.length()) {
                    this.zze = -1;
                }
            } else {
                while (i < zzc && this.zzc.zzb(this.zzb.charAt(i))) {
                    i++;
                }
                while (zzc > i) {
                    int i4 = zzc - 1;
                    if (!this.zzc.zzb(this.zzb.charAt(i4))) {
                        break;
                    }
                    zzc = i4;
                }
                if (!this.zzd || i != zzc) {
                    break;
                }
                i = this.zze;
            }
        }
        int i5 = this.zzf;
        if (i5 == 1) {
            CharSequence charSequence = this.zzb;
            int length = charSequence.length();
            this.zze = -1;
            while (length > i) {
                int i6 = length - 1;
                if (!this.zzc.zzb(charSequence.charAt(i6))) {
                    break;
                }
                length = i6;
            }
            zzc = length;
        } else {
            this.zzf = i5 - 1;
        }
        return this.zzb.subSequence(i, zzc).toString();
    }

    abstract int zzc(int i);

    abstract int zzd(int i);
}
