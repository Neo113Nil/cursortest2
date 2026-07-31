package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.X3;
import com.my.target.common.MyTargetConfig;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
class o5 extends t4 {
    private Map a;

    o5() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(Context context) {
        String str;
        Method method;
        Object invoke;
        String str2;
        String str3 = null;
        try {
            Class<?> cls = Class.forName("com.huawei.hms.ads.identifier.AdvertisingIdClient");
            mi.a("HuaweiOAIdDataProvider: Send huawei AId");
            method = cls.getMethod("getAdvertisingIdInfo", Context.class);
        } catch (Throwable unused) {
        }
        if (method != null && (invoke = method.invoke(null, context)) != null) {
            Method method2 = invoke.getClass().getMethod("getId", null);
            if (method2 != null) {
                str2 = (String) method2.invoke(invoke, null);
                try {
                    mi.a("HuaweiOAIdDataProvider: Huawei AId - " + str2);
                } catch (Throwable unused2) {
                }
            } else {
                str2 = null;
            }
            Method method3 = invoke.getClass().getMethod(X3.j.M, null);
            if (method3 != null) {
                str3 = (!((Boolean) method3.invoke(invoke, null)).booleanValue() ? 1 : 0) + "";
                StringBuilder sb = new StringBuilder();
                sb.append("HuaweiOAIdDataProvider: Huawei ad tracking enabled - ");
                sb.append(!r1.booleanValue());
                mi.a(sb.toString());
            }
            str = str3;
            str3 = str2;
            synchronized (this) {
                try {
                    if (str3 == null) {
                        this.a.remove(CommonUrlParts.HUAWEI_OAID);
                    } else {
                        this.a.put(CommonUrlParts.HUAWEI_OAID, str3);
                    }
                    if (str == null) {
                        this.a.remove("oaid_tracking_enabled");
                    } else {
                        this.a.put("oaid_tracking_enabled", str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ve.a(context).d(str3);
            ve.a(context).e(str);
            return;
        }
        str = null;
        synchronized (this) {
        }
    }

    synchronized Map a(MyTargetConfig myTargetConfig, final Context context) {
        if (o0.a()) {
            mi.a("HuaweiOAIdDataProvider: You must not call collectData method from main thread");
            return new HashMap();
        }
        if (this.a != null) {
            return new HashMap(this.a);
        }
        this.a = new HashMap();
        ve a = ve.a(context);
        try {
            Class.forName("com.huawei.hms.ads.identifier.AdvertisingIdClient");
            String e = a.e();
            String d = a.d();
            if (TextUtils.isEmpty(e)) {
                a(context);
            } else {
                this.a.put(CommonUrlParts.HUAWEI_OAID, e);
                this.a.put("oaid_tracking_enabled", d);
                o0.d(new Runnable() { // from class: com.my.target.o5$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        o5.this.a(context);
                    }
                });
            }
            return new HashMap(this.a);
        } catch (Throwable unused) {
            a.d(null);
            a.e(null);
            return new HashMap();
        }
    }
}
