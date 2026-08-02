package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzflm {
    private static zzflm zza;
    private float zzb = 0.0f;
    private final zzflf zzc;
    private final zzfld zzd;
    private zzfle zze;
    private zzflg zzf;

    public zzflm(zzflf zzflfVar, zzfld zzfldVar) {
        this.zzc = zzflfVar;
        this.zzd = zzfldVar;
    }

    public static zzflm zzb() {
        if (zza == null) {
            zza = new zzflm(new zzflf(), new zzfld());
        }
        return zza;
    }

    public final float zza() {
        return this.zzb;
    }

    public final void zzc(Context context) {
        this.zze = new zzfle(new Handler(), context, new zzflc(), this, null);
    }

    public final void zzd(float f) {
        this.zzb = f;
        if (this.zzf == null) {
            this.zzf = zzflg.zza();
        }
        Iterator it = this.zzf.zzb().iterator();
        while (it.hasNext()) {
            ((zzfkv) it.next()).zzg().zzh(f);
        }
    }

    public final void zze() {
        zzflh.zza().zzd(this);
        zzflh.zza().zzb();
        zzfmi.zzd().zzi();
        this.zze.zza();
    }

    public final void zzf() {
        zzfmi.zzd().zzj();
        zzflh.zza().zzc();
        this.zze.zzb();
    }
}
