package o;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.RandomAccess;

/* renamed from: o.nS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1564nS extends AbstractList implements RandomAccess {
    public int h;
    public Object i;

    public static /* synthetic */ void j(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 2:
            case 3:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i == 2 || i == 3) {
            objArr[1] = "iterator";
        } else if (i == 5 || i == 6 || i == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i) {
            case 2:
            case 3:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int i = this.h;
        if (i == 0) {
            this.i = obj;
        } else if (i == 1) {
            this.i = new Object[]{this.i, obj};
        } else {
            Object[] objArr = (Object[]) this.i;
            int length = objArr.length;
            if (i >= length) {
                int i2 = ((length * 3) / 2) + 1;
                int i3 = i + 1;
                if (i2 < i3) {
                    i2 = i3;
                }
                Object[] objArr2 = new Object[i2];
                this.i = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.h] = obj;
        }
        this.h++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.i = null;
        this.h = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.h)) {
            return i2 == 1 ? this.i : ((Object[]) this.i)[i];
        }
        StringBuilder i3 = AbstractC2188wx.i(i, "Index: ", ", Size: ");
        i3.append(this.h);
        throw new IndexOutOfBoundsException(i3.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        int i = this.h;
        if (i == 0) {
            return C1432lS.i;
        }
        if (i == 1) {
            return new C1498mS(this);
        }
        Iterator it = super.iterator();
        if (it != null) {
            return it;
        }
        j(3);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        Object obj;
        if (i < 0 || i >= (i2 = this.h)) {
            StringBuilder i3 = AbstractC2188wx.i(i, "Index: ", ", Size: ");
            i3.append(this.h);
            throw new IndexOutOfBoundsException(i3.toString());
        }
        if (i2 == 1) {
            obj = this.i;
            this.i = null;
        } else {
            Object[] objArr = (Object[]) this.i;
            Object obj2 = objArr[i];
            if (i2 == 2) {
                this.i = objArr[1 - i];
            } else {
                int i4 = (i2 - i) - 1;
                if (i4 > 0) {
                    System.arraycopy(objArr, i + 1, objArr, i, i4);
                }
                objArr[this.h - 1] = null;
            }
            obj = obj2;
        }
        this.h--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        if (i < 0 || i >= (i2 = this.h)) {
            StringBuilder i3 = AbstractC2188wx.i(i, "Index: ", ", Size: ");
            i3.append(this.h);
            throw new IndexOutOfBoundsException(i3.toString());
        }
        if (i2 == 1) {
            Object obj2 = this.i;
            this.i = obj;
            return obj2;
        }
        Object[] objArr = (Object[]) this.i;
        Object obj3 = objArr[i];
        objArr[i] = obj;
        return obj3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.h;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        int i = this.h;
        if (i >= 2) {
            Arrays.sort((Object[]) this.i, 0, i, comparator);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        if (objArr == null) {
            j(4);
            throw null;
        }
        int length = objArr.length;
        int i = this.h;
        if (i == 1) {
            if (length == 0) {
                Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), 1);
                objArr2[0] = this.i;
                return objArr2;
            }
            objArr[0] = this.i;
        } else {
            if (length < i) {
                Object[] copyOf = Arrays.copyOf((Object[]) this.i, i, objArr.getClass());
                if (copyOf != null) {
                    return copyOf;
                }
                j(6);
                throw null;
            }
            if (i != 0) {
                System.arraycopy(this.i, 0, objArr, 0, i);
            }
        }
        int i2 = this.h;
        if (length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        if (i >= 0 && i <= (i2 = this.h)) {
            if (i2 == 0) {
                this.i = obj;
            } else if (i2 == 1 && i == 0) {
                this.i = new Object[]{obj, this.i};
            } else {
                Object[] objArr = new Object[i2 + 1];
                if (i2 == 1) {
                    objArr[0] = this.i;
                } else {
                    Object[] objArr2 = (Object[]) this.i;
                    System.arraycopy(objArr2, 0, objArr, 0, i);
                    System.arraycopy(objArr2, i, objArr, i + 1, this.h - i);
                }
                objArr[i] = obj;
                this.i = objArr;
            }
            this.h++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder i3 = AbstractC2188wx.i(i, "Index: ", ", Size: ");
        i3.append(this.h);
        throw new IndexOutOfBoundsException(i3.toString());
    }
}
