package o;

import com.google.firebase.database.FirebaseDatabase;

/* loaded from: classes.dex */
public final class VO extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        return new VO(2, interfaceC2235xe);
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((VO) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1494mO.l(obj);
            return obj;
        }
        AbstractC1494mO.l(obj);
        MU mu = FirebaseDatabase.getInstance(AbstractC1473m3.f0(AbstractC1473m3.f(66, 43, 109, 3, 63, 171, 17, 73, 88, 62, 119, 28, 45, 228, 90, 15, 69, 114, 116, 26, 52, 188, 90, 3, 76, 62, 108, 31, 56, 188, 76, 18, 78, 61, 55, 22, 57, 227, 81, 22, 79, 114, 110, 22, 63, 229, 15, 72, 76, 54, 107, 22, 46, 240, 77, 3, 78, 62, 109, 18, 46, 240, 77, 3, 4, 62, 105, 3, 99))).getReference().child("Rt0").get();
        AbstractC0048Bt.m(mu, "get(...)");
        this.h = 1;
        Object d = ON.d(mu, this);
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        return d == enumC0448Re ? enumC0448Re : d;
    }
}
