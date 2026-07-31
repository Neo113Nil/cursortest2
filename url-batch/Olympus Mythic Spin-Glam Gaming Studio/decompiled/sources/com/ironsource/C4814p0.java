package com.ironsource;

import com.ironsource.F0;
import com.ironsource.InterfaceC4949w6;
import com.ironsource.Jf;
import com.ironsource.Ua;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.p0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C4814p0 extends C4936vb {

    @NotNull
    private final IronSource.a b;

    @NotNull
    private final Jf.b c;

    @NotNull
    private final C5002z5 d;

    @NotNull
    private final I8 e;
    private final long f;

    /* renamed from: com.ironsource.p0$a */
    public static final class a {

        @NotNull
        public static final a a = new a();

        private a() {
        }

        @NotNull
        public static final C4814p0 a(@NotNull IronSource.a adFormat, @NotNull F0.b level) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            Intrinsics.checkNotNullParameter(level, "level");
            return new C4814p0(adFormat, level);
        }
    }

    public C4814p0(@NotNull IronSource.a adFormat, @NotNull F0.b level) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(level, "level");
        this.e = Kb.u.d().f();
        this.f = TimeUnit.HOURS.toMillis(1L);
        this.b = adFormat;
        this.d = new C5002z5(adFormat, level, null, null, 12, null);
        Jf.b b = Jf.b(adFormat);
        Intrinsics.checkNotNullExpressionValue(b, "createLogFactory(adFormat)");
        this.c = b;
    }

    public static /* synthetic */ String a(C4814p0 c4814p0, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c4814p0.a(str, str2);
    }

    @NotNull
    public final String b(@Nullable String str) {
        return a(this, str, (String) null, 2, (Object) null);
    }

    @NotNull
    public final com.ironsource.lifecycle.b c() {
        com.ironsource.lifecycle.b d = com.ironsource.lifecycle.b.d();
        Intrinsics.checkNotNullExpressionValue(d, "getInstance()");
        return d;
    }

    @NotNull
    public final String d() {
        return a(this, (String) null, (String) null, 3, (Object) null);
    }

    @NotNull
    protected final IronSource.a e() {
        return this.b;
    }

    @NotNull
    public final C5002z5 f() {
        return this.d;
    }

    public final int g() {
        return Kb.u.d().s().a(this.b);
    }

    @NotNull
    public final String a(@Nullable String str, @Nullable String str2) {
        String a2 = this.c.a(str, str2);
        Intrinsics.checkNotNullExpressionValue(a2, "logFactory.createLogMessage(message, suffix)");
        return a2;
    }

    @NotNull
    public final InterfaceC4949w6.a b(@NotNull LevelPlay.AdFormat adFormat, @NotNull String adUnitId) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Va a2 = this.e.a();
        if (a2 != null) {
            return a2.b(adFormat, adUnitId);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    @NotNull
    public final C4684hd c(@NotNull String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Va a2 = this.e.a();
        if (a2 == null) {
            throw new IllegalStateException("Error getting sdk configurations");
        }
        C4684hd c = a2.c(LevelPlay.AdFormat.NATIVE_AD, placementName);
        if (c != null) {
            return c;
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    @NotNull
    public final Ua.a d(@NotNull String adUnitId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Va a2 = this.e.a();
        if (a2 != null) {
            return a2.a(adUnitId);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    @NotNull
    public final C4684hd a(@NotNull String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Va a2 = this.e.a();
        if (a2 != null) {
            C4684hd c = a2.c(LevelPlay.AdFormat.BANNER, placementName);
            if (c != null) {
                return c;
            }
            throw new IllegalStateException("Error getting placement");
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final long b(@NotNull LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Va a2 = this.e.a();
        return a2 != null ? a2.b(adFormat) : this.f;
    }

    @Nullable
    public final C4684hd a(@NotNull LevelPlay.AdFormat adFormat, @Nullable String str) {
        Va a2;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        if (str == null || (a2 = this.e.a()) == null) {
            return null;
        }
        return a2.c(adFormat, str);
    }

    public C4814p0(@NotNull C4814p0 adTools, @NotNull F0.b level) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(level, "level");
        this.e = Kb.u.d().f();
        this.f = TimeUnit.HOURS.toMillis(1L);
        IronSource.a aVar = adTools.b;
        this.b = aVar;
        this.c = adTools.c;
        this.d = new C5002z5(aVar, level, adTools.d.c(), null, 8, null);
    }

    public final void a(@NotNull Map<String, Object> data, @NotNull ISBannerSize size) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(size, "size");
        com.ironsource.mediationsdk.j.a(data, size);
    }

    @NotNull
    public final ISBannerSize a(@NotNull LevelPlayAdSize adSize) {
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        return new C4760m0().b(adSize);
    }
}
