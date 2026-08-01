package androidx.lifecycle;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final C.g f1378a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1379b;

    /* renamed from: c, reason: collision with root package name */
    public int f1380c = -1;
    public final /* synthetic */ w d;

    public v(w wVar, C.g gVar) {
        this.d = wVar;
        this.f1378a = gVar;
    }

    public final void a(boolean z2) {
        if (z2 == this.f1379b) {
            return;
        }
        this.f1379b = z2;
        int i = z2 ? 1 : -1;
        w wVar = this.d;
        int i2 = wVar.f1384c;
        wVar.f1384c = i + i2;
        if (!wVar.d) {
            wVar.d = true;
            while (true) {
                try {
                    int i3 = wVar.f1384c;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } finally {
                    wVar.d = false;
                }
            }
        }
        if (this.f1379b) {
            wVar.c(this);
        }
    }
}
