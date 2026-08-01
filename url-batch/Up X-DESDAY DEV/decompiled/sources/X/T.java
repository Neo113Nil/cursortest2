package X;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class T implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f868a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f869b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0041i f870c;

    public /* synthetic */ T(C0041i c0041i, U u2, int i) {
        this.f868a = i;
        this.f870c = c0041i;
        this.f869b = u2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f868a) {
            case 0:
                ArrayList arrayList = this.f870c.f917b;
                U u2 = this.f869b;
                if (arrayList.contains(u2)) {
                    V.a(u2.f873c.f952E, u2.f871a);
                    break;
                }
                break;
            default:
                C0041i c0041i = this.f870c;
                ArrayList arrayList2 = c0041i.f917b;
                U u3 = this.f869b;
                arrayList2.remove(u3);
                c0041i.f918c.remove(u3);
                break;
        }
    }
}
