package com.inmobi.media;

import android.content.Context;
import android.os.Process;
import com.inmobi.media.core.config.models.SignalsConfig;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

/* renamed from: com.inmobi.media.mj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4187mj {
    public static String d;
    public static boolean e;
    public static long f;
    public static final Qa i;
    public static final M1 j;
    public static final M1 k;
    public static final /* synthetic */ KProperty[] b = {Reflection.property1(new PropertyReference1Impl(C4187mj.class, "sessionCnt", "getSessionCnt()I", 0)), Reflection.property1(new PropertyReference1Impl(C4187mj.class, "userRetention", "getUserRetention()I", 0))};
    public static final C4187mj a = new C4187mj();
    public static final String c = C4187mj.class.getSimpleName();
    public static final List g = CollectionsKt.mutableListOf(0, 0, 0, 0);
    public static final AtomicBoolean h = new AtomicBoolean(false);

    static {
        Qa qa;
        Context context = AbstractC4002fj.a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Qa.b;
            qa = Pa.a(context, "session_pref_file");
        } else {
            qa = null;
        }
        i = qa;
        int i2 = 12;
        j = new M1(-1, new Function0() { // from class: com.inmobi.media.mj$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Integer.valueOf(C4187mj.a());
            }
        }, i2);
        k = new M1(-1, new Function0() { // from class: com.inmobi.media.mj$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Integer.valueOf(C4187mj.b());
            }
        }, i2);
    }

    public static boolean a(int i2) {
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        return ((SignalsConfig) AbstractC4015g4.a.a(SignalsConfig.class)).getSession().getSigControlList().contains(Integer.valueOf(i2));
    }

    public static final int b() {
        a.getClass();
        Qa qa = i;
        if (qa == null) {
            return 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Intrinsics.checkNotNullParameter("u-ret", "key");
        return Integer.min((int) ((currentTimeMillis - qa.a.getLong("u-ret", currentTimeMillis)) / 86400000), Integer.MAX_VALUE);
    }

    public static void c() {
        if (h.getAndSet(true)) {
            return;
        }
        if (AbstractC4477xj.a().getSessionEnabled()) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            d = uuid;
            String TAG = c;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        }
        f = System.currentTimeMillis() - Process.getElapsedCpuTime();
        if (a(5)) {
            Qa qa = i;
            if (qa != null) {
                Intrinsics.checkNotNullParameter(com.safedk.android.analytics.brandsafety.m.R, "key");
                qa.a(com.safedk.android.analytics.brandsafety.m.R, Integer.min(qa.a.getInt(com.safedk.android.analytics.brandsafety.m.R, 0) + 1, Integer.MAX_VALUE), false);
            }
            j.a();
        }
        if (a(6)) {
            Qa qa2 = i;
            if (qa2 != null) {
                Intrinsics.checkNotNullParameter("u-ret", "key");
                if (!qa2.a.contains("u-ret")) {
                    qa2.a("u-ret", System.currentTimeMillis(), false);
                }
            }
            k.a();
        }
    }

    public static final int a() {
        a.getClass();
        Qa qa = i;
        if (qa == null) {
            return 0;
        }
        Intrinsics.checkNotNullParameter(com.safedk.android.analytics.brandsafety.m.R, "key");
        return qa.a.getInt(com.safedk.android.analytics.brandsafety.m.R, 0);
    }

    public static void a(String adtype, Boolean bool) {
        Intrinsics.checkNotNullParameter(adtype, "adtype");
        if (Intrinsics.areEqual(adtype, "banner") && a(1)) {
            List list = g;
            list.set(0, Integer.valueOf(Integer.min(((Number) list.get(0)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (Intrinsics.areEqual(adtype, com.safedk.android.analytics.brandsafety.m.w) && !Intrinsics.areEqual(bool, Boolean.TRUE) && a(2)) {
            List list2 = g;
            list2.set(1, Integer.valueOf(Integer.min(((Number) list2.get(1)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (Intrinsics.areEqual(adtype, "native") && a(4)) {
            List list3 = g;
            list3.set(3, Integer.valueOf(Integer.min(((Number) list3.get(3)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE) && a(3)) {
            List list4 = g;
            list4.set(2, Integer.valueOf(Integer.min(((Number) list4.get(2)).intValue() + 1, Integer.MAX_VALUE)));
        }
    }
}
