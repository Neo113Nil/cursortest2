package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.ironsource.x0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC4961x0 {

    @NotNull
    public static final a r = new a(null);
    public static final int s = -1;

    @NotNull
    private final C4671h0 a;
    private final boolean b;

    @Nullable
    private final String c;

    @NotNull
    private final List<NetworkSettings> d;

    @NotNull
    private final C4770ma e;

    @NotNull
    private final C4869s2 f;
    private int g;
    private final int h;
    private boolean i;
    private final int j;
    private final int k;

    @NotNull
    private final O0 l;
    private final long m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private boolean q;

    /* renamed from: com.ironsource.x0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <AdFormatConfig, AdUnitData> AdUnitData a(@NotNull C4671h0 adProperties, @Nullable Va va, @NotNull Function1 getAdFormatConfig, @NotNull Function2 createAdUnitData) {
            List<C5009zc> emptyList;
            We d;
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            Intrinsics.checkNotNullParameter(getAdFormatConfig, "getAdFormatConfig");
            Intrinsics.checkNotNullParameter(createAdUnitData, "createAdUnitData");
            Object invoke = getAdFormatConfig.invoke((va == null || (d = va.d()) == null) ? null : d.c());
            if (invoke == null) {
                throw new IllegalStateException("Error getting " + adProperties.a() + " configurations");
            }
            if (va == null || (emptyList = va.d(adProperties.e(), adProperties.c())) == null) {
                emptyList = CollectionsKt.emptyList();
            }
            String f = IronSourceUtils.f();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(emptyList, 10));
            Iterator<T> it = emptyList.iterator();
            while (it.hasNext()) {
                arrayList.add(((C5009zc) it.next()).f());
            }
            C4770ma b = C4770ma.b();
            Intrinsics.checkNotNullExpressionValue(b, "getInstance()");
            return (AdUnitData) createAdUnitData.invoke(new C4943w0(f, arrayList, b), invoke);
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC4961x0(@NotNull C4671h0 adProperties, boolean z, @Nullable String str, @NotNull List<? extends NetworkSettings> providerList, @NotNull C4770ma publisherDataHolder, @NotNull C4869s2 auctionSettings, int i, int i2, boolean z2, int i3, int i4, @NotNull O0 loadingData, long j, boolean z3, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(providerList, "providerList");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        Intrinsics.checkNotNullParameter(auctionSettings, "auctionSettings");
        Intrinsics.checkNotNullParameter(loadingData, "loadingData");
        this.a = adProperties;
        this.b = z;
        this.c = str;
        this.d = providerList;
        this.e = publisherDataHolder;
        this.f = auctionSettings;
        this.g = i;
        this.h = i2;
        this.i = z2;
        this.j = i3;
        this.k = i4;
        this.l = loadingData;
        this.m = j;
        this.n = z3;
        this.o = z4;
        this.p = z5;
        this.q = z6;
    }

    public final void a(int i) {
        this.g = i;
    }

    @NotNull
    public C4671h0 b() {
        return this.a;
    }

    @NotNull
    public abstract JSONObject b(@NotNull NetworkSettings networkSettings);

    @NotNull
    public abstract String c();

    public final boolean d() {
        return this.i;
    }

    @NotNull
    public final C4869s2 e() {
        return this.f;
    }

    public final long f() {
        return this.m;
    }

    public final int g() {
        return this.j;
    }

    public final int h() {
        return this.h;
    }

    @NotNull
    public final O0 i() {
        return this.l;
    }

    @NotNull
    public abstract String j();

    public final int k() {
        return this.g;
    }

    @NotNull
    public final String l() {
        String c;
        C4684hd f = b().f();
        return (f == null || (c = f.c()) == null) ? "" : c;
    }

    @NotNull
    public final List<NetworkSettings> m() {
        return this.d;
    }

    public final boolean n() {
        return this.n;
    }

    @NotNull
    public final C4770ma o() {
        return this.e;
    }

    public final boolean p() {
        return this.p;
    }

    public final boolean q() {
        return this.q;
    }

    @Nullable
    public final String r() {
        return this.c;
    }

    public final boolean s() {
        return this.o;
    }

    public final boolean t() {
        return this.f.g() > 0;
    }

    public boolean u() {
        return this.b;
    }

    @NotNull
    public final String v() {
        String format = String.format(Locale.getDefault(), "%s: %d, %s: %b, %s: %b", com.ironsource.mediationsdk.d.x, Integer.valueOf(this.g), com.ironsource.mediationsdk.d.y, Boolean.valueOf(this.i), com.ironsource.mediationsdk.d.z, Boolean.valueOf(this.q));
        Intrinsics.checkNotNullExpressionValue(format, "format(\n          Locale…     showPriorityEnabled)");
        return format;
    }

    public final void a(boolean z) {
        this.i = z;
    }

    public final void b(boolean z) {
        this.q = z;
    }

    public final int a() {
        return this.k;
    }

    @Nullable
    public final NetworkSettings a(@NotNull String instanceName) {
        Object obj;
        Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        Iterator<T> it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((NetworkSettings) obj).getProviderInstanceName().equals(instanceName)) {
                break;
            }
        }
        return (NetworkSettings) obj;
    }

    public /* synthetic */ AbstractC4961x0(C4671h0 c4671h0, boolean z, String str, List list, C4770ma c4770ma, C4869s2 c4869s2, int i, int i2, boolean z2, int i3, int i4, O0 o0, long j, boolean z3, boolean z4, boolean z5, boolean z6, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4671h0, z, str, list, c4770ma, c4869s2, i, i2, z2, i3, i4, o0, j, z3, z4, z5, (i5 & 65536) != 0 ? false : z6);
    }

    @NotNull
    public AdData a(@NotNull NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        AdData createAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(b(providerSettings), b().a(), this.c);
        Intrinsics.checkNotNullExpressionValue(createAdDataForNetworkAdapter, "createAdDataForNetworkAd…perties.adFormat, userId)");
        return createAdDataForNetworkAdapter;
    }
}
