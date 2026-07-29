package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzey implements zzer {
    private final Context zza;
    private final List zzb = new ArrayList();
    private final zzer zzc;
    private zzer zzd;
    private zzer zze;
    private zzer zzf;
    private zzer zzg;
    private zzer zzh;
    private zzer zzi;
    private zzer zzj;
    private zzer zzk;

    public zzey(Context context, zzer zzerVar) {
        this.zza = context.getApplicationContext();
        this.zzc = zzerVar;
    }

    private final zzer zzg() {
        if (this.zze == null) {
            zzej zzejVar = new zzej(this.zza);
            this.zze = zzejVar;
            zzh(zzejVar);
        }
        return this.zze;
    }

    private final void zzh(zzer zzerVar) {
        for (int i = 0; i < this.zzb.size(); i++) {
            zzerVar.zzf((zzft) this.zzb.get(i));
        }
    }

    private static final void zzi(zzer zzerVar, zzft zzftVar) {
        if (zzerVar != null) {
            zzerVar.zzf(zzftVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final long zzb(zzew zzewVar) throws IOException {
        zzer zzerVar;
        zzcw.zzf(this.zzk == null);
        String scheme = zzewVar.zza.getScheme();
        if (zzeg.zzV(zzewVar.zza)) {
            String path = zzewVar.zza.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.zzd == null) {
                    zzfh zzfhVar = new zzfh();
                    this.zzd = zzfhVar;
                    zzh(zzfhVar);
                }
                this.zzk = this.zzd;
            } else {
                this.zzk = zzg();
            }
        } else if ("asset".equals(scheme)) {
            this.zzk = zzg();
        } else if ("content".equals(scheme)) {
            if (this.zzf == null) {
                zzeo zzeoVar = new zzeo(this.zza);
                this.zzf = zzeoVar;
                zzh(zzeoVar);
            }
            this.zzk = this.zzf;
        } else if ("rtmp".equals(scheme)) {
            if (this.zzg == null) {
                try {
                    zzer zzerVar2 = (zzer) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.zzg = zzerVar2;
                    zzh(zzerVar2);
                } catch (ClassNotFoundException unused) {
                    Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
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
                zzfv zzfvVar = new zzfv(2000);
                this.zzh = zzfvVar;
                zzh(zzfvVar);
            }
            this.zzk = this.zzh;
        } else if ("data".equals(scheme)) {
            if (this.zzi == null) {
                zzep zzepVar = new zzep();
                this.zzi = zzepVar;
                zzh(zzepVar);
            }
            this.zzk = this.zzi;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.zzj == null) {
                    zzfr zzfrVar = new zzfr(this.zza);
                    this.zzj = zzfrVar;
                    zzh(zzfrVar);
                }
                zzerVar = this.zzj;
            } else {
                zzerVar = this.zzc;
            }
            this.zzk = zzerVar;
        }
        return this.zzk.zzb(zzewVar);
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final Uri zzc() {
        zzer zzerVar = this.zzk;
        if (zzerVar == null) {
            return null;
        }
        return zzerVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final void zzd() throws IOException {
        zzer zzerVar = this.zzk;
        if (zzerVar != null) {
            try {
                zzerVar.zzd();
            } finally {
                this.zzk = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzer, com.google.android.gms.internal.ads.zzfo
    public final Map zze() {
        zzer zzerVar = this.zzk;
        return zzerVar == null ? Collections.emptyMap() : zzerVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        zzer zzerVar = this.zzk;
        Objects.requireNonNull(zzerVar);
        return zzerVar.zza(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final void zzf(zzft zzftVar) {
        Objects.requireNonNull(zzftVar);
        this.zzc.zzf(zzftVar);
        this.zzb.add(zzftVar);
        zzi(this.zzd, zzftVar);
        zzi(this.zze, zzftVar);
        zzi(this.zzf, zzftVar);
        zzi(this.zzg, zzftVar);
        zzi(this.zzh, zzftVar);
        zzi(this.zzi, zzftVar);
        zzi(this.zzj, zzftVar);
    }
}
