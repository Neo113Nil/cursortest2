package com.pubmatic.sdk.webrendering.dsa;

import com.pubmatic.sdk.common.log.POBLog;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0001¨\u0006\u0002"}, d2 = {"encodeToUTF8", "", "webrendering_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes15.dex */
public final class POBDsaInfoPresenterHelperKt {
    @NotNull
    public static final String encodeToUTF8(@Nullable String str) {
        String str2;
        if (str != null) {
            try {
                str2 = URLEncoder.encode(str, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                POBLog.error("StringEncoding", "Failed to encode string: " + e.getMessage(), new Object[0]);
                str2 = "";
            }
        } else {
            str2 = null;
        }
        return str2 == null ? "" : str2;
    }
}
