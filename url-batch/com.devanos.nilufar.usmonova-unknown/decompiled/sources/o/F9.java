package o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class F9 implements Runnable {
    public final /* synthetic */ int h;
    public final int i;
    public final Object j;

    public /* synthetic */ F9(int i, int i2, Object obj) {
        this.h = i2;
        this.j = obj;
        this.i = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.h) {
            case 0:
                M5 m5 = (M5) ((C1818rJ) this.j).i;
                if (m5 != null) {
                    m5.getClass();
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.j;
                int size = arrayList.size();
                int i = 0;
                if (this.i == 1) {
                    while (i < size) {
                        ((AbstractC0220Ij) arrayList.get(i)).a();
                        i++;
                    }
                    break;
                } else {
                    while (i < size) {
                        ((AbstractC0220Ij) arrayList.get(i)).getClass();
                        i++;
                    }
                    break;
                }
            default:
                ((C1274j20) this.j).i(this.i);
                break;
        }
    }

    public F9(List list, int i, Throwable th) {
        this.h = 1;
        AbstractC1807r8.m(list, "initCallbacks cannot be null");
        this.j = new ArrayList(list);
        this.i = i;
    }
}
