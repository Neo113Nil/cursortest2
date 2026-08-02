package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import androidx.core.view.PointerIconCompat;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgj extends zzfl {
    private RandomAccessFile zza;
    private Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzgj() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i, int i2) throws zzgi {
        if (i2 == 0) {
            return 0;
        }
        if (this.zzc == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.zza;
            int i3 = zzet.zza;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(this.zzc, i2));
            if (read > 0) {
                this.zzc -= read;
                zzg(read);
            }
            return read;
        } catch (IOException e) {
            throw new zzgi(e, AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final long zzb(zzfy zzfyVar) throws zzgi {
        boolean zzb;
        Uri uri = zzfyVar.zza;
        this.zzb = uri;
        zzi(zzfyVar);
        int i = AdError.INTERNAL_ERROR_2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.zza = randomAccessFile;
            try {
                randomAccessFile.seek(zzfyVar.zze);
                long j = zzfyVar.zzf;
                if (j == -1) {
                    j = this.zza.length() - zzfyVar.zze;
                }
                this.zzc = j;
                if (j < 0) {
                    throw new zzgi(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                this.zzd = true;
                zzj(zzfyVar);
                return this.zzc;
            } catch (IOException e) {
                throw new zzgi(e, AdError.SERVER_ERROR_CODE);
            }
        } catch (FileNotFoundException e2) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new zzgi(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2, PointerIconCompat.TYPE_WAIT);
            }
            int i2 = zzet.zza;
            zzb = zzgh.zzb(e2.getCause());
            if (true != zzb) {
                i = 2005;
            }
            throw new zzgi(e2, i);
        } catch (SecurityException e3) {
            throw new zzgi(e3, AdError.INTERNAL_ERROR_2006);
        } catch (RuntimeException e4) {
            throw new zzgi(e4, AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final void zzd() throws zzgi {
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
                throw new zzgi(e, AdError.SERVER_ERROR_CODE);
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
