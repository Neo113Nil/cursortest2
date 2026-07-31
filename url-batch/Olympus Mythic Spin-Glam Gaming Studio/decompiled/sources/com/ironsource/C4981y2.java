package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C4822p8;
import com.ironsource.mediationsdk.logger.IronLog;
import com.yandex.div.core.ScrollDirection;

/* renamed from: com.ironsource.y2, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C4981y2 {
    public static C4981y2 a;

    /* renamed from: com.ironsource.y2$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C4822p8.a.values().length];
            a = iArr;
            try {
                iArr[C4822p8.a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[C4822p8.a.Device.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[C4822p8.a.Controller.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static C4981y2 a() {
        C4981y2 c4981y2 = a;
        return c4981y2 == null ? new C4981y2() : c4981y2;
    }

    public boolean a(Activity activity) {
        if (a.a[C4609da.e().b().ordinal()] != 3) {
            return false;
        }
        try {
            com.ironsource.sdk.controller.v vVar = (com.ironsource.sdk.controller.v) P9.b((Context) activity).a().k();
            if (vVar == null) {
                return true;
            }
            vVar.l(ScrollDirection.BACK);
            return true;
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }
}
