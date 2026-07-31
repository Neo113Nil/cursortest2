package com.fyber.inneractive.sdk.click;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes5.dex */
public final class l extends a {
    public static final k b = new k();
    public boolean a = false;

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.p);
        p0.startActivity(p1);
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final boolean a(Uri uri, r rVar) {
        return !this.a;
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final b a(Context context, Uri uri, List list) {
        Intent intent;
        ResolveInfo resolveInfo;
        if (this.a) {
            return null;
        }
        if (Build.VERSION.SDK_INT > 29) {
            String scheme = uri.getScheme();
            if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                if (this.a) {
                    return null;
                }
                Intent intent2 = new Intent("android.intent.action.VIEW", uri);
                if (!(context instanceof Activity)) {
                    intent2.setFlags(268435456);
                }
                return a(context, intent2, uri, list);
            }
        }
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 32);
        if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
            return null;
        }
        List<ResolveInfo> queryIntentActivities2 = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("http://www.fyber.com")), 32);
        TreeSet treeSet = new TreeSet(b);
        treeSet.addAll(queryIntentActivities2);
        queryIntentActivities.removeAll(treeSet);
        if (queryIntentActivities.size() <= 0 || (resolveInfo = queryIntentActivities.get(0)) == null) {
            intent = null;
        } else {
            intent = new Intent("android.intent.action.VIEW", uri);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent.setClassName(activityInfo.packageName, activityInfo.name);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
        }
        if (intent == null || this.a) {
            return null;
        }
        return a(context, intent, uri, list);
    }

    public final b a(Context context, Intent intent, Uri uri, List list) {
        if (this.a) {
            return r.a(uri.toString(), "Resolver", "The process was cancelled");
        }
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            if (list != null) {
                list.add(new j(uri.toString(), true, a.a(intent.getData(), q.OPEN_IN_EXTERNAL_APPLICATION), null));
            }
            return new b(uri.toString(), a.a(intent.getData(), q.OPEN_IN_EXTERNAL_APPLICATION), "Resolver", null);
        } catch (Throwable th) {
            IAlog.a("failed starting activity with error: %s", th.getLocalizedMessage());
            if (list != null) {
                list.add(new j(uri.toString(), false, q.OPEN_IN_EXTERNAL_APPLICATION, null));
            }
            return r.a(uri.toString(), "Resolver", "failed starting resolved activity - " + th.getMessage());
        }
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final void a() {
        this.a = true;
    }
}
