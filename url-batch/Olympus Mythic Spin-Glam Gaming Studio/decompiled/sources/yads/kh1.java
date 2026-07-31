package yads;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class kh1 {
    public final dm2 a = new dm2();

    public final String a(String str, Map map) {
        Map plus = MapsKt.plus(map, TuplesKt.to("{CLIENT_TIME}", String.valueOf(System.currentTimeMillis())));
        this.a.getClass();
        String str2 = str;
        for (Map.Entry entry : plus.entrySet()) {
            str2 = StringsKt.replace$default(str2, (String) entry.getKey(), (String) entry.getValue(), false, 4, (Object) null);
        }
        return str2;
    }
}
