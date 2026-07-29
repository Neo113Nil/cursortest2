package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class F2 extends Lambda implements Function1 {
    public final /* synthetic */ Activity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F2(Activity activity) {
        super(1);
        this.a = activity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Intent intent = (Intent) obj;
        Intrinsics.checkNotNullParameter(intent, "intent");
        List<ResolveInfo> queryIntentServices = this.a.getPackageManager().queryIntentServices(intent, 0);
        Intrinsics.checkNotNullExpressionValue(queryIntentServices, "activity.packageManager.…IntentServices(intent, 0)");
        return queryIntentServices;
    }
}
