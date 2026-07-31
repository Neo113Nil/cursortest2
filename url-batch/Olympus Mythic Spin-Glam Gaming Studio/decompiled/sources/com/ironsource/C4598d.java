package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4598d implements Y5 {

    @NotNull
    private final C4612dd a;

    public C4598d(@NotNull C4612dd folderRootUrl) {
        Intrinsics.checkNotNullParameter(folderRootUrl, "folderRootUrl");
        this.a = folderRootUrl;
    }

    @Override // com.ironsource.Y5
    @NotNull
    public String value() {
        return this.a.a() + "/abTestMap.json";
    }
}
