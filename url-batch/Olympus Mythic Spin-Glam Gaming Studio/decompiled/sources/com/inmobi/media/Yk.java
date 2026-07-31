package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes14.dex */
public abstract class Yk {
    public static C4458x1 a;

    public static void a() {
        try {
            c();
            b();
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue("Yk", "TAG");
            e.getMessage();
        }
    }

    public static void b() {
        String str;
        try {
            C4458x1 c4458x1 = a;
            if (c4458x1 == null || (str = c4458x1.b) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue("Yk", "TAG");
            Xb.a((byte) 2, "Yk", "Publisher device Id is " + str);
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue("Yk", "TAG");
            e.getMessage();
        }
    }

    public static void c() {
        boolean z;
        boolean booleanValue;
        C4458x1 c4458x1;
        try {
            Context context = AbstractC4002fj.a;
            if (context != null) {
                C4458x1 c4458x12 = new C4458x1();
                try {
                    Reflection.getOrCreateKotlinClass(AdvertisingIdClient.class).getSimpleName();
                    try {
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                        Intrinsics.checkNotNullExpressionValue(advertisingIdInfo, "getAdvertisingIdInfo(...)");
                        c4458x12.b = advertisingIdInfo.getId();
                        c4458x12.a(advertisingIdInfo.isLimitAdTrackingEnabled());
                        a = c4458x12;
                        Boolean bool = AbstractC4132kh.b;
                        if (bool == null) {
                            Context context2 = AbstractC4002fj.a;
                            z = false;
                            if (context2 != null) {
                                ConcurrentHashMap concurrentHashMap = Qa.b;
                                Qa a2 = Pa.a(context2, "user_info_store");
                                Intrinsics.checkNotNullParameter("user_age_restricted", "key");
                                AbstractC4132kh.b = Boolean.valueOf(a2.a.getBoolean("user_age_restricted", false));
                            }
                            Boolean bool2 = AbstractC4132kh.b;
                            if (bool2 != null) {
                                booleanValue = bool2.booleanValue();
                            }
                            if (z || (c4458x1 = a) == null) {
                            }
                            c4458x1.b = null;
                            return;
                        }
                        booleanValue = bool.booleanValue();
                        z = booleanValue;
                        if (z) {
                        }
                    } catch (Throwable th) {
                        Intrinsics.checkNotNullExpressionValue("Yk", "TAG");
                        th.getMessage();
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue("Yk", "TAG");
            e.getMessage();
        }
    }

    public static final void d() {
        c();
    }

    public static void a(boolean z) {
        C4458x1 c4458x1 = a;
        if (c4458x1 == null) {
            return;
        }
        if (z) {
            c4458x1.b = null;
        } else if (c4458x1.b == null) {
            Runnable runnable = new Runnable() { // from class: com.inmobi.media.Yk$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Yk.d();
                }
            };
            Context context = AbstractC4002fj.a;
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            AbstractC4002fj.g.submit(runnable);
        }
    }
}
