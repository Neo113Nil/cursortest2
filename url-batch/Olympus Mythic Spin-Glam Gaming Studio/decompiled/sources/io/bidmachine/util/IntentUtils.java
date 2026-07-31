package io.bidmachine.util;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: IntentUtils.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lio/bidmachine/util/IntentUtils;", "", "()V", "STORE_PACKAGE", "", "findStoreComponentName", "Landroid/content/ComponentName;", "resolveInfoList", "", "Landroid/content/pm/ResolveInfo;", "urlToIntent", "Landroid/content/Intent;", "url", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes14.dex */
public final class IntentUtils {

    @NotNull
    public static final IntentUtils INSTANCE = new IntentUtils();

    @NotNull
    public static final String STORE_PACKAGE = "com.android.vending";

    private IntentUtils() {
    }

    @NotNull
    public static final Intent urlToIntent(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Uri parse = Uri.parse(url);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(url)");
        return IntentUtilsKt.toIntent$default(parse, false, 1, null);
    }

    @Nullable
    public static final ComponentName findStoreComponentName(@NotNull List<? extends ResolveInfo> resolveInfoList) {
        Object obj;
        Intrinsics.checkNotNullParameter(resolveInfoList, "resolveInfoList");
        Iterator<T> it = resolveInfoList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((ResolveInfo) obj).activityInfo.packageName, "com.android.vending")) {
                break;
            }
        }
        ResolveInfo resolveInfo = (ResolveInfo) obj;
        if (resolveInfo == null) {
            return null;
        }
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        return new ComponentName(activityInfo.packageName, activityInfo.name);
    }
}
