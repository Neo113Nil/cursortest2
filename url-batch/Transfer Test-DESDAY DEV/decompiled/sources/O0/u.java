package O0;

import android.graphics.Matrix;
import android.graphics.Path;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public float f594a;

    /* renamed from: b, reason: collision with root package name */
    public float f595b;

    /* renamed from: c, reason: collision with root package name */
    public float f596c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f597e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f598f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f599g = new ArrayList();

    public u() {
        d(RecyclerView.f1570A0, 270.0f, RecyclerView.f1570A0);
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
        float f5 = this.f595b;
        float f6 = this.f596c;
        q qVar = new q(f5, f6, f5, f6);
        qVar.f587f = this.d;
        qVar.f588g = f4;
        this.f599g.add(new o(qVar));
        this.d = f2;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f598f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((s) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f2, float f3) {
        r rVar = new r();
        rVar.f589b = f2;
        rVar.f590c = f3;
        this.f598f.add(rVar);
        p pVar = new p(rVar, this.f595b, this.f596c);
        float b2 = pVar.b() + 270.0f;
        float b3 = pVar.b() + 270.0f;
        a(b2);
        this.f599g.add(pVar);
        this.d = b3;
        this.f595b = f2;
        this.f596c = f3;
    }

    public final void d(float f2, float f3, float f4) {
        this.f594a = f2;
        this.f595b = RecyclerView.f1570A0;
        this.f596c = f2;
        this.d = f3;
        this.f597e = (f3 + f4) % 360.0f;
        this.f598f.clear();
        this.f599g.clear();
    }
}
