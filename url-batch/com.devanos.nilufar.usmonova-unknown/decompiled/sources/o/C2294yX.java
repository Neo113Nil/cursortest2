package o;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.yX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2294yX implements TypeVariable, Type {
    public final InterfaceC1727px h;

    public C2294yX(InterfaceC1727px interfaceC1727px) {
        AbstractC0048Bt.n(interfaceC1727px, "typeParameter");
        this.h = interfaceC1727px;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable) || !getName().equals(((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    @Override // java.lang.reflect.TypeVariable
    public final Type[] getBounds() {
        RM rm = ((C1793qx) this.h).i;
        InterfaceC0937dx interfaceC0937dx = C1793qx.k[0];
        Object invoke = rm.invoke();
        AbstractC0048Bt.m(invoke, "<get-upperBounds>(...)");
        List list = (List) invoke;
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(PX.x((InterfaceC1463lx) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public final GenericDeclaration getGenericDeclaration() {
        String s = AbstractC1888sN.s("An operation is not implemented: ", "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.h);
        AbstractC0048Bt.n(s, "message");
        throw new WE(s);
    }

    @Override // java.lang.reflect.TypeVariable
    public final String getName() {
        return ((C1793qx) this.h).b();
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return getName();
    }

    public final int hashCode() {
        getName();
        getGenericDeclaration();
        throw null;
    }

    public final String toString() {
        return getName();
    }
}
