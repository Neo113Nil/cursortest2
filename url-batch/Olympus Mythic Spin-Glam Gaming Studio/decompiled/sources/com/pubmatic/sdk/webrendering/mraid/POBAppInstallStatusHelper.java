package com.pubmatic.sdk.webrendering.mraid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.pubmatic.sdk.common.cache.POBCacheManager;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBDeepLinkURLModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0010\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0010\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/pubmatic/sdk/webrendering/mraid/POBAppInstallStatusHelper;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/pubmatic/sdk/common/cache/POBCacheManager;", "cacheManager", "", SDKConstants.PARAM_DEEP_LINK, "aDomain", "Lcom/pubmatic/sdk/webrendering/mraid/POBAppInstallStatusHelper$AppInstallStatus;", "determineAppInstallStatus", "(Landroid/content/Context;Lcom/pubmatic/sdk/common/cache/POBCacheManager;Ljava/lang/String;Ljava/lang/String;)Lcom/pubmatic/sdk/webrendering/mraid/POBAppInstallStatusHelper$AppInstallStatus;", "Landroid/content/Intent;", SDKConstants.PARAM_INTENT, "a", "(Landroid/content/Context;Landroid/content/Intent;)Lcom/pubmatic/sdk/webrendering/mraid/POBAppInstallStatusHelper$AppInstallStatus;", "scheme", "Lorg/json/JSONObject;", "appInstallStatusData", "", "(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Z", "AppInstallStatus", "webrendering_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class POBAppInstallStatusHelper {

    @NotNull
    public static final POBAppInstallStatusHelper INSTANCE = new POBAppInstallStatusHelper();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/pubmatic/sdk/webrendering/mraid/POBAppInstallStatusHelper$AppInstallStatus;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "a", "I", "getValue", "()I", "INSTALLED", "NOT_INSTALLED", "NOT_ALLOWED", "webrendering_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum AppInstallStatus {
        INSTALLED(1),
        NOT_INSTALLED(0),
        NOT_ALLOWED(-1);


        /* renamed from: a, reason: from kotlin metadata */
        private final int value;

        AppInstallStatus(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    private POBAppInstallStatusHelper() {
    }

    private static final AppInstallStatus a(Context context, Intent intent) {
        PackageManager packageManager = context.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "packageManager.queryInte…nager.MATCH_DEFAULT_ONLY)");
        Iterator<ResolveInfo> it = queryIntentActivities.iterator();
        while (it.hasNext()) {
            ResolveInfo next = it.next();
            if ((next != null ? next.activityInfo : null) != null) {
                return AppInstallStatus.INSTALLED;
            }
        }
        POBLog.debug("POBAppInstallStatusHelper", "App is not installed: " + intent.getData(), new Object[0]);
        return AppInstallStatus.NOT_INSTALLED;
    }

    @NotNull
    public static final AppInstallStatus determineAppInstallStatus(@NotNull Context context, @NotNull POBCacheManager cacheManager, @NotNull String deepLink, @Nullable String aDomain) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cacheManager, "cacheManager");
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        JSONObject appStatusSchemes = cacheManager.getAppStatusSchemes();
        if (aDomain == null || appStatusSchemes == null || !cacheManager.getAppInstallStatus() || !appStatusSchemes.has(aDomain)) {
            return AppInstallStatus.NOT_ALLOWED;
        }
        POBDeepLinkURLModel parseFromUrl = POBDeepLinkURLModel.INSTANCE.parseFromUrl(deepLink);
        if (parseFromUrl.getPrimaryUrl() != null) {
            deepLink = parseFromUrl.getPrimaryUrl();
        }
        if (deepLink == null || deepLink.length() == 0) {
            return AppInstallStatus.NOT_ALLOWED;
        }
        try {
            Uri parse = Uri.parse(deepLink);
            String scheme = parse != null ? parse.getScheme() : null;
            if (scheme == null || !a(scheme, appStatusSchemes, aDomain)) {
                return AppInstallStatus.NOT_ALLOWED;
            }
            try {
                return a(context, new Intent("android.intent.action.VIEW", parse));
            } catch (Exception unused) {
                POBLog.debug("POBAppInstallStatusHelper", "Unable to determine App: " + deepLink, new Object[0]);
                return AppInstallStatus.NOT_INSTALLED;
            }
        } catch (Exception unused2) {
            POBLog.debug("POBAppInstallStatusHelper", "Failed to parse deep link URI: " + deepLink, new Object[0]);
            return AppInstallStatus.NOT_ALLOWED;
        }
    }

    private static final boolean a(String scheme, JSONObject appInstallStatusData, String aDomain) {
        JSONArray optJSONArray = appInstallStatusData.optJSONArray(aDomain);
        if (optJSONArray != null && optJSONArray.length() != 0) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                } catch (Exception e) {
                    POBLog.debug("POBAppInstallStatusHelper", "Invalid scheme entry at index " + i + ": " + e.getMessage(), new Object[0]);
                }
                if (StringsKt.equals(scheme, optJSONArray.getString(i), true)) {
                    return true;
                }
            }
            POBLog.debug("POBAppInstallStatusHelper", "Scheme '" + scheme + "' is not in the allowed schemes for domain '" + aDomain + '\'', new Object[0]);
        }
        return false;
    }
}
