package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzgn extends zzfs {
    private RandomAccessFile zza;
    private Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzgn() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i, int i2) throws zzgm {
        if (i2 == 0) {
            return 0;
        }
        if (this.zzc == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.zza;
            String str = zzeo.zza;
            RandomAccessFile randomAccessFile2 = randomAccessFile;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(this.zzc, i2));
            if (read > 0) {
                this.zzc -= read;
                zzh(read);
            }
            return read;
        } catch (IOException e) {
            throw new zzgm(e, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final long zzb(zzge zzgeVar) throws zzgm {
        Uri uri = zzgeVar.zza;
        this.zzb = uri;
        zzf(zzgeVar);
        int i = PlaybackException.ERROR_CODE_IO_NO_PERMISSION;
        try {
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            String str = path;
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.zza = randomAccessFile;
            try {
                long j = zzgeVar.zze;
                randomAccessFile.seek(j);
                long j2 = zzgeVar.zzf;
                if (j2 == -1) {
                    j2 = this.zza.length() - j;
                }
                this.zzc = j2;
                if (j2 < 0) {
                    throw new zzgm(null, null, 2008);
                }
                this.zzd = true;
                zzg(zzgeVar);
                return this.zzc;
            } catch (IOException e) {
                throw new zzgm(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new zzgm(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2, 1004);
            }
            if (!(e2.getCause() instanceof ErrnoException) || ((ErrnoException) e2.getCause()).errno != OsConstants.EACCES) {
                i = 2005;
            }
            throw new zzgm(e2, i);
        } catch (SecurityException e3) {
            throw new zzgm(e3, PlaybackException.ERROR_CODE_IO_NO_PERMISSION);
        } catch (RuntimeException e4) {
            throw new zzgm(e4, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() throws zzgm {
        this.zzb = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.zza;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.zza = null;
                if (this.zzd) {
                    this.zzd = false;
                    zzi();
                }
            } catch (IOException e) {
                throw new zzgm(e, 2000);
            }
        } catch (Throwable th) {
            this.zza = null;
            if (this.zzd) {
                this.zzd = false;
                zzi();
            }
            throw th;
        }
    }
}
