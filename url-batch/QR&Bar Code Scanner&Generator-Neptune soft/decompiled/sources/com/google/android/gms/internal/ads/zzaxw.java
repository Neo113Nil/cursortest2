package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzaxw {
    private final zzauz[] zza;
    private final zzava zzb;
    private zzauz zzc;

    public zzaxw(zzauz[] zzauzVarArr, zzava zzavaVar) {
        this.zza = zzauzVarArr;
        this.zzb = zzavaVar;
    }

    public final void zza() {
        if (this.zzc != null) {
            this.zzc = null;
        }
    }

    public final zzauz zzb(zzauy zzauyVar, Uri uri) throws IOException, InterruptedException {
        zzauz zzauzVar = this.zzc;
        if (zzauzVar != null) {
            return zzauzVar;
        }
        zzauz[] zzauzVarArr = this.zza;
        int length = zzauzVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            zzauz zzauzVar2 = zzauzVarArr[i];
            try {
            } catch (EOFException unused) {
            } catch (Throwable th) {
                zzauyVar.zze();
                throw th;
            }
            if (zzauzVar2.zzg(zzauyVar)) {
                this.zzc = zzauzVar2;
                zzauyVar.zze();
                break;
            }
            continue;
            zzauyVar.zze();
            i++;
        }
        zzauz zzauzVar3 = this.zzc;
        if (zzauzVar3 != null) {
            zzauzVar3.zzd(this.zzb);
            return this.zzc;
        }
        throw new zzayu("None of the available extractors (" + zzbar.zzk(this.zza) + ") could read the stream.", uri);
    }
}
