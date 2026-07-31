package com.inmobi.media;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.android.billingclient.api.BillingClient;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.yandex.div.core.DivActionHandler;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.mh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC4184mh {
    public static String a;
    public static Ah b;
    public static int c;
    public static final Lazy d = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.mh$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return Boolean.valueOf(AbstractC4184mh.c());
        }
    });

    public static void a() {
        Qa qa;
        Context context = AbstractC4002fj.a;
        String str = null;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Qa.b;
            qa = Pa.a(context, "purchase_store");
        } else {
            qa = null;
        }
        if (qa != null) {
            Intrinsics.checkNotNullParameter("purchase_pref", "key");
            str = qa.a.getString("purchase_pref", null);
        }
        if (str != null) {
            a = str;
        }
    }

    public static void b() {
        try {
            Context context = AbstractC4002fj.a;
            if (context == null) {
                return;
            }
            C4277q4 c4277q4 = AbstractC4015g4.a;
            Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
            if (((SignalsConfig) AbstractC4015g4.a.a(SignalsConfig.class)).getPurchases().getInapp()) {
                a();
                if (a(context)) {
                    c = 1;
                    Ah ah = new Ah();
                    b = ah;
                    ah.a(context, new Function1() { // from class: com.inmobi.media.mh$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC4184mh.a((C4211nh) obj);
                        }
                    });
                }
            }
        } catch (Exception e) {
            Lazy lazy = AbstractC3861aa.a;
            AbstractC3861aa.a(new Q2(e));
            e.getMessage();
        }
    }

    public static final boolean c() {
        return true;
    }

    public static final Unit a(C4211nh c4211nh) {
        Qa qa;
        c = 2;
        if (c4211nh == null) {
            Ah ah = b;
            if (ah != null) {
                ah.a = null;
                BillingClient billingClient = ah.b;
                if (billingClient != null) {
                    billingClient.endConnection();
                }
            }
            b = null;
            return Unit.INSTANCE;
        }
        c4211nh.toString();
        JSONObject jSONObject = new JSONObject();
        int i = c4211nh.a;
        if (i > 0) {
            jSONObject.put("p", i);
        }
        int i2 = c4211nh.b;
        if (i2 > 0) {
            jSONObject.put("s", i2);
        }
        String nipMapJSON = jSONObject.length() == 0 ? null : jSONObject.toString();
        if (nipMapJSON != null) {
            a = nipMapJSON;
            Intrinsics.checkNotNullParameter(nipMapJSON, "nipMapJSON");
            Intrinsics.checkNotNullParameter(nipMapJSON, "nipMapJSON");
            Context context = AbstractC4002fj.a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Qa.b;
                qa = Pa.a(context, "purchase_store");
            } else {
                qa = null;
            }
            if (qa != null) {
                ConcurrentHashMap concurrentHashMap2 = Qa.b;
                qa.a("purchase_pref", nipMapJSON, false);
            }
        }
        Ah ah2 = b;
        if (ah2 != null) {
            ah2.a = null;
            BillingClient billingClient2 = ah2.b;
            if (billingClient2 != null) {
                billingClient2.endConnection();
            }
        }
        b = null;
        return Unit.INSTANCE;
    }

    public static boolean a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        F5.a.getClass();
        if (!F5.x()) {
            return false;
        }
        if (!((Boolean) d.getValue()).booleanValue()) {
            AbstractC4342sh.a(new C4264ph((short) 2230));
            return false;
        }
        if (!b(context)) {
            return false;
        }
        int i = c;
        if (i != 1 && i != 2) {
            return true;
        }
        AbstractC4342sh.a(new C4264ph(i != 1 ? i != 2 ? (short) 0 : (short) 2232 : (short) 2231));
        return false;
    }

    public static boolean b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            String string = bundle != null ? bundle.getString("com.google.android.play.billingclient.version") : null;
            C4277q4 c4277q4 = AbstractC4015g4.a;
            Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
            boolean contains = CollectionsKt.contains(((SignalsConfig) AbstractC4015g4.a.a(SignalsConfig.class)).getPurchases().getVersionList(), string);
            if (!contains) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (string == null) {
                    string = "";
                }
                linkedHashMap.put(DivActionHandler.DivActionReason.TRIGGER, string);
                C4425vk c4425vk = C4425vk.a;
                C4425vk.b("BillingClientNotCompatible", linkedHashMap, EnumC4530zk.a);
            }
            return contains;
        } catch (Exception e) {
            Lazy lazy = AbstractC3861aa.a;
            AbstractC3861aa.a(new Q2(e));
            e.getMessage();
            return false;
        }
    }
}
