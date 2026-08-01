package defpackage;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class lk {
    public final ArrayList a = new ArrayList();
    public boolean b = false;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final /* synthetic */ sk d;

    public lk(sk skVar) {
        this.d = skVar;
    }

    public final void a(boolean z) {
        qu quVar;
        this.b = z;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            kv kvVar = (kv) obj;
            boolean z2 = kvVar.e && z;
            if (kvVar.b != z2) {
                kvVar.b = z2;
                oe oeVar = kvVar.c;
                if (oeVar != null && (quVar = (qu) oeVar.g) != null) {
                    quVar.b();
                }
            }
        }
    }
}
