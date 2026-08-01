package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class w8 implements Runnable {
    public final /* synthetic */ int f;
    public final int g;
    public final Object h;

    public w8(List list, int i, Throwable th) {
        this.f = 1;
        g8.p(list, "initCallbacks cannot be null");
        this.h = new ArrayList(list);
        this.g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        int i2 = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                oo ooVar = (oo) ((uv) obj).f;
                if (ooVar != null) {
                    ooVar.B(i2);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i3 = 0;
                if (i2 == 1) {
                    while (i3 < size) {
                        ((yg) arrayList.get(i3)).a();
                        i3++;
                    }
                    break;
                } else {
                    while (i3 < size) {
                        ((yg) arrayList.get(i3)).getClass();
                        i3++;
                    }
                    break;
                }
            case 2:
                ((as) obj).f0.j0(i2);
                break;
            default:
                ((bu) obj).k(i2);
                break;
        }
    }

    public /* synthetic */ w8(int i, int i2, Object obj) {
        this.f = i2;
        this.h = obj;
        this.g = i;
    }
}
