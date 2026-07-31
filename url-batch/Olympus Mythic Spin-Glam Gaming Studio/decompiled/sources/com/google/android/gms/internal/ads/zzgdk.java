package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzgdk {
    private static zzgdk zzb;
    final zzgdl zza;

    private zzgdk(Context context) {
        this.zza = zzgdl.zza(context);
    }

    public static final zzgdk zza(Context context) {
        zzgdk zzgdkVar;
        synchronized (zzgdk.class) {
            try {
                if (zzb == null) {
                    zzb = new zzgdk(context);
                }
                zzgdkVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgdkVar;
    }

    public final void zzb(boolean z) throws IOException {
        synchronized (zzgdk.class) {
            try {
                zzgdl zzgdlVar = this.zza;
                zzgdlVar.zzb("paidv2_publisher_option", Boolean.valueOf(z));
                if (!z) {
                    zzgdlVar.zzf("paidv2_creation_time");
                    zzgdlVar.zzf("paidv2_id");
                    zzgdlVar.zzf("vendor_scoped_gpid_v2_id");
                    zzgdlVar.zzf("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzc() {
        boolean zze;
        synchronized (zzgdk.class) {
            zze = this.zza.zze("paidv2_publisher_option", true);
        }
        return zze;
    }

    public final void zzd(boolean z) throws IOException {
        synchronized (zzgdk.class) {
            this.zza.zzb("paidv2_user_option", Boolean.valueOf(z));
        }
    }

    public final boolean zze() {
        boolean zze;
        synchronized (zzgdk.class) {
            zze = this.zza.zze("paidv2_user_option", true);
        }
        return zze;
    }
}
