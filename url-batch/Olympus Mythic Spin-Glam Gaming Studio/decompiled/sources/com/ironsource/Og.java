package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes11.dex */
public abstract class Og {

    @NotNull
    public static final a d = new a(null);

    @NotNull
    private final V0 a;

    @NotNull
    private final AbstractC4961x0 b;

    @NotNull
    private final Wc c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Og a(@NotNull V0 adTools, @NotNull AbstractC4961x0 adUnitData) {
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
            return adUnitData.t() ? new C4887t2(adTools, adUnitData) : new Fc(adTools, adUnitData);
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final class c implements Wc {
        c() {
        }
    }

    public Og(@NotNull V0 adTools, @NotNull AbstractC4961x0 adUnitData) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.a = adTools;
        this.b = adUnitData;
        this.c = new c();
    }

    private final InterfaceC4974xd b() {
        int i = b.a[this.b.b().a().ordinal()];
        if (i == 1) {
            return Kb.u.d().B();
        }
        if (i == 2) {
            return Kb.u.d().F();
        }
        IronLog.INTERNAL.warning(C4814p0.a(this.a, "Unable to reset preloaded instance", (String) null, 2, (Object) null));
        return null;
    }

    @NotNull
    public Wc a() {
        return this.c;
    }

    public abstract void a(@NotNull E e, @NotNull Pg pg);

    protected final void c() {
        InterfaceC4974xd b2 = b();
        if (b2 == null) {
            return;
        }
        b2.a(this.b.b().c(), false);
    }

    public static /* synthetic */ Qg a(Og og, List list, Map map, C4780n2 c4780n2, E e, B b2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createAdInstanceWaterfall");
        }
        if ((i & 16) != 0) {
            b2 = null;
        }
        return og.a(list, map, c4780n2, e, b2);
    }

    @NotNull
    public final Qg a(@NotNull List<? extends C4834q2> waterfallItems, @NotNull Map<String, I> adInstancePayloads, @NotNull C4780n2 auctionData, @NotNull E adInstanceFactory, @Nullable B b2) {
        Intrinsics.checkNotNullParameter(waterfallItems, "waterfallItems");
        Intrinsics.checkNotNullParameter(adInstancePayloads, "adInstancePayloads");
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        IronLog.INTERNAL.verbose(C4814p0.a(this.a, "waterfall.size() = " + waterfallItems.size(), (String) null, 2, (Object) null));
        ArrayList arrayList = new ArrayList();
        int size = waterfallItems.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C4834q2 c4834q2 = waterfallItems.get(i);
            if (!z && b2 != null && Intrinsics.areEqual(b2.p(), c4834q2.c())) {
                b2.a(c4834q2);
                arrayList.add(b2);
                z = true;
            } else {
                B a2 = a(c4834q2, auctionData, adInstanceFactory, adInstancePayloads.get(c4834q2.c()));
                if (a2 != null && a2.g() != null) {
                    arrayList.add(a2);
                }
            }
        }
        if (b2 != null && !z) {
            c();
        }
        Qg qg = new Qg(arrayList);
        IronLog.INTERNAL.verbose(C4814p0.a(this.a, "updateWaterfall() - next waterfall is " + qg.d(), (String) null, 2, (Object) null));
        return qg;
    }

    private final B a(C4834q2 c4834q2, C4780n2 c4780n2, E e, I i) {
        AbstractC4961x0 abstractC4961x0 = this.b;
        String c2 = c4834q2.c();
        Intrinsics.checkNotNullExpressionValue(c2, "item.instanceName");
        NetworkSettings a2 = abstractC4961x0.a(c2);
        if (a2 == null) {
            String c3 = c4834q2.c();
            Intrinsics.checkNotNullExpressionValue(c3, "item.instanceName");
            a("Could not find matching provider settings for auction response item", c3);
            return null;
        }
        if (i == null) {
            String c4 = c4834q2.c();
            Intrinsics.checkNotNullExpressionValue(c4, "item.instanceName");
            a("Could not find matching adInstancePayload for auction response item", c4);
            return null;
        }
        com.ironsource.mediationsdk.c.b().b(a2, this.b.b().a(), this.b.b().b());
        int g = this.a.g();
        AbstractC4961x0 abstractC4961x02 = this.b;
        return e.a(new C(abstractC4961x02, a2, c4780n2, new C4618e1(a2, abstractC4961x02.b(a2), this.b.b().a()), c4834q2, g, false, 64, null), i);
    }

    private final void a(String str, String str2) {
        String str3 = str + " - item = " + str2;
        IronLog.INTERNAL.error(C4814p0.a(this.a, str3, (String) null, 2, (Object) null));
        this.a.f().h().i(str3);
    }
}
