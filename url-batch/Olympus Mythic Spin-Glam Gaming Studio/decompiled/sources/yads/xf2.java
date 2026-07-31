package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes13.dex */
public final class xf2 extends Lambda implements Function0 {
    public static final xf2 b = new xf2();

    public xf2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        Object obj;
        Iterator<E> it = wf2.d.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            List list = ((wf2) obj).b;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    try {
                        Class.forName((String) it2.next());
                        break loop0;
                    } catch (ClassNotFoundException unused) {
                    } catch (Throwable unused2) {
                        boolean z = ob1.a;
                    }
                }
            }
        }
        return (wf2) obj;
    }
}
