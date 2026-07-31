package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
class zzgmj extends zzgmk {
    private volatile zzgmk zza;
    final zzgmf zzb;
    final Character zzc;

    zzgmj(zzgmf zzgmfVar, Character ch) {
        this.zzb = zzgmfVar;
        boolean z = true;
        if (ch != null) {
            ch.charValue();
            if (zzgmfVar.zze('=')) {
                z = false;
            }
        }
        zzghc.zzf(z, "Padding character %s was already in alphabet", ch);
        this.zzc = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgmj) {
            zzgmj zzgmjVar = (zzgmj) obj;
            if (this.zzb.equals(zzgmjVar.zzb) && Objects.equals(this.zzc, zzgmjVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzc;
        return Objects.hashCode(ch) ^ this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        zzgmf zzgmfVar = this.zzb;
        sb.append(zzgmfVar);
        if (8 % zzgmfVar.zzb != 0) {
            Character ch = this.zzc;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgmk
    void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        zzghc.zzo(0, i2, bArr.length);
        while (i3 < i2) {
            int i4 = this.zzb.zzd;
            zze(appendable, bArr, i3, Math.min(i4, i2 - i3));
            i3 += i4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmk
    int zzb(byte[] bArr, CharSequence charSequence) throws zzgmi {
        int i;
        CharSequence zzg = zzg(charSequence);
        int length = zzg.length();
        zzgmf zzgmfVar = this.zzb;
        if (!zzgmfVar.zzb(length)) {
            int length2 = zzg.length();
            StringBuilder sb = new StringBuilder(String.valueOf(length2).length() + 21);
            sb.append("Invalid input length ");
            sb.append(length2);
            throw new zzgmi(sb.toString());
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < zzg.length()) {
            long j = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i = zzgmfVar.zzc;
                if (i4 >= i) {
                    break;
                }
                j <<= zzgmfVar.zzb;
                if (i2 + i4 < zzg.length()) {
                    j |= zzgmfVar.zzc(zzg.charAt(i5 + i2));
                    i5++;
                }
                i4++;
            }
            int i6 = zzgmfVar.zzd;
            int i7 = i5 * zzgmfVar.zzb;
            int i8 = (i6 - 1) * 8;
            while (i8 >= (i6 * 8) - i7) {
                bArr[i3] = (byte) ((j >>> i8) & 255);
                i8 -= 8;
                i3++;
            }
            i2 += i;
        }
        return i3;
    }

    zzgmk zzc(zzgmf zzgmfVar, Character ch) {
        return new zzgmj(zzgmfVar, ch);
    }

    @Override // com.google.android.gms.internal.ads.zzgmk
    final int zzd(int i) {
        zzgmf zzgmfVar = this.zzb;
        return zzgmfVar.zzc * zzgmx.zzb(i, zzgmfVar.zzd, RoundingMode.CEILING);
    }

    final void zze(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzghc.zzo(i, i + i2, bArr.length);
        zzgmf zzgmfVar = this.zzb;
        int i3 = zzgmfVar.zzd;
        int i4 = 0;
        zzghc.zza(i2 <= i3);
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | (bArr[i + i5] & 255)) << 8;
        }
        int i6 = (i2 + 1) * 8;
        int i7 = zzgmfVar.zzb;
        while (i4 < i2 * 8) {
            appendable.append(zzgmfVar.zza(zzgmfVar.zza & ((int) (j >>> ((i6 - i7) - i4)))));
            i4 += i7;
        }
        Character ch = this.zzc;
        if (ch != null) {
            while (i4 < i3 * 8) {
                ch.charValue();
                appendable.append('=');
                i4 += i7;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmk
    final int zzf(int i) {
        return (int) (((this.zzb.zzb * i) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.ads.zzgmk
    public final zzgmk zzh() {
        return this.zzc == null ? this : zzc(this.zzb, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgmk
    public final zzgmk zzi() {
        zzgmk zzgmkVar = this.zza;
        if (zzgmkVar == null) {
            zzgmf zzgmfVar = this.zzb;
            zzgmf zzd = zzgmfVar.zzd();
            zzgmkVar = zzd == zzgmfVar ? this : zzc(zzd, this.zzc);
            this.zza = zzgmkVar;
        }
        return zzgmkVar;
    }

    zzgmj(String str, String str2, Character ch) {
        this(new zzgmf(str, str2.toCharArray()), ch);
    }

    @Override // com.google.android.gms.internal.ads.zzgmk
    final CharSequence zzg(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.zzc;
        if (ch == null) {
            return charSequence;
        }
        ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }
}
