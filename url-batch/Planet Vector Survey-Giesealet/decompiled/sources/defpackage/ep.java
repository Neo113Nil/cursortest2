package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ep implements Runnable {
    public final ArrayList d;
    public final int e;

    public ep(List list, int i, Throwable th) {
        ld0.f(list, "initCallbacks cannot be null");
        this.d = new ArrayList(list);
        this.e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        if (this.e != 1) {
            while (i < size) {
                ((bl) arrayList.get(i)).b.e = nz.h;
                i++;
            }
            return;
        }
        while (i < size) {
            bl blVar = (bl) arrayList.get(i);
            blVar.a.setValue(Boolean.TRUE);
            blVar.b.e = new kx(true);
            i++;
        }
    }
}
