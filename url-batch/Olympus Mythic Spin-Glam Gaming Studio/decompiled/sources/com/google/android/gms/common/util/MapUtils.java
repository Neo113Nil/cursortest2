package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.pubmatic.sdk.common.POBCommonConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes10.dex */
public class MapUtils {
    @KeepForSdk
    public static void writeStringMapToJson(@NonNull StringBuilder sb, @NonNull HashMap<String, String> hashMap) {
        sb.append("{");
        boolean z = true;
        for (String str : hashMap.keySet()) {
            if (!z) {
                sb.append(StringUtils.COMMA);
            }
            String str2 = hashMap.get(str);
            sb.append("\"");
            sb.append(str);
            sb.append("\":");
            if (str2 == null) {
                sb.append(POBCommonConstants.NULL_VALUE);
            } else {
                sb.append("\"");
                sb.append(str2);
                sb.append("\"");
            }
            z = false;
        }
        sb.append("}");
    }
}
