package com.my.target.ads;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes11.dex */
public class Reward {
    public static final String DEFAULT = "default";

    @NonNull
    public final String type;

    private Reward(String str) {
        this.type = str;
    }

    @NonNull
    public static Reward getDefault() {
        return new Reward("default");
    }
}
