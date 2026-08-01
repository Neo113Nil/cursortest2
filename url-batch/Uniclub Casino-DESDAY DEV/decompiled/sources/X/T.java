package X;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class T implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f872a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f873b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0040i f874c;

    public /* synthetic */ T(C0040i c0040i, U u2, int i) {
        this.f872a = i;
        this.f874c = c0040i;
        this.f873b = u2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f872a) {
            case 0:
                ArrayList arrayList = this.f874c.f921b;
                U u2 = this.f873b;
                if (arrayList.contains(u2)) {
                    V.a(u2.f877c.f956E, u2.f875a);
                    break;
                }
                break;
            default:
                C0040i c0040i = this.f874c;
                ArrayList arrayList2 = c0040i.f921b;
                U u3 = this.f873b;
                arrayList2.remove(u3);
                c0040i.f922c.remove(u3);
                break;
        }
    }
}
