package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.database.core.ServerValues;
import com.google.firebase.messaging.Constants;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbhq implements zzbix {
    @Override // com.google.android.gms.internal.ads.zzbix
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcej zzcejVar = (zzcej) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get(Constants.ScionAnalytics.PARAM_LABEL);
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get(ServerValues.NAME_OP_TIMESTAMP);
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("No label given for CSI tick.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("No timestamp given for CSI tick.");
                return;
            }
            try {
                long elapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() + (Long.parseLong(str4) - com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
                if (true == TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                zzcejVar.zzm().zzc(str2, str3, elapsedRealtime);
                return;
            } catch (NumberFormatException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Malformed timestamp for CSI tick.", e);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            if (TextUtils.isEmpty(str5)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("No value given for CSI experiment.");
                return;
            } else {
                zzcejVar.zzm().zza().zzd("e", str5);
                return;
            }
        }
        if ("extra".equals(str)) {
            String str6 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
            String str7 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            if (TextUtils.isEmpty(str7)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("No name given for CSI extra.");
            } else {
                zzcejVar.zzm().zza().zzd(str6, str7);
            }
        }
    }
}
