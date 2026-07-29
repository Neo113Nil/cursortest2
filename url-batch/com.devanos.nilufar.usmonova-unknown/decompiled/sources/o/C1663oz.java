package o;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: o.oz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1663oz extends AbstractList implements RandomAccess, InterfaceC1795qz {
    public static final C1176hY i = new C1176hY(new C1663oz());
    public final ArrayList h;

    public C1663oz() {
        this.h = new ArrayList();
    }

    @Override // o.InterfaceC1795qz
    public final C1176hY a() {
        return new C1176hY(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        this.h.add(i2, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.h.size(), collection);
    }

    @Override // o.InterfaceC1795qz
    public final List b() {
        return Collections.unmodifiableList(this.h);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.h.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // o.InterfaceC1795qz
    public final AbstractC1281j9 e(int i2) {
        AbstractC1281j9 c2271yA;
        ArrayList arrayList = this.h;
        Object obj = arrayList.get(i2);
        if (obj instanceof AbstractC1281j9) {
            c2271yA = (AbstractC1281j9) obj;
        } else if (obj instanceof String) {
            try {
                c2271yA = new C2271yA(((String) obj).getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-8 not supported?", e);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            c2271yA = new C2271yA(bArr2);
        }
        if (c2271yA != obj) {
            arrayList.set(i2, c2271yA);
        }
        return c2271yA;
    }

    @Override // o.InterfaceC1795qz
    public final void g(C2271yA c2271yA) {
        this.h.add(c2271yA);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        ArrayList arrayList = this.h;
        Object obj = arrayList.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC1281j9) {
            AbstractC1281j9 abstractC1281j9 = (AbstractC1281j9) obj;
            String v = abstractC1281j9.v();
            if (abstractC1281j9.p()) {
                arrayList.set(i2, v);
            }
            return v;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = AbstractC1986tt.a;
        try {
            String str = new String(bArr, "UTF-8");
            if (ON.o(bArr, 0, bArr.length) == 0) {
                arrayList.set(i2, str);
            }
            return str;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        Object remove = this.h.remove(i2);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof AbstractC1281j9) {
            return ((AbstractC1281j9) remove).v();
        }
        byte[] bArr = (byte[]) remove;
        byte[] bArr2 = AbstractC1986tt.a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        Object obj2 = this.h.set(i2, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof AbstractC1281j9) {
            return ((AbstractC1281j9) obj2).v();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = AbstractC1986tt.a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.h.size();
    }

    public C1663oz(InterfaceC1795qz interfaceC1795qz) {
        this.h = new ArrayList(interfaceC1795qz.size());
        addAll(interfaceC1795qz);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        if (collection instanceof InterfaceC1795qz) {
            collection = ((InterfaceC1795qz) collection).b();
        }
        boolean addAll = this.h.addAll(i2, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }
}
