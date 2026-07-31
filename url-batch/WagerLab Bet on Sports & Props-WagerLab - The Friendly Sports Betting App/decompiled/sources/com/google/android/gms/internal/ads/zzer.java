package com.google.android.gms.internal.ads;

import androidx.media3.container.MdtaMetadataEntry;
import com.amazon.a.a.o.b.f;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.UByte$$ExternalSyntheticBackport0;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzer implements zzan {
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public zzer(String str, byte[] bArr, int i, int i2) {
        char c;
        byte b;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals(MdtaMetadataEntry.KEY_ANDROID_CAPTURE_FPS)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -269399509:
                if (str.equals(MdtaMetadataEntry.KEY_AUXILIARY_TRACKS_INTERLEAVED)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1011693540:
                if (str.equals(MdtaMetadataEntry.KEY_AUXILIARY_TRACKS_LENGTH)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1098277265:
                if (str.equals(MdtaMetadataEntry.KEY_AUXILIARY_TRACKS_OFFSET)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2002123038:
                if (str.equals(MdtaMetadataEntry.KEY_AUXILIARY_TRACKS_MAP)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            if (i2 == 23) {
                if (bArr.length == 4) {
                    i2 = 23;
                    zzghc.zza(r4);
                } else {
                    i2 = 23;
                }
            }
            r4 = false;
            zzghc.zza(r4);
        } else if (c == 1 || c == 2) {
            if (i2 == 78) {
                if (bArr.length == 8) {
                    i2 = 78;
                    zzghc.zza(r4);
                } else {
                    i2 = 78;
                }
            }
            r4 = false;
            zzghc.zza(r4);
        } else if (c == 3) {
            zzghc.zza(i2 == 0);
        } else if (c == 4) {
            if (i2 == 75) {
                if (bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    i2 = 75;
                    zzghc.zza(r4);
                } else {
                    i2 = 75;
                }
            }
            r4 = false;
            zzghc.zza(r4);
        }
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzer zzerVar = (zzer) obj;
            if (this.zza.equals(zzerVar.zza) && Arrays.equals(this.zzb, zzerVar.zzb) && this.zzc == zzerVar.zzc && this.zzd == zzerVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() + 527) * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }

    public final List zzb() {
        zzghc.zzi(this.zza.equals(MdtaMetadataEntry.KEY_AUXILIARY_TRACKS_MAP), "Metadata is not an auxiliary tracks map");
        byte[] bArr = this.zzb;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2]));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008c A[LOOP:0: B:18:0x0089->B:20:0x008c, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String sb;
        byte[] bArr;
        int i = this.zzd;
        if (i == 0) {
            if (this.zza.equals(MdtaMetadataEntry.KEY_AUXILIARY_TRACKS_MAP)) {
                List zzb = zzb();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("track types = ");
                zzggw.zzb(sb2, zzb, f.f598a);
                sb = sb2.toString();
            }
            bArr = this.zzb;
            String str = zzeo.zza;
            int length = bArr.length;
            StringBuilder sb3 = new StringBuilder(length + length);
            while (r1 < bArr.length) {
            }
            sb = sb3.toString();
        } else if (i == 1) {
            sb = zzeo.zzi(this.zzb);
        } else if (i == 23) {
            sb = String.valueOf(Float.intBitsToFloat(zzgne.zzd(this.zzb)));
        } else if (i == 67) {
            sb = String.valueOf(zzgne.zzd(this.zzb));
        } else if (i != 75) {
            if (i == 78) {
                sb = String.valueOf(new zzef(this.zzb).zzJ());
            }
            bArr = this.zzb;
            String str2 = zzeo.zza;
            int length2 = bArr.length;
            StringBuilder sb32 = new StringBuilder(length2 + length2);
            for (int i2 = 0; i2 < bArr.length; i2++) {
                sb32.append(Character.forDigit((bArr[i2] >> 4) & 15, 16));
                sb32.append(Character.forDigit(bArr[i2] & Ascii.SI, 16));
            }
            sb = sb32.toString();
        } else {
            sb = String.valueOf(UByte$$ExternalSyntheticBackport0.m(this.zzb[0]));
        }
        String str3 = this.zza;
        StringBuilder sb4 = new StringBuilder(String.valueOf(str3).length() + 18 + String.valueOf(sb).length());
        sb4.append("mdta: key=");
        sb4.append(str3);
        sb4.append(", value=");
        sb4.append(sb);
        return sb4.toString();
    }
}
