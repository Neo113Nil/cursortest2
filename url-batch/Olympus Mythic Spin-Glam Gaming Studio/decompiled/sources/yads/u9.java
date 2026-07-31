package yads;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.collections.MapsKt;

/* loaded from: classes4.dex */
public final class u9 {
    public static final ExecutorService d = Executors.newCachedThreadPool(new qy1(qy1.b));
    public final v3 a;
    public final yu2 b;
    public final Context c;

    public u9(Context context, v3 v3Var, yu2 yu2Var) {
        this.a = v3Var;
        this.b = yu2Var;
        this.c = context.getApplicationContext();
    }

    public static /* synthetic */ void a(u9 u9Var, String str, a93 a93Var, io2 io2Var, int i) {
        Map emptyMap = MapsKt.emptyMap();
        if ((i & 8) != 0) {
            io2Var = new io2((Map) null, 3);
        }
        u9Var.a(str, a93Var, emptyMap, io2Var);
    }

    public final void a(final String str, a93 a93Var, final Map map, final io2 io2Var) {
        final pd2 pd2Var = new pd2(this.c, this.a, this.b, a93Var);
        if (str.length() > 0) {
            d.execute(new Runnable() { // from class: yads.u9$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    u9.a(pd2.this, str, map, io2Var);
                }
            });
        }
    }

    public static final void a(pd2 pd2Var, String str, Map map, io2 io2Var) {
        pd2Var.a(str, map, io2Var);
    }
}
