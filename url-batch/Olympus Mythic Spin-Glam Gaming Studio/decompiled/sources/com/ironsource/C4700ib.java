package com.ironsource;

import com.ironsource.InterfaceC4717jb;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.ib, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4700ib {

    @NotNull
    private final C4735kb a;

    /* renamed from: com.ironsource.ib$a */
    public static final class a {

        @NotNull
        private C4700ib a = new C4700ib(null);

        @NotNull
        public final a a(@NotNull String adUnitId) {
            Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
            this.a.a(adUnitId);
            return this;
        }

        @NotNull
        public final a b(@NotNull String placementName) {
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            this.a.b(placementName);
            return this;
        }

        @NotNull
        public final a a(@NotNull InterfaceC4771mb listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.a.a(listener);
            return this;
        }

        @NotNull
        public final C4700ib a() {
            return this.a;
        }
    }

    public /* synthetic */ C4700ib(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public final String c() {
        return this.a.i();
    }

    @Nullable
    public final String d() {
        return this.a.j();
    }

    @Nullable
    public final InterfaceC4717jb.a e() {
        return this.a.k();
    }

    @Nullable
    public final AdapterNativeAdViewBinder f() {
        return this.a.l();
    }

    @Nullable
    public final String g() {
        return this.a.m();
    }

    public final void h() {
        this.a.n();
    }

    private C4700ib() {
        this.a = new C4735kb(C4950w7.a.a(), this);
    }

    public final void a() {
        this.a.f();
    }

    @Nullable
    public final String b() {
        return this.a.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        this.a.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(String str) {
        this.a.b(str);
    }

    public final void a(@Nullable InterfaceC4771mb interfaceC4771mb) {
        this.a.a(interfaceC4771mb);
    }
}
