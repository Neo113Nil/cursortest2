package com.ironsource;

import android.content.Context;
import com.ironsource.P3;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class Ie {

    @NotNull
    private final Pe a;

    @NotNull
    private final C4980y1 b;

    @NotNull
    private final G9 c;

    @NotNull
    private final C4685he d;

    @NotNull
    private final U9 e;

    public Ie() {
        this(null, null, null, null, null, 31, null);
    }

    public final void a(@NotNull Context context, @NotNull Te serverResponse) {
        P3.c.C0352c m;
        JSONObject u;
        String c;
        P3.c.C0352c m2;
        String q;
        Boolean t;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        P3.c g = serverResponse.d().g();
        this.a.a(context, InterfaceC4986y7.a, (g == null || (t = g.t()) == null) ? true : t.booleanValue());
        P3.c g2 = serverResponse.d().g();
        if (g2 != null && (m2 = g2.m()) != null && (q = m2.q()) != null) {
            this.b.a(q);
            this.c.a(q);
            this.d.a(q);
        }
        P3.b f = serverResponse.d().f();
        if (f != null && (c = f.c()) != null) {
            this.e.b(c);
        }
        P3.c g3 = serverResponse.d().g();
        if (g3 == null || (m = g3.m()) == null || (u = m.u()) == null) {
            return;
        }
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(u.toString());
        JSONObject optJSONObject = jsonObjectInit.optJSONObject("events");
        if (optJSONObject != null) {
            Intrinsics.checkNotNullExpressionValue(optJSONObject, "optJSONObject(\"events\")");
            jsonObjectInit.remove("events");
            Map<String, String> b = IronSourceUtils.b(optJSONObject);
            this.b.b(b);
            this.c.b(b);
            this.d.b(b);
        }
        Map<String, String> b2 = IronSourceUtils.b(jsonObjectInit);
        this.b.a(b2);
        this.c.a(b2);
        this.d.a(b2);
    }

    public Ie(@NotNull Pe sharedPreferences, @NotNull C4980y1 appEventsManager, @NotNull G9 interstitialEventsManager, @NotNull C4685he rewardedVideoEventsManager, @NotNull U9 globalDataWriter) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(appEventsManager, "appEventsManager");
        Intrinsics.checkNotNullParameter(interstitialEventsManager, "interstitialEventsManager");
        Intrinsics.checkNotNullParameter(rewardedVideoEventsManager, "rewardedVideoEventsManager");
        Intrinsics.checkNotNullParameter(globalDataWriter, "globalDataWriter");
        this.a = sharedPreferences;
        this.b = appEventsManager;
        this.c = interstitialEventsManager;
        this.d = rewardedVideoEventsManager;
        this.e = globalDataWriter;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Ie(Pe pe, C4980y1 c4980y1, G9 g9, C4685he c4685he, U9 u9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(pe, r10, r1, c4685he, (i & 16) != 0 ? new U9() : u9);
        pe = (i & 1) != 0 ? new Oe() : pe;
        C4980y1 q = (i & 2) != 0 ? Kb.u.d().q() : c4980y1;
        if ((i & 4) != 0) {
            g9 = G9.i();
            Intrinsics.checkNotNullExpressionValue(g9, "getInstance()");
        }
        G9 g92 = g9;
        if ((i & 8) != 0) {
            c4685he = C4685he.i();
            Intrinsics.checkNotNullExpressionValue(c4685he, "getInstance()");
        }
    }
}
