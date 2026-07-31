package sg.bigo.ads.aj;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.api.core.p;
import sg.bigo.ads.api.core.q;

/* loaded from: classes12.dex */
public abstract class a<T extends Ad, U extends sg.bigo.ads.api.core.b> implements d<T>, Ad {

    @NonNull
    protected final sg.bigo.ads.api.b X;

    @NonNull
    protected sg.bigo.ads.bu.a Y;
    protected a aa;
    public int U = 0;
    public int V = 0;
    public int W = 0;
    protected int Z = sg.bigo.ads.bu.a.a;
    protected int ab = 0;
    protected final p ac = new p();

    /* renamed from: sg.bigo.ads.aj.a$a, reason: collision with other inner class name */
    public interface InterfaceC1836a {
        void a(sg.bigo.ads.api.core.c cVar);

        void b();
    }

    public a(@NonNull sg.bigo.ads.api.b bVar) {
        this.X = bVar;
    }

    public int A() {
        int i = this.ab + 1;
        this.ab = i;
        return i;
    }

    public final a Q() {
        return this.aa;
    }

    @Nullable
    public final q R() {
        U f = f();
        if (f != null) {
            return f.Z();
        }
        return null;
    }

    public final int S() {
        return this.Z;
    }

    @NonNull
    public final sg.bigo.ads.api.b T() {
        return this.X;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(Ad ad) {
        if (ad == null) {
            return 1;
        }
        return g() >= (ad instanceof a ? ((a) ad).g() : 0.0d) ? 1 : -1;
    }

    public abstract void a(int i, int i2, String str);

    public void a(String str, String str2, int i) {
    }

    public void a(boolean z, boolean z2) {
        this.U = z2 ? 1 : !z ? 2 : 3;
    }

    public abstract void b();

    public void b(int i) {
        this.V = i;
    }

    public p b_() {
        return this.ac;
    }

    public abstract void c();

    public void c(int i) {
        this.W = i;
    }

    public abstract String d();

    public abstract long e();

    @NonNull
    public abstract U f();

    public double g() {
        AdBid bid = getBid();
        return bid != null ? bid.getPrice() : (sg.bigo.ads.bc.a.a(d(), e()) * 1.0d) / 1.0E8d;
    }

    public final void g(int i) {
        this.Z = i;
    }
}
