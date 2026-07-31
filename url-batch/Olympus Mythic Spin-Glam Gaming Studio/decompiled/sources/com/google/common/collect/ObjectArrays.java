package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class ObjectArrays {
    public static Object[] newArray(Object[] objArr, int i) {
        return Platform.newArray(objArr, i);
    }

    static Object[] toArrayImpl(Collection collection, Object[] objArr) {
        int size = collection.size();
        if (objArr.length < size) {
            objArr = newArray(objArr, size);
        }
        fillArray(collection, objArr);
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }

    static Object[] toArrayImpl(Object[] objArr, int i, int i2, Object[] objArr2) {
        Preconditions.checkPositionIndexes(i, i + i2, objArr.length);
        if (objArr2.length < i2) {
            objArr2 = newArray(objArr2, i2);
        } else if (objArr2.length > i2) {
            objArr2[i2] = null;
        }
        System.arraycopy(objArr, i, objArr2, 0, i2);
        return objArr2;
    }

    static Object[] toArrayImpl(Collection collection) {
        return fillArray(collection, new Object[collection.size()]);
    }

    private static Object[] fillArray(Iterable iterable, Object[] objArr) {
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    static Object[] checkElementsNotNull(Object... objArr) {
        checkElementsNotNull(objArr, objArr.length);
        return objArr;
    }

    static Object[] checkElementsNotNull(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            checkElementNotNull(objArr[i2], i2);
        }
        return objArr;
    }

    static Object checkElementNotNull(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i);
    }
}
