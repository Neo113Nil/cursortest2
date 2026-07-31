package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzhat {
    public static void zza(byte[] bArr, File file) throws IOException {
        zzhai zzhaiVar = new zzhai();
        file.getClass();
        FileOutputStream zza = zzhar.zza(file, zzgxw.zzq(new zzhaq[0]), zzhaiVar);
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

    public static void zzc(File file, File file2) throws IOException {
        file.getClass();
        file2.getClass();
        zzguk.zzh(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        if (file.renameTo(file2)) {
            return;
        }
        zzguk.zzh(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        zzhas zzhasVar = new zzhas(file, null);
        zzhai zzhaiVar = new zzhai();
        zzgxw zzq = zzgxw.zzq(new zzhaq[0]);
        zzhap zza = zzhap.zza();
        try {
            InputStream zza2 = zzhasVar.zza();
            zza.zzb(zza2);
            FileOutputStream zza3 = zzhar.zza(file2, zzq, zzhaiVar);
            zza.zzb(zza3);
            int i = zzham.zza;
            byte[] bArr = new byte[8192];
            while (true) {
                int read = zza2.read(bArr);
                if (read == -1) {
                    break;
                } else {
                    zza3.write(bArr, 0, read);
                }
            }
            zza.close();
            if (file.delete()) {
                return;
            }
            if (!file2.delete()) {
                throw new IOException("Unable to delete ".concat(file2.toString()));
            }
            throw new IOException("Unable to delete ".concat(file.toString()));
        } catch (Throwable th) {
            try {
                throw zza.zzc(th);
            } catch (Throwable th2) {
                zza.close();
                throw th2;
            }
        }
    }
}
