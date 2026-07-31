package yads;

import android.content.Context;
import java.util.Map;
import kotlin.ExceptionsKt;
import kotlin.collections.MapsKt;
import org.json.JSONException;

/* loaded from: classes13.dex */
public final class q12 implements ap2 {
    public final w12 a;

    public q12(Context context, mt1 mt1Var) {
        this.a = new w12(context, mt1Var);
    }

    @Override // yads.ap2
    public final Object a(u82 u82Var) {
        w12 w12Var = this.a;
        nm3 nm3Var = w12Var.a;
        nm3Var.a.getClass();
        int i = u82Var.a;
        zp2 zp2Var = new zp2(u82Var.b);
        Map map = u82Var.c;
        if (map == null) {
            map = MapsKt.emptyMap();
        }
        String a = nm3Var.b.a(new yp2(i, zp2Var, map));
        if (a != null && a.length() != 0) {
            Map map2 = u82Var.c;
            if (map2 == null) {
                map2 = MapsKt.emptyMap();
            }
            try {
                return w12Var.b.a(a, new dm(map2));
            } catch (JSONException e) {
                ExceptionsKt.stackTraceToString(e);
                boolean z = ob1.a;
            } catch (o12 e2) {
                ExceptionsKt.stackTraceToString(e2);
                boolean z2 = ob1.a;
            }
        }
        return null;
    }
}
