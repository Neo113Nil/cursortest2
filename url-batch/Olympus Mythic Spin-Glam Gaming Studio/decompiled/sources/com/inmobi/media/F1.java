package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes10.dex */
public abstract class F1 {
    public static AppSetIdInfo a;

    static {
        b();
    }

    public static final void a(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static void b() {
        Context context = AbstractC4002fj.a;
        if (context != null && a()) {
            AppSetIdClient client = AppSet.getClient(context);
            Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
            Task<AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
            Intrinsics.checkNotNullExpressionValue(appSetIdInfo, "getAppSetIdInfo(...)");
            final Function1 function1 = new Function1() { // from class: com.inmobi.media.F1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return F1.a((AppSetIdInfo) obj);
                }
            };
            appSetIdInfo.addOnSuccessListener(new OnSuccessListener() { // from class: com.inmobi.media.F1$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    F1.a(Function1.this, obj);
                }
            });
        }
    }

    public static final Unit a(AppSetIdInfo appSetIdInfo) {
        a = appSetIdInfo;
        return Unit.INSTANCE;
    }

    public static boolean a() {
        try {
            Reflection.getOrCreateKotlinClass(AppSetIdInfo.class).getSimpleName();
            Reflection.getOrCreateKotlinClass(Task.class).getSimpleName();
            return true;
        } catch (NoClassDefFoundError e) {
            Intrinsics.checkNotNullExpressionValue("F1", "tag");
            e.toString();
            return false;
        }
    }

    public static void a(LinkedHashMap mutableMap) {
        AppSetIdInfo appSetIdInfo;
        Intrinsics.checkNotNullParameter(mutableMap, "mutableMap");
        if (a() && (appSetIdInfo = a) != null) {
            mutableMap.put("d-app-set-id", appSetIdInfo.getId());
            int scope = appSetIdInfo.getScope();
            StringBuilder sb = new StringBuilder();
            sb.append(scope);
        }
    }
}
