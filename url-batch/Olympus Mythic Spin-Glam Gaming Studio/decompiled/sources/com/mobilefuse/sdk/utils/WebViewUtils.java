package com.mobilefuse.sdk.utils;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.facebook.share.internal.ShareConstants;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager;
import com.mobilefuse.sdk.logging.HttpRequestTracker;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w;
import java.io.ByteArrayInputStream;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WebViewUtils.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0002J0\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/mobilefuse/sdk/utils/WebViewUtils;", "", "()V", "interceptionMap", "", "", "createBlockedResponse", "Landroid/webkit/WebResourceResponse;", "shouldInterceptRequest", "context", "Landroid/content/Context;", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "onCriticalFailure", "Lkotlin/Function0;", "", "mobilefuse-sdk-mraid_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes.dex */
public final class WebViewUtils {

    @NotNull
    public static final WebViewUtils INSTANCE = new WebViewUtils();
    private static final Map<String, String> interceptionMap = MapsKt.mapOf(TuplesKt.to(w.k, "mobilefuse/mraid.js"), TuplesKt.to("vast.js", "mobilefuse/vast.js"), TuplesKt.to("mraid_close_controls.js", "mobilefuse/mraid_close_controls.js"));

    private WebViewUtils() {
    }

    public static /* synthetic */ WebResourceResponse shouldInterceptRequest$default(Context context, Uri uri, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        return shouldInterceptRequest(context, uri, function0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
    
        r6 = (kotlin.Unit) r8.mo4828invoke();
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final WebResourceResponse shouldInterceptRequest(@Nullable Context context, @Nullable Uri uri, @Nullable Function0 onCriticalFailure) {
        String path;
        Object obj;
        if (uri == null || (path = uri.getPath()) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(path, "uri?.path ?: return null");
        if (context == null) {
            return null;
        }
        HttpRequestTracker.logHttpRequest(path);
        try {
            Iterator<T> it = interceptionMap.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (StringsKt.contains$default((CharSequence) path, (CharSequence) obj, false, 2, (Object) null)) {
                    break;
                }
            }
            String str = (String) obj;
            if (str == null) {
                return null;
            }
            byte[] specificAssetBytes = MobileFuseAssetManager.INSTANCE.getSpecificAssetBytes(str, context);
            if (specificAssetBytes != null && specificAssetBytes.length != 0) {
                return new WebResourceResponse("", "UTF-8", new ByteArrayInputStream(specificAssetBytes));
            }
            return INSTANCE.createBlockedResponse();
        } catch (Throwable th) {
            WebViewUtils webViewUtils = INSTANCE;
            StabilityHelper.logException(webViewUtils, th);
            if (onCriticalFailure != null) {
            }
            return webViewUtils.createBlockedResponse();
        }
    }

    private final WebResourceResponse createBlockedResponse() {
        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
    }
}
