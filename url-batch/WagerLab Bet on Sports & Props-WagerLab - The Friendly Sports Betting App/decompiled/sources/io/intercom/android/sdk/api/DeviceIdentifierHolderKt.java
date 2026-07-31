package io.intercom.android.sdk.api;

import android.content.Context;
import android.content.SharedPreferences;
import io.intercom.android.sdk.utilities.PreferenceKeys;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: DeviceIdentifierHolder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"getDeviceIdentifier", "", "context", "Landroid/content/Context;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DeviceIdentifierHolderKt {
    public static final String getDeviceIdentifier(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(PreferenceKeys.INTERCOM_PREFS, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        String string = sharedPreferences.getString("device_identifier", "");
        String str = string;
        if (str != null && !StringsKt.isBlank(str)) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("device_identifier", uuid);
        edit.apply();
        return uuid;
    }
}
