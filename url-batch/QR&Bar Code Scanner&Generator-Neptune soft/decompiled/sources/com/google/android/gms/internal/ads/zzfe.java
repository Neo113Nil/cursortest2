package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfe implements zzex {
    private final Context zza;
    private final List zzb = new ArrayList();
    private final zzex zzc;
    private zzex zzd;
    private zzex zze;
    private zzex zzf;
    private zzex zzg;
    private zzex zzh;
    private zzex zzi;
    private zzex zzj;
    private zzex zzk;

    public zzfe(Context context, zzex zzexVar) {
        this.zza = context.getApplicationContext();
        this.zzc = zzexVar;
    }

    private final zzex zzg() {
        if (this.zze == null) {
            zzeq zzeqVar = new zzeq(this.zza);
            this.zze = zzeqVar;
            zzh(zzeqVar);
        }
        return this.zze;
    }

    private final void zzh(zzex zzexVar) {
        for (int i = 0; i < this.zzb.size(); i++) {
            zzexVar.zzf((zzfz) this.zzb.get(i));
        }
    }

    private static final void zzi(zzex zzexVar, zzfz zzfzVar) {
        if (zzexVar != null) {
            zzexVar.zzf(zzfzVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final long zzb(zzfc zzfcVar) throws IOException {
        zzex zzexVar;
        zzdd.zzf(this.zzk == null);
        String scheme = zzfcVar.zza.getScheme();
        if (zzen.zzW(zzfcVar.zza)) {
            String path = zzfcVar.zza.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.zzd == null) {
                    zzfn zzfnVar = new zzfn();
                    this.zzd = zzfnVar;
                    zzh(zzfnVar);
                }
                this.zzk = this.zzd;
            } else {
                this.zzk = zzg();
            }
        } else if ("asset".equals(scheme)) {
            this.zzk = zzg();
        } else if ("content".equals(scheme)) {
            if (this.zzf == null) {
                zzeu zzeuVar = new zzeu(this.zza);
                this.zzf = zzeuVar;
                zzh(zzeuVar);
            }
            this.zzk = this.zzf;
        } else if ("rtmp".equals(scheme)) {
            if (this.zzg == null) {
                try {
                    zzex zzexVar2 = (zzex) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.zzg = zzexVar2;
                    zzh(zzexVar2);
                } catch (ClassNotFoundException unused) {
                    zzdw.zze("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                }
                if (this.zzg == null) {
                    this.zzg = this.zzc;
                }
            }
            this.zzk = this.zzg;
        } else if ("udp".equals(scheme)) {
            if (this.zzh == null) {
                zzgb zzgbVar = new zzgb(2000);
                this.zzh = zzgbVar;
                zzh(zzgbVar);
            }
            this.zzk = this.zzh;
        } else if ("data".equals(scheme)) {
            if (this.zzi == null) {
                zzev zzevVar = new zzev();
                this.zzi = zzevVar;
                zzh(zzevVar);
            }
            this.zzk = this.zzi;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.zzj == null) {
                    zzfx zzfxVar = new zzfx(this.zza);
                    this.zzj = zzfxVar;
                    zzh(zzfxVar);
                }
                zzexVar = this.zzj;
            } else {
                zzexVar = this.zzc;
            }
            this.zzk = zzexVar;
        }
        return this.zzk.zzb(zzfcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final Uri zzc() {
        zzex zzexVar = this.zzk;
        if (zzexVar == null) {
            return null;
        }
        return zzexVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final void zzd() throws IOException {
        zzex zzexVar = this.zzk;
        if (zzexVar != null) {
            try {
                zzexVar.zzd();
            } finally {
                this.zzk = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzex, com.google.android.gms.internal.ads.zzfu
    public final Map zze() {
        zzex zzexVar = this.zzk;
        return zzexVar == null ? Collections.emptyMap() : zzexVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        zzex zzexVar = this.zzk;
        Objects.requireNonNull(zzexVar);
        return zzexVar.zza(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final void zzf(zzfz zzfzVar) {
        Objects.requireNonNull(zzfzVar);
        this.zzc.zzf(zzfzVar);
        this.zzb.add(zzfzVar);
        zzi(this.zzd, zzfzVar);
        zzi(this.zze, zzfzVar);
        zzi(this.zzf, zzfzVar);
        zzi(this.zzg, zzfzVar);
        zzi(this.zzh, zzfzVar);
        zzi(this.zzi, zzfzVar);
        zzi(this.zzj, zzfzVar);
    }
}
