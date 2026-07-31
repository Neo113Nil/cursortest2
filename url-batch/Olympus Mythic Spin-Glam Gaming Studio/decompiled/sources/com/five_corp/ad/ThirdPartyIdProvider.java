package com.five_corp.ad;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public interface ThirdPartyIdProvider {
    @NonNull
    String getProviderName();

    @Nullable
    JSONObject getUserInfo();
}
