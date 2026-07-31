package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes12.dex */
public final class Dg implements Y5 {

    @NotNull
    private final C4612dd a;

    @NotNull
    private final String b;

    public Dg(@NotNull C4612dd folderRootUrl, @NotNull String version) {
        Intrinsics.checkNotNullParameter(folderRootUrl, "folderRootUrl");
        Intrinsics.checkNotNullParameter(version, "version");
        this.a = folderRootUrl;
        this.b = version;
    }

    @NotNull
    public final String a() {
        return this.b;
    }

    @Override // com.ironsource.Y5
    @NotNull
    public String value() {
        return this.a.a() + "/versions/" + this.b + "/mobileController.html";
    }
}
