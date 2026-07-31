package sg.bigo.ads.core.landing;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.ironsource.X3;
import com.safedk.android.utils.Logger;
import io.bidmachine.util.network.NetworkUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import sg.bigo.ads.api.AdActivity;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.api.core.d;
import sg.bigo.ads.api.core.e;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes6.dex */
public final class a {
    private static Intent a(@NonNull Uri uri) {
        return new Intent("android.intent.action.VIEW", uri).addFlags(268435456);
    }

    private static Intent a(String str, String str2, String str3, boolean z) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        intent.setData(Uri.parse("https://play.google.com/d?id=".concat(String.valueOf(str))));
        intent.putExtra("overlay", z);
        intent.putExtra("callerId", str2);
        if (r.b((CharSequence) str3)) {
            intent.putExtra(Constants.REFERRER, str3);
        }
        return intent;
    }

    public static String a(String str, Map<String, String> map, String str2) {
        StringBuilder sb;
        String host = Uri.parse(str2).getHost();
        if (r.a((CharSequence) str) || map.isEmpty() || r.a((CharSequence) host)) {
            return str2;
        }
        try {
            Set<String> queryParameterNames = Uri.parse(str2).getQueryParameterNames();
            if (!str.equals("all") && !str.contains(host)) {
                return str2;
            }
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!queryParameterNames.contains(entry.getKey())) {
                    sb2.append(entry.getValue());
                    sb2.append(X3.j.c);
                }
            }
            String sb3 = sb2.toString();
            if (TextUtils.isEmpty(sb3)) {
                return str2;
            }
            String substring = sb3.substring(0, sb3.length() - 1);
            if (str2.contains("?")) {
                sb = new StringBuilder();
                sb.append(str2);
                sb.append(X3.j.c);
                sb.append(substring);
            } else {
                sb = new StringBuilder();
                sb.append(str2);
                sb.append("?");
                sb.append(substring);
            }
            str2 = sb.toString();
            return str2;
        } catch (Throwable th) {
            sg.bigo.ads.bn.a.a(0, "LinkUtils", "appendPixel error =" + th.getMessage());
            return str2;
        }
    }

    private static d a(Activity activity, Uri uri, String str, String str2, boolean z, int i, boolean z2) {
        if (activity != null && uri != null) {
            try {
                if (uri.getScheme() != null && !TextUtils.isEmpty(str)) {
                    String queryParameter = uri.getQueryParameter(Constants.REFERRER);
                    String queryParameter2 = uri.getQueryParameter("id");
                    if (!TextUtils.equals(str2, queryParameter2)) {
                        return new d(3, queryParameter2, null);
                    }
                    if (NetworkUtils.PROTOCOL_MARKET.equalsIgnoreCase(uri.getScheme())) {
                        String lowerCase = uri.toString().toLowerCase();
                        if (!lowerCase.contains("details") && !lowerCase.contains("launch")) {
                            return new d(2, queryParameter2, queryParameter);
                        }
                    } else if (!"details".equalsIgnoreCase(uri.getLastPathSegment())) {
                        return new d(2, queryParameter2, queryParameter);
                    }
                    if (z) {
                        i = 1;
                    }
                    Intent a = a(queryParameter2, str, queryParameter, i == 1);
                    if (a.resolveActivity(activity.getPackageManager()) == null) {
                        return new d(2, queryParameter2, queryParameter);
                    }
                    if (z2) {
                        safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(activity, a, 0);
                    }
                    return new d(1, queryParameter2, queryParameter);
                }
            } catch (Throwable th) {
                th.getMessage();
                return new d(2, null, null);
            }
        }
        return new d(2, null, null);
    }

    public static void a(Activity activity, String str, String str2, String str3) {
        try {
            safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(activity, a(str, str2, str3, true), 0);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static boolean a(Context context, String str) {
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, context.getPackageManager().getLaunchIntentForPackage(str));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean a(Context context, String str, String str2, @NonNull List<String> list) {
        String str3;
        try {
            Intent a = a(Uri.parse(str));
            if (!TextUtils.isEmpty(str2)) {
                a.setPackage(str2);
            }
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, a);
            return true;
        } catch (Exception e) {
            if (e instanceof ActivityNotFoundException) {
                str3 = "Unable to open target URL by browser due to ActivityNotFoundException.";
            } else {
                StringBuilder sb = new StringBuilder();
                if (TextUtils.isEmpty(str2)) {
                    str2 = "unknown";
                }
                sb.append(str2);
                sb.append(": ");
                sb.append(e.getMessage());
                list.add(sb.toString());
                str3 = "Unable to open target URL by system browser.";
            }
            sg.bigo.ads.bn.a.a(2, "LinkUtils", str3);
            return false;
        }
    }

    public static boolean a(Uri uri, Context context, Activity activity, @NonNull e eVar, @Nullable String str, boolean z, String str2, int i, boolean z2) {
        if (uri == null || uri.getScheme() == null || context == null || uri.getScheme().startsWith("http")) {
            return false;
        }
        eVar.k = uri.toString();
        if (uri.getScheme().startsWith(NetworkUtils.PROTOCOL_MARKET)) {
            if (z || i > 0) {
                eVar.d = a(activity, uri, context.getPackageName(), str2, z, i, z2);
                if (eVar.b() == 1) {
                    return true;
                }
            }
            Intent a = a(uri);
            a.setPackage("com.android.vending");
            try {
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, a);
                eVar.b = 1;
                return true;
            } catch (ActivityNotFoundException unused) {
                eVar.b = 2;
            } catch (Exception e) {
                sg.bigo.ads.bn.a.a(0, "LinkUtils", e.toString());
                eVar.b = 4;
            }
        }
        eVar.l = str;
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, a(uri));
            eVar.c = 1;
            return true;
        } catch (ActivityNotFoundException unused2) {
            eVar.b = 2;
            return false;
        } catch (Exception e2) {
            sg.bigo.ads.bn.a.a(0, "LinkUtils", e2.toString());
            eVar.c = 4;
            return false;
        }
    }

    public static boolean a(Uri uri, Context context, Activity activity, @NonNull e eVar, boolean z, String str, int i, boolean z2) {
        if (context != null && uri != null) {
            if (z || i > 0) {
                eVar.d = a(activity, uri, context.getPackageName(), str, z, i, z2);
                if (eVar.b() == 1) {
                    eVar.n = true;
                    eVar.a = 5;
                    return true;
                }
            }
            Intent a = a(uri);
            a.setPackage("com.android.vending");
            try {
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, a);
                eVar.b = 1;
                eVar.n = true;
                eVar.a = 2;
                return true;
            } catch (ActivityNotFoundException unused) {
                eVar.b = 2;
                try {
                    safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, a(uri));
                    eVar.n = true;
                    eVar.a = 2;
                    return true;
                } catch (Exception e) {
                    sg.bigo.ads.bn.a.a(0, "LinkUtils", e.toString());
                }
            } catch (Exception e2) {
                sg.bigo.ads.bn.a.a(0, "LinkUtils", e2.toString());
                eVar.b = 4;
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, a(uri));
                eVar.n = true;
                eVar.a = 2;
                return true;
            }
        }
        return false;
    }

    public static boolean a(String str) {
        return str.startsWith("market://") || str.startsWith("http://play.google.com") || str.startsWith("https://play.google.com");
    }

    public static boolean a(b bVar, Context context, String str, @Nullable JSONArray jSONArray) {
        int i;
        if (!str.startsWith(com.safedk.android.analytics.brandsafety.creatives.discoveries.d.v) && !str.startsWith(com.safedk.android.analytics.brandsafety.creatives.discoveries.d.u)) {
            str = com.safedk.android.analytics.brandsafety.creatives.discoveries.d.v.concat(str);
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() > 0) {
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                String optString = jSONArray.optString(i2);
                if (!TextUtils.isEmpty(optString) && a(context, str, optString, arrayList)) {
                    sg.bigo.ads.da.b.a(bVar, "1", arrayList, optString, 1);
                    return true;
                }
            }
        }
        if (sg.bigo.ads.common.utils.d.b(context, "com.android.chrome") == 1 && a(context, str, "com.android.chrome", arrayList)) {
            i = 2;
        } else {
            if (!a(context, str, (String) null, arrayList)) {
                sg.bigo.ads.da.b.a(bVar, "0", arrayList, "", 0);
                return false;
            }
            i = 3;
        }
        sg.bigo.ads.da.b.a(bVar, "1", arrayList, "", i);
        return true;
    }

    public static boolean b(Context context, String str) {
        try {
            Intent intent = new Intent();
            String c = c(context, str);
            if (c == null) {
                return false;
            }
            intent.setComponent(new ComponentName(str, c));
            intent.addFlags(268435456);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String c(Context context, String str) {
        if (context == null) {
            return null;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setPackage(str);
        Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 131072).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && activityInfo.exported) {
                return activityInfo.name;
            }
        }
        return null;
    }

    public static void d(Context context, String str) {
        Intent a = AdActivity.a(context, WebViewActivityImpl.class);
        a.putExtra("url", str);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, a);
    }

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }
}
