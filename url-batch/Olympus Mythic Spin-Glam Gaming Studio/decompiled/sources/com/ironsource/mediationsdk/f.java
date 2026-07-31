package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.C4744l2;
import com.ironsource.C4869s2;
import com.ironsource.U1;
import com.ironsource.mediationsdk.e;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class f implements g {

    @NotNull
    private final C4869s2 a;

    @NotNull
    private final String b;

    public f(@NotNull C4869s2 settings, @NotNull String sessionId) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.a = settings;
        this.b = sessionId;
    }

    @Override // com.ironsource.mediationsdk.g
    @NotNull
    public e.a a(@NotNull Context context, @NotNull h auctionRequestParams, @NotNull U1 auctionListener) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auctionRequestParams, "auctionRequestParams");
        Intrinsics.checkNotNullParameter(auctionListener, "auctionListener");
        JSONObject a = a(context, auctionRequestParams);
        String a2 = this.a.a(auctionRequestParams.t());
        return auctionRequestParams.t() ? new C4744l2(auctionListener, new URL(a2), a, auctionRequestParams.u(), this.a) : new e.a(auctionListener, new URL(a2), a, auctionRequestParams.u(), this.a);
    }

    @Override // com.ironsource.mediationsdk.g
    public boolean b() {
        return this.a.g() > 0;
    }

    @Override // com.ironsource.mediationsdk.g
    public boolean a() {
        return this.a.n();
    }

    private final JSONObject a(Context context, h hVar) throws JSONException {
        JSONObject a = d.b().a(hVar);
        Intrinsics.checkNotNullExpressionValue(a, "getInstance().enrichToke…low(auctionRequestParams)");
        return a;
    }
}
