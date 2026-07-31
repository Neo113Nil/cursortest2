package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzhae extends zzhag {
    private zzhae(zzhac zzhacVar, Character ch) {
        super(zzhacVar, ch);
        zzguk.zza(zzhacVar.zzf().length == 64);
    }

    @Override // com.google.android.gms.internal.ads.zzhag, com.google.android.gms.internal.ads.zzhah
    final void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        zzguk.zzo(0, i2, bArr.length);
        for (int i4 = i2; i4 >= 3; i4 -= 3) {
            int i5 = bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i6 = bArr[i3 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i7 = bArr[i3 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            zzhac zzhacVar = this.zzb;
            int i8 = (i6 << 8) | (i5 << 16) | i7;
            appendable.append(zzhacVar.zza(i8 >>> 18));
            appendable.append(zzhacVar.zza((i8 >>> 12) & 63));
            appendable.append(zzhacVar.zza((i8 >>> 6) & 63));
            appendable.append(zzhacVar.zza(i8 & 63));
            i3 += 3;
        }
        if (i3 < i2) {
            zze(appendable, bArr, i3, i2 - i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhag, com.google.android.gms.internal.ads.zzhah
    final int zzb(byte[] bArr, CharSequence charSequence) throws zzhaf {
        CharSequence zzg = zzg(charSequence);
        int length = zzg.length();
        zzhac zzhacVar = this.zzb;
        if (!zzhacVar.zzb(length)) {
            int length2 = zzg.length();
            StringBuilder sb = new StringBuilder(String.valueOf(length2).length() + 21);
            sb.append("Invalid input length ");
            sb.append(length2);
            throw new zzhaf(sb.toString());
        }
        int i = 0;
        int i2 = 0;
        while (i < zzg.length()) {
            int i3 = i2 + 1;
            int zzc = (zzhacVar.zzc(zzg.charAt(i + 1)) << 12) | (zzhacVar.zzc(zzg.charAt(i)) << 18);
            bArr[i2] = (byte) (zzc >>> 16);
            int i4 = i + 2;
            if (i4 < zzg.length()) {
                int i5 = i + 3;
                int zzc2 = zzc | (zzhacVar.zzc(zzg.charAt(i4)) << 6);
                int i6 = i2 + 2;
                bArr[i3] = (byte) ((zzc2 >>> 8) & 255);
                if (i5 < zzg.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((zzc2 | zzhacVar.zzc(zzg.charAt(i5))) & 255);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i = i4;
                i2 = i3;
            }
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhag
    final zzhah zzc(zzhac zzhacVar, Character ch) {
        return new zzhae(zzhacVar, ch);
    }

    zzhae(String str, String str2, Character ch) {
        this(new zzhac(str, str2.toCharArray()), ch);
    }
}
