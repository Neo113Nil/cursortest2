package com.ogury.ad.internal;

import android.content.Context;
import com.mobilefuse.sdk.MobileFuseDefaults;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class uh extends r4 {
    public final og b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public uh(Context context) {
        super(context, app, coreWrapper);
        r0 app = new r0(context);
        h2 coreWrapper = new h2(context);
        og permissionsHandler = new og(context, hb.c);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(coreWrapper, "coreWrapper");
        Intrinsics.checkNotNullParameter(permissionsHandler, "permissionsHandler");
        this.b = permissionsHandler;
    }

    @Override // com.ogury.ad.internal.r4, com.ogury.ad.internal.k2, com.ogury.core.internal.network.HeadersLoader
    @NotNull
    public Map<String, String> loadHeaders() {
        Map<String, String> loadHeaders = super.loadHeaders();
        og ogVar = this.b;
        ogVar.getClass();
        String str = (String) ogVar.a(g2.b, new xf(ogVar));
        if (str == null) {
            str = MobileFuseDefaults.ADVERTISING_ID_ZEROS;
        }
        loadHeaders.put("User", str);
        og ogVar2 = this.b;
        ogVar2.getClass();
        String str2 = (String) ogVar2.a(g2.d, new dg(ogVar2));
        if (str2 != null) {
            loadHeaders.put("Instance-Token", str2);
        }
        return loadHeaders;
    }
}
