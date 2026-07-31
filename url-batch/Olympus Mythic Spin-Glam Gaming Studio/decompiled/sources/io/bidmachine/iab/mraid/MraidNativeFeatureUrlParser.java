package io.bidmachine.iab.mraid;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes11.dex */
public final class MraidNativeFeatureUrlParser {
    private final a a = new a();

    @Nullable
    public MraidCalendarEvent parseCalendarEvent(@NonNull String str) {
        try {
            return parseCalendarEvent(Uri.parse(str));
        } catch (Exception e) {
            MraidLog.e("MraidNativeFeatureUrlParser", e);
            return null;
        }
    }

    @Nullable
    public Uri parseStorePictureUri(@NonNull String str) {
        try {
            return parseStorePictureUri(Uri.parse(str));
        } catch (Exception e) {
            MraidLog.e("MraidNativeFeatureUrlParser", e);
            return null;
        }
    }

    @Nullable
    public MraidCalendarEvent parseCalendarEvent(@NonNull Uri uri) {
        try {
            return this.a.a(Uri.decode(uri.getQueryParameter("eventJson")));
        } catch (Exception e) {
            MraidLog.e("MraidNativeFeatureUrlParser", e);
            return null;
        }
    }

    @Nullable
    public Uri parseStorePictureUri(@NonNull Uri uri) {
        try {
            return Uri.parse(Uri.decode(uri.getQueryParameter("url")));
        } catch (Exception e) {
            MraidLog.e("MraidNativeFeatureUrlParser", e);
            return null;
        }
    }
}
