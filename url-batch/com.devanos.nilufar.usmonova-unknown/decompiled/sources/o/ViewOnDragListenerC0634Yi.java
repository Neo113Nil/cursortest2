package o;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1;
import o.TC;
import o.ViewOnDragListenerC0634Yi;

/* renamed from: o.Yi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnDragListenerC0634Yi implements View.OnDragListener, InterfaceC0608Xi {
    public final C0727aj a = new C0727aj();
    public final N6 b = new N6(0);
    public final DragAndDropModifierOnDragListener$modifier$1 c = new XC() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        @Override // o.XC
        public final TC d() {
            return ViewOnDragListenerC0634Yi.this.a;
        }

        @Override // o.XC
        public final /* bridge */ /* synthetic */ void e(TC tc) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return ViewOnDragListenerC0634Yi.this.a.hashCode();
        }
    };

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        Y1 y1 = new Y1(24, dragEvent);
        int action = dragEvent.getAction();
        EnumC2359zW enumC2359zW = EnumC2359zW.h;
        C0727aj c0727aj = this.a;
        switch (action) {
            case 1:
                C1098gM c1098gM = new C1098gM();
                C1400l c1400l = new C1400l(y1, c0727aj, c1098gM);
                if (c1400l.invoke(c0727aj) == enumC2359zW) {
                    DY.s(c0727aj, c1400l);
                }
                boolean z = c1098gM.h;
                N6 n6 = this.b;
                n6.getClass();
                F6 f6 = new F6(n6);
                while (f6.hasNext()) {
                    ((C0727aj) f6.next()).u(y1);
                }
                return z;
            case 2:
                c0727aj.t(y1);
                return false;
            case 3:
                return c0727aj.q(y1);
            case 4:
                UY uy = new UY(14, y1);
                if (uy.invoke(c0727aj) == enumC2359zW) {
                    DY.s(c0727aj, uy);
                    return false;
                }
                return false;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                c0727aj.r(y1);
                return false;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                c0727aj.s(y1);
                return false;
            default:
                return false;
        }
    }
}
