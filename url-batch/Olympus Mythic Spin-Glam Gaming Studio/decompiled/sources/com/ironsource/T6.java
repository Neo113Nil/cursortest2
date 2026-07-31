package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class T6 {

    @NotNull
    private final U9 a;

    public T6(@NotNull U9 globalDataWriter) {
        Intrinsics.checkNotNullParameter(globalDataWriter, "globalDataWriter");
        this.a = globalDataWriter;
    }

    public final void a(@NotNull JSONObject metaDataJson) {
        Intrinsics.checkNotNullParameter(metaDataJson, "metaDataJson");
        if (metaDataJson.has(com.ironsource.mediationsdk.metadata.a.j)) {
            try {
                Object remove = metaDataJson.remove(com.ironsource.mediationsdk.metadata.a.j);
                Intrinsics.checkNotNull(remove, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                ArrayList arrayList = (ArrayList) remove;
                if (arrayList.isEmpty()) {
                    return;
                }
                Object obj = arrayList.get(0);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                this.a.e((String) obj);
            } catch (ClassCastException e) {
                C4782n4.d().a(e);
                IronLog.INTERNAL.error("got the following error " + e.getMessage());
            }
        }
    }
}
