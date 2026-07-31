package io.bidmachine.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.share.internal.ShareConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.util.network.NetworkUtils;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: IntentUtils.kt */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0000\u001a\u0012\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001a\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001a$\u0010\u000f\u001a\u00020\u0010*\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u001a\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001a$\u0010\u0018\u001a\u00020\u0010*\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0000\u001a\u0012\u0010\u0019\u001a\u00020\u0014*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001b\u001a\u0014\u0010\u001c\u001a\u00020\u0014*\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u001a$\u0010\u001d\u001a\u00020\u0010*\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u001a\n\u0010\u001e\u001a\u00020\f*\u00020\f\u001a\n\u0010\u001e\u001a\u00020\f*\u00020\u001b\u001a\u0014\u0010\u001f\u001a\u00020\f*\u00020\u001b2\b\b\u0002\u0010 \u001a\u00020\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"CUSTOM_PARAM_RAW_URL", "", "CUSTOM_PARAM_REMOVE_CUSTOM_PARAMS", "KEY_CUSTOM_PARAMS", "extractBmCustomParams", "", "urlString", "removeBmCustomParams", "findAndSetIntentComponent", "", "Landroid/content/Context;", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "findComponentName", "Landroid/content/ComponentName;", "findEndpointAndOpenUrl", "", "url", "postMethod", "Lio/bidmachine/util/Executable;", "Lio/bidmachine/util/ProcessUrlResult;", "findResolveInfoList", "", "Landroid/content/pm/ResolveInfo;", "openRawUrl", "openUri", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "openUrl", "openUrlWithPostback", "toChooserIntent", "toIntent", "newTask", "bidmachine-android-sdk_bd_3_7_1"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class IntentUtilsKt {

    @NotNull
    private static final String CUSTOM_PARAM_RAW_URL = "lraw";

    @NotNull
    private static final String CUSTOM_PARAM_REMOVE_CUSTOM_PARAMS = "rcp";

    @NotNull
    private static final String KEY_CUSTOM_PARAMS = "bmcp";

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "io.bidmachine");
        p0.startActivity(p1);
    }

    public static final void findEndpointAndOpenUrl(@NotNull Context context, @Nullable String str, @Nullable final Executable<ProcessUrlResult> executable) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (str == null || str.length() == 0) {
            if (executable != null) {
                executable.execute(ProcessUrlResult.INSTANCE.getFAIL());
                return;
            }
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        final String validUrl = Utils.getValidUrl(str);
        if (validUrl == null || validUrl.length() == 0) {
            if (executable != null) {
                executable.execute(ProcessUrlResult.INSTANCE.getFAIL());
                return;
            }
            return;
        }
        Set<String> extractBmCustomParams = extractBmCustomParams(validUrl);
        if (extractBmCustomParams.contains(CUSTOM_PARAM_RAW_URL)) {
            if (extractBmCustomParams.contains(CUSTOM_PARAM_REMOVE_CUSTOM_PARAMS)) {
                str = removeBmCustomParams(str);
            }
            openRawUrl(context, str, executable);
        } else if (Utils.isHttpUrl(validUrl)) {
            Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: io.bidmachine.util.IntentUtilsKt$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    IntentUtilsKt.findEndpointAndOpenUrl$lambda$0(applicationContext, validUrl, executable);
                }
            });
        } else {
            openUrlWithPostback(applicationContext, validUrl, executable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void findEndpointAndOpenUrl$lambda$0(Context applicationContext, String str, Executable executable) {
        Intrinsics.checkNotNullParameter(applicationContext, "$applicationContext");
        openUrlWithPostback(applicationContext, NetworkUtils.findEndpoint$default(str, 0, 2, null), executable);
    }

    @NotNull
    public static final ProcessUrlResult openUri(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(uri, "uri");
        return openUrl(context, uri.toString());
    }

    @NotNull
    public static final ProcessUrlResult openUrl(@NotNull Context context, @Nullable String str) {
        ProcessUrlResult processUrlResult;
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (str == null || str.length() == 0) {
            return ProcessUrlResult.INSTANCE.getFAIL();
        }
        try {
            Intent urlToIntent = IntentUtils.urlToIntent(str);
            if (!findAndSetIntentComponent(context, urlToIntent)) {
                String decode = URLDecoder.decode(str, Charsets.UTF_8.name());
                Intrinsics.checkNotNullExpressionValue(decode, "decode(url, Charsets.UTF_8.name())");
                urlToIntent = IntentUtils.urlToIntent(decode);
                findAndSetIntentComponent(context, urlToIntent);
            }
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, urlToIntent);
            processUrlResult = ProcessUrlResult.INSTANCE.getSUCCESS();
        } catch (Throwable unused) {
            processUrlResult = null;
        }
        return processUrlResult == null ? ProcessUrlResult.INSTANCE.getFAIL() : processUrlResult;
    }

    public static final void openUrlWithPostback(@NotNull Context context, @Nullable String str, @Nullable Executable<ProcessUrlResult> executable) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        UiUtils.INSTANCE.onUiThreadWithArgSafely(openUrl(context, str), executable);
    }

    public static /* synthetic */ Intent toIntent$default(Uri uri, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return toIntent(uri, z);
    }

    @NotNull
    public static final Intent toIntent(@NotNull Uri uri, boolean z) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        if (z) {
            intent.setFlags(268435456);
        }
        return intent;
    }

    @NotNull
    public static final Intent toChooserIntent(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return toChooserIntent(toIntent$default(uri, false, 1, null));
    }

    @NotNull
    public static final Intent toChooserIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intent flags = Intent.createChooser(intent, "").setFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(flags, "createChooser(this, \"\")\n…t.FLAG_ACTIVITY_NEW_TASK)");
        return flags;
    }

    public static final boolean findAndSetIntentComponent(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(intent, "intent");
        ComponentName findComponentName = findComponentName(context, intent);
        if (findComponentName == null) {
            return false;
        }
        intent.setComponent(findComponentName);
        return true;
    }

    @Nullable
    public static final ComponentName findComponentName(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(intent, "intent");
        List<ResolveInfo> findResolveInfoList = findResolveInfoList(context, intent);
        if (findResolveInfoList.isEmpty()) {
            return null;
        }
        ComponentName findStoreComponentName = IntentUtils.findStoreComponentName(findResolveInfoList);
        return findStoreComponentName == null ? new ComponentName(findResolveInfoList.get(0).activityInfo.packageName, findResolveInfoList.get(0).activityInfo.name) : findStoreComponentName;
    }

    @NotNull
    public static final List<ResolveInfo> findResolveInfoList(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(intent, "intent");
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "packageManager.queryIntentActivities(intent, 0)");
        return queryIntentActivities;
    }

    public static final void openRawUrl(@NotNull Context context, @NotNull String urlString, @Nullable Executable<ProcessUrlResult> executable) {
        Object m8023constructorimpl;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        Uri parseUriSafely = UrlUtilsKt.parseUriSafely(urlString);
        if (parseUriSafely == null) {
            if (executable != null) {
                executable.execute(ProcessUrlResult.INSTANCE.getFAIL());
                return;
            }
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Unit unit = null;
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, toIntent$default(parseUriSafely, false, 1, null));
            if (executable != null) {
                executable.execute(ProcessUrlResult.INSTANCE.getSUCCESS());
                unit = Unit.INSTANCE;
            }
            m8023constructorimpl = Result.m8023constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8026exceptionOrNullimpl(m8023constructorimpl) == null || executable == null) {
            return;
        }
        executable.execute(ProcessUrlResult.INSTANCE.getFAIL());
    }

    @NotNull
    public static final Set<String> extractBmCustomParams(@NotNull String urlString) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        Uri parseUriSafely = UrlUtilsKt.parseUriSafely(urlString);
        if (parseUriSafely == null) {
            return SetsKt.emptySet();
        }
        String queryParameter = parseUriSafely.getQueryParameter(KEY_CUSTOM_PARAMS);
        if (queryParameter == null) {
            queryParameter = "";
        }
        List split$default = StringsKt.split$default((CharSequence) queryParameter, new String[]{"_"}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : split$default) {
            if (!StringsKt.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.toSet(arrayList);
    }

    @NotNull
    public static final String removeBmCustomParams(@NotNull String urlString) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        Uri parseUriSafely = UrlUtilsKt.parseUriSafely(urlString);
        if (parseUriSafely == null) {
            return urlString;
        }
        String uri = UrlUtilsKt.removeQueryParameters(parseUriSafely, KEY_CUSTOM_PARAMS).toString();
        Intrinsics.checkNotNullExpressionValue(uri, "uri.removeQueryParameter…CUSTOM_PARAMS).toString()");
        return uri;
    }
}
