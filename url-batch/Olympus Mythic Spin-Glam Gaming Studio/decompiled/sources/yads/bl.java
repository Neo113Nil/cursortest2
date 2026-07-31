package yads;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes5.dex */
public final class bl {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public final void a(final int i, final long j, final long j2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            final al alVar = (al) it.next();
            if (!alVar.c) {
                alVar.a.post(new Runnable() { // from class: yads.bl$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((wb0) al.this.b).b(i, j, j2);
                    }
                });
            }
        }
    }
}
