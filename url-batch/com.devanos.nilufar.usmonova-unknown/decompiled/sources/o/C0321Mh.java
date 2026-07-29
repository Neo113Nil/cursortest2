package o;

import java.util.List;

/* renamed from: o.Mh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0321Mh {
    public final C0296Lh a;
    public final InterfaceC0893dE b;
    public final InterfaceC1118gg c;
    public final C0695aD d;
    public final C1097gL e;
    public final AbstractC1478m8 f;
    public final InterfaceC0607Xh g;
    public final XW h;
    public final SB i;

    public C0321Mh(C0296Lh c0296Lh, InterfaceC0893dE interfaceC0893dE, InterfaceC1118gg interfaceC1118gg, C0695aD c0695aD, C1097gL c1097gL, AbstractC1478m8 abstractC1478m8, InterfaceC0607Xh interfaceC0607Xh, XW xw, List list) {
        String f;
        AbstractC0048Bt.n(c0296Lh, "components");
        AbstractC0048Bt.n(interfaceC0893dE, "nameResolver");
        AbstractC0048Bt.n(interfaceC1118gg, "containingDeclaration");
        AbstractC0048Bt.n(c1097gL, "versionRequirementTable");
        AbstractC0048Bt.n(abstractC1478m8, "metadataVersion");
        AbstractC0048Bt.n(list, "typeParameters");
        this.a = c0296Lh;
        this.b = interfaceC0893dE;
        this.c = interfaceC1118gg;
        this.d = c0695aD;
        this.e = c1097gL;
        this.f = abstractC1478m8;
        this.g = interfaceC0607Xh;
        this.h = new XW(this, xw, list, "Deserializer for \"" + interfaceC1118gg.getName() + '\"', (interfaceC0607Xh == null || (f = interfaceC0607Xh.f()) == null) ? "[container not found]" : f);
        this.i = new SB(this);
    }

    public final C0321Mh a(InterfaceC1118gg interfaceC1118gg, List list, InterfaceC0893dE interfaceC0893dE, C0695aD c0695aD, C1097gL c1097gL, AbstractC1478m8 abstractC1478m8) {
        AbstractC0048Bt.n(list, "typeParameterProtos");
        AbstractC0048Bt.n(interfaceC0893dE, "nameResolver");
        AbstractC0048Bt.n(c1097gL, "versionRequirementTable");
        AbstractC0048Bt.n(abstractC1478m8, "metadataVersion");
        int i = abstractC1478m8.b;
        if ((i != 1 || abstractC1478m8.c < 4) && i <= 1) {
            c1097gL = this.e;
        }
        return new C0321Mh(this.a, interfaceC0893dE, interfaceC1118gg, c0695aD, c1097gL, abstractC1478m8, this.g, this.h, list);
    }
}
