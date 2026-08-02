package com.google.android.play.core.internal;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.util.Log;
import com.google.android.play.core.splitcompat.SplitCompat;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes2.dex */
public final class zzaw implements com.google.android.play.core.splitinstall.zzh {
    private final Context zza;
    private final com.google.android.play.core.splitcompat.zze zzb;
    private final zzay zzc;
    private final Executor zzd;
    private final com.google.android.play.core.splitcompat.zzr zze;

    public zzaw(Context context, Executor executor, zzay zzayVar, com.google.android.play.core.splitcompat.zze zzeVar, com.google.android.play.core.splitcompat.zzr zzrVar, byte[] bArr) {
        this.zza = context;
        this.zzb = zzeVar;
        this.zzc = zzayVar;
        this.zzd = executor;
        this.zze = zzrVar;
    }

    static /* bridge */ /* synthetic */ void zzb(zzaw zzawVar, List list, com.google.android.play.core.splitinstall.zzf zzfVar) {
        Integer zze = zzawVar.zze(list);
        if (zze == null) {
            return;
        }
        if (zze.intValue() == 0) {
            zzfVar.zzc();
        } else {
            zzfVar.zzb(zze.intValue());
        }
    }

    static /* bridge */ /* synthetic */ void zzc(zzaw zzawVar, com.google.android.play.core.splitinstall.zzf zzfVar) {
        try {
            if (SplitCompat.zzd(zzce.zza(zzawVar.zza))) {
                Log.i("SplitCompat", "Splits installed.");
                zzfVar.zza();
            } else {
                Log.e("SplitCompat", "Emulating splits failed.");
                zzfVar.zzb(-12);
            }
        } catch (Exception e) {
            Log.e("SplitCompat", "Error emulating splits.", e);
            zzfVar.zzb(-12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0122 A[Catch: Exception -> 0x0126, TRY_LEAVE, TryCatch #8 {Exception -> 0x0126, blocks: (B:3:0x0004, B:88:0x0122, B:94:0x011f, B:6:0x0016, B:10:0x0024, B:11:0x002d, B:13:0x0033, B:15:0x005b, B:19:0x006e, B:22:0x007a, B:33:0x0099, B:48:0x00a6, B:52:0x0068, B:57:0x00a7, B:59:0x00ac, B:61:0x00b6, B:63:0x00be, B:66:0x00c6, B:67:0x00d4, B:69:0x00d8, B:71:0x00e9, B:72:0x0112, B:75:0x00f0, B:78:0x00f6, B:81:0x00fd, B:84:0x0105, B:86:0x010c), top: B:2:0x0004, inners: #9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Integer zze(List list) {
        FileLock fileLock;
        File[] listFiles;
        try {
            FileChannel channel = new RandomAccessFile(this.zzb.zzd(), "rw").getChannel();
            Integer num = null;
            try {
                try {
                    fileLock = channel.tryLock();
                } catch (OverlappingFileLockException unused) {
                    fileLock = null;
                }
                if (fileLock != null) {
                    int i = 0;
                    try {
                        Log.i("SplitCompat", "Copying splits.");
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            Intent intent = (Intent) it.next();
                            String stringExtra = intent.getStringExtra("split_id");
                            AssetFileDescriptor openAssetFileDescriptor = this.zza.getContentResolver().openAssetFileDescriptor(intent.getData(), "r");
                            File zze = this.zzb.zze(stringExtra);
                            if ((!zze.exists() || zze.length() == openAssetFileDescriptor.getLength()) && zze.exists()) {
                            }
                            if (this.zzb.zzg(stringExtra).exists()) {
                                continue;
                            } else {
                                BufferedInputStream bufferedInputStream = new BufferedInputStream(openAssetFileDescriptor.createInputStream());
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(zze);
                                    try {
                                        byte[] bArr = new byte[4096];
                                        while (true) {
                                            int read = bufferedInputStream.read(bArr);
                                            if (read <= 0) {
                                                break;
                                            }
                                            fileOutputStream.write(bArr, 0, read);
                                        }
                                        fileOutputStream.close();
                                        bufferedInputStream.close();
                                    } finally {
                                    }
                                } catch (Throwable th) {
                                    try {
                                        bufferedInputStream.close();
                                    } catch (Throwable unused2) {
                                    }
                                    throw th;
                                }
                            }
                        }
                        Log.i("SplitCompat", "Splits copied.");
                        try {
                            listFiles = this.zzb.zzb().listFiles();
                            try {
                            } catch (Exception e) {
                                Log.e("SplitCompat", "Error verifying splits.", e);
                            }
                        } catch (IOException e2) {
                            Log.e("SplitCompat", "Cannot access directory for unverified splits.", e2);
                        }
                    } catch (Exception e3) {
                        Log.e("SplitCompat", "Error copying splits.", e3);
                    }
                    if (this.zzc.zzc(listFiles)) {
                        if (this.zzc.zza(listFiles)) {
                            try {
                                File[] listFiles2 = this.zzb.zzb().listFiles();
                                Arrays.sort(listFiles2);
                                int length = listFiles2.length;
                                while (true) {
                                    length--;
                                    if (length < 0) {
                                        break;
                                    }
                                    com.google.android.play.core.splitcompat.zze.zzm(listFiles2[length]);
                                    File file = listFiles2[length];
                                    file.renameTo(this.zzb.zzf(file));
                                }
                                Log.i("SplitCompat", "Splits verified.");
                            } catch (IOException e4) {
                                Log.e("SplitCompat", "Cannot write verified split.", e4);
                                i = -13;
                                num = Integer.valueOf(i);
                                fileLock.release();
                                if (channel != null) {
                                }
                                return num;
                            }
                            num = Integer.valueOf(i);
                            fileLock.release();
                        }
                    }
                    Log.e("SplitCompat", "Split verification failed.");
                    i = -11;
                    num = Integer.valueOf(i);
                    fileLock.release();
                }
                if (channel != null) {
                    channel.close();
                }
                return num;
            } catch (Throwable th2) {
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (Throwable unused3) {
                    }
                }
                throw th2;
            }
        } catch (Exception e5) {
            Log.e("SplitCompat", "Error locking files.", e5);
            return -13;
        }
    }

    @Override // com.google.android.play.core.splitinstall.zzh
    public final void zzd(List list, com.google.android.play.core.splitinstall.zzf zzfVar) {
        if (!SplitCompat.zze()) {
            throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        }
        this.zzd.execute(new zzav(this, list, zzfVar));
    }
}
