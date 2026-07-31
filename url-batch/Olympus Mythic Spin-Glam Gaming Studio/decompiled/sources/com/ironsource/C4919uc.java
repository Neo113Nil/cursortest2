package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.uc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4919uc implements InterfaceC4864rf<JSONObject>, InterfaceC4829pf<C4879sc> {

    @NotNull
    private final Map<String, C4707j1> a = new LinkedHashMap();

    @Override // com.ironsource.InterfaceC4624e7
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(@NotNull EnumC4847qf mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        for (Map.Entry<String, C4707j1> entry : this.a.entrySet()) {
            String key = entry.getKey();
            JSONArray a = entry.getValue().a(mode);
            if (a.length() > 0) {
                jsonObjectInit.put(key, a);
            }
        }
        return jsonObjectInit;
    }

    @Override // com.ironsource.InterfaceC4829pf
    public void a(@NotNull C4879sc record) {
        Intrinsics.checkNotNullParameter(record, "record");
        String c = record.c();
        Map<String, C4707j1> map = this.a;
        C4707j1 c4707j1 = map.get(c);
        if (c4707j1 == null) {
            c4707j1 = new C4707j1();
            map.put(c, c4707j1);
        }
        c4707j1.a(record.a(new C4897tc()));
    }
}
