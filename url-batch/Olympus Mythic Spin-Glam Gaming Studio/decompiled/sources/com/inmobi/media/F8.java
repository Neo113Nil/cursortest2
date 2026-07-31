package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.RootConfig;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public abstract class F8 {
    public static String a;

    static {
        String TAG = F8.class.getSimpleName();
        a(G9.a());
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        G9.a();
    }

    public static String a() {
        boolean booleanValue;
        Boolean bool = AbstractC4132kh.b;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            Context context = AbstractC4002fj.a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Qa.b;
                Qa a2 = Pa.a(context, "user_info_store");
                Intrinsics.checkNotNullParameter("user_age_restricted", "key");
                AbstractC4132kh.b = Boolean.valueOf(a2.a.getBoolean("user_age_restricted", false));
            }
            Boolean bool2 = AbstractC4132kh.b;
            booleanValue = bool2 != null ? bool2.booleanValue() : false;
        }
        if (booleanValue) {
            Intrinsics.checkNotNullExpressionValue("F8", "TAG");
            return null;
        }
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
        C4277q4 c4277q42 = AbstractC4015g4.a;
        if (CollectionsKt.contains(((RootConfig) c4277q42.a(RootConfig.class)).getIPAddrTPSupport(), AbstractC4030gj.b)) {
            Intrinsics.checkNotNullExpressionValue("F8", "TAG");
            return a;
        }
        Intrinsics.checkNotNullExpressionValue("F8", "TAG");
        Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
        Objects.toString(((RootConfig) c4277q42.a(RootConfig.class)).getIPAddrTPSupport());
        return null;
    }

    public static void a(String str) {
        boolean booleanValue;
        Boolean bool = AbstractC4132kh.b;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            Context context = AbstractC4002fj.a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Qa.b;
                Qa a2 = Pa.a(context, "user_info_store");
                Intrinsics.checkNotNullParameter("user_age_restricted", "key");
                AbstractC4132kh.b = Boolean.valueOf(a2.a.getBoolean("user_age_restricted", false));
            }
            Boolean bool2 = AbstractC4132kh.b;
            booleanValue = bool2 != null ? bool2.booleanValue() : false;
        }
        if (!booleanValue) {
            a = str;
            G9.a(str);
        } else {
            a = null;
            G9.a(null);
        }
    }
}
