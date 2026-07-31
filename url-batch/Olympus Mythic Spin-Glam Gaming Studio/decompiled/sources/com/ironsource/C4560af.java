package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.af, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4560af {

    @Nullable
    private C4542a6 a;

    /* renamed from: com.ironsource.af$a */
    private final class a extends Ze {
        public a() {
        }

        @Override // com.ironsource.Ze, java.lang.Runnable
        public void run() {
            JSONObject b = IronSourceUtils.b(false);
            try {
                b.put(IronSourceConstants.EVENTS_DURATION, a());
            } catch (JSONException e) {
                C4782n4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            C4630ed.P.a(new C4966x5(EnumC4984y5.APP_ENTER_BACKGROUND, b));
        }
    }

    public final void a(@NotNull InterfaceC4749l7 applicationLifecycleService) {
        Intrinsics.checkNotNullParameter(applicationLifecycleService, "applicationLifecycleService");
        this.a = new C4542a6(applicationLifecycleService, new a());
    }
}
