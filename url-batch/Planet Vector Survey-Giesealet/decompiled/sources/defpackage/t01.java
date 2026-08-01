package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class t01 {
    public static final LinkedHashMap a;

    static {
        j3 j3Var = dz0.b;
        Float valueOf = Float.valueOf(1.0f);
        pd0 pd0Var = new pd0(j3Var, valueOf);
        pd0 pd0Var2 = new pd0(dz0.h, valueOf);
        pd0 pd0Var3 = new pd0(dz0.g, valueOf);
        pd0 pd0Var4 = new pd0(dz0.a, Float.valueOf(0.01f));
        j3 j3Var2 = dz0.i;
        Float valueOf2 = Float.valueOf(0.5f);
        pd0 pd0Var5 = new pd0(j3Var2, valueOf2);
        pd0 pd0Var6 = new pd0(dz0.e, valueOf2);
        pd0 pd0Var7 = new pd0(dz0.f, valueOf2);
        j3 j3Var3 = dz0.c;
        Float valueOf3 = Float.valueOf(0.1f);
        pd0[] pd0VarArr = {pd0Var, pd0Var2, pd0Var3, pd0Var4, pd0Var5, pd0Var6, pd0Var7, new pd0(j3Var3, valueOf3), new pd0(dz0.d, valueOf3)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(x40.J(9));
        for (int i = 0; i < 9; i++) {
            pd0 pd0Var8 = pd0VarArr[i];
            linkedHashMap.put(pd0Var8.d, pd0Var8.e);
        }
        a = linkedHashMap;
    }
}
