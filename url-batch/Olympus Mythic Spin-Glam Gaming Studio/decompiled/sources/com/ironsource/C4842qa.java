package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.ironsource.qa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4842qa implements Ue<JSONObject> {

    @NotNull
    private final Ue<String> a;

    public C4842qa(@NotNull Ue<String> serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        this.a = serverResponse;
    }

    @Override // com.ironsource.Ue
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a() {
        return IronSourceNetworkBridge.jsonObjectInit(this.a.a());
    }
}
