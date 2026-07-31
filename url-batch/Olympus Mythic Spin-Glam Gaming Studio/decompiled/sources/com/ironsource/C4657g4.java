package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.g4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4657g4 implements InterfaceC4932v7 {

    @NotNull
    private final String a;

    @NotNull
    private final String b;
    private final boolean c;

    @NotNull
    private final C4612dd d;

    public C4657g4() {
        this(null, null, false, null, 15, null);
    }

    @Override // com.ironsource.InterfaceC4932v7
    @NotNull
    public String a() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC4932v7
    public boolean b() {
        return this.c;
    }

    @Override // com.ironsource.InterfaceC4932v7
    @NotNull
    public C4612dd c() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC4932v7
    @NotNull
    public String d() {
        return this.b;
    }

    public C4657g4(@NotNull String controllerUrl, @NotNull String cacheFolder, boolean z, @NotNull C4612dd rootFolder) {
        Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        Intrinsics.checkNotNullParameter(cacheFolder, "cacheFolder");
        Intrinsics.checkNotNullParameter(rootFolder, "rootFolder");
        this.a = controllerUrl;
        this.b = cacheFolder;
        this.c = z;
        this.d = rootFolder;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C4657g4(String str, String str2, boolean z, C4612dd c4612dd, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new C4612dd(str) : c4612dd);
        str = (i & 1) != 0 ? "" : str;
    }
}
