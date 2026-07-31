package com.ogury.ad.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.ironsource.X3;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class mb extends r4 {
    public final q0 b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mb(Context context) {
        super(context, app, coreWrapper);
        r0 app = new r0(context);
        h2 coreWrapper = new h2(context);
        q0 androidDevice = new q0(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(coreWrapper, "coreWrapper");
        Intrinsics.checkNotNullParameter(androidDevice, "androidDevice");
        this.b = androidDevice;
    }

    @Override // com.ogury.ad.internal.r4, com.ogury.ad.internal.k2, com.ogury.core.internal.network.HeadersLoader
    @NotNull
    public Map<String, String> loadHeaders() {
        String str;
        NetworkInfo networkInfo;
        Map<String, String> loadHeaders = super.loadHeaders();
        loadHeaders.put("Api-Key", X3.j.d + this.a.b.a() + X3.j.e);
        loadHeaders.put("Sdk-Version", "[5.2.2]");
        this.b.b.getClass();
        loadHeaders.put("Timezone", qh.a());
        q0 q0Var = this.b;
        q0Var.getClass();
        try {
            Context context = q0Var.a;
            Intrinsics.checkNotNullParameter(context, "<this>");
            Intrinsics.checkNotNullParameter(context, "<this>");
            Intrinsics.checkNotNullParameter("android.permission.ACCESS_NETWORK_STATE", "permission");
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                Object systemService = context.getSystemService("connectivity");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                networkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            } else {
                networkInfo = null;
            }
            str = networkInfo != null ? q0.a(networkInfo) : "UNKNOWN";
        } catch (Exception e) {
            Logger.INSTANCE.e(LogTag.INTERNAL, SourceTag.ADS, e);
            str = "NONE";
        }
        loadHeaders.put("Connectivity", str);
        loadHeaders.put("Sdk-Version-Type", "ads");
        return loadHeaders;
    }
}
