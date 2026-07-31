package com.ironsource;

import com.ironsource.We;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.oe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C4810oe {

    @NotNull
    private final C4975xe a;

    @Nullable
    private final Te b;

    @Nullable
    private final C4608d9 c;

    public C4810oe(@NotNull C4975xe sdkInitResponse, @Nullable Te te, @Nullable C4608d9 c4608d9) {
        Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
        this.a = sdkInitResponse;
        this.b = te;
        this.c = c4608d9;
    }

    @NotNull
    public final M1 a() {
        return this.a.a().b().d();
    }

    @NotNull
    public final F1 b() {
        return this.a.a().b().b();
    }

    @NotNull
    public final N5 c() {
        return this.a.b();
    }

    @NotNull
    public final We d() {
        return this.a.c();
    }

    @NotNull
    public final Gb e() {
        return this.a.a().b().f();
    }

    @Nullable
    public final C4608d9 f() {
        return this.c;
    }

    @NotNull
    public final We.a g() {
        We.a i = this.a.c().i();
        Intrinsics.checkNotNullExpressionValue(i, "sdkInitResponse.fullResponse.origin");
        return i;
    }

    @NotNull
    protected final C4975xe h() {
        return this.a;
    }

    @Nullable
    public final Te i() {
        return this.b;
    }

    public /* synthetic */ C4810oe(C4975xe c4975xe, Te te, C4608d9 c4608d9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4975xe, (i & 2) != 0 ? null : te, (i & 4) != 0 ? null : c4608d9);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4810oe(@NotNull C4810oe sdkConfig) {
        this(sdkConfig.a, sdkConfig.b, sdkConfig.c);
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
    }
}
