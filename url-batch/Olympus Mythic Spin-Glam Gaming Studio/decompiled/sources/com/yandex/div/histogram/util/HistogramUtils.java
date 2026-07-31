package com.yandex.div.histogram.util;

import com.ogury.core.internal.datastore.preferences.core.PreferencesSerializer;
import com.safedk.android.utils.j;
import com.yandex.div.histogram.HistogramCallType;
import com.yandex.div.histogram.HistogramRecordConfiguration;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: HistogramUtils.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/histogram/util/HistogramUtils;", "", "()V", "calculateUtf8JsonByteSize", "", PreferencesSerializer.fileExtension, "Lorg/json/JSONObject;", "calculateUtf8StringByteSize", "str", "", "getUtf8CharByteSize", "ch", "", "shouldRecordHistogram", "", "callType", j.c, "Lcom/yandex/div/histogram/HistogramRecordConfiguration;", "div-histogram_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class HistogramUtils {

    @NotNull
    public static final HistogramUtils INSTANCE = new HistogramUtils();

    private HistogramUtils() {
    }

    public final int calculateUtf8StringByteSize(@NotNull String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i += getUtf8CharByteSize(str.charAt(i2));
        }
        return i;
    }

    public final int getUtf8CharByteSize(char ch) {
        if (Character.isHighSurrogate(ch)) {
            return 4;
        }
        if (Character.isLowSurrogate(ch)) {
            return 0;
        }
        if (ch < 128) {
            return 1;
        }
        if (ch < 2048) {
            return 2;
        }
        if (ch < 0) {
            return 3;
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (!Assert.isEnabled()) {
            return 4;
        }
        Assert.fail("Unsupported character: '" + ch + '\'');
        return 4;
    }

    public final boolean shouldRecordHistogram(@HistogramCallType @NotNull String callType, @NotNull HistogramRecordConfiguration configuration) {
        int hashCode = callType.hashCode();
        if (hashCode != 2106116) {
            if (hashCode != 2106217) {
                if (hashCode == 2688677 && callType.equals("Warm")) {
                    return configuration.isWarmRecordingEnabled();
                }
            } else if (callType.equals("Cool")) {
                return configuration.isCoolRecordingEnabled();
            }
        } else if (callType.equals("Cold")) {
            return configuration.isColdRecordingEnabled();
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("Unknown histogram call type: " + callType);
        }
        return false;
    }

    public final int calculateUtf8JsonByteSize(@NotNull JSONObject json) {
        return JSONUtf8BytesCalculator.INSTANCE.calculateUtf8JsonBytes(json);
    }
}
