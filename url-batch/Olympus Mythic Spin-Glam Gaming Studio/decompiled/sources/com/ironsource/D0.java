package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes13.dex */
public final class D0 extends E5 {

    @NotNull
    private final C4814p0 a;

    @NotNull
    private final C4671h0 b;

    @Nullable
    private final String c;

    public /* synthetic */ D0(C4814p0 c4814p0, C4671h0 c4671h0, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4814p0, c4671h0, (i & 4) != 0 ? null : str);
    }

    @Override // com.ironsource.E0
    @NotNull
    public Map<String, Object> a(@Nullable C0 c0) {
        Map<String, Object> a = a(this.b);
        a.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        a.put("sessionDepth", Integer.valueOf(this.a.g()));
        String str = this.c;
        if (str != null) {
            a.put(IronSourceConstants.EVENTS_MEDIATION_LOAD_STRATEGY, str);
        }
        return a;
    }

    public D0(@NotNull C4814p0 adTools, @NotNull C4671h0 adProperties, @Nullable String str) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.a = adTools;
        this.b = adProperties;
        this.c = str;
    }
}
