package com.ironsource;

import android.app.Activity;
import com.ironsource.C4855r6;
import com.ironsource.InterfaceC4949w6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public final class K6 implements InterfaceC4949w6, C4855r6.b, C4855r6.a {

    @NotNull
    private final C4814p0 a;

    @NotNull
    private final InterfaceC4949w6.a b;

    @NotNull
    private final InterfaceC4873s6 c;

    @NotNull
    private final InterfaceC4909u6 d;

    @NotNull
    private final InterfaceC4931v6 e;

    @Nullable
    private C4855r6 f;

    public K6(@NotNull C4814p0 adTools, @NotNull InterfaceC4949w6.a config, @NotNull InterfaceC4873s6 fullscreenAdUnitFactory, @NotNull InterfaceC4909u6 fullscreenAdUnitListener, @NotNull InterfaceC4931v6 listener) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitListener, "fullscreenAdUnitListener");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a = adTools;
        this.b = config;
        this.c = fullscreenAdUnitFactory;
        this.d = fullscreenAdUnitListener;
        this.e = listener;
    }

    @NotNull
    public final C4814p0 a() {
        return this.a;
    }

    @NotNull
    public final InterfaceC4949w6.a b() {
        return this.b;
    }

    @Override // com.ironsource.C4855r6.b
    public void c(@NotNull C4855r6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.onAdInfoChanged(adInfo);
    }

    @Override // com.ironsource.InterfaceC4949w6
    public void loadAd() {
        C4855r6 a = this.c.a(true, this.d);
        a.a(this);
        this.f = a;
    }

    @Override // com.ironsource.InterfaceC4949w6
    public void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C4855r6 c4855r6 = this.f;
        if (c4855r6 != null) {
            c4855r6.a(activity, this);
        }
    }

    @Override // com.ironsource.C4855r6.b
    public void b(@NotNull C4855r6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.b(adInfo);
    }

    @Override // com.ironsource.C4855r6.b
    public void a(@NotNull C4855r6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f = null;
        this.e.a();
    }

    @Override // com.ironsource.C4855r6.b
    public void b(@NotNull C4855r6 adUnit, @Nullable IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.e.a(ironSourceError);
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
}
