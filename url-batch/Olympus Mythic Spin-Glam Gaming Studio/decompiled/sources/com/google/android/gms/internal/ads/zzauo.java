package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.safedk.android.internal.partials.AdMobFilesBridge;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzauo implements zzatc {
    private final zzaun zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzauo(zzaun zzaunVar, int i) {
        this.zzc = zzaunVar;
    }

    @VisibleForTesting
    static byte[] zzg(zzaum zzaumVar, long j) throws IOException {
        long zza = zzaumVar.zza();
        if (j >= 0 && j <= zza) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(zzaumVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 33 + String.valueOf(zza).length());
        sb.append("streamToBytes length=");
        sb.append(j);
        sb.append(", maxLength=");
        sb.append(zza);
        throw new IOException(sb.toString());
    }

    static void zzh(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    static int zzi(InputStream inputStream) throws IOException {
        return (zzp(inputStream) << 24) | zzp(inputStream) | (zzp(inputStream) << 8) | (zzp(inputStream) << 16);
    }

    static void zzj(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    static long zzk(InputStream inputStream) throws IOException {
        return (zzp(inputStream) & 255) | ((zzp(inputStream) & 255) << 8) | ((zzp(inputStream) & 255) << 16) | ((zzp(inputStream) & 255) << 24) | ((zzp(inputStream) & 255) << 32) | ((zzp(inputStream) & 255) << 40) | ((zzp(inputStream) & 255) << 48) | ((zzp(inputStream) & 255) << 56);
    }

    static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzj(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static String zzm(zzaum zzaumVar) throws IOException {
        return new String(zzg(zzaumVar, zzk(zzaumVar)), "UTF-8");
    }

    private final void zzn(String str, zzaul zzaulVar) {
        Map map = this.zza;
        if (map.containsKey(str)) {
            this.zzb += zzaulVar.zza - ((zzaul) map.get(str)).zza;
        } else {
            this.zzb += zzaulVar.zza;
        }
        map.put(str, zzaulVar);
    }

    private final void zzo(String str) {
        zzaul zzaulVar = (zzaul) this.zza.remove(str);
        if (zzaulVar != null) {
            this.zzb -= zzaulVar.zza;
        }
    }

    private static int zzp(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private static final String zzq(String str) {
        int length = str.length() >> 1;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzatc
    public final synchronized zzatb zza(String str) {
        zzaul zzaulVar = (zzaul) this.zza.get(str);
        if (zzaulVar == null) {
            return null;
        }
        File zzf = zzf(str);
        try {
            zzaum zzaumVar = new zzaum(new BufferedInputStream(new FileInputStream(zzf)), zzf.length());
            try {
                String str2 = zzaul.zza(zzaumVar).zzb;
                if (!TextUtils.equals(str, str2)) {
                    zzaue.zzb("%s: key=%s, found=%s", zzf.getAbsolutePath(), str, str2);
                    zzo(str);
                    return null;
                }
                byte[] zzg = zzg(zzaumVar, zzaumVar.zza());
                zzatb zzatbVar = new zzatb();
                zzatbVar.zza = zzg;
                zzatbVar.zzb = zzaulVar.zzc;
                zzatbVar.zzc = zzaulVar.zzd;
                zzatbVar.zzd = zzaulVar.zze;
                zzatbVar.zze = zzaulVar.zzf;
                zzatbVar.zzf = zzaulVar.zzg;
                List<zzatk> list = zzaulVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzatk zzatkVar : list) {
                    treeMap.put(zzatkVar.zza(), zzatkVar.zzb());
                }
                zzatbVar.zzg = treeMap;
                zzatbVar.zzh = Collections.unmodifiableList(list);
                return zzatbVar;
            } finally {
                zzaumVar.close();
            }
        } catch (IOException e) {
            zzaue.zzb("%s: %s", zzf.getAbsolutePath(), e.toString());
            zze(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatc
    public final synchronized void zzb(String str, zzatb zzatbVar) {
        long j;
        try {
            long j2 = this.zzb;
            int length = zzatbVar.zza.length;
            long j3 = j2 + length;
            int i = this.zzd;
            if (j3 <= i || length <= i * 0.9f) {
                File zzf = zzf(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(AdMobFilesBridge.fileOutputStreamCtor(zzf));
                    zzaul zzaulVar = new zzaul(str, zzatbVar);
                    try {
                        zzh(bufferedOutputStream, 538247942);
                        zzl(bufferedOutputStream, zzaulVar.zzb);
                        String str2 = zzaulVar.zzc;
                        if (str2 == null) {
                            str2 = "";
                        }
                        zzl(bufferedOutputStream, str2);
                        zzj(bufferedOutputStream, zzaulVar.zzd);
                        zzj(bufferedOutputStream, zzaulVar.zze);
                        zzj(bufferedOutputStream, zzaulVar.zzf);
                        zzj(bufferedOutputStream, zzaulVar.zzg);
                        List<zzatk> list = zzaulVar.zzh;
                        if (list != null) {
                            zzh(bufferedOutputStream, list.size());
                            for (zzatk zzatkVar : list) {
                                zzl(bufferedOutputStream, zzatkVar.zza());
                                zzl(bufferedOutputStream, zzatkVar.zzb());
                            }
                        } else {
                            zzh(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(zzatbVar.zza);
                        bufferedOutputStream.close();
                        zzaulVar.zza = zzf.length();
                        zzn(str, zzaulVar);
                        long j4 = this.zzb;
                        int i2 = this.zzd;
                        if (j4 >= i2) {
                            boolean z = zzaue.zzb;
                            if (z) {
                                zzaue.zza("Pruning old cache entries.", new Object[0]);
                            }
                            long j5 = this.zzb;
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = this.zza.entrySet().iterator();
                            int i3 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    j = j5;
                                    break;
                                }
                                zzaul zzaulVar2 = (zzaul) ((Map.Entry) it.next()).getValue();
                                String str3 = zzaulVar2.zzb;
                                if (zzf(str3).delete()) {
                                    j = j5;
                                    this.zzb -= zzaulVar2.zza;
                                } else {
                                    j = j5;
                                    zzaue.zzb("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                                }
                                it.remove();
                                i3++;
                                if (this.zzb < i2 * 0.9f) {
                                    break;
                                } else {
                                    j5 = j;
                                }
                            }
                            if (z) {
                                zzaue.zza("pruned %d files, %d bytes, %d ms", Integer.valueOf(i3), Long.valueOf(this.zzb - j), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                            }
                        }
                    } catch (IOException e) {
                        zzaue.zzb("%s", e.toString());
                        bufferedOutputStream.close();
                        zzaue.zzb("Failed to write header for %s", zzf.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!zzf.delete()) {
                        zzaue.zzb("Could not clean up file %s", zzf.getAbsolutePath());
                    }
                    if (!this.zzc.zza().exists()) {
                        zzaue.zzb("Re-initializing cache after external clearing.", new Object[0]);
                        this.zza.clear();
                        this.zzb = 0L;
                        zzc();
                    }
                }
            }
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatc
    public final synchronized void zzc() {
        File zza = this.zzc.zza();
        if (zza.exists()) {
            File[] listFiles = zza.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    try {
                        long length = file.length();
                        zzaum zzaumVar = new zzaum(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            zzaul zza2 = zzaul.zza(zzaumVar);
                            zza2.zza = length;
                            zzn(zza2.zzb, zza2);
                            zzaumVar.close();
                        } catch (Throwable th) {
                            zzaumVar.close();
                            throw th;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!zza.mkdirs()) {
            zzaue.zzc("Unable to create cache dir %s", zza.getAbsolutePath());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatc
    public final synchronized void zzd(String str, boolean z) {
        zzatb zza = zza(str);
        if (zza != null) {
            zza.zzf = 0L;
            zza.zze = 0L;
            zzb(str, zza);
        }
    }

    public final synchronized void zze(String str) {
        boolean delete = zzf(str).delete();
        zzo(str);
        if (delete) {
            return;
        }
        zzaue.zzb("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }

    public final File zzf(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public zzauo(File file, int i) {
        this.zzc = new zzauk(this, file);
    }
}
