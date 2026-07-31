package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.wd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4956wd implements InterfaceC4974xd {

    @NotNull
    private final LevelPlay.AdFormat a;

    @NotNull
    private final InterfaceC4938vd b;

    @NotNull
    private final A7 c;

    @NotNull
    private a d;

    @NotNull
    private List<InterfaceC4898td> e;
    private final int f;

    /* renamed from: com.ironsource.wd$a */
    private enum a {
        None,
        Idle,
        Loading
    }

    /* renamed from: com.ironsource.wd$b */
    public /* synthetic */ class b {
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

    /* renamed from: com.ironsource.wd$c */
    static final class c extends Lambda implements Function1 {
        final /* synthetic */ InterfaceC4898td a;
        final /* synthetic */ C4956wd b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC4898td interfaceC4898td, C4956wd c4956wd) {
            super(1);
            this.a = interfaceC4898td;
            this.b = c4956wd;
        }

        public final void a(boolean z) {
            if (!z) {
                IronLog.INTERNAL.verbose("adunit \"" + this.a.b() + "\" failed to load, removing");
                this.b.e.remove(this.a);
            }
            this.b.d();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    public C4956wd(@NotNull LevelPlay.AdFormat adFormat, @NotNull InterfaceC4938vd adUnitsFactory, @NotNull A7 epService) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitsFactory, "adUnitsFactory");
        Intrinsics.checkNotNullParameter(epService, "epService");
        this.a = adFormat;
        this.b = adUnitsFactory;
        this.c = epService;
        this.d = a.None;
        this.e = new ArrayList();
        this.f = b();
    }

    private final int c() {
        int i = b.a[this.a.ordinal()];
        if (i == 1) {
            return this.c.K();
        }
        if (i != 2) {
            return 0;
        }
        return this.c.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        InterfaceC4898td e = e();
        if (e == null) {
            this.d = a.Idle;
        } else {
            this.d = a.Loading;
            e.a(new c(e, this));
        }
    }

    private final InterfaceC4898td e() {
        Object obj;
        if (!a()) {
            IronLog.INTERNAL.verbose(this.a + " - reached capacity");
            return null;
        }
        Iterator<T> it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((InterfaceC4898td) obj).a()) {
                break;
            }
        }
        InterfaceC4898td interfaceC4898td = (InterfaceC4898td) obj;
        if (interfaceC4898td != null) {
            return interfaceC4898td;
        }
        IronLog.INTERNAL.verbose(this.a + " - preload done");
        return null;
    }

    private final int b() {
        int i = b.a[this.a.ordinal()];
        if (i == 1) {
            return this.c.i();
        }
        if (i != 2) {
            return 0;
        }
        return this.c.x();
    }

    @Override // com.ironsource.InterfaceC4974xd
    public void a(@NotNull Va config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (!this.c.w()) {
            IronLog.INTERNAL.warning(this.a + " - preload is disabled");
            return;
        }
        if (this.d != a.None) {
            IronLog.INTERNAL.warning(this.a + " - initializing service again");
            return;
        }
        int c2 = c();
        if (c2 >= 1) {
            IronLog.INTERNAL.verbose(String.valueOf(this.a));
            this.d = a.Idle;
            this.e = CollectionsKt.toMutableList((Collection) this.b.a(config.c(this.a), c2, config));
            d();
            return;
        }
        IronLog.INTERNAL.warning(this.a + " - invalid maxParallelLoad: " + c2);
    }

    private final InterfaceC4898td b(String str) {
        Object obj;
        Iterator<T> it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((InterfaceC4898td) obj).b(), str)) {
                break;
            }
        }
        return (InterfaceC4898td) obj;
    }

    public /* synthetic */ C4956wd(LevelPlay.AdFormat adFormat, InterfaceC4938vd interfaceC4938vd, A7 a7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(adFormat, (i & 2) != 0 ? new C4920ud(adFormat) : interfaceC4938vd, (i & 4) != 0 ? Kb.u.d().h() : a7);
    }

    private final boolean a() {
        int i;
        List<InterfaceC4898td> list = this.e;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (!((InterfaceC4898td) it.next()).a() && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i < this.f;
    }

    @Override // com.ironsource.InterfaceC4974xd
    @Nullable
    public C4712j6 a(@NotNull String adUnitId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        IronLog.INTERNAL.verbose(this.a + " - adunit: \"" + adUnitId + "\"");
        InterfaceC4898td b2 = b(adUnitId);
        if (b2 != null) {
            return b2.c();
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4974xd
    public void a(@NotNull String adUnitId, boolean z) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(this.a + " - adunit: \"" + adUnitId + "\", didUseInstance: " + z);
        InterfaceC4898td b2 = b(adUnitId);
        if (b2 == null) {
            ironLog.warning("adunit is null at \"" + adUnitId + "\"");
            return;
        }
        b2.a(z);
        if (z && this.d == a.Idle) {
            d();
        }
    }
}
