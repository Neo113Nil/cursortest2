package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.Application;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ऽ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC0698 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static AbstractC0698 f1552;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public boolean f1554 = false;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final HashSet f1553 = new HashSet();

    static {
        StringFog.decrypt("Vsb3rH8xW/x3z/u3fTFy2XjZ7KtwOGXGdNjup304\n", "EaqYzh5dF5U=\n");
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static synchronized AbstractC0698 m4143() {
        AbstractC0698 abstractC0698;
        synchronized (AbstractC0698.class) {
            try {
                if (f1552 == null) {
                    f1552 = new C0739();
                }
                abstractC0698 = f1552;
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractC0698;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public abstract boolean mo4144();

    /* renamed from: ｋ, reason: contains not printable characters */
    public final synchronized ArrayList m4145() {
        return new ArrayList(this.f1553);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public abstract Activity mo4146();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public abstract void mo4147(Application application, Activity activity);

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m4148(C1118 c1118) {
        this.f1553.add(c1118);
    }
}
