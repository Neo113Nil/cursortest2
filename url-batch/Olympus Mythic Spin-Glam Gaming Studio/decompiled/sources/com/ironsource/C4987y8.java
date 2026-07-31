package com.ironsource;

import com.ironsource.X3;
import com.ironsource.sdk.utils.SDKUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.y8, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4987y8 {

    @NotNull
    public static final C4987y8 a = new C4987y8();

    private C4987y8() {
    }

    @Nullable
    public static final String a() {
        JSONObject optJSONObject = SDKUtils.getControllerConfigAsJSONObject().optJSONObject(X3.a.c);
        Object opt = optJSONObject != null ? optJSONObject.opt(B5.K) : null;
        if (opt == null || !(opt instanceof JSONArray)) {
            return null;
        }
        JSONArray jSONArray = (JSONArray) opt;
        IntRange until = RangesKt.until(0, jSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator it = until.iterator();
        while (it.hasNext()) {
            Object opt2 = jSONArray.opt(((IntIterator) it).nextInt());
            if (opt2 != null) {
                arrayList.add(opt2);
            }
        }
        return CollectionsKt.joinToString$default(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null);
    }
}
