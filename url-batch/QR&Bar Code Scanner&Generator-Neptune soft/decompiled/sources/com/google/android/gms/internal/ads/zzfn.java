package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import androidx.core.view.PointerIconCompat;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfn extends zzer {
    private RandomAccessFile zza;
    private Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzfn() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) throws zzfm {
        if (i2 == 0) {
            return 0;
        }
        if (this.zzc == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.zza;
            int i3 = zzen.zza;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(this.zzc, i2));
            if (read > 0) {
                this.zzc -= read;
                zzg(read);
            }
            return read;
        } catch (IOException e) {
            throw new zzfm(e, 2000);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        if (r1 != false) goto L37;
     */
    @Override // com.google.android.gms.internal.ads.zzex
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzfc zzfcVar) throws zzfm {
        boolean zzb;
        Uri uri = zzfcVar.zza;
        this.zzb = uri;
        zzi(zzfcVar);
        int i = 2006;
        try {
            String path = uri.getPath();
            Objects.requireNonNull(path);
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.zza = randomAccessFile;
            try {
                randomAccessFile.seek(zzfcVar.zzf);
                long j = zzfcVar.zzg;
                if (j == -1) {
                    j = this.zza.length() - zzfcVar.zzf;
                }
                this.zzc = j;
                if (j < 0) {
                    throw new zzfm(null, null, 2008);
                }
                this.zzd = true;
                zzj(zzfcVar);
                return this.zzc;
            } catch (IOException e) {
                throw new zzfm(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new zzfm(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2, PointerIconCompat.TYPE_WAIT);
            }
            if (zzen.zza >= 21) {
                zzb = zzfl.zzb(e2.getCause());
            }
            i = 2005;
            throw new zzfm(e2, i);
        } catch (SecurityException e3) {
            throw new zzfm(e3, 2006);
        } catch (RuntimeException e4) {
            throw new zzfm(e4, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final void zzd() throws zzfm {
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
                    zzh();
                }
            } catch (IOException e) {
                throw new zzfm(e, 2000);
            }
        } catch (Throwable th) {
            this.zza = null;
            if (this.zzd) {
                this.zzd = false;
                zzh();
            }
            throw th;
        }
    }
}
