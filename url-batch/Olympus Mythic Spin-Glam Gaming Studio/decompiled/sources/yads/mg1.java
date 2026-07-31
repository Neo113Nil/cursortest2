package yads;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes5.dex */
public final class mg1 {
    public static final Object d = new Object();
    public static volatile mg1 e;
    public final qy1 a = new qy1(qy1.c);
    public final ArrayList b = new ArrayList();
    public int c;

    public final Executor a() {
        Executor executor;
        synchronized (d) {
            try {
                if (this.b.size() < 4) {
                    executor = Executors.newSingleThreadExecutor(this.a);
                    this.b.add(executor);
                } else {
                    ArrayList arrayList = this.b;
                    int i = this.c;
                    this.c = i + 1;
                    executor = (Executor) arrayList.get(i);
                    if (this.c == 4) {
                        this.c = 0;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executor;
    }
}
