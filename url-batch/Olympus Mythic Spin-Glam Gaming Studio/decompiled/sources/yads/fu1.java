package yads;

import java.util.ArrayList;

/* loaded from: classes13.dex */
public final class fu1 {
    public final Object a = new Object();
    public final ArrayList b = new ArrayList();

    public final void a(m51 m51Var) {
        synchronized (this.a) {
            this.b.add(m51Var);
        }
    }
}
