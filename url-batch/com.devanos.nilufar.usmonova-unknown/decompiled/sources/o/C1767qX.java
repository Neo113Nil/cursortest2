package o;

/* renamed from: o.qX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1767qX extends AbstractC1701pX {
    public final int a;
    public final AbstractC1004ey b;

    public C1767qX(int i, AbstractC1004ey abstractC1004ey) {
        if (i == 0) {
            e(0);
            throw null;
        }
        if (abstractC1004ey == null) {
            e(1);
            throw null;
        }
        this.a = i;
        this.b = abstractC1004ey;
    }

    public static /* synthetic */ void e(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (i != 4 && i != 5) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String format = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // o.AbstractC1701pX
    public final int a() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        e(4);
        throw null;
    }

    @Override // o.AbstractC1701pX
    public final AbstractC1004ey b() {
        AbstractC1004ey abstractC1004ey = this.b;
        if (abstractC1004ey != null) {
            return abstractC1004ey;
        }
        e(5);
        throw null;
    }

    @Override // o.AbstractC1701pX
    public final boolean c() {
        return false;
    }

    @Override // o.AbstractC1701pX
    public final AbstractC1701pX d(C1398ky c1398ky) {
        if (c1398ky == null) {
            e(6);
            throw null;
        }
        AbstractC1004ey abstractC1004ey = this.b;
        AbstractC0048Bt.n(abstractC1004ey, "type");
        return new C1767qX(this.a, abstractC1004ey);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1767qX(AbstractC1004ey abstractC1004ey) {
        this(1, abstractC1004ey);
        if (abstractC1004ey != null) {
        } else {
            e(2);
            throw null;
        }
    }
}
