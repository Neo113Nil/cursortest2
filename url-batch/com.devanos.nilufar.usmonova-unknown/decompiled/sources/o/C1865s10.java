package o;

import android.view.View;
import com.devanos.nilufar.usmonova.R;

/* renamed from: o.s10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1865s10 extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public final /* synthetic */ C0901dM i;
    public final /* synthetic */ View j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1865s10(C0901dM c0901dM, View view, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.i = c0901dM;
        this.j = view;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        return new C1865s10(this.i, this.j, interfaceC2235xe);
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C1865s10) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        C0782bY c0782bY = C0782bY.a;
        C0901dM c0901dM = this.i;
        View view = this.j;
        try {
            if (i == 0) {
                AbstractC1494mO.l(obj);
                this.h = 1;
                Object p = AbstractC0022At.p(c0901dM.r, new YL(2, null), this);
                EnumC0448Re enumC0448Re = EnumC0448Re.h;
                if (p != enumC0448Re) {
                    p = c0782bY;
                }
                if (p == enumC0448Re) {
                    return enumC0448Re;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1494mO.l(obj);
            }
            if (AbstractC2327z10.b(view) == c0901dM) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
            return c0782bY;
        } finally {
            if (AbstractC2327z10.b(view) == c0901dM) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
        }
    }
}
