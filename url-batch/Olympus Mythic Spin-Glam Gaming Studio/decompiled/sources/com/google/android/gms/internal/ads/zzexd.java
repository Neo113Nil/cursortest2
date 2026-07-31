package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzexd implements zzfdg {
    private final Integer zza;

    private zzexd(Integer num) {
        this.zza = num;
    }

    static /* synthetic */ zzexd zzb(VersionInfoParcel versionInfoParcel) {
        int i;
        int extensionVersion;
        int extensionVersion2;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlH)).booleanValue()) {
            return new zzexd(null);
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        int i2 = 0;
        try {
            i = Build.VERSION.SDK_INT;
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdUtil.getAdServicesExtensionVersion");
        }
        if (i >= 30) {
            extensionVersion2 = SdkExtensions.getExtensionVersion(30);
            if (extensionVersion2 > 3) {
                i2 = SdkExtensions.getExtensionVersion(1000000);
                return new zzexd(Integer.valueOf(i2));
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlK)).booleanValue()) {
            if (versionInfoParcel.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlJ)).intValue() && i >= 31) {
                extensionVersion = SdkExtensions.getExtensionVersion(31);
                if (extensionVersion >= 9) {
                    i2 = SdkExtensions.getExtensionVersion(31);
                }
            }
        }
        return new zzexd(Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Integer num = this.zza;
        Bundle bundle = (Bundle) obj;
        if (num != null) {
            bundle.putInt("aos", num.intValue());
        }
    }
}
