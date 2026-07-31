package yads;

import android.widget.ImageView;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class e80 {
    public final o03 a;
    public final ArrayList b;

    public e80(o03 o03Var) {
        ArrayList arrayList = new ArrayList();
        this.a = o03Var;
        this.b = arrayList;
    }

    public final dt a(String str, ImageView imageView) {
        final e31 a = this.a.a(str, new d80(imageView), 0, 0);
        dt dtVar = new dt() { // from class: yads.e80$$ExternalSyntheticLambda0
            @Override // yads.dt
            public final void cancel() {
                e80.a(e31.this);
            }
        };
        this.b.add(dtVar);
        return dtVar;
    }

    public static final void a(e31 e31Var) {
        e31Var.a();
    }
}
