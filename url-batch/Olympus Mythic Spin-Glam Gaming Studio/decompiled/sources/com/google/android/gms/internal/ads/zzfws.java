package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzfws implements zzfwl {
    private static zzfws zza;
    private float zzb = 0.0f;
    private zzfwg zzc;
    private zzfwk zzd;

    public zzfws(zzfwh zzfwhVar, zzfwd zzfwdVar) {
    }

    public static zzfws zza() {
        if (zza == null) {
            zza = new zzfws(new zzfwh(), new zzfwd());
        }
        return zza;
    }

    public final void zzb(Context context) {
        this.zzc = new zzfwg(new Handler(), context, new zzfwc(), this);
    }

    public final void zzc() {
        zzfwj.zza().zzg(this);
        zzfwj.zza().zze();
        zzfxu.zzb().zzc();
        this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfwl
    public final void zzd(boolean z) {
        if (z) {
            zzfxu.zzb().zzc();
        } else {
            zzfxu.zzb().zze();
        }
    }

    public final void zze() {
        zzfxu.zzb().zzd();
        zzfwj.zza().zzf();
        this.zzc.zzb();
    }

    public final void zzf(float f) {
        this.zzb = f;
        if (this.zzd == null) {
            this.zzd = zzfwk.zza();
        }
        Iterator it = this.zzd.zzf().iterator();
        while (it.hasNext()) {
            ((zzfvq) it.next()).zzg().zzo(f);
        }
    }

    public final float zzg() {
        return this.zzb;
    }
}
