package m1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3132a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3133b;

    public /* synthetic */ c(int i, Object obj) {
        this.f3132a = i;
        this.f3133b = obj;
    }

    @Override // m1.d
    public final Iterator iterator() {
        switch (this.f3132a) {
            case 0:
                return new b(this);
            default:
                return (Iterator) this.f3133b;
        }
    }
}
