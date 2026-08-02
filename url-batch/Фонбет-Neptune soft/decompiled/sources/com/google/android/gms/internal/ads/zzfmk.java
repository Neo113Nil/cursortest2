package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfmk extends zzfmn {
    private static final zzfmk zzb = new zzfmk();

    private zzfmk() {
    }

    public static zzfmk zza() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfmn
    public final void zzb(boolean z) {
        Iterator it = zzfml.zza().zzc().iterator();
        while (it.hasNext()) {
            ((zzflu) it.next()).zzg().zzk(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmn
    public final boolean zzc() {
        Iterator it = zzfml.zza().zzb().iterator();
        while (it.hasNext()) {
            View zzf = ((zzflu) it.next()).zzf();
            if (zzf != null && zzf.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
