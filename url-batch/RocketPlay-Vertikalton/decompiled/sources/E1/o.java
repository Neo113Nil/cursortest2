package E1;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class o extends A1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f331e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f332f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f333g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, q qVar, int i, List list) {
        super(str, true);
        this.f332f = qVar;
        this.f333g = i;
    }

    @Override // A1.a
    public final long a() {
        switch (this.f331e) {
            case 0:
                this.f332f.f345k.getClass();
                try {
                    this.f332f.f357w.E(this.f333g, 9);
                    synchronized (this.f332f) {
                        this.f332f.f359y.remove(Integer.valueOf(this.f333g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f332f.f345k.getClass();
                try {
                    this.f332f.f357w.E(this.f333g, 9);
                    synchronized (this.f332f) {
                        this.f332f.f359y.remove(Integer.valueOf(this.f333g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, q qVar, int i, List list, boolean z2) {
        super(str, true);
        this.f332f = qVar;
        this.f333g = i;
    }
}
