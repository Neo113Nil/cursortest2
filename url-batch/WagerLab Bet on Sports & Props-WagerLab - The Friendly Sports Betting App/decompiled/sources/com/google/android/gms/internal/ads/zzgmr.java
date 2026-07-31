package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzgmr {
    public static void zza(byte[] bArr, File file) throws IOException {
        zzgmq zzgmqVar = new zzgmq(file, new zzgmp[0], null);
        bArr.getClass();
        OutputStream zza = zzgmqVar.zza();
        try {
            zza.write(bArr);
            zza.close();
        } catch (Throwable th) {
            try {
                zza.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void zzb(File file) throws IOException {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException("Unable to create parent directories of ".concat(file.toString()));
        }
    }
}
