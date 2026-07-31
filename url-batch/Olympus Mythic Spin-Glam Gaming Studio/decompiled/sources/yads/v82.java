package yads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class v82 {
    public final jm2 a;
    public final lm2 b;

    public v82() {
        jm2 jm2Var = new jm2();
        lm2 a = lm2.b.a();
        this.a = jm2Var;
        this.b = a;
    }

    public final u82 a(ro2 ro2Var) {
        String str;
        lm2 lm2Var = this.b;
        lm2Var.getClass();
        synchronized (lm2.c) {
            str = (String) lm2Var.a.get(ro2Var);
            lm2Var.a.remove(ro2Var);
        }
        if (str != null) {
            try {
                this.a.getClass();
                hm2 a = jm2.a(str);
                byte[] bytes = a.b.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                return new u82(200, bytes, (Map) a.a, false);
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
