package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class I9 extends V9 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I9(Member member, Type type, Class cls, Type[] typeArr, int i) {
        super(member, type, cls, typeArr);
        this.e = i;
    }

    @Override // o.G9
    public final Object call(Object[] objArr) {
        switch (this.e) {
            case 0:
                AbstractC0048Bt.n(objArr, "args");
                AbstractC0946e20.j(this, objArr);
                Constructor constructor = (Constructor) this.a;
                C1621oJ c1621oJ = new C1621oJ(2);
                c1621oJ.c(objArr);
                c1621oJ.b(null);
                ArrayList arrayList = c1621oJ.a;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                AbstractC0048Bt.n(objArr, "args");
                AbstractC0946e20.j(this, objArr);
                return ((Constructor) this.a).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }
}
