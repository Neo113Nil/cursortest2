package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzaya implements zzaye, zzayd {
    private final Uri zza;
    private final zzazl zzb;
    private final zzavb zzc;
    private final int zzd;
    private final Handler zze;
    private final zzaxz zzf;
    private final zzatf zzg = new zzatf();
    private final int zzh;
    private zzayd zzi;
    private zzath zzj;
    private boolean zzk;

    public zzaya(Uri uri, zzazl zzazlVar, zzavb zzavbVar, int i, Handler handler, zzaxz zzaxzVar, String str, int i2) {
        this.zza = uri;
        this.zzb = zzazlVar;
        this.zzc = zzavbVar;
        this.zzd = i;
        this.zze = handler;
        this.zzf = zzaxzVar;
        this.zzh = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzaye
    public final void zza() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzaye
    public final void zzb(zzasm zzasmVar, boolean z, zzayd zzaydVar) {
        this.zzi = zzaydVar;
        zzayr zzayrVar = new zzayr(-9223372036854775807L, false);
        this.zzj = zzayrVar;
        zzaydVar.zzg(zzayrVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaye
    public final void zzc(zzayc zzaycVar) {
        ((zzaxy) zzaycVar).zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzaye
    public final void zzd() {
        this.zzi = null;
    }

    @Override // com.google.android.gms.internal.ads.zzaye
    public final zzayc zze(int i, zzazp zzazpVar) {
        zzbac.zzc(i == 0);
        return new zzaxy(this.zza, this.zzb.zza(), this.zzc.zza(), this.zzd, this.zze, this.zzf, this, zzazpVar, null, this.zzh, null);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final void zzg(zzath zzathVar, Object obj) {
        zzatf zzatfVar = this.zzg;
        zzathVar.zzd(0, zzatfVar, false);
        boolean z = zzatfVar.zzc != -9223372036854775807L;
        if (!this.zzk || z) {
            this.zzj = zzathVar;
            this.zzk = z;
            this.zzi.zzg(zzathVar, null);
        }
    }
}
