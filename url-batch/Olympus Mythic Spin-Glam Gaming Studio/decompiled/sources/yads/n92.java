package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class n92 {
    public final jr1 a;
    public final Object b = new Object();

    public n92(so1 so1Var) {
        this.a = new jr1(so1Var);
    }

    public final Object a(Context context, l03 l03Var, ArrayList arrayList, l92 l92Var) {
        final ArrayList arrayList2 = new ArrayList(arrayList.size());
        final CountDownLatch countDownLatch = new CountDownLatch(arrayList.size());
        xo xoVar = new xo();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.a.a(context, l03Var, (er1) it.next(), xoVar, new hr1() { // from class: yads.n92$$ExternalSyntheticLambda0
                @Override // yads.hr1
                public final void a(JSONObject jSONObject) {
                    n92.a(n92.this, countDownLatch, arrayList2, jSONObject);
                }
            });
        }
        return BuildersKt.withContext(Dispatchers.getIO(), new m92(this, countDownLatch, arrayList2, xoVar, null), l92Var);
    }

    public static final void a(n92 n92Var, CountDownLatch countDownLatch, ArrayList arrayList, JSONObject jSONObject) {
        if (jSONObject != null) {
            synchronized (n92Var.b) {
                arrayList.add(jSONObject);
            }
        }
        countDownLatch.countDown();
    }
}
