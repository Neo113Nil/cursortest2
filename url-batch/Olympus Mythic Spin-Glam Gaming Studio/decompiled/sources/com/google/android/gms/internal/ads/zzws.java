package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzws implements zzyh {
    private final zzagn zza;

    @Nullable
    private zzagh zzb;

    @Nullable
    private zzagi zzc;

    public zzws(zzagn zzagnVar) {
        this.zza = zzagnVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
    
        if (r6.zzn() != r11) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        if (r6.zzn() != r11) goto L23;
     */
    @Override // com.google.android.gms.internal.ads.zzyh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzj zzjVar, Uri uri, Map map, long j, long j2, zzagk zzagkVar) throws IOException {
        zzafy zzafyVar = new zzafy(zzjVar, j, j2);
        this.zzc = zzafyVar;
        if (this.zzb != null) {
            return;
        }
        zzagh[] zzb = this.zza.zzb(uri, map);
        int length = zzb.length;
        zzgxj zzv = zzgxm.zzv(length);
        if (length == 1) {
            this.zzb = zzb[0];
        } else {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                zzagh zzaghVar = zzb[i];
                try {
                } catch (EOFException unused) {
                    if (this.zzb == null) {
                    }
                } catch (Throwable th) {
                    zzguk.zzi(this.zzb != null || zzafyVar.zzn() == j);
                    zzafyVar.zzl();
                    throw th;
                }
                if (zzaghVar.zza(zzafyVar)) {
                    this.zzb = zzaghVar;
                    zzguk.zzi(true);
                    zzafyVar.zzl();
                    break;
                } else {
                    zzv.zzh(zzaghVar.zzb());
                    if (this.zzb == null) {
                    }
                    boolean z = true;
                    zzguk.zzi(z);
                    zzafyVar.zzl();
                    i++;
                }
            }
            if (this.zzb == null) {
                String zzd = zzgue.zzd(zzgym.zzc(zzgxm.zzr(zzb), zzwr.zza), ", ");
                StringBuilder sb = new StringBuilder(zzd.length() + 58);
                sb.append("None of the available extractors (");
                sb.append(zzd);
                sb.append(") could read the stream.");
                throw new zzzs(sb.toString(), uri, zzv.zzi());
            }
        }
        this.zzb.zzc(zzagkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final void zzb() {
        zzagh zzaghVar = this.zzb;
        if (zzaghVar != null) {
            zzaghVar.zzf();
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final void zzc() {
        zzagh zzaghVar = this.zzb;
        if (zzaghVar != null && (zzaghVar instanceof zzalb)) {
            ((zzalb) zzaghVar).zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final long zzd() {
        zzagi zzagiVar = this.zzc;
        if (zzagiVar != null) {
            return zzagiVar.zzn();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final void zze(long j, long j2) {
        zzagh zzaghVar = this.zzb;
        zzaghVar.getClass();
        zzaghVar.zze(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final int zzf(zzahh zzahhVar) throws IOException {
        zzagi zzagiVar;
        zzagh zzaghVar = this.zzb;
        if (zzaghVar == null || (zzagiVar = this.zzc) == null) {
            throw null;
        }
        return zzaghVar.zzd(zzagiVar, zzahhVar);
    }
}
