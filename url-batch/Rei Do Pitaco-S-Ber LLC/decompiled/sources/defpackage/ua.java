package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class ua extends ab {
    public static final void a0(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, h hVar) {
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : collection) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            vv.c(sb, obj, hVar);
        }
        sb.append(charSequence3);
    }

    public static Object b0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(list.size() - 1);
    }

    public static List c0(Iterable iterable) {
        ArrayList arrayList;
        iterable.getClass();
        boolean z = iterable instanceof Collection;
        uh uhVar = uh.f;
        if (z) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return uhVar;
            }
            if (size != 1) {
                return new ArrayList(collection);
            }
            return oo.x(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        if (z) {
            arrayList = new ArrayList((Collection) iterable);
        } else {
            arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : oo.x(arrayList.get(0)) : uhVar;
    }
}
