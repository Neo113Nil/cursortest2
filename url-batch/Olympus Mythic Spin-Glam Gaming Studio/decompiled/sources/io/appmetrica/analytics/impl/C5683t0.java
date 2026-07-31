package io.appmetrica.analytics.impl;

import android.content.Context;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* renamed from: io.appmetrica.analytics.impl.t0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5683t0 {
    public final C5603po a;
    public volatile Boolean b;
    public InterfaceC5202ab c;
    public InterfaceC5228bb d;

    public C5683t0() {
        this(new C5603po());
    }

    public final synchronized InterfaceC5202ab a(Context context, C5402i4 c5402i4) {
        try {
            if (this.c == null) {
                if (a(context)) {
                    this.c = new C5787x0();
                } else {
                    this.c = new C5657s0(context, c5402i4);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    public C5683t0(C5603po c5603po) {
        this.a = c5603po;
    }

    public final boolean a(Context context) {
        Boolean bool = this.b;
        if (bool == null) {
            synchronized (this) {
                try {
                    bool = this.b;
                    if (bool == null) {
                        this.a.getClass();
                        boolean z = AndroidUtils.isApiAchieved(24) && !C5603po.a(context);
                        bool = Boolean.valueOf(z);
                        this.b = bool;
                        if (z) {
                            ImportantLogger.INSTANCE.info(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA, "User is locked. So use stubs. Events will not be sent.", new Object[0]);
                        }
                    }
                } finally {
                }
            }
        }
        return bool.booleanValue();
    }
}
