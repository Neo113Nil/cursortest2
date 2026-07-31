package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class I0 implements InterfaceC4864rf<JSONObject>, InterfaceC4829pf<G0> {

    @NotNull
    private final Map<String, C4919uc> a = new LinkedHashMap();

    @Override // com.ironsource.InterfaceC4624e7
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(@NotNull EnumC4847qf mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        for (Map.Entry<String, C4919uc> entry : this.a.entrySet()) {
            String key = entry.getKey();
            JSONObject a = entry.getValue().a(mode);
            if (a.length() > 0) {
                jsonObjectInit.put(StringsKt.substringAfterLast$default(key, "_", (String) null, 2, (Object) null), a);
            }
        }
        return jsonObjectInit;
    }

    @Override // com.ironsource.InterfaceC4829pf
    public void a(@NotNull G0 record) {
        Intrinsics.checkNotNullParameter(record, "record");
        String d = record.d();
        Map<String, C4919uc> map = this.a;
        C4919uc c4919uc = map.get(d);
        if (c4919uc == null) {
            c4919uc = new C4919uc();
            map.put(d, c4919uc);
        }
        c4919uc.a(record.a(new H0()));
    }
}
