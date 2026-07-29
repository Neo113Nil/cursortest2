package o;

/* loaded from: classes.dex */
public final /* synthetic */ class U8 extends AbstractC0485Sp implements InterfaceC2114vp {
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U8(int i, int i2, Object obj) {
        super(i, obj);
        this.j = i2;
    }

    @Override // o.AbstractC2336z9, o.InterfaceC0387Ov
    public final String getName() {
        switch (this.j) {
            case 0:
                return "loadResource";
            case 1:
                return "simpleType";
            case 2:
                return "getValueClassPropertyType";
            case 3:
                return "<init>";
            case 4:
                return "prepareType";
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                return "searchMethodsByNameWithoutBuiltinMagic";
            default:
                return "searchMethodsInSupertypesWithoutBuiltinMagic";
        }
    }

    @Override // o.AbstractC2336z9
    public final InterfaceC1134gw getOwner() {
        switch (this.j) {
        }
        return UM.a.b(C0494Sy.class);
    }

    @Override // o.AbstractC2336z9
    public final String getSignature() {
        switch (this.j) {
            case 0:
                return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
            case 1:
                return "computeValueClassRepresentation$simpleType(Lorg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;)Lorg/jetbrains/kotlin/types/SimpleType;";
            case 2:
                return "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;";
            case 3:
                return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
            case 4:
                return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
            default:
                return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        switch (this.j) {
            case 0:
                String str = (String) obj;
                AbstractC0048Bt.n(str, "p0");
                ((Y8) this.receiver).getClass();
                return Y8.a(str);
            case 1:
                MK mk = (MK) obj;
                AbstractC0048Bt.n(mk, "p0");
                return ((XW) this.receiver).d(mk, true);
            case 2:
                C0827cE c0827cE = (C0827cE) obj;
                AbstractC0048Bt.n(c0827cE, "p0");
                return ((C0581Wh) this.receiver).A0(c0827cE);
            case 3:
                C1398ky c1398ky = (C1398ky) obj;
                AbstractC0048Bt.n(c1398ky, "p0");
                return new C0503Th((C0581Wh) this.receiver, c1398ky);
            case 4:
                InterfaceC1266iy interfaceC1266iy = (InterfaceC1266iy) obj;
                AbstractC0048Bt.n(interfaceC1266iy, "p0");
                return ((C1332jy) this.receiver).a(interfaceC1266iy);
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                C0827cE c0827cE2 = (C0827cE) obj;
                AbstractC0048Bt.n(c0827cE2, "p0");
                return C0494Sy.v((C0494Sy) this.receiver, c0827cE2);
            default:
                C0827cE c0827cE3 = (C0827cE) obj;
                AbstractC0048Bt.n(c0827cE3, "p0");
                return C0494Sy.w((C0494Sy) this.receiver, c0827cE3);
        }
    }
}
