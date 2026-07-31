package io.bidmachine.rendering.internal.deeplinkprocessor;

import android.net.Uri;
import com.pubmatic.sdk.common.POBCommonConstants;
import io.bidmachine.util.UrlUtilsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public abstract class d {
    public static final Uri a(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Uri.Builder path = new Uri.Builder().scheme("https").authority(POBCommonConstants.PLAY_STORE_DOMAIN).path("/d");
        Intrinsics.checkNotNullExpressionValue(path, "Builder()\n        .schem…path(INLINE_INSTALL_PATH)");
        Uri build = UrlUtilsKt.appendQueryParametersFrom$default(path, uri, null, 2, null).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n        .schem…om(this)\n        .build()");
        return build;
    }
}
