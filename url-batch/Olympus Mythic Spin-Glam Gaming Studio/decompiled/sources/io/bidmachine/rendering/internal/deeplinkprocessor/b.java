package io.bidmachine.rendering.internal.deeplinkprocessor;

import android.content.Context;
import android.net.Uri;
import io.bidmachine.util.Executable;
import io.bidmachine.util.UrlUtilsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public interface b {
    void a(Context context, Uri uri, Executable executable);

    default void a(Context context, String url, Executable executable) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        a(context, UrlUtilsKt.parseUri(url), executable);
    }

    boolean a(Uri uri);
}
