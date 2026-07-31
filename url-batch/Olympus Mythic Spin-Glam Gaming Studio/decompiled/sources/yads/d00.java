package yads;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d00 {
    public static e00 a(String str) {
        Object obj;
        Iterator<E> it = e00.l.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((e00) obj).b, str)) {
                break;
            }
        }
        return (e00) obj;
    }
}
