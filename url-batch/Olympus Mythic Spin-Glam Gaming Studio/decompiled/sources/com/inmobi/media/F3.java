package com.inmobi.media;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes10.dex */
public abstract class F3 {
    public static final /* synthetic */ int a = 0;

    public static int a(Context context, String url, ResolveInfo resolveInfo, Eh redirectionValidator, String api) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        Intrinsics.checkNotNullParameter(api, "api");
        if (context == null) {
            return 7;
        }
        if (!redirectionValidator.c()) {
            redirectionValidator.a("EX_" + api);
            return 8;
        }
        Intent parseUri = Intent.parseUri(url, 3);
        Intrinsics.checkNotNullExpressionValue(parseUri, "parseUri(...)");
        F5.a.getClass();
        if (F5.v() && parseUri.getAction() == null) {
            parseUri.setAction("android.intent.action.VIEW");
        }
        if ((resolveInfo != null ? resolveInfo.activityInfo : null) != null) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if ((activityInfo != null ? activityInfo.packageName : null) != null) {
                if ((activityInfo != null ? activityInfo.name : null) != null) {
                    parseUri.setClassName(activityInfo.packageName, activityInfo.name);
                }
            }
        }
        parseUri.setFlags(268435456);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, parseUri);
        return 0;
    }

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.i);
        p0.startActivityForResult(p1, p2);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.i);
        p0.startActivity(p1);
    }

    public static int a(Context context, String url, Eh redirectionValidator, String api) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        Intrinsics.checkNotNullParameter(api, "api");
        if (context == null) {
            return 7;
        }
        if (!redirectionValidator.c()) {
            redirectionValidator.a("EX_" + api);
            return 8;
        }
        try {
            Intent parseUri = Intent.parseUri(url, 0);
            parseUri.setFlags(268435456);
            F5.a.getClass();
            if (F5.v() && parseUri.getAction() == null) {
                parseUri.setAction("android.intent.action.VIEW");
            }
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, parseUri);
            return 0;
        } catch (ActivityNotFoundException e) {
            Uri parse = Uri.parse(url);
            Intrinsics.checkNotNullExpressionValue(parse, "Uri.parse(this)");
            String a2 = a(url);
            if (Intrinsics.areEqual(SDKConstants.PARAM_INTENT, parse.getScheme()) && a2 != null && a2.length() != 0) {
                return a(context, a2, redirectionValidator, api);
            }
            throw e;
        } catch (NullPointerException e2) {
            Uri parse2 = Uri.parse(url);
            Intrinsics.checkNotNullExpressionValue(parse2, "Uri.parse(this)");
            String a3 = a(url);
            if (Intrinsics.areEqual(SDKConstants.PARAM_INTENT, parse2.getScheme()) && a3 != null && a3.length() != 0) {
                return a(context, a3, redirectionValidator, api);
            }
            throw e2;
        }
    }

    public static String a(String str) {
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            F5.a.getClass();
            if (F5.v() && parseUri.getAction() == null) {
                parseUri.setAction("android.intent.action.VIEW");
            }
            return parseUri.getStringExtra("browser_fallback_url");
        } catch (URISyntaxException e) {
            Intrinsics.checkNotNullExpressionValue("F3", "TAG");
            e.getMessage();
            return null;
        }
    }

    public static boolean a(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return Intrinsics.areEqual("http", uri.getScheme()) || Intrinsics.areEqual("https", uri.getScheme());
    }

    public static List a(Context context, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (url.length() == 0 || context == null) {
            return CollectionsKt.emptyList();
        }
        Intent parseUri = Intent.parseUri(url, 3);
        Intrinsics.checkNotNullExpressionValue(parseUri, "parseUri(...)");
        F5.a.getClass();
        if (F5.v() && parseUri.getAction() == null) {
            parseUri.setAction("android.intent.action.VIEW");
        }
        List<ResolveInfo> queryIntentActivityOptions = context.getPackageManager().queryIntentActivityOptions((ComponentName) null, (Intent[]) null, parseUri, 0);
        Intrinsics.checkNotNullExpressionValue(queryIntentActivityOptions, "queryIntentActivityOptions(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : queryIntentActivityOptions) {
            if (((ResolveInfo) obj).activityInfo.exported) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int a(C3966eb validationResult) {
        PackageManager packageManager;
        Intrinsics.checkNotNullParameter(validationResult, "validationResult");
        Activity activity = validationResult.a;
        String str = validationResult.b;
        if (StringsKt.isBlank(str)) {
            return 2;
        }
        Intrinsics.checkNotNullExpressionValue("F3", "TAG");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        intent.setData(Uri.parse(str));
        try {
            packageManager = activity.getPackageManager();
        } catch (Exception unused) {
            packageManager = null;
        }
        if (packageManager == null || intent.resolveActivity(packageManager) == null) {
            return 6;
        }
        try {
            safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(activity, intent, 0);
            Intrinsics.checkNotNullExpressionValue("F3", "TAG");
            intent.toString();
            return 0;
        } catch (ActivityNotFoundException unused2) {
            return 6;
        } catch (NullPointerException unused3) {
            return 13;
        } catch (SecurityException unused4) {
            return 12;
        } catch (URISyntaxException unused5) {
            return 5;
        } catch (Exception unused6) {
            return 9;
        }
    }
}
