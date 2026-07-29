package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzaws {
    private final zzatv[] zza;
    private final zzatw zzb;
    private zzatv zzc;

    public zzaws(zzatv[] zzatvVarArr, zzatw zzatwVar) {
        this.zza = zzatvVarArr;
        this.zzb = zzatwVar;
    }

    public final void zza() {
        if (this.zzc != null) {
            this.zzc = null;
        }
    }

    public final zzatv zzb(zzatu zzatuVar, Uri uri) throws IOException, InterruptedException {
        zzatv zzatvVar = this.zzc;
        if (zzatvVar != null) {
            return zzatvVar;
        }
        zzatv[] zzatvVarArr = this.zza;
        int length = zzatvVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            zzatv zzatvVar2 = zzatvVarArr[i];
            try {
            } catch (EOFException unused) {
            } catch (Throwable th) {
                zzatuVar.zze();
                throw th;
            }
            if (zzatvVar2.zzg(zzatuVar)) {
                this.zzc = zzatvVar2;
                zzatuVar.zze();
                break;
            }
            continue;
            zzatuVar.zze();
            i++;
        }
        zzatv zzatvVar3 = this.zzc;
        if (zzatvVar3 != null) {
            zzatvVar3.zzd(this.zzb);
            return this.zzc;
        }
        throw new zzaxq("None of the available extractors (" + zzazn.zzk(this.zza) + ") could read the stream.", uri);
    }
}
