package com.pubmatic.sdk.common.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class POBExternalUserId {
    private final String a;
    private final String b;
    private int c = 0;
    private JSONObject d;

    public POBExternalUserId(@NonNull String str, @NonNull String str2) {
        this.a = str;
        this.b = str2;
    }

    public int getAtype() {
        return this.c;
    }

    @Nullable
    public JSONObject getExtension() {
        return this.d;
    }

    @NonNull
    public String getId() {
        return this.b;
    }

    @NonNull
    public String getSource() {
        return this.a;
    }

    public void setAtype(int i) {
        this.c = i;
    }

    public void setExtension(@Nullable JSONObject jSONObject) {
        this.d = jSONObject;
    }
}
