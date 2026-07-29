package o;

/* loaded from: classes.dex */
public final class CL extends L {
    public final /* synthetic */ int i;
    public final /* synthetic */ BL j;

    public /* synthetic */ CL(BL bl, int i) {
        this.i = i;
        this.j = bl;
    }

    @Override // o.L
    public final void E0(String[] strArr) {
        switch (this.i) {
            case 0:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
                }
                this.j.i.k = strArr;
                return;
            default:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
                }
                this.j.i.l = strArr;
                return;
        }
    }
}
