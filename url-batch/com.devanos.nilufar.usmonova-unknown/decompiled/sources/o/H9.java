package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class H9 extends V9 implements InterfaceC2071v8 {
    public final /* synthetic */ int e;
    public final Object f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public H9(Constructor constructor, Object obj, int i) {
        super(constructor, r6, null, (Type[]) (r0.length <= 2 ? new Type[0] : P6.f0(r0, 1, r0.length - 1)));
        this.e = i;
        switch (i) {
            case 1:
                AbstractC0048Bt.n(constructor, "constructor");
                Class declaringClass = constructor.getDeclaringClass();
                AbstractC0048Bt.m(declaringClass, "constructor.declaringClass");
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                AbstractC0048Bt.m(genericParameterTypes, "constructor.genericParameterTypes");
                super(constructor, declaringClass, null, genericParameterTypes);
                this.f = obj;
                break;
            default:
                AbstractC0048Bt.n(constructor, "constructor");
                Class declaringClass2 = constructor.getDeclaringClass();
                AbstractC0048Bt.m(declaringClass2, "constructor.declaringClass");
                Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
                AbstractC0048Bt.m(genericParameterTypes2, "constructor.genericParameterTypes");
                this.f = obj;
                break;
        }
    }

    @Override // o.G9
    public final Object call(Object[] objArr) {
        switch (this.e) {
            case 0:
                AbstractC0048Bt.n(objArr, "args");
                AbstractC0946e20.j(this, objArr);
                Constructor constructor = (Constructor) this.a;
                C1621oJ c1621oJ = new C1621oJ(3);
                c1621oJ.b(this.f);
                c1621oJ.c(objArr);
                c1621oJ.b(null);
                ArrayList arrayList = c1621oJ.a;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                AbstractC0048Bt.n(objArr, "args");
                AbstractC0946e20.j(this, objArr);
                Constructor constructor2 = (Constructor) this.a;
                C1621oJ c1621oJ2 = new C1621oJ(2);
                c1621oJ2.b(this.f);
                c1621oJ2.c(objArr);
                ArrayList arrayList2 = c1621oJ2.a;
                return constructor2.newInstance(arrayList2.toArray(new Object[arrayList2.size()]));
        }
    }
}
