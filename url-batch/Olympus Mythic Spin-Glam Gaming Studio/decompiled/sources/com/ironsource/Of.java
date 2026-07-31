package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class Of {

    @NotNull
    public static final Of a = new Of();

    private Of() {
    }

    public final void a(int i) {
        a(EnumC4984y5.TEST_SUITE_FAILED_TO_OPEN, Integer.valueOf(i), null);
    }

    public final void b() {
        a(this, EnumC4984y5.TEST_SUITE_LAUNCH_TS, null, null, 6, null);
    }

    public final void c() {
        a(this, EnumC4984y5.TEST_SUITE_OPENED_SUCCESSFULLY, null, null, 6, null);
    }

    public final void d() {
        a(this, EnumC4984y5.TEST_SUITE_WEB_CONTROLLER_OPEN_SUCCESSFULLY, null, null, 6, null);
    }

    public final void a(@NotNull String errorReason) {
        Intrinsics.checkNotNullParameter(errorReason, "errorReason");
        a(EnumC4984y5.TEST_SUITE_WEB_CONTROLLER_FAILED_TO_LOAD, Integer.valueOf(IronSourceConstants.errorCode_TEST_SUITE_WEB_CONTROLLER_NOT_LOADED), errorReason);
    }

    static /* synthetic */ void a(Of of, EnumC4984y5 enumC4984y5, Integer num, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        of.a(enumC4984y5, num, str);
    }

    private final void a(EnumC4984y5 enumC4984y5, Integer num, String str) {
        Xf xf = Xf.a;
        JSONObject a2 = xf.a(false);
        if (num != null) {
            a2.put(IronSourceConstants.EVENTS_ERROR_CODE, num.intValue());
            JSONArray a3 = a();
            if (a3 != null) {
                a2.put(com.ironsource.mediationsdk.metadata.a.f, a3);
            }
        }
        if (str != null) {
            a2.put("reason", str);
        }
        xf.a(enumC4984y5, a2);
    }

    private final JSONArray a() {
        ConcurrentHashMap<String, List<String>> d = Xf.a.d();
        if (d.containsKey(com.ironsource.mediationsdk.metadata.a.f)) {
            return new JSONArray((Collection) d.get(com.ironsource.mediationsdk.metadata.a.f));
        }
        return null;
    }
}
