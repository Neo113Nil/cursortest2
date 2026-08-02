package com.google.android.play.core.assetpacks;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SequenceInputStream;
import java.util.zip.GZIPInputStream;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes2.dex */
final class zzcf {
    private static final com.google.android.play.core.internal.zzag zza = new com.google.android.play.core.internal.zzag("ExtractChunkTaskHandler");
    private final byte[] zzb = new byte[8192];
    private final zzbh zzc;
    private final com.google.android.play.core.internal.zzco zzd;
    private final com.google.android.play.core.internal.zzco zze;
    private final zzco zzf;
    private final zzeb zzg;

    zzcf(zzbh zzbhVar, com.google.android.play.core.internal.zzco zzcoVar, com.google.android.play.core.internal.zzco zzcoVar2, zzco zzcoVar3, zzeb zzebVar) {
        this.zzc = zzbhVar;
        this.zzd = zzcoVar;
        this.zze = zzcoVar2;
        this.zzf = zzcoVar3;
        this.zzg = zzebVar;
    }

    private final File zzb(zzce zzceVar) {
        File zzp = this.zzc.zzp(zzceVar.zzl, zzceVar.zza, zzceVar.zzb, zzceVar.zzd);
        if (!zzp.exists()) {
            zzp.mkdirs();
        }
        return zzp;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:11|(2:13|(12:15|(1:(1:(2:19|(1:21)(2:86|87))(2:88|89))(2:90|(10:92|(6:24|(4:25|(2:29|(1:38)(4:33|(1:35)|36|37))|39|(1:41)(1:66))|44|(1:46)|47|(2:49|(1:51)(2:52|(1:54)(3:55|(2:57|(1:59)(2:61|62))(1:64)|60))))|67|68|(2:80|81)|70|71|72|73|(2:75|76)(1:77))(2:93|94)))(2:95|(4:97|(4:98|(1:100)|101|(1:104)(1:112))|107|(3:109|110|111))(2:113|114))|22|(0)|67|68|(0)|70|71|72|73|(0)(0))(2:115|116))|117|(0)|67|68|(0)|70|71|72|73|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02fa, code lost:
    
        com.google.android.play.core.assetpacks.zzcf.zza.zze("Could not close file for chunk %s of slice %s of pack %s.", java.lang.Integer.valueOf(r23.zzf), r23.zzd, r23.zzl);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0186 A[Catch: all -> 0x0292, TryCatch #2 {all -> 0x0292, blocks: (B:24:0x0186, B:25:0x018f, B:27:0x0199, B:29:0x019f, B:31:0x01a5, B:33:0x01ab, B:35:0x01cf, B:37:0x01db, B:38:0x01df, B:39:0x01e6, B:41:0x01ec, B:44:0x01f2, B:46:0x01f8, B:47:0x0208, B:49:0x020e, B:51:0x0214, B:52:0x0227, B:54:0x022d, B:55:0x023c, B:57:0x0242, B:60:0x0283, B:61:0x026a, B:62:0x0271, B:64:0x0272, B:111:0x0151, B:113:0x0156, B:114:0x0160, B:115:0x0161, B:116:0x0181), top: B:11:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x029e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.play.core.assetpacks.zzbh] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzce zzceVar) {
        InputStream inputStream;
        InputStream inputStream2;
        zzet zzb;
        File zzc;
        long length;
        int min;
        int max;
        long j;
        ?? r10 = this.zzc;
        String str = zzceVar.zzl;
        int i = zzceVar.zza;
        long j2 = zzceVar.zzb;
        String str2 = zzceVar.zzd;
        zzen zzenVar = new zzen(r10, str, i, j2, str2);
        File zzo = r10.zzo(str, i, j2, str2);
        if (!zzo.exists()) {
            zzo.mkdirs();
        }
        try {
            InputStream inputStream3 = zzceVar.zzj;
            InputStream gZIPInputStream = zzceVar.zze != 1 ? inputStream3 : new GZIPInputStream(inputStream3, 8192);
            try {
                try {
                    if (zzceVar.zzf > 0) {
                        zzem zzb2 = zzenVar.zzb();
                        int zzb3 = zzb2.zzb();
                        int i2 = zzceVar.zzf;
                        if (zzb3 != i2 - 1) {
                            throw new zzck(String.format("Trying to resume with chunk number %s when previously processed chunk was number %s.", Integer.valueOf(i2), Integer.valueOf(zzb2.zzb())), zzceVar.zzk);
                        }
                        int zza2 = zzb2.zza();
                        if (zza2 == 1) {
                            zza.zza("Resuming zip entry from last chunk during file %s.", zzb2.zze());
                            File file = new File(zzb2.zze());
                            if (!file.exists()) {
                                throw new zzck("Partial file specified in checkpoint does not exist. Corrupt directory.", zzceVar.zzk);
                            }
                            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                            randomAccessFile.seek(zzb2.zzc());
                            long zzd = zzb2.zzd();
                            while (true) {
                                min = (int) Math.min(zzd, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                                max = Math.max(gZIPInputStream.read(this.zzb, 0, min), 0);
                                if (max > 0) {
                                    randomAccessFile.write(this.zzb, 0, max);
                                }
                                j = zzd - max;
                                if (j <= 0 || max <= 0) {
                                    break;
                                } else {
                                    zzd = j;
                                }
                            }
                            long length2 = randomAccessFile.length();
                            randomAccessFile.close();
                            if (max != min) {
                                zza.zza("Chunk has ended while resuming the previous chunks file content.", new Object[0]);
                                inputStream = gZIPInputStream;
                                zzenVar.zzg(file.getCanonicalPath(), length2, j, zzceVar.zzf);
                            }
                        } else {
                            if (zza2 == 2) {
                                zza.zza("Resuming zip entry from last chunk during local file header.", new Object[0]);
                                File zzm = this.zzc.zzm(zzceVar.zzl, zzceVar.zza, zzceVar.zzb, zzceVar.zzd);
                                if (!zzm.exists()) {
                                    throw new zzck("Checkpoint extension file not found.", zzceVar.zzk);
                                }
                                inputStream = gZIPInputStream;
                                inputStream2 = new SequenceInputStream(new FileInputStream(zzm), gZIPInputStream);
                                if (inputStream2 != null) {
                                    zzbw zzbwVar = new zzbw(inputStream2);
                                    File zzb4 = zzb(zzceVar);
                                    do {
                                        zzb = zzbwVar.zzb();
                                        if (!zzb.zze() && !zzbwVar.zzc()) {
                                            if (!zzb.zzh() || zzb.zzg()) {
                                                zzenVar.zzk(zzb.zzf(), zzbwVar);
                                            } else {
                                                zzenVar.zzj(zzb.zzf());
                                                File file2 = new File(zzb4, zzb.zzc());
                                                file2.getParentFile().mkdirs();
                                                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                                int read = zzbwVar.read(this.zzb, 0, 8192);
                                                while (read > 0) {
                                                    fileOutputStream.write(this.zzb, 0, read);
                                                    read = zzbwVar.read(this.zzb, 0, 8192);
                                                }
                                                fileOutputStream.close();
                                            }
                                        }
                                        if (zzbwVar.zzd()) {
                                            break;
                                        }
                                    } while (!zzbwVar.zzc());
                                    if (zzbwVar.zzc()) {
                                        zza.zza("Writing central directory metadata.", new Object[0]);
                                        zzenVar.zzk(zzb.zzf(), inputStream2);
                                    }
                                    if (!zzceVar.zza()) {
                                        if (zzb.zze()) {
                                            zza.zza("Writing slice checkpoint for partial local file header.", new Object[0]);
                                            zzenVar.zzh(zzb.zzf(), zzceVar.zzf);
                                        } else if (zzbwVar.zzc()) {
                                            zza.zza("Writing slice checkpoint for central directory.", new Object[0]);
                                            zzenVar.zzf(zzceVar.zzf);
                                        } else {
                                            if (zzb.zza() == 0) {
                                                zza.zza("Writing slice checkpoint for partial file.", new Object[0]);
                                                zzc = new File(zzb(zzceVar), zzb.zzc());
                                                length = zzb.zzb() - zzbwVar.zza();
                                                if (zzc.length() != length) {
                                                    throw new zzck("Partial file is of unexpected size.");
                                                }
                                            } else {
                                                zza.zza("Writing slice checkpoint for partial unextractable file.", new Object[0]);
                                                zzc = zzenVar.zzc();
                                                length = zzc.length();
                                            }
                                            zzenVar.zzg(zzc.getCanonicalPath(), length, zzbwVar.zza(), zzceVar.zzf);
                                        }
                                    }
                                }
                                inputStream.close();
                                if (zzceVar.zza()) {
                                    try {
                                        zzenVar.zzi(zzceVar.zzf);
                                    } catch (IOException e) {
                                        zza.zzb("Writing extraction finished checkpoint failed with %s.", e.getMessage());
                                        throw new zzck("Writing extraction finished checkpoint failed.", e, zzceVar.zzk);
                                    }
                                }
                                zza.zzd("Extraction finished for chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(zzceVar.zzf), zzceVar.zzd, zzceVar.zzl, Integer.valueOf(zzceVar.zzk));
                                ((zzy) this.zzd.zza()).zzg(zzceVar.zzk, zzceVar.zzl, zzceVar.zzd, zzceVar.zzf);
                                zzceVar.zzj.close();
                                if (zzceVar.zzi == 3) {
                                    zzbb zzbbVar = (zzbb) this.zze.zza();
                                    String str3 = zzceVar.zzl;
                                    long j3 = zzceVar.zzh;
                                    zzbbVar.zzd(AssetPackState.zzb(str3, 3, 0, j3, j3, this.zzf.zzb(str3, zzceVar), 1, zzceVar.zzc, this.zzg.zza(zzceVar.zzl)));
                                    return;
                                }
                                return;
                            }
                            if (zza2 != 3) {
                                throw new zzck(String.format("Slice checkpoint file corrupt. Unexpected FileExtractionStatus %s.", Integer.valueOf(zzb2.zza())), zzceVar.zzk);
                            }
                            zza.zza("Resuming central directory from last chunk.", new Object[0]);
                            zzenVar.zzd(gZIPInputStream, zzb2.zzc());
                            if (!zzceVar.zza()) {
                                throw new zzck("Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB.", zzceVar.zzk);
                            }
                            inputStream = gZIPInputStream;
                        }
                        inputStream2 = null;
                        if (inputStream2 != null) {
                        }
                        inputStream.close();
                        if (zzceVar.zza()) {
                        }
                        zza.zzd("Extraction finished for chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(zzceVar.zzf), zzceVar.zzd, zzceVar.zzl, Integer.valueOf(zzceVar.zzk));
                        ((zzy) this.zzd.zza()).zzg(zzceVar.zzk, zzceVar.zzl, zzceVar.zzd, zzceVar.zzf);
                        zzceVar.zzj.close();
                        if (zzceVar.zzi == 3) {
                        }
                    }
                    inputStream = gZIPInputStream;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                    }
                    inputStream.close();
                    if (zzceVar.zza()) {
                    }
                    zza.zzd("Extraction finished for chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(zzceVar.zzf), zzceVar.zzd, zzceVar.zzl, Integer.valueOf(zzceVar.zzk));
                    ((zzy) this.zzd.zza()).zzg(zzceVar.zzk, zzceVar.zzl, zzceVar.zzd, zzceVar.zzf);
                    zzceVar.zzj.close();
                    if (zzceVar.zzi == 3) {
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        r10.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                r10 = gZIPInputStream;
            }
        } catch (IOException e2) {
            zza.zzb("IOException during extraction %s.", e2.getMessage());
            throw new zzck(String.format("Error extracting chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(zzceVar.zzf), zzceVar.zzd, zzceVar.zzl, Integer.valueOf(zzceVar.zzk)), e2, zzceVar.zzk);
        }
    }
}
