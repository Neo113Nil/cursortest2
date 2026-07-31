package com.ironsource;

import com.ironsource.F0;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.yd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C4992yd implements InterfaceC5010zd {

    @NotNull
    private final V0 a;

    @NotNull
    private final AbstractC4961x0 b;

    @NotNull
    private final Function1 c;

    /* renamed from: com.ironsource.yd$a */
    static final class a extends Lambda implements Function1 {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V0 invoke(@NotNull V0 tools) {
            Intrinsics.checkNotNullParameter(tools, "tools");
            return new V0(tools, F0.b.PROVIDER);
        }
    }

    public C4992yd(@NotNull V0 adUnitTools, @NotNull AbstractC4961x0 adUnitData, @NotNull Function1 createProviderTools) {
        Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(createProviderTools, "createProviderTools");
        this.a = adUnitTools;
        this.b = adUnitData;
        this.c = createProviderTools;
    }

    private final List<NetworkSettings> b(List<String> list) {
        Set set = CollectionsKt.toSet(list);
        HashMap hashMap = new HashMap(list.size());
        for (NetworkSettings networkSettings : this.b.m()) {
            if (set.contains(networkSettings.getProviderInstanceName())) {
                String providerInstanceName = networkSettings.getProviderInstanceName();
                Intrinsics.checkNotNullExpressionValue(providerInstanceName, "provider.providerInstanceName");
                hashMap.put(providerInstanceName, networkSettings);
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            NetworkSettings networkSettings2 = (NetworkSettings) hashMap.get((String) it.next());
            if (networkSettings2 != null) {
                arrayList.add(networkSettings2);
            }
        }
        return arrayList;
    }

    @Override // com.ironsource.InterfaceC5010zd
    @NotNull
    public List<C4712j6> a(@NotNull List<String> instances) {
        Intrinsics.checkNotNullParameter(instances, "instances");
        if (instances.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        List<NetworkSettings> b = b(instances);
        C4780n2 a2 = a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(b, 10));
        Iterator<T> it = b.iterator();
        while (it.hasNext()) {
            arrayList.add(a(a2, (NetworkSettings) it.next()));
        }
        return arrayList;
    }

    public /* synthetic */ C4992yd(V0 v0, AbstractC4961x0 abstractC4961x0, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(v0, abstractC4961x0, (i & 4) != 0 ? a.a : function1);
    }

    private final C4712j6 a(C4780n2 c4780n2, NetworkSettings networkSettings) {
        I i = new I(this.a, this.b, networkSettings);
        return new C4712j6((V0) this.c.invoke(this.a), new C(this.b, networkSettings, c4780n2, new C4618e1(networkSettings, this.b.b(networkSettings), this.b.b().a()), new C4834q2(networkSettings.getProviderInstanceName()), this.a.g(), true), i);
    }

    private final C4780n2 a() {
        return new C4780n2("", IronSourceNetworkBridge.jsonObjectInit(), null, 0, "");
    }
}
