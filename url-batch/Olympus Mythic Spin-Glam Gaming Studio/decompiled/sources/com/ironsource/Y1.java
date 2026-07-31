package com.ironsource;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes9.dex */
public final class Y1 implements Z1 {

    @NotNull
    private final C4787n9 a;

    @NotNull
    private final com.ironsource.mediationsdk.d b;

    @Nullable
    private final C4655g2 c;

    public Y1(@NotNull C4787n9 instanceInfo, @NotNull com.ironsource.mediationsdk.d auctionDataUtils, @Nullable C4655g2 c4655g2) {
        Intrinsics.checkNotNullParameter(instanceInfo, "instanceInfo");
        Intrinsics.checkNotNullParameter(auctionDataUtils, "auctionDataUtils");
        this.a = instanceInfo;
        this.b = auctionDataUtils;
        this.c = c4655g2;
    }

    @Override // com.ironsource.Z1
    public void a(@NotNull String methodName) {
        List<String> emptyList;
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        C4655g2 c4655g2 = this.c;
        if (c4655g2 == null || (emptyList = c4655g2.b()) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        a(emptyList, methodName);
    }

    @Override // com.ironsource.Z1
    public void b(@NotNull String methodName) {
        List<String> emptyList;
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        C4655g2 c4655g2 = this.c;
        if (c4655g2 == null || (emptyList = c4655g2.a()) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        a(emptyList, methodName);
    }

    @Override // com.ironsource.Z1
    public void c(@NotNull String methodName) {
        List<String> emptyList;
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        C4655g2 c4655g2 = this.c;
        if (c4655g2 == null || (emptyList = c4655g2.c()) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        a(emptyList, methodName);
    }

    private final void a(List<String> list, String str) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.b.a(str, this.a.e(), com.ironsource.mediationsdk.d.b().a(it.next(), this.a.e(), this.a.f(), this.a.d(), "", "", "", ""));
        }
    }
}
