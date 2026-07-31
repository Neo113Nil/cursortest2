package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.ironsource.f9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4644f9 {

    @NotNull
    public static final C4644f9 a = new C4644f9();

    private C4644f9() {
    }

    @NotNull
    public static final JSONObject a() {
        new U9().b(ContextProvider.getInstance().getApplicationContext());
        String jSONObject = new C4626e9().a().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "InitProvider().getInitData().toString()");
        Ye.c(jSONObject);
        JSONObject encodedJsonInitResponse = IronSourceNetworkBridge.jsonObjectInit().put("data", J9.e(C4729k5.b().c(), jSONObject));
        Intrinsics.checkNotNullExpressionValue(encodedJsonInitResponse, "encodedJsonInitResponse");
        return encodedJsonInitResponse;
    }
}
