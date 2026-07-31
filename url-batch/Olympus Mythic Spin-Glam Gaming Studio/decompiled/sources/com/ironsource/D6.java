package com.ironsource;

import android.app.Activity;
import com.ironsource.C4855r6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes13.dex */
public final class D6 implements InterfaceC4949w6, C4855r6.b, C4855r6.a {

    @NotNull
    public static final a f = new a(null);

    @NotNull
    public static final String g = "Fullscreen ProgressiveOnShown Strategy";

    @NotNull
    private final C4814p0 a;

    @NotNull
    private final InterfaceC4873s6 b;

    @NotNull
    private final InterfaceC4909u6 c;

    @NotNull
    private final InterfaceC4931v6 d;

    @NotNull
    private J6 e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public D6(@NotNull C4814p0 adTools, @NotNull InterfaceC4873s6 factory, @NotNull InterfaceC4909u6 fullscreenAdUnitListener, @NotNull InterfaceC4931v6 listener) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitListener, "fullscreenAdUnitListener");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a = adTools;
        this.b = factory;
        this.c = fullscreenAdUnitListener;
        this.d = listener;
        this.e = new E6(this, null, false, 4, null);
    }

    @NotNull
    public final C4814p0 a() {
        return this.a;
    }

    @NotNull
    public final InterfaceC4873s6 b() {
        return this.b;
    }

    @NotNull
    public final InterfaceC4909u6 c() {
        return this.c;
    }

    @NotNull
    public final InterfaceC4931v6 d() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC4949w6
    public void loadAd() {
        this.e.loadAd();
    }

    @Override // com.ironsource.InterfaceC4949w6
    public void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.e.a(activity);
    }

    @Override // com.ironsource.C4855r6.b
    public void b(@NotNull C4855r6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.c(adInfo);
    }

    @Override // com.ironsource.C4855r6.b
    public void c(@NotNull C4855r6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.b(adInfo);
    }

    public final void a(@NotNull J6 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.e = state;
    }

    @Override // com.ironsource.C4855r6.b
    public void b(@NotNull C4855r6 adUnit, @Nullable IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.e.a(ironSourceError);
    }

    public final void a(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.a.f().h().f("Fullscreen ProgressiveOnShown Strategy - " + message);
    }

    @Override // com.ironsource.C4855r6.a
    public void a(@NotNull C4855r6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.a(adInfo);
    }

    @Override // com.ironsource.C4855r6.a
    public void a(@NotNull C4855r6 adUnit, @Nullable IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.e.c(ironSourceError);
    }

    @Override // com.ironsource.C4855r6.b
    public void a(@NotNull C4855r6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.e.a();
    }
}
