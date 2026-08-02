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

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzakz implements zzajn {
    private final zzaky zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzakz(zzaky zzakyVar, int i) {
        this.zzc = zzakyVar;
    }

    static int zze(InputStream inputStream) throws IOException {
        return (zzn(inputStream) << 24) | zzn(inputStream) | (zzn(inputStream) << 8) | (zzn(inputStream) << 16);
    }

    static long zzf(InputStream inputStream) throws IOException {
        return (zzn(inputStream) & 255) | ((zzn(inputStream) & 255) << 8) | ((zzn(inputStream) & 255) << 16) | ((zzn(inputStream) & 255) << 24) | ((zzn(inputStream) & 255) << 32) | ((zzn(inputStream) & 255) << 40) | ((zzn(inputStream) & 255) << 48) | ((255 & zzn(inputStream)) << 56);
    }

    static String zzh(zzakx zzakxVar) throws IOException {
        return new String(zzm(zzakxVar, zzf(zzakxVar)), "UTF-8");
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

    static byte[] zzm(zzakx zzakxVar, long j) throws IOException {
        long zza = zzakxVar.zza();
        if (j >= 0 && j <= zza) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(zzakxVar).readFully(bArr);
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

    private final void zzo(String str, zzakw zzakwVar) {
        if (this.zza.containsKey(str)) {
            this.zzb += zzakwVar.zza - ((zzakw) this.zza.get(str)).zza;
        } else {
            this.zzb += zzakwVar.zza;
        }
        this.zza.put(str, zzakwVar);
    }

    private final void zzp(String str) {
        zzakw zzakwVar = (zzakw) this.zza.remove(str);
        if (zzakwVar != null) {
            this.zzb -= zzakwVar.zza;
        }
    }

    private static final String zzq(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzajn
    public final synchronized zzajm zza(String str) {
        zzakw zzakwVar = (zzakw) this.zza.get(str);
        if (zzakwVar == null) {
            return null;
        }
        File zzg = zzg(str);
        try {
            zzakx zzakxVar = new zzakx(new BufferedInputStream(new FileInputStream(zzg)), zzg.length());
            try {
                zzakw zza = zzakw.zza(zzakxVar);
                if (!TextUtils.equals(str, zza.zzb)) {
                    zzakp.zza("%s: key=%s, found=%s", zzg.getAbsolutePath(), str, zza.zzb);
                    zzp(str);
                    return null;
                }
                byte[] zzm = zzm(zzakxVar, zzakxVar.zza());
                zzajm zzajmVar = new zzajm();
                zzajmVar.zza = zzm;
                zzajmVar.zzb = zzakwVar.zzc;
                zzajmVar.zzc = zzakwVar.zzd;
                zzajmVar.zzd = zzakwVar.zze;
                zzajmVar.zze = zzakwVar.zzf;
                zzajmVar.zzf = zzakwVar.zzg;
                List<zzajv> list = zzakwVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzajv zzajvVar : list) {
                    treeMap.put(zzajvVar.zza(), zzajvVar.zzb());
                }
                zzajmVar.zzg = treeMap;
                zzajmVar.zzh = Collections.unmodifiableList(zzakwVar.zzh);
                return zzajmVar;
            } finally {
                zzakxVar.close();
            }
        } catch (IOException e) {
            zzakp.zza("%s: %s", zzg.getAbsolutePath(), e.toString());
            zzi(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajn
    public final synchronized void zzb() {
        long length;
        zzakx zzakxVar;
        File zza = this.zzc.zza();
        if (!zza.exists()) {
            if (zza.mkdirs()) {
                return;
            }
            zzakp.zzb("Unable to create cache dir %s", zza.getAbsolutePath());
            return;
        }
        File[] listFiles = zza.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            try {
                length = file.length();
                zzakxVar = new zzakx(new BufferedInputStream(new FileInputStream(file)), length);
            } catch (IOException unused) {
                file.delete();
            }
            try {
                zzakw zza2 = zzakw.zza(zzakxVar);
                zza2.zza = length;
                zzo(zza2.zzb, zza2);
                zzakxVar.close();
            } catch (Throwable th) {
                zzakxVar.close();
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajn
    public final synchronized void zzc(String str, boolean z) {
        zzajm zza = zza(str);
        if (zza != null) {
            zza.zzf = 0L;
            zza.zze = 0L;
            zzd(str, zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajn
    public final synchronized void zzd(String str, zzajm zzajmVar) {
        BufferedOutputStream bufferedOutputStream;
        zzakw zzakwVar;
        long j = this.zzb;
        int length = zzajmVar.zza.length;
        int i = this.zzd;
        if (j + length <= i || length <= i * 0.9f) {
            File zzg = zzg(str);
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(zzg));
                zzakwVar = new zzakw(str, zzajmVar);
            } catch (IOException unused) {
                if (!zzg.delete()) {
                    zzakp.zza("Could not clean up file %s", zzg.getAbsolutePath());
                }
                if (!this.zzc.zza().exists()) {
                    zzakp.zza("Re-initializing cache after external clearing.", new Object[0]);
                    this.zza.clear();
                    this.zzb = 0L;
                    zzb();
                    return;
                }
            }
            try {
                zzj(bufferedOutputStream, 538247942);
                zzl(bufferedOutputStream, zzakwVar.zzb);
                String str2 = zzakwVar.zzc;
                if (str2 == null) {
                    str2 = "";
                }
                zzl(bufferedOutputStream, str2);
                zzk(bufferedOutputStream, zzakwVar.zzd);
                zzk(bufferedOutputStream, zzakwVar.zze);
                zzk(bufferedOutputStream, zzakwVar.zzf);
                zzk(bufferedOutputStream, zzakwVar.zzg);
                List<zzajv> list = zzakwVar.zzh;
                if (list != null) {
                    zzj(bufferedOutputStream, list.size());
                    for (zzajv zzajvVar : list) {
                        zzl(bufferedOutputStream, zzajvVar.zza());
                        zzl(bufferedOutputStream, zzajvVar.zzb());
                    }
                } else {
                    zzj(bufferedOutputStream, 0);
                }
                bufferedOutputStream.flush();
                bufferedOutputStream.write(zzajmVar.zza);
                bufferedOutputStream.close();
                zzakwVar.zza = zzg.length();
                zzo(str, zzakwVar);
                if (this.zzb >= this.zzd) {
                    if (zzakp.zzb) {
                        zzakp.zzd("Pruning old cache entries.", new Object[0]);
                    }
                    long j2 = this.zzb;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    Iterator it = this.zza.entrySet().iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        zzakw zzakwVar2 = (zzakw) ((Map.Entry) it.next()).getValue();
                        if (zzg(zzakwVar2.zzb).delete()) {
                            this.zzb -= zzakwVar2.zza;
                        } else {
                            String str3 = zzakwVar2.zzb;
                            zzakp.zza("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                        }
                        it.remove();
                        i2++;
                        if (this.zzb < this.zzd * 0.9f) {
                            break;
                        }
                    }
                    if (zzakp.zzb) {
                        zzakp.zzd("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.zzb - j2), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                    }
                }
            } catch (IOException e) {
                zzakp.zza("%s", e.toString());
                bufferedOutputStream.close();
                zzakp.zza("Failed to write header for %s", zzg.getAbsolutePath());
                throw new IOException();
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
        zzakp.zza("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }

    public zzakz(File file, int i) {
        this.zzc = new zzakv(this, file);
    }
}
