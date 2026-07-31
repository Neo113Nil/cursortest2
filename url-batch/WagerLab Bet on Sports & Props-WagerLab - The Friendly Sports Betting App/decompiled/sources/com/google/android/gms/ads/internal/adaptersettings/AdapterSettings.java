package com.google.android.gms.ads.internal.adaptersettings;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzbbr;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes4.dex */
class AdapterSettings {
    private static volatile AdapterSettings instance;
    private final zzbbr adapterSettingsInternal = zzbd.zzd();

    AdapterSettings() {
    }

    private boolean getBoolean(String str, boolean z) {
        return this.adapterSettingsInternal.zzf(str, z);
    }

    private float getFloat(String str, float f) {
        return this.adapterSettingsInternal.zze(str, f);
    }

    public static AdapterSettings getInstance() {
        if (instance == null) {
            synchronized (AdapterSettings.class) {
                if (instance == null) {
                    instance = new AdapterSettings();
                }
            }
        }
        return instance;
    }

    private int getInt(String str, int i) {
        return this.adapterSettingsInternal.zzd(str, i);
    }

    private long getLong(String str, long j) {
        return this.adapterSettingsInternal.zzc(str, j);
    }

    private String getString(String str, String str2) {
        return this.adapterSettingsInternal.zzb(str, str2);
    }
}
