package p1;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends l1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3434e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f3435f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3436g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, o oVar, int i, List list) {
        super(str, true);
        this.f3435f = oVar;
        this.f3436g = i;
    }

    @Override // l1.a
    public final long a() {
        switch (this.f3434e) {
            case 0:
                this.f3435f.f3448k.getClass();
                try {
                    this.f3435f.f3460w.k(this.f3436g, 9);
                    synchronized (this.f3435f) {
                        this.f3435f.f3462y.remove(Integer.valueOf(this.f3436g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f3435f.f3448k.getClass();
                try {
                    this.f3435f.f3460w.k(this.f3436g, 9);
                    synchronized (this.f3435f) {
                        this.f3435f.f3462y.remove(Integer.valueOf(this.f3436g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, o oVar, int i, List list, boolean z2) {
        super(str, true);
        this.f3435f = oVar;
        this.f3436g = i;
    }
}
