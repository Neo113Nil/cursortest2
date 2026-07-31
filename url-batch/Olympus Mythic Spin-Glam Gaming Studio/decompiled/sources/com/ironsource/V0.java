package com.ironsource;

import com.ironsource.F0;
import com.ironsource.M8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes10.dex */
public class V0 extends C4814p0 {

    @NotNull
    private final C4814p0 g;

    @NotNull
    private final S0 h;

    @Nullable
    private InterfaceC4726k2 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(@NotNull C4814p0 adTools, @NotNull AbstractC4961x0 adUnitData, @NotNull F0.b level) {
        super(adTools, level);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(level, "level");
        this.g = adTools;
        S0 a = Jf.a(adUnitData, adUnitData.e().c());
        Intrinsics.checkNotNullExpressionValue(a, "getAdUnitPerformance(\n  …auctionSavedHistoryLimit)");
        this.h = a;
    }

    public final void a(@Nullable InterfaceC4726k2 interfaceC4726k2) {
        this.i = interfaceC4726k2;
    }

    @NotNull
    public final String e(@NotNull String serverData) {
        Intrinsics.checkNotNullParameter(serverData, "serverData");
        String c = com.ironsource.mediationsdk.d.b().c(serverData);
        Intrinsics.checkNotNullExpressionValue(c, "getInstance().getDynamic…romServerData(serverData)");
        return c;
    }

    @NotNull
    public final S0 h() {
        return this.h;
    }

    @Nullable
    public final InterfaceC4726k2 i() {
        return this.i;
    }

    @Nullable
    public final String j() {
        return com.ironsource.mediationsdk.p.h().g();
    }

    @Nullable
    public final C4573ba k() {
        return Jf.a();
    }

    @NotNull
    public final M8.a l() {
        return Kb.u.a().i();
    }

    public final void a(@NotNull AbstractRunnableC4756le task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Kf.a.b(task);
    }

    @Nullable
    public final BaseAdAdapter<?, ?> a(@NotNull C instanceData) {
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        return com.ironsource.mediationsdk.c.b().a(instanceData.v(), instanceData.i(), instanceData.j().b().b());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(@NotNull V0 adUnitTools, @NotNull F0.b level) {
        super(adUnitTools, level);
        Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        Intrinsics.checkNotNullParameter(level, "level");
        this.g = adUnitTools.g;
        this.h = adUnitTools.h;
        this.i = adUnitTools.i;
    }

    @Nullable
    public final BaseAdAdapter<?, ?> a(@NotNull NetworkSettings providerSettings, @NotNull IronSource.a adFormat, @NotNull UUID adId) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adId, "adId");
        return com.ironsource.mediationsdk.c.b().a(providerSettings, adFormat, adId);
    }

    @NotNull
    public final String a(long j, @NotNull String instanceName) {
        Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        String a = IronSourceUtils.a(j, instanceName);
        Intrinsics.checkNotNullExpressionValue(a, "getTransId(timeStamp, instanceName)");
        return a;
    }
}
