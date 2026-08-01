package Y;

import E1.AbstractC0001b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class T implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1402a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f1403b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0047i f1404c;

    public /* synthetic */ T(C0047i c0047i, U u2, int i) {
        this.f1402a = i;
        this.f1404c = c0047i;
        this.f1403b = u2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1402a) {
            case 0:
                ArrayList arrayList = this.f1404c.f1451b;
                U u2 = this.f1403b;
                if (arrayList.contains(u2)) {
                    AbstractC0001b.a(u2.f1407c.f1486E, u2.f1405a);
                    break;
                }
                break;
            default:
                C0047i c0047i = this.f1404c;
                ArrayList arrayList2 = c0047i.f1451b;
                U u3 = this.f1403b;
                arrayList2.remove(u3);
                c0047i.f1452c.remove(u3);
                break;
        }
    }
}
