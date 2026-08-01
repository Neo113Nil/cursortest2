package defpackage;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1;
import defpackage.n4;
import defpackage.t50;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class n4 implements View.OnDragListener, mn {
    public final nn a;
    public final o8 b;
    public final AndroidDragAndDropManager$modifier$1 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1] */
    public n4() {
        nn nnVar = new nn();
        nnVar.t = 0L;
        this.a = nnVar;
        this.b = new o8();
        this.c = new z50() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
            public final boolean equals(Object obj) {
                return obj == this;
            }

            @Override // defpackage.z50
            public final t50 f() {
                return n4.this.a;
            }

            @Override // defpackage.z50
            public final /* bridge */ /* synthetic */ void g(t50 t50Var) {
            }

            public final int hashCode() {
                return n4.this.a.hashCode();
            }
        };
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        p01 p01Var = new p01(7, dragEvent);
        int action = dragEvent.getAction();
        hx0 hx0Var = hx0.d;
        o8 o8Var = this.b;
        nn nnVar = this.a;
        switch (action) {
            case 1:
                cj0 cj0Var = new cj0();
                f2 f2Var = new f2(p01Var, nnVar, cj0Var);
                if (f2Var.c(nnVar) == hx0Var) {
                    yc0.t(nnVar, f2Var);
                }
                boolean z = cj0Var.d;
                o8Var.getClass();
                j8 j8Var = new j8(o8Var);
                while (j8Var.hasNext()) {
                    ((nn) j8Var.next()).n0();
                }
                break;
            case 2:
                nnVar.m0(p01Var);
                break;
            case 4:
                f2 f2Var2 = new f2(11, p01Var);
                if (f2Var2.c(nnVar) == hx0Var) {
                    yc0.t(nnVar, f2Var2);
                }
                o8Var.clear();
                break;
            case 5:
                nnVar.k0();
                break;
            case 6:
                nnVar.l0();
                break;
        }
        return false;
    }
}
