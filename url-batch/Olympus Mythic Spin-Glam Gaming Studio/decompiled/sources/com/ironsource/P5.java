package com.ironsource;

import android.content.Context;
import com.ironsource.X3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class P5 implements Mc {
    private boolean a = true;

    @NotNull
    private String b = Q5.j;

    public static final class a implements InterfaceC4660g7 {
        a() {
        }

        @Override // com.ironsource.InterfaceC4660g7
        public void a(boolean z) {
            if (z) {
                return;
            }
            IronLog.API.error("failed to send impression data");
        }
    }

    private final JSONObject b() {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        jsonObjectInit.put(Wa.o, "android");
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            jsonObjectInit.put("deviceType", IronSourceUtils.b(applicationContext));
            Q9 d = IronSourceUtils.d(applicationContext);
            if (d != null) {
                jsonObjectInit.put("advId", d.c());
                jsonObjectInit.put("advIdType", d.d());
            }
        }
        String i = com.ironsource.mediationsdk.p.h().i();
        if (i != null) {
            jsonObjectInit.put(X3.j.g, i);
        }
        return jsonObjectInit;
    }

    @Override // com.ironsource.Mc
    public void a() {
    }

    public final void a(@NotNull String dataSource, @NotNull JSONObject impressionData) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(impressionData, "impressionData");
        if (!this.a) {
            IronLog.INTERNAL.verbose("disabled from server");
            return;
        }
        try {
            JSONObject b = b();
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            jsonObjectInit.putOpt("externalMediationSource", dataSource);
            jsonObjectInit.putOpt("externalMediationData", impressionData);
            jsonObjectInit.putOpt("clientParams", b);
            IronLog.API.info("impressionData: " + jsonObjectInit);
            C4642f7.a(this.b, jsonObjectInit.toString(), new a());
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.API.error("exception " + e.getMessage() + " sending impression data");
        }
    }

    @Override // com.ironsource.Mc
    public void g(@Nullable String str) {
    }

    @Override // com.ironsource.Mc
    public void a(@Nullable List<IronSource.a> list, boolean z, @Nullable N3 n3) {
        if (n3 != null) {
            C1 b = n3.b();
            M1 f = b != null ? b.f() : null;
            Intrinsics.checkNotNull(f);
            this.a = f.l();
            this.b = n3.b().f().d();
        }
    }
}
