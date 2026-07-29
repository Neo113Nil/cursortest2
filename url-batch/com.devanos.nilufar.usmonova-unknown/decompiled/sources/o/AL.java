package o;

/* loaded from: classes.dex */
public final class AL extends L {
    public final /* synthetic */ int i;
    public final /* synthetic */ InterfaceC0597Wx j;

    public /* synthetic */ AL(InterfaceC0597Wx interfaceC0597Wx, int i) {
        this.i = i;
        this.j = interfaceC0597Wx;
    }

    @Override // o.L
    public final void E0(String[] strArr) {
        switch (this.i) {
            case 0:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
                }
                ((BL) this.j).i.k = strArr;
                return;
            case 1:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
                }
                ((BL) this.j).i.l = strArr;
                return;
            default:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
                }
                ((BL) this.j).i.f30o = strArr;
                return;
        }
    }
}
