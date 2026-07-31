package com.vungle.ads.internal.network;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public enum g {
    GET,
    POST;


    @NotNull
    public static final f Companion = new Object() { // from class: com.vungle.ads.internal.network.f
        @NotNull
        public final KSerializer serializer() {
            return e.a;
        }
    };
}
