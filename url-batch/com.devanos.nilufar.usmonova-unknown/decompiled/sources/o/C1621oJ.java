package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: o.oJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1621oJ {
    public final ArrayList a;

    public C1621oJ(int i) {
        this.a = new ArrayList(i);
    }

    public void a(int i) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty() || !(((Number) arrayList.get(0)).intValue() == i || ((Number) arrayList.get(arrayList.size() - 1)).intValue() == i)) {
            int size = arrayList.size();
            arrayList.add(Integer.valueOf(i));
            while (size > 0) {
                int i2 = ((size + 1) >>> 1) - 1;
                int intValue = ((Number) arrayList.get(i2)).intValue();
                if (i <= intValue) {
                    break;
                }
                arrayList.set(size, Integer.valueOf(intValue));
                size = i2;
            }
            arrayList.set(size, Integer.valueOf(i));
        }
    }

    public void b(Object obj) {
        this.a.add(obj);
    }

    public void c(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z = obj instanceof Object[];
        ArrayList arrayList = this.a;
        if (z) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            if (!(obj instanceof Iterator)) {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
    }

    public int d() {
        int intValue;
        ArrayList arrayList = this.a;
        if (arrayList.size() <= 0) {
            EB.h("Set is empty");
            throw null;
        }
        int intValue2 = ((Number) arrayList.get(0)).intValue();
        while (!arrayList.isEmpty() && ((Number) arrayList.get(0)).intValue() == intValue2) {
            arrayList.set(0, AbstractC0720ac.v0(arrayList));
            arrayList.remove(arrayList.size() - 1);
            int size = arrayList.size();
            int size2 = arrayList.size() >>> 1;
            int i = 0;
            while (i < size2) {
                int intValue3 = ((Number) arrayList.get(i)).intValue();
                int i2 = (i + 1) * 2;
                int i3 = i2 - 1;
                int intValue4 = ((Number) arrayList.get(i3)).intValue();
                if (i2 >= size || (intValue = ((Number) arrayList.get(i2)).intValue()) <= intValue4) {
                    if (intValue4 > intValue3) {
                        arrayList.set(i, Integer.valueOf(intValue4));
                        arrayList.set(i3, Integer.valueOf(intValue3));
                        i = i3;
                    }
                } else if (intValue > intValue3) {
                    arrayList.set(i, Integer.valueOf(intValue));
                    arrayList.set(i2, Integer.valueOf(intValue3));
                    i = i2;
                }
            }
        }
        return intValue2;
    }

    public C1621oJ(int i, boolean z) {
        switch (i) {
            case 2:
                this.a = new ArrayList();
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }
}
