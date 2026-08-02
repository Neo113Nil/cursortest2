package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzagf implements zzzi {
    public static final zzzp zza = new zzzp() { // from class: com.google.android.gms.internal.ads.zzage
        @Override // com.google.android.gms.internal.ads.zzzp
        public final zzzi[] zza() {
            zzzp zzzpVar = zzagf.zza;
            return new zzzi[]{new zzagf()};
        }

        @Override // com.google.android.gms.internal.ads.zzzp
        public final /* synthetic */ zzzi[] zzb(Uri uri, Map map) {
            return zzzo.zza(this, uri, map);
        }
    };
    private zzzl zzb;
    private zzagn zzc;
    private boolean zzd;

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    private final boolean zze(zzzj zzzjVar) throws IOException {
        zzagh zzaghVar = new zzagh();
        if (zzaghVar.zzb(zzzjVar, true) && (zzaghVar.zza & 2) == 2) {
            int min = Math.min(zzaghVar.zze, 8);
            zzef zzefVar = new zzef(min);
            ((zzyy) zzzjVar).zzm(zzefVar.zzH(), 0, min, false);
            zzefVar.zzF(0);
            if (zzefVar.zza() >= 5 && zzefVar.zzk() == 127 && zzefVar.zzs() == 1179402563) {
                this.zzc = new zzagd();
            } else {
                zzefVar.zzF(0);
                try {
                    if (zzaav.zzd(1, zzefVar, true)) {
                        this.zzc = new zzagp();
                    }
                } catch (zzbu unused) {
                }
                zzefVar.zzF(0);
                if (zzagj.zzd(zzefVar)) {
                    this.zzc = new zzagj();
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final int zza(zzzj zzzjVar, zzaai zzaaiVar) throws IOException {
        zzdd.zzb(this.zzb);
        if (this.zzc == null) {
            if (!zze(zzzjVar)) {
                throw zzbu.zza("Failed to determine bitstream type", null);
            }
            zzzjVar.zzj();
        }
        if (!this.zzd) {
            zzaap zzv = this.zzb.zzv(0, 1);
            this.zzb.zzC();
            this.zzc.zzh(this.zzb, zzv);
            this.zzd = true;
        }
        return this.zzc.zze(zzzjVar, zzaaiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzb(zzzl zzzlVar) {
        this.zzb = zzzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzc(long j, long j2) {
        zzagn zzagnVar = this.zzc;
        if (zzagnVar != null) {
            zzagnVar.zzj(j, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final boolean zzd(zzzj zzzjVar) throws IOException {
        try {
            return zze(zzzjVar);
        } catch (zzbu unused) {
            return false;
        }
    }
}
