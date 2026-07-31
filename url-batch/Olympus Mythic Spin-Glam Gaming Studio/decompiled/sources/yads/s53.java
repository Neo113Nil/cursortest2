package yads;

import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class s53 {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public s53(Handler handler) {
        this.a = handler;
    }

    public final r53 a(int i, Object obj) {
        r53 a = a();
        a.a = this.a.obtainMessage(i, obj);
        return a;
    }

    public static r53 a() {
        r53 r53Var;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                if (arrayList.isEmpty()) {
                    r53Var = new r53();
                } else {
                    r53Var = (r53) arrayList.remove(arrayList.size() - 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r53Var;
    }
}
