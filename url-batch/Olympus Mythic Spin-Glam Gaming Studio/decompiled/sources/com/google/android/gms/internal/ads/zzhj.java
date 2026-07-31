package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzhj extends zzhk {
    private final AssetManager zza;

    @Nullable
    private Uri zzb;

    @Nullable
    private InputStream zzc;
    private long zzd;
    private boolean zze;

    public zzhj(Context context) {
        super(false);
        this.zza = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws zzhi {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zzd;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new zzhi(e, 2000);
            }
        }
        InputStream inputStream = this.zzc;
        String str = zzfm.zza;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.zzd;
        if (j2 != -1) {
            this.zzd = j2 - read;
        }
        zzh(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final long zzb(zzhw zzhwVar) throws zzhi {
        try {
            Uri uri = zzhwVar.zza;
            this.zzb = uri;
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            zzf(zzhwVar);
            InputStream open = this.zza.open(path, 1);
            this.zzc = open;
            long j = zzhwVar.zze;
            if (open.skip(j) < j) {
                throw new zzhi(null, 2008);
            }
            long j2 = zzhwVar.zzf;
            if (j2 != -1) {
                this.zzd = j2;
            } else {
                long available = this.zzc.available();
                this.zzd = available;
                if (available == 2147483647L) {
                    this.zzd = -1L;
                }
            }
            this.zze = true;
            zzg(zzhwVar);
            return this.zzd;
        } catch (zzhi e) {
            throw e;
        } catch (IOException e2) {
            throw new zzhi(e2, true != (e2 instanceof FileNotFoundException) ? 2000 : 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    @Nullable
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zzd() throws zzhi {
        this.zzb = null;
        try {
            try {
                InputStream inputStream = this.zzc;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.zzc = null;
                if (this.zze) {
                    this.zze = false;
                    zzi();
                }
            } catch (IOException e) {
                throw new zzhi(e, 2000);
            }
        } catch (Throwable th) {
            this.zzc = null;
            if (this.zze) {
                this.zze = false;
                zzi();
            }
            throw th;
        }
    }
}
