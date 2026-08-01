package M0;

import android.graphics.Matrix;
import android.graphics.Path;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public float f890a;

    /* renamed from: b, reason: collision with root package name */
    public float f891b;

    /* renamed from: c, reason: collision with root package name */
    public float f892c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f893e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f894f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f895g = new ArrayList();

    public u() {
        d(RecyclerView.f1949A0, 270.0f, RecyclerView.f1949A0);
    }

    public final void a(float f2) {
        float f3 = this.d;
        if (f3 == f2) {
            return;
        }
        float f4 = ((f2 - f3) + 360.0f) % 360.0f;
        if (f4 > 180.0f) {
            return;
        }
        float f5 = this.f891b;
        float f6 = this.f892c;
        q qVar = new q(f5, f6, f5, f6);
        qVar.f883f = this.d;
        qVar.f884g = f4;
        this.f895g.add(new o(qVar));
        this.d = f2;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f894f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((s) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f2, float f3) {
        r rVar = new r();
        rVar.f885b = f2;
        rVar.f886c = f3;
        this.f894f.add(rVar);
        p pVar = new p(rVar, this.f891b, this.f892c);
        float b2 = pVar.b() + 270.0f;
        float b3 = pVar.b() + 270.0f;
        a(b2);
        this.f895g.add(pVar);
        this.d = b3;
        this.f891b = f2;
        this.f892c = f3;
    }

    public final void d(float f2, float f3, float f4) {
        this.f890a = f2;
        this.f891b = RecyclerView.f1949A0;
        this.f892c = f2;
        this.d = f3;
        this.f893e = (f3 + f4) % 360.0f;
        this.f894f.clear();
        this.f895g.clear();
    }
}
