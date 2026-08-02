package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzrl implements zztb {
    private final zzzp zza;
    private zzzi zzb;
    private zzzj zzc;

    public zzrl(zzzp zzzpVar) {
        this.zza = zzzpVar;
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final long zzb() {
        zzzj zzzjVar = this.zzc;
        if (zzzjVar != null) {
            return zzzjVar.zzf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzc() {
        zzzi zzziVar = this.zzb;
        if (zzziVar instanceof zzaeq) {
            ((zzaeq) zzziVar).zze();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
    
        if (r6.zzf() != r11) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006c, code lost:
    
        if (r6.zzf() != r11) goto L37;
     */
    @Override // com.google.android.gms.internal.ads.zztb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzr zzrVar, Uri uri, Map map, long j, long j2, zzzl zzzlVar) throws IOException {
        zzyy zzyyVar = new zzyy(zzrVar, j, j2);
        this.zzc = zzyyVar;
        if (this.zzb != null) {
            return;
        }
        zzzi[] zzb = this.zza.zzb(uri, map);
        int length = zzb.length;
        if (length == 1) {
            this.zzb = zzb[0];
        } else {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                zzzi zzziVar = zzb[i];
                try {
                } catch (EOFException unused) {
                    if (this.zzb == null) {
                    }
                } catch (Throwable th) {
                    zzdd.zzf(this.zzb != null || zzyyVar.zzf() == j);
                    zzyyVar.zzj();
                    throw th;
                }
                if (zzziVar.zzd(zzyyVar)) {
                    this.zzb = zzziVar;
                    zzdd.zzf(zzziVar != null || zzyyVar.zzf() == j);
                    zzyyVar.zzj();
                } else {
                    if (this.zzb == null) {
                    }
                    boolean z = true;
                    zzdd.zzf(z);
                    zzyyVar.zzj();
                    i++;
                }
            }
            if (this.zzb == null) {
                throw new zzui("None of the available extractors (" + zzen.zzK(zzb) + ") could read the stream.", uri);
            }
        }
        this.zzb.zzb(zzzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zze() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final int zza(zzaai zzaaiVar) throws IOException {
        zzzi zzziVar = this.zzb;
        Objects.requireNonNull(zzziVar);
        zzzj zzzjVar = this.zzc;
        Objects.requireNonNull(zzzjVar);
        return zzziVar.zza(zzzjVar, zzaaiVar);
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzf(long j, long j2) {
        zzzi zzziVar = this.zzb;
        Objects.requireNonNull(zzziVar);
        zzziVar.zzc(j, j2);
    }
}
