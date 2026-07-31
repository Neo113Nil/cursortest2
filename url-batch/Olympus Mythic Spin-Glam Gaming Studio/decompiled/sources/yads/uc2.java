package yads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes4.dex */
public final class uc2 {
    public static final List a = CollectionsKt.listOf((Object[]) new String[]{"android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET"});

    public static void a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            List mutableList = CollectionsKt.toMutableList((Collection) a);
            String[] strArr = packageInfo.requestedPermissions;
            if (strArr != null) {
                mutableList.removeAll(ArraysKt.toList(strArr));
                if (mutableList.isEmpty()) {
                    return;
                }
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("Please, check %s permission in AndroidManifest file.", Arrays.copyOf(new Object[]{mutableList}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                throw new ja1(format);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
