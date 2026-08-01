package Y;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class T implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f1022b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0041i f1023c;

    public /* synthetic */ T(C0041i c0041i, U u2, int i) {
        this.f1021a = i;
        this.f1023c = c0041i;
        this.f1022b = u2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1021a) {
            case 0:
                ArrayList arrayList = this.f1023c.f1070b;
                U u2 = this.f1022b;
                if (arrayList.contains(u2)) {
                    V.a(u2.f1026c.f1105E, u2.f1024a);
                    break;
                }
                break;
            default:
                C0041i c0041i = this.f1023c;
                ArrayList arrayList2 = c0041i.f1070b;
                U u3 = this.f1022b;
                arrayList2.remove(u3);
                c0041i.f1071c.remove(u3);
                break;
        }
    }
}
