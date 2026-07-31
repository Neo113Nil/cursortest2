package com.mobilefuse.sdk.utils;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: JsonUtils.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, d2 = {"isValidJson", "", "", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
/* loaded from: classes5.dex */
public final class JsonUtilsKt {
    public static final boolean isValidJson(@Nullable String str) {
        try {
            if (str == null) {
                str = "";
            }
            new JSONObject(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
