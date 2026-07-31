package com.ironsource;

import com.ironsource.S1;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.ironsource.u2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C4905u2 {

    @NotNull
    private final V0 a;

    @NotNull
    private final AbstractC4961x0 b;

    @NotNull
    private final com.ironsource.mediationsdk.e c;

    @NotNull
    private final C4673h2 d;

    /* renamed from: com.ironsource.u2$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* renamed from: com.ironsource.u2$b */
    public static final class b implements S1.d {
        final /* synthetic */ InterfaceC4927v2 b;

        b(InterfaceC4927v2 interfaceC4927v2) {
            this.b = interfaceC4927v2;
        }

        @Override // com.ironsource.S1.d
        public void a(@NotNull S1 auction) {
            Intrinsics.checkNotNullParameter(auction, "auction");
            C4905u2.this.b(auction, this.b);
        }

        @Override // com.ironsource.S1.d
        public void a(@NotNull S1 auction, @NotNull String error) {
            Intrinsics.checkNotNullParameter(auction, "auction");
            Intrinsics.checkNotNullParameter(error, "error");
            C4905u2.this.b(auction, this.b);
        }
    }

    public C4905u2(@NotNull V0 adTools, @NotNull AbstractC4961x0 adUnitData) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.a = adTools;
        this.b = adUnitData;
        C4869s2 e = adUnitData.e();
        String d = IronSourceUtils.d();
        Intrinsics.checkNotNullExpressionValue(d, "getSessionId()");
        com.ironsource.mediationsdk.e eVar = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(e, d));
        this.c = eVar;
        this.d = new C4673h2(adTools, eVar);
    }

    private final InterfaceC4974xd c() {
        int i = a.a[this.b.b().e().ordinal()];
        if (i == 1) {
            return Kb.u.d().B();
        }
        if (i != 2) {
            return null;
        }
        return Kb.u.d().F();
    }

    private final C4712j6 d() {
        InterfaceC4974xd c2 = c();
        if (c2 != null) {
            return c2.a(this.b.b().c());
        }
        return null;
    }

    @NotNull
    public final C4673h2 b() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(S1 s1, InterfaceC4927v2 interfaceC4927v2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("auction waterfallString = " + ((Object) s1.d().d())));
        if (!s1.g()) {
            ironLog.verbose(a("auction failed - no candidates"));
            this.a.f().b().a(1005, "No candidates available for auctioning");
            interfaceC4927v2.a(B0.e(this.b.b().a()), "no available ad to load");
        } else {
            this.a.f().b().b(s1.d().d().toString());
            this.c.a(ContextProvider.getInstance().getApplicationContext(), a(s1, this.a.g()), new c(interfaceC4927v2, s1, s1.d().c()));
        }
    }

    public void a(@NotNull InterfaceC4927v2 completionListener) {
        Intrinsics.checkNotNullParameter(completionListener, "completionListener");
        IronLog.INTERNAL.verbose(a());
        this.a.f().b().a(this.b.b().d());
        a(new S1(this.a, this.b, d()), completionListener);
    }

    private final void a(S1 s1, InterfaceC4927v2 interfaceC4927v2) {
        if (!s1.f()) {
            b(s1, interfaceC4927v2);
        } else {
            s1.a(new b(interfaceC4927v2));
        }
    }

    /* renamed from: com.ironsource.u2$c */
    public static final class c implements U1 {
        final /* synthetic */ InterfaceC4927v2 a;
        final /* synthetic */ S1 b;
        final /* synthetic */ B c;

        c(InterfaceC4927v2 interfaceC4927v2, S1 s1, B b) {
            this.a = interfaceC4927v2;
            this.b = s1;
            this.c = b;
        }

        @Override // com.ironsource.U1
        public void a(@NotNull List<C4834q2> newWaterfall, @NotNull String auctionId, @Nullable C4834q2 c4834q2, @Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, int i, long j, int i2, @Nullable String str) {
            Intrinsics.checkNotNullParameter(newWaterfall, "newWaterfall");
            Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            this.a.a(newWaterfall, this.b.c(), auctionId, c4834q2, jSONObject, jSONObject2, i, j, i2, str, this.c);
        }

        @Override // com.ironsource.U1
        public void a(int i, @Nullable String str, int i2, @NotNull String auctionFallback, long j) {
            Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
            this.a.a(i, str, i2, auctionFallback, j, this.c);
        }
    }

    private final com.ironsource.mediationsdk.h a(S1 s1, int i) {
        com.ironsource.mediationsdk.h hVar = new com.ironsource.mediationsdk.h(this.b.b().a());
        hVar.b(IronSourceUtils.g());
        hVar.a(s1.d().a());
        hVar.a(s1.d().b());
        hVar.a(this.a.h());
        hVar.a(i);
        hVar.a(this.a.k());
        Uf g = this.b.b().g();
        hVar.e(g != null ? g.c() : false);
        hVar.a(this.b.b().d());
        B c2 = s1.d().c();
        hVar.d(c2 != null ? c2.p() : null);
        InterfaceC4726k2 i2 = this.a.i();
        if (i2 != null) {
            i2.a(hVar);
        }
        return hVar;
    }

    private final String a(String str) {
        return C4814p0.a(this.a, str, (String) null, 2, (Object) null);
    }

    private final String a() {
        return C4814p0.a(this.a, (String) null, (String) null, 2, (Object) null);
    }
}
