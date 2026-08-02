package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.net.URLDecoder;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzev extends zzer {
    private zzfc zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzev() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.zzd;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(zzen.zzH(this.zzb), this.zzc, bArr, i, min);
        this.zzc += min;
        this.zzd -= min;
        zzg(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final long zzb(zzfc zzfcVar) throws IOException {
        zzi(zzfcVar);
        this.zza = zzfcVar;
        Uri uri = zzfcVar.zza;
        String scheme = uri.getScheme();
        zzdd.zze("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String[] zzag = zzen.zzag(uri.getSchemeSpecificPart(), ",");
        if (zzag.length != 2) {
            throw zzbu.zzb("Unexpected URI format: ".concat(String.valueOf(String.valueOf(uri))), null);
        }
        String str = zzag[1];
        if (zzag[0].contains(";base64")) {
            try {
                this.zzb = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw zzbu.zzb("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e);
            }
        } else {
            this.zzb = zzen.zzaa(URLDecoder.decode(str, zzfsk.zza.name()));
        }
        long j = zzfcVar.zzf;
        int length = this.zzb.length;
        if (j > length) {
            this.zzb = null;
            throw new zzey(2008);
        }
        int i = (int) j;
        this.zzc = i;
        int i2 = length - i;
        this.zzd = i2;
        long j2 = zzfcVar.zzg;
        if (j2 != -1) {
            this.zzd = (int) Math.min(i2, j2);
        }
        zzj(zzfcVar);
        long j3 = zzfcVar.zzg;
        return j3 != -1 ? j3 : this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final Uri zzc() {
        zzfc zzfcVar = this.zza;
        if (zzfcVar != null) {
            return zzfcVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzh();
        }
        this.zza = null;
    }
}
