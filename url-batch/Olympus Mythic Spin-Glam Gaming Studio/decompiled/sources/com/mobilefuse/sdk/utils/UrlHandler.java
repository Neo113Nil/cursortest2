package com.mobilefuse.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import com.facebook.share.internal.ShareConstants;
import com.mobilefuse.sdk.StabilityHelper;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UrlHandler.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J<\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000eH\u0007J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u0011"}, d2 = {"Lcom/mobilefuse/sdk/utils/UrlHandler;", "", "()V", "createIntent", "Landroid/content/Intent;", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "openBrowser", "", "url", "", "context", "Landroid/content/Context;", "onComplete", "Lkotlin/Function0;", "onError", "parseUri", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes6.dex */
public final class UrlHandler {

    @NotNull
    public static final UrlHandler INSTANCE = new UrlHandler();

    public static final void openBrowser(@NotNull String str, @NotNull Context context) {
        openBrowser$default(str, context, null, null, 12, null);
    }

    public static final void openBrowser(@NotNull String str, @NotNull Context context, @Nullable Function0 function0) {
        openBrowser$default(str, context, function0, null, 8, null);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.E);
        p0.startActivity(p1);
    }

    private UrlHandler() {
    }

    public static /* synthetic */ void openBrowser$default(String str, Context context, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        if ((i & 8) != 0) {
            function02 = null;
        }
        openBrowser(str, context, function0, function02);
    }

    public static final void openBrowser(@NotNull String url, @NotNull Context context, @Nullable Function0 onComplete, @Nullable Function0 onError) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            UrlHandler urlHandler = INSTANCE;
            Uri parseUri = urlHandler.parseUri(url);
            if (parseUri != null) {
                Intent createIntent = urlHandler.createIntent(parseUri);
                if (createIntent.resolveActivity(context.getPackageManager()) != null) {
                    safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, createIntent);
                    if (onComplete != null) {
                    }
                } else if (onError != null) {
                }
            }
        } catch (Throwable th) {
            StabilityHelper.logException(INSTANCE, th);
            if (onError != null) {
            }
        }
    }

    @VisibleForTesting
    @Nullable
    public final Uri parseUri(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return Uri.parse(url);
    }

    @VisibleForTesting
    @NotNull
    public final Intent createIntent(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.addFlags(268435456);
        return intent;
    }
}
