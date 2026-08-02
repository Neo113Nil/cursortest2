package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import javax.annotation.Nullable;
import kotlin.time.DurationKt;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzepp implements zzevn {

    @Nullable
    private final Integer zza;

    private zzepp(@Nullable Integer num) {
        this.zza = num;
    }

    static /* bridge */ /* synthetic */ zzepp zzb(VersionInfoParcel versionInfoParcel) {
        int extensionVersion;
        int extensionVersion2;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjg)).booleanValue()) {
            return new zzepp(null);
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        int i = 0;
        try {
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "AdUtil.getAdServicesExtensionVersion");
        }
        if (Build.VERSION.SDK_INT >= 30) {
            extensionVersion2 = SdkExtensions.getExtensionVersion(30);
            if (extensionVersion2 > 3) {
                i = SdkExtensions.getExtensionVersion(DurationKt.NANOS_IN_MILLIS);
                return new zzepp(Integer.valueOf(i));
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjj)).booleanValue()) {
            if (versionInfoParcel.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzji)).intValue() && Build.VERSION.SDK_INT >= 31) {
                extensionVersion = SdkExtensions.getExtensionVersion(31);
                if (extensionVersion >= 9) {
                    i = SdkExtensions.getExtensionVersion(31);
                }
            }
        }
        return new zzepp(Integer.valueOf(i));
    }

    @Override // com.google.android.gms.internal.ads.zzevn
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Integer num = this.zza;
        Bundle bundle = (Bundle) obj;
        if (num != null) {
            bundle.putInt("aos", num.intValue());
        }
    }
}
