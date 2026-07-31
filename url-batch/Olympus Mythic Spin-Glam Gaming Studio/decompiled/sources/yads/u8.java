package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class u8 {
    public static c a(Map map) {
        Set set;
        Long l;
        String b = xz0.b(map, a11.n);
        String str = "";
        if (b == null) {
            b = "";
        }
        String b2 = xz0.b(map, a11.L);
        if (b2 == null) {
            set = SetsKt.emptySet();
        } else {
            try {
                str = new JSONObject(b2).optString("test_ids", "");
            } catch (Throwable unused) {
                boolean z = ob1.a;
            }
            List split$default = StringsKt.split$default((CharSequence) str, new String[]{";"}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList();
            Iterator it = split$default.iterator();
            while (it.hasNext()) {
                try {
                    l = Long.valueOf(Long.parseLong((String) it.next()));
                } catch (Throwable unused2) {
                    l = null;
                }
                if (l != null) {
                    arrayList.add(l);
                }
            }
            set = CollectionsKt.toSet(arrayList);
        }
        return new c(b, set);
    }
}
