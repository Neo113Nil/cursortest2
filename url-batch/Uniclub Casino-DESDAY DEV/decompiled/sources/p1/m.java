package p1;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends l1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3439e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f3440f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3441g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, o oVar, int i, List list) {
        super(str, true);
        this.f3440f = oVar;
        this.f3441g = i;
    }

    @Override // l1.a
    public final long a() {
        switch (this.f3439e) {
            case 0:
                this.f3440f.f3453k.getClass();
                try {
                    this.f3440f.f3465w.k(this.f3441g, 9);
                    synchronized (this.f3440f) {
                        this.f3440f.f3467y.remove(Integer.valueOf(this.f3441g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f3440f.f3453k.getClass();
                try {
                    this.f3440f.f3465w.k(this.f3441g, 9);
                    synchronized (this.f3440f) {
                        this.f3440f.f3467y.remove(Integer.valueOf(this.f3441g));
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
        this.f3440f = oVar;
        this.f3441g = i;
    }
}
