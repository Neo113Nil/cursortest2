package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class AM extends FM implements InterfaceC1855ru {
    public final Constructor a;

    public AM(Constructor constructor) {
        AbstractC0048Bt.n(constructor, "member");
        this.a = constructor;
    }

    @Override // o.FM
    public final Member b() {
        return this.a;
    }

    @Override // o.InterfaceC1855ru
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.a.getTypeParameters();
        AbstractC0048Bt.m(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new LM(typeVariable));
        }
        return arrayList;
    }
}
