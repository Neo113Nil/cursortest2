package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class Ob {

    @NotNull
    private final com.ironsource.mediationsdk.c a;

    @NotNull
    private final C4770ma b;

    @NotNull
    private final U9 c;

    @NotNull
    private final T6 d;

    @NotNull
    private final C4782n4 e;

    public Ob() {
        this(null, null, null, null, null, 31, null);
    }

    public final void a(boolean z) {
        a(CollectionsKt.listOf(com.ironsource.mediationsdk.metadata.a.a), z);
    }

    public final void b(boolean z) {
        List<String> META_DATA_COPPA_FLAGS = com.ironsource.mediationsdk.metadata.a.g;
        Intrinsics.checkNotNullExpressionValue(META_DATA_COPPA_FLAGS, "META_DATA_COPPA_FLAGS");
        a(META_DATA_COPPA_FLAGS, z);
    }

    public Ob(@NotNull com.ironsource.mediationsdk.c adapterRepository, @NotNull C4770ma publisherDataHolder, @NotNull U9 globalDataWriter, @NotNull T6 googleWaterMarkDataWriter, @NotNull C4782n4 crashReporter) {
        Intrinsics.checkNotNullParameter(adapterRepository, "adapterRepository");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        Intrinsics.checkNotNullParameter(globalDataWriter, "globalDataWriter");
        Intrinsics.checkNotNullParameter(googleWaterMarkDataWriter, "googleWaterMarkDataWriter");
        Intrinsics.checkNotNullParameter(crashReporter, "crashReporter");
        this.a = adapterRepository;
        this.b = publisherDataHolder;
        this.c = globalDataWriter;
        this.d = googleWaterMarkDataWriter;
        this.e = crashReporter;
    }

    private final void a(String str, boolean z) {
        List<String> listOf = CollectionsKt.listOf(String.valueOf(z));
        if (MetaDataUtils.isMediationOnlyKey(str)) {
            this.b.a(str, listOf);
        } else {
            this.a.c(str, listOf);
        }
    }

    private final void a() {
        try {
            HashMap hashMap = new HashMap(this.a.d());
            hashMap.putAll(this.b.c());
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            for (Map.Entry entry : hashMap.entrySet()) {
                jsonObjectInit.put((String) entry.getKey(), (List) entry.getValue());
            }
            this.d.a(jsonObjectInit);
            this.c.a(jsonObjectInit);
        } catch (JSONException e) {
            this.e.a(e);
            IronLog.INTERNAL.error("got the following error " + e.getMessage());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Ob(com.ironsource.mediationsdk.c cVar, C4770ma c4770ma, U9 u9, T6 t6, C4782n4 c4782n4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, r10, r1, r2, c4782n4);
        if ((i & 1) != 0) {
            cVar = com.ironsource.mediationsdk.c.b();
            Intrinsics.checkNotNullExpressionValue(cVar, "getInstance()");
        }
        if ((i & 2) != 0) {
            c4770ma = C4770ma.b();
            Intrinsics.checkNotNullExpressionValue(c4770ma, "getInstance()");
        }
        C4770ma c4770ma2 = c4770ma;
        U9 u92 = (i & 4) != 0 ? new U9() : u9;
        T6 t62 = (i & 8) != 0 ? new T6(u92) : t6;
        if ((i & 16) != 0) {
            c4782n4 = C4782n4.d();
            Intrinsics.checkNotNullExpressionValue(c4782n4, "getInstance()");
        }
    }

    private final void a(List<String> list, boolean z) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            a((String) it.next(), z);
        }
        a();
    }
}
