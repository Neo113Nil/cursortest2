package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzre implements zzsu {
    private final zzyz zza;
    private zzys zzb;
    private zzyt zzc;

    public zzre(zzyz zzyzVar) {
        this.zza = zzyzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final long zzb() {
        zzyt zzytVar = this.zzc;
        if (zzytVar != null) {
            return zzytVar.zzf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzc() {
        zzys zzysVar = this.zzb;
        if (zzysVar instanceof zzadp) {
            ((zzadp) zzysVar).zze();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r6.zzf() != r11) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006c, code lost:
    
        if (r6.zzf() != r11) goto L37;
     */
    @Override // com.google.android.gms.internal.ads.zzsu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzp zzpVar, Uri uri, Map map, long j, long j2, zzyv zzyvVar) throws IOException {
        zzym zzymVar = new zzym(zzpVar, j, j2);
        this.zzc = zzymVar;
        if (this.zzb != null) {
            return;
        }
        zzys[] zzb = this.zza.zzb(uri, map);
        int length = zzb.length;
        if (length == 1) {
            this.zzb = zzb[0];
        } else {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                zzys zzysVar = zzb[i];
                try {
                } catch (EOFException unused) {
                    if (this.zzb == null) {
                    }
                } catch (Throwable th) {
                    zzcw.zzf(this.zzb != null || zzymVar.zzf() == j);
                    zzymVar.zzj();
                    throw th;
                }
                if (zzysVar.zzd(zzymVar)) {
                    this.zzb = zzysVar;
                    zzcw.zzf(zzysVar != null || zzymVar.zzf() == j);
                    zzymVar.zzj();
                } else {
                    if (this.zzb == null) {
                    }
                    boolean z = true;
                    zzcw.zzf(z);
                    zzymVar.zzj();
                    i++;
                }
            }
            if (this.zzb == null) {
                throw new zzua("None of the available extractors (" + zzeg.zzJ(zzb) + ") could read the stream.", uri);
            }
        }
        this.zzb.zzb(zzyvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zze() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final int zza(zzzs zzzsVar) throws IOException {
        zzys zzysVar = this.zzb;
        Objects.requireNonNull(zzysVar);
        zzyt zzytVar = this.zzc;
        Objects.requireNonNull(zzytVar);
        return zzysVar.zza(zzytVar, zzzsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzf(long j, long j2) {
        zzys zzysVar = this.zzb;
        Objects.requireNonNull(zzysVar);
        zzysVar.zzc(j, j2);
    }
}
