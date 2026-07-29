package o;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.qM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1756qM extends AbstractC1624oM implements InterfaceC0411Pt {
    public final Object[] b;

    public C1756qM(C0827cE c0827cE, Object[] objArr) {
        super(c0827cE);
        this.b = objArr;
    }

    public final ArrayList a() {
        Object[] objArr = this.b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            AbstractC0048Bt.k(obj);
            Class<?> cls = obj.getClass();
            List list = AbstractC1492mM.a;
            arrayList.add(Enum.class.isAssignableFrom(cls) ? new CM(null, (Enum) obj) : obj instanceof Annotation ? new C1690pM(null, (Annotation) obj) : obj instanceof Object[] ? new C1756qM(null, (Object[]) obj) : obj instanceof Class ? new C2283yM(null, (Class) obj) : new EM(null, obj));
        }
        return arrayList;
    }
}
