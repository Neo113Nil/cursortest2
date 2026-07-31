package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.od, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C4809od implements E0 {

    @NotNull
    private final String a;

    public C4809od(@NotNull String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        this.a = placementName;
    }

    @Override // com.ironsource.E0
    @NotNull
    public Map<String, Object> a(@Nullable C0 c0) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", this.a);
        return hashMap;
    }
}
