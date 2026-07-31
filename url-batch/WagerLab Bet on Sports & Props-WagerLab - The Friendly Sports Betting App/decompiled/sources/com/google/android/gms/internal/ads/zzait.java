package com.google.android.gms.internal.ads;

import androidx.media3.common.C;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzait {
    public final boolean zza;
    public final String zzb;
    public final zzaea zzc;
    public final int zzd;
    public final byte[] zze;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r6.equals(androidx.media3.common.C.CENC_TYPE_cenc) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzait(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        char c = 0;
        int i4 = 1;
        zzghc.zza((i == 0) ^ (bArr2 == null));
        this.zza = z;
        this.zzb = str;
        this.zzd = i;
        this.zze = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (str.equals(C.CENC_TYPE_cbc1)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3046671:
                    if (str.equals(C.CENC_TYPE_cbcs)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3049879:
                    break;
                case 3049895:
                    if (str.equals(C.CENC_TYPE_cens)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0 && c != 1) {
                if (c == 2 || c == 3) {
                    i4 = 2;
                } else {
                    StringBuilder sb = new StringBuilder(str.length() + 68);
                    sb.append("Unsupported protection scheme type '");
                    sb.append(str);
                    sb.append("'. Assuming AES-CTR crypto mode.");
                    zzds.zzc("TrackEncryptionBox", sb.toString());
                }
            }
        }
        this.zzc = new zzaea(i4, bArr, i2, i3);
    }
}
