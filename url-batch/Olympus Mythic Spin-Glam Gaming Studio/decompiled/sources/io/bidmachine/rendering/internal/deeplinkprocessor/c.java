package io.bidmachine.rendering.internal.deeplinkprocessor;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.util.Executable;
import io.bidmachine.util.IntentUtilsKt;
import io.bidmachine.util.ProcessUrlResult;
import io.bidmachine.util.SystemComponent;
import io.bidmachine.util.UiUtils;
import io.bidmachine.util.network.NetworkUtils;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public final class c implements b {
    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "io.bidmachine");
        p0.startActivityForResult(p1, p2);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "io.bidmachine");
        p0.startActivity(p1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.getPath(), "/store/apps/details") != false) goto L24;
     */
    @Override // io.bidmachine.rendering.internal.deeplinkprocessor.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(Uri uri) {
        String scheme;
        Intrinsics.checkNotNullParameter(uri, "uri");
        boolean z = false;
        try {
            scheme = uri.getScheme();
        } catch (Throwable unused) {
        }
        if (scheme != null && scheme.hashCode() == -1081306052 && scheme.equals(NetworkUtils.PROTOCOL_MARKET)) {
            if (Intrinsics.areEqual(uri.getHost(), "details") && uri.getQueryParameterNames().contains("id")) {
                z = true;
            }
            return z;
        }
        if (Intrinsics.areEqual(uri.getHost(), POBCommonConstants.PLAY_STORE_DOMAIN)) {
            if (uri.getQueryParameterNames().contains("id")) {
                if (!Intrinsics.areEqual(uri.getPath(), "/d")) {
                }
                z = true;
            }
        }
        return z;
    }

    @Override // io.bidmachine.rendering.internal.deeplinkprocessor.b
    public void a(Context context, Uri uri, Executable executable) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        UiUtils.INSTANCE.onUiThreadWithArgSafely(a(context, d.a(uri)), executable);
    }

    public final ProcessUrlResult a(Context context, Uri uri) {
        Intent intent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            intent = IntentUtilsKt.toIntent(uri, false);
            intent.setPackage("com.android.vending");
            intent.putExtra("overlay", true);
            intent.putExtra("callerId", context.getPackageName());
        } catch (Throwable unused) {
        }
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            if (context instanceof Activity) {
                safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221((Activity) context, intent, 0);
            } else {
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            }
            return new ProcessUrlResult(true, SystemComponent.InlineInstall);
        }
        Unit unit = Unit.INSTANCE;
        return ProcessUrlResult.INSTANCE.getFAIL();
    }
}
