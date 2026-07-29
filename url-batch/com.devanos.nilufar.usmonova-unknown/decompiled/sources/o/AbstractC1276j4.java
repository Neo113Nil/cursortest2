package o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: o.j4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1276j4 {
    public static final C2245xo a = new C2245xo("javax.annotation.meta.TypeQualifierNickname");
    public static final C2245xo b = new C2245xo("javax.annotation.meta.TypeQualifier");
    public static final C2245xo c = new C2245xo("javax.annotation.meta.TypeQualifierDefault");
    public static final C2245xo d = new C2245xo("kotlin.annotations.jvm.UnderMigration");
    public static final Object e;
    public static final LinkedHashMap f;
    public static final Set g;

    static {
        EnumC1212i4 enumC1212i4 = EnumC1212i4.m;
        EnumC1212i4 enumC1212i42 = EnumC1212i4.l;
        EnumC1212i4 enumC1212i43 = EnumC1212i4.k;
        EnumC1212i4 enumC1212i44 = EnumC1212i4.i;
        EnumC1212i4 enumC1212i45 = EnumC1212i4.j;
        List K = AbstractC0868ct.K(enumC1212i43, enumC1212i44, enumC1212i45, enumC1212i4, enumC1212i42);
        C2245xo c2245xo = AbstractC0464Ru.c;
        EnumC2078vF enumC2078vF = EnumC2078vF.j;
        Map G = EB.G(new C1619oH(c2245xo, new C0619Xt(new C2144wF(enumC2078vF), K, false)), new C1619oH(AbstractC0464Ru.f, new C0619Xt(new C2144wF(enumC2078vF), K, false)));
        e = G;
        LinkedHashMap linkedHashMap = new LinkedHashMap(EB.G(new C1619oH(new C2245xo("javax.annotation.ParametersAreNullableByDefault"), new C0619Xt(new C2144wF(EnumC2078vF.i), AbstractC0868ct.J(enumC1212i45))), new C1619oH(new C2245xo("javax.annotation.ParametersAreNonnullByDefault"), new C0619Xt(new C2144wF(enumC2078vF), AbstractC0868ct.J(enumC1212i45)))));
        linkedHashMap.putAll(G);
        f = linkedHashMap;
        g = P6.u0(new C2245xo[]{AbstractC0464Ru.h, AbstractC0464Ru.i});
    }
}
