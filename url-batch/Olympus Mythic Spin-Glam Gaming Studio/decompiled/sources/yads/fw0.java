package yads;

import android.content.Context;
import android.graphics.Typeface;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes14.dex */
public final class fw0 {
    public final fv0 a;

    public fw0(Context context) {
        this.a = new fv0(context.getApplicationContext());
    }

    public final Typeface a(qv0 qv0Var) {
        ConcurrentHashMap concurrentHashMap = cw0.a;
        Typeface typeface = (Typeface) concurrentHashMap.get(qv0Var);
        if (typeface != null) {
            return typeface;
        }
        Typeface a = this.a.a(qv0Var);
        if (a == null) {
            return null;
        }
        concurrentHashMap.put(qv0Var, a);
        return a;
    }
}
