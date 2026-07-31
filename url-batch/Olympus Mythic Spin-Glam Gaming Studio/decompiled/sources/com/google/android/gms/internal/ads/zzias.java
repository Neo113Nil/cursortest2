package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzias {
    private static final Charset zza = Charset.forName("UTF-8");

    public static byte[] zza(String str, int i) {
        byte[] bytes = str.getBytes(zza);
        int length = bytes.length;
        zziar zziarVar = new zziar(2, new byte[(length * 3) / 4]);
        if (!zziarVar.zza(bytes, 0, length, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i2 = zziarVar.zzb;
        byte[] bArr = zziarVar.zza;
        if (i2 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        return bArr2;
    }
}
