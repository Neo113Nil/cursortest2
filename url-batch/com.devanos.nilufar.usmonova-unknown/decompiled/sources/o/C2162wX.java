package o;

/* renamed from: o.wX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2162wX extends AbstractC0791bh {
    public final String i;

    public C2162wX(String str) {
        this.i = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void N0(int i) {
        String format;
        String str = (i == 1 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 4) ? 2 : 3];
        if (i != 1) {
            if (i == 2) {
                objArr[0] = "delegate";
            } else if (i == 3) {
                objArr[0] = "kotlinTypeRefiner";
            } else if (i != 4) {
                objArr[0] = "newAttributes";
            }
            if (i != 1) {
                objArr[1] = "toString";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else {
                objArr[1] = "refine";
            }
            if (i != 1) {
                if (i == 2) {
                    objArr[2] = "replaceDelegate";
                } else if (i == 3) {
                    objArr[2] = "refine";
                } else if (i != 4) {
                    objArr[2] = "replaceAttributes";
                }
            }
            format = String.format(str, objArr);
            if (i == 1 && i != 4) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }
        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        if (i != 1) {
        }
        if (i != 1) {
        }
        format = String.format(str, objArr);
        if (i == 1) {
        }
        throw new IllegalStateException(format);
    }

    @Override // o.AbstractC0791bh, o.AbstractC1004ey
    public final AbstractC1004ey D0(C1398ky c1398ky) {
        if (c1398ky != null) {
            return this;
        }
        N0(3);
        throw null;
    }

    @Override // o.JR, o.AbstractC2097vY
    public final /* bridge */ /* synthetic */ AbstractC2097vY F0(boolean z) {
        F0(z);
        throw null;
    }

    @Override // o.AbstractC0791bh, o.AbstractC2097vY
    /* renamed from: G0 */
    public final AbstractC2097vY D0(C1398ky c1398ky) {
        if (c1398ky != null) {
            return this;
        }
        N0(3);
        throw null;
    }

    @Override // o.JR, o.AbstractC2097vY
    public final /* bridge */ /* synthetic */ AbstractC2097vY H0(OW ow) {
        H0(ow);
        throw null;
    }

    @Override // o.JR
    /* renamed from: I0 */
    public final JR F0(boolean z) {
        throw new IllegalStateException(this.i);
    }

    @Override // o.JR
    /* renamed from: J0 */
    public final JR H0(OW ow) {
        if (ow != null) {
            throw new IllegalStateException(this.i);
        }
        N0(0);
        throw null;
    }

    @Override // o.AbstractC0791bh
    public final JR K0() {
        throw new IllegalStateException(this.i);
    }

    @Override // o.AbstractC0791bh
    /* renamed from: L0 */
    public final JR D0(C1398ky c1398ky) {
        if (c1398ky != null) {
            return this;
        }
        N0(3);
        throw null;
    }

    @Override // o.AbstractC0791bh
    public final AbstractC0791bh M0(JR jr) {
        throw new IllegalStateException(this.i);
    }

    @Override // o.JR
    public final String toString() {
        String str = this.i;
        if (str != null) {
            return str;
        }
        N0(1);
        throw null;
    }
}
