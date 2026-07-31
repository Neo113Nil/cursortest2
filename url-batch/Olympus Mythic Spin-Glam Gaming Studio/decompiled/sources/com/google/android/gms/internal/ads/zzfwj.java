package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzfwj extends zzfwm {

    @SuppressLint({"StaticFieldLeak"})
    private static final zzfwj zzb = new zzfwj();

    private zzfwj() {
    }

    public static zzfwj zza() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfwm
    public final boolean zzb() {
        Iterator it = zzfwk.zza().zzf().iterator();
        while (it.hasNext()) {
            View zzi = ((zzfvq) it.next()).zzi();
            if (zzi != null && zzi.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfwm
    public final void zzc(boolean z) {
        Iterator it = zzfwk.zza().zze().iterator();
        while (it.hasNext()) {
            ((zzfvq) it.next()).zzg().zzf(z);
        }
    }
}
