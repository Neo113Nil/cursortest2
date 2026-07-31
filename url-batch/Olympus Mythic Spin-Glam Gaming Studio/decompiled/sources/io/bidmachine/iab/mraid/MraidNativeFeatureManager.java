package io.bidmachine.iab.mraid;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.iab.utils.SystemFeatureAvailability;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public final class MraidNativeFeatureManager {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    public MraidNativeFeatureManager(@NonNull Context context, @Nullable String[] strArr) {
        this(context, (List<String>) (strArr != null ? Arrays.asList(strArr) : null));
    }

    private boolean a(String str, List list) {
        return list != null && list.contains(str);
    }

    public boolean isCalendarFeatureAvailable() {
        return this.d;
    }

    public boolean isInlineVideoFeatureAvailable() {
        return this.c;
    }

    public boolean isSmsFeatureAvailable() {
        return this.a;
    }

    public boolean isStorePictureFeatureAvailable() {
        return this.e;
    }

    public boolean isTelFeatureAvailable() {
        return this.b;
    }

    public MraidNativeFeatureManager(@NonNull Context context, @Nullable List<String> list) {
        SystemFeatureAvailability systemFeatureAvailability = new SystemFeatureAvailability(context);
        boolean z = false;
        this.a = a("sms", list) && systemFeatureAvailability.hasTelephony();
        if (a("tel", list) && systemFeatureAvailability.hasTelephony()) {
            z = true;
        }
        this.b = z;
        this.c = a("inlineVideo", list);
        this.d = a("calendar", list);
        this.e = a("storePicture", list);
    }
}
