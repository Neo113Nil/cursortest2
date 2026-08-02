package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaqd implements zzaor {
    private final zzaqc zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzaqd(zzaqc zzaqcVar, int i) {
        this.zzc = zzaqcVar;
    }

    static int zze(InputStream inputStream) throws IOException {
        return (zzn(inputStream) << 24) | zzn(inputStream) | (zzn(inputStream) << 8) | (zzn(inputStream) << 16);
    }

    static long zzf(InputStream inputStream) throws IOException {
        return (zzn(inputStream) & 255) | ((zzn(inputStream) & 255) << 8) | ((zzn(inputStream) & 255) << 16) | ((zzn(inputStream) & 255) << 24) | ((zzn(inputStream) & 255) << 32) | ((zzn(inputStream) & 255) << 40) | ((zzn(inputStream) & 255) << 48) | ((zzn(inputStream) & 255) << 56);
    }

    static String zzh(zzaqb zzaqbVar) throws IOException {
        return new String(zzm(zzaqbVar, zzf(zzaqbVar)), "UTF-8");
    }

    static void zzj(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    static void zzk(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzk(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static byte[] zzm(zzaqb zzaqbVar, long j) throws IOException {
        long zza = zzaqbVar.zza();
        if (j >= 0 && j <= zza) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(zzaqbVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + zza);
    }

    private static int zzn(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private final void zzo(String str, zzaqa zzaqaVar) {
        if (this.zza.containsKey(str)) {
            this.zzb += zzaqaVar.zza - ((zzaqa) this.zza.get(str)).zza;
        } else {
            this.zzb += zzaqaVar.zza;
        }
        this.zza.put(str, zzaqaVar);
    }

    private final void zzp(String str) {
        zzaqa zzaqaVar = (zzaqa) this.zza.remove(str);
        if (zzaqaVar != null) {
            this.zzb -= zzaqaVar.zza;
        }
    }

    private static final String zzq(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzaor
    public final synchronized zzaoq zza(String str) {
        zzaqa zzaqaVar = (zzaqa) this.zza.get(str);
        if (zzaqaVar == null) {
            return null;
        }
        File zzg = zzg(str);
        try {
            zzaqb zzaqbVar = new zzaqb(new BufferedInputStream(new FileInputStream(zzg)), zzg.length());
            try {
                zzaqa zza = zzaqa.zza(zzaqbVar);
                if (!TextUtils.equals(str, zza.zzb)) {
                    zzapt.zza("%s: key=%s, found=%s", zzg.getAbsolutePath(), str, zza.zzb);
                    zzp(str);
                    return null;
                }
                byte[] zzm = zzm(zzaqbVar, zzaqbVar.zza());
                zzaoq zzaoqVar = new zzaoq();
                zzaoqVar.zza = zzm;
                zzaoqVar.zzb = zzaqaVar.zzc;
                zzaoqVar.zzc = zzaqaVar.zzd;
                zzaoqVar.zzd = zzaqaVar.zze;
                zzaoqVar.zze = zzaqaVar.zzf;
                zzaoqVar.zzf = zzaqaVar.zzg;
                List<zzaoz> list = zzaqaVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzaoz zzaozVar : list) {
                    treeMap.put(zzaozVar.zza(), zzaozVar.zzb());
                }
                zzaoqVar.zzg = treeMap;
                zzaoqVar.zzh = Collections.unmodifiableList(zzaqaVar.zzh);
                return zzaoqVar;
            } finally {
                zzaqbVar.close();
            }
        } catch (IOException e) {
            zzapt.zza("%s: %s", zzg.getAbsolutePath(), e.toString());
            zzi(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaor
    public final synchronized void zzb() {
        File zza = this.zzc.zza();
        if (zza.exists()) {
            File[] listFiles = zza.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    try {
                        long length = file.length();
                        zzaqb zzaqbVar = new zzaqb(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            zzaqa zza2 = zzaqa.zza(zzaqbVar);
                            zza2.zza = length;
                            zzo(zza2.zzb, zza2);
                            zzaqbVar.close();
                        } catch (Throwable th) {
                            zzaqbVar.close();
                            throw th;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!zza.mkdirs()) {
            zzapt.zzb("Unable to create cache dir %s", zza.getAbsolutePath());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaor
    public final synchronized void zzc(String str, boolean z) {
        zzaoq zza = zza(str);
        if (zza != null) {
            zza.zzf = 0L;
            zza.zze = 0L;
            zzd(str, zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaor
    public final synchronized void zzd(String str, zzaoq zzaoqVar) {
        long j;
        long j2 = this.zzb;
        int length = zzaoqVar.zza.length;
        long j3 = j2 + length;
        int i = this.zzd;
        if (j3 <= i || length <= i * 0.9f) {
            File zzg = zzg(str);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(zzg));
                zzaqa zzaqaVar = new zzaqa(str, zzaoqVar);
                try {
                    zzj(bufferedOutputStream, 538247942);
                    zzl(bufferedOutputStream, zzaqaVar.zzb);
                    String str2 = zzaqaVar.zzc;
                    if (str2 == null) {
                        str2 = "";
                    }
                    zzl(bufferedOutputStream, str2);
                    zzk(bufferedOutputStream, zzaqaVar.zzd);
                    zzk(bufferedOutputStream, zzaqaVar.zze);
                    zzk(bufferedOutputStream, zzaqaVar.zzf);
                    zzk(bufferedOutputStream, zzaqaVar.zzg);
                    List<zzaoz> list = zzaqaVar.zzh;
                    if (list != null) {
                        zzj(bufferedOutputStream, list.size());
                        for (zzaoz zzaozVar : list) {
                            zzl(bufferedOutputStream, zzaozVar.zza());
                            zzl(bufferedOutputStream, zzaozVar.zzb());
                        }
                    } else {
                        zzj(bufferedOutputStream, 0);
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.write(zzaoqVar.zza);
                    bufferedOutputStream.close();
                    zzaqaVar.zza = zzg.length();
                    zzo(str, zzaqaVar);
                    if (this.zzb >= this.zzd) {
                        if (zzapt.zzb) {
                            zzapt.zzd("Pruning old cache entries.", new Object[0]);
                        }
                        long j4 = this.zzb;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        Iterator it = this.zza.entrySet().iterator();
                        int i2 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                j = elapsedRealtime;
                                break;
                            }
                            zzaqa zzaqaVar2 = (zzaqa) ((Map.Entry) it.next()).getValue();
                            if (zzg(zzaqaVar2.zzb).delete()) {
                                j = elapsedRealtime;
                                this.zzb -= zzaqaVar2.zza;
                            } else {
                                j = elapsedRealtime;
                                String str3 = zzaqaVar2.zzb;
                                zzapt.zza("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                            }
                            it.remove();
                            i2++;
                            if (this.zzb < this.zzd * 0.9f) {
                                break;
                            } else {
                                elapsedRealtime = j;
                            }
                        }
                        if (zzapt.zzb) {
                            zzapt.zzd("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.zzb - j4), Long.valueOf(SystemClock.elapsedRealtime() - j));
                        }
                    }
                } catch (IOException e) {
                    zzapt.zza("%s", e.toString());
                    bufferedOutputStream.close();
                    zzapt.zza("Failed to write header for %s", zzg.getAbsolutePath());
                    throw new IOException();
                }
            } catch (IOException unused) {
                if (!zzg.delete()) {
                    zzapt.zza("Could not clean up file %s", zzg.getAbsolutePath());
                }
                if (!this.zzc.zza().exists()) {
                    zzapt.zza("Re-initializing cache after external clearing.", new Object[0]);
                    this.zza.clear();
                    this.zzb = 0L;
                    zzb();
                }
            }
        }
    }

    public final File zzg(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public final synchronized void zzi(String str) {
        boolean delete = zzg(str).delete();
        zzp(str);
        if (delete) {
            return;
        }
        zzapt.zza("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }

    public zzaqd(File file, int i) {
        this.zzc = new zzapz(this, file);
    }
}
