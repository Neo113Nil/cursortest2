package io.bidmachine.ads.networks.adaptiverendering.measurer;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.appodeal.adsession.VerificationScriptResource;
import io.bidmachine.core.Logger;
import io.bidmachine.internal.AbstractC6023s;
import io.bidmachine.rendering.measurer.HtmlMeasurer;
import io.bidmachine.rendering.measurer.MeasurerFactory;
import io.bidmachine.rendering.measurer.VideoMeasurer;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class AdMeasurerFactory implements MeasurerFactory {

    @NonNull
    @VisibleForTesting
    static final String JAVA_SCRIPT_RESOURCE_URL = "java_script_resource_url";

    @NonNull
    @VisibleForTesting
    static final String OM = "om";

    @NonNull
    @VisibleForTesting
    static final String SKIP_OFFSET = "skip_offset";

    @NonNull
    @VisibleForTesting
    static final String VENDOR = "vendor";

    @NonNull
    @VisibleForTesting
    static final String VERIFICATIONS = "verifications";

    @NonNull
    @VisibleForTesting
    static final String VERIFICATION_PARAMETERS = "verification_parameters";

    @VisibleForTesting
    static void addVerificationScriptResource(@NonNull List<VerificationScriptResource> list, @NonNull String str, @Nullable String str2, @Nullable String str3) {
        try {
            URL url = new URL(str);
            list.add((TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) ? VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url) : VerificationScriptResource.createVerificationScriptResourceWithParameters(str2, url, str3));
        } catch (Throwable th) {
            Logger.w(th);
        }
    }

    @Nullable
    @VisibleForTesting
    static Float getSkipOffsetSec(@NonNull Map<String, String> map) {
        if (TextUtils.isEmpty(map.get(SKIP_OFFSET))) {
            return null;
        }
        try {
            return Float.valueOf(Long.parseLong(r4) / 1000.0f);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    @VisibleForTesting
    static List<VerificationScriptResource> getVerificationScriptResourceList(@NonNull Map<String, String> map) {
        String str = map.get(VERIFICATIONS);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    addVerificationScriptResource(arrayList, optJSONObject.optString(JAVA_SCRIPT_RESOURCE_URL), optJSONObject.optString("vendor"), optJSONObject.optString("verification_parameters"));
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.bidmachine.rendering.measurer.MeasurerFactory
    @Nullable
    public HtmlMeasurer createHtmlMeasurer(@NonNull Context context, @NonNull String str, @Nullable Map<String, String> map) {
        if (str.equalsIgnoreCase(OM) && AbstractC6023s.c()) {
            return new OMHtmlMeasurer();
        }
        return null;
    }

    @Override // io.bidmachine.rendering.measurer.MeasurerFactory
    @Nullable
    public VideoMeasurer createVideoMeasurer(@NonNull Context context, @NonNull String str, @Nullable Map<String, String> map) {
        List<VerificationScriptResource> verificationScriptResourceList;
        if (!str.equalsIgnoreCase(OM) || !AbstractC6023s.c() || map == null || map.isEmpty() || (verificationScriptResourceList = getVerificationScriptResourceList(map)) == null || verificationScriptResourceList.isEmpty()) {
            return null;
        }
        return new OMVideoMeasurer(verificationScriptResourceList, getSkipOffsetSec(map));
    }
}
