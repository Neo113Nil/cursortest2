package o;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.c4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0817c4 implements G9 {
    public final Class a;
    public final ArrayList b;
    public final int c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;

    public C0817c4(Class cls, ArrayList arrayList, int i, int i2, List list) {
        AbstractC0048Bt.n(cls, "jClass");
        AbstractC1888sN.p(i, "callMode");
        AbstractC1888sN.p(i2, "origin");
        AbstractC0048Bt.n(list, "methods");
        this.a = cls;
        this.b = arrayList;
        this.c = i;
        this.d = list;
        ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.e = arrayList2;
        List list2 = this.d;
        ArrayList arrayList3 = new ArrayList(AbstractC0786bc.d0(list2));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            AbstractC0048Bt.m(returnType, "it");
            List list3 = AbstractC1492mM.a;
            Class<?> cls2 = (Class) AbstractC1492mM.c.get(returnType);
            if (cls2 != null) {
                returnType = cls2;
            }
            arrayList3.add(returnType);
        }
        this.f = arrayList3;
        List list4 = this.d;
        ArrayList arrayList4 = new ArrayList(AbstractC0786bc.d0(list4));
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((Method) it3.next()).getDefaultValue());
        }
        this.g = arrayList4;
        if (this.c == 2 && i2 == 1 && !AbstractC0720ac.x0(this.b, "value").isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override // o.G9
    public final List a() {
        return this.e;
    }

    @Override // o.G9
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        if (r11.isInstance(r8) != false) goto L30;
     */
    @Override // o.G9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call(Object[] objArr) {
        String a;
        AbstractC0048Bt.n(objArr, "args");
        AbstractC0946e20.j(this, objArr);
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.b;
            if (i >= length) {
                return AbstractC1807r8.t(this.a, EB.V(AbstractC0720ac.O0(arrayList2, arrayList)), this.d);
            }
            Object obj = objArr[i];
            int i3 = i2 + 1;
            ArrayList arrayList3 = this.f;
            if (obj == null && this.c == 1) {
                obj = this.g.get(i2);
            } else {
                Class cls = (Class) arrayList3.get(i2);
                if (!(obj instanceof Class)) {
                    if (obj instanceof InterfaceC0517Tv) {
                        obj = AbstractC1473m3.D((InterfaceC0517Tv) obj);
                    } else if (obj instanceof Object[]) {
                        Object[] objArr2 = (Object[]) obj;
                        if (!(objArr2 instanceof Class[])) {
                            if (objArr2 instanceof InterfaceC0517Tv[]) {
                                AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                                InterfaceC0517Tv[] interfaceC0517TvArr = (InterfaceC0517Tv[]) obj;
                                ArrayList arrayList4 = new ArrayList(interfaceC0517TvArr.length);
                                for (InterfaceC0517Tv interfaceC0517Tv : interfaceC0517TvArr) {
                                    arrayList4.add(AbstractC1473m3.D(interfaceC0517Tv));
                                }
                                obj = arrayList4.toArray(new Class[0]);
                            } else {
                                obj = objArr2;
                            }
                        }
                    }
                }
                obj = null;
            }
            if (obj == null) {
                String str = (String) arrayList2.get(i2);
                Class cls2 = (Class) arrayList3.get(i2);
                InterfaceC0517Tv b = AbstractC0048Bt.h(cls2, Class.class) ? UM.a.b(InterfaceC0517Tv.class) : (cls2.isArray() && AbstractC0048Bt.h(cls2.getComponentType(), Class.class)) ? UM.a.b(InterfaceC0517Tv[].class) : AbstractC1473m3.G(cls2);
                if (AbstractC0048Bt.h(b.a(), UM.a.b(Object[].class).a())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(b.a());
                    sb.append('<');
                    Class<?> componentType = AbstractC1473m3.D(b).getComponentType();
                    AbstractC0048Bt.m(componentType, "kotlinClass.java.componentType");
                    sb.append(AbstractC1473m3.G(componentType).a());
                    sb.append('>');
                    a = sb.toString();
                } else {
                    a = b.a();
                }
                throw new IllegalArgumentException("Argument #" + i2 + ' ' + str + " is not of the required type " + a);
            }
            arrayList.add(obj);
            i++;
            i2 = i3;
        }
    }

    @Override // o.G9
    public final Type getReturnType() {
        return this.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C0817c4(Class cls, ArrayList arrayList, int i) {
        this(cls, arrayList, i, 2, r5);
        ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), null));
        }
    }
}
