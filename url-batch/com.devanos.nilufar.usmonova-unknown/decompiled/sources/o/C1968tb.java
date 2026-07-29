package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: o.tb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1968tb extends AbstractC1664p {
    public final YC c;
    public final List d;
    public final Collection e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1968tb(YC yc, List list, Collection collection, OT ot) {
        super(ot);
        if (list == null) {
            k(1);
            throw null;
        }
        if (collection == null) {
            k(2);
            throw null;
        }
        if (ot == null) {
            k(3);
            throw null;
        }
        this.c = yc;
        this.d = Collections.unmodifiableList(new ArrayList(list));
        this.e = Collections.unmodifiableCollection(collection);
    }

    public static /* synthetic */ void k(int i) {
        String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // o.SW
    public final boolean a() {
        return true;
    }

    @Override // o.AbstractC1205i0
    public final Collection e() {
        Collection collection = this.e;
        if (collection != null) {
            return collection;
        }
        k(6);
        throw null;
    }

    @Override // o.AbstractC1205i0
    public final C1097gL g() {
        return C1097gL.m;
    }

    @Override // o.SW
    public final List getParameters() {
        List list = this.d;
        if (list != null) {
            return list;
        }
        k(4);
        throw null;
    }

    @Override // o.AbstractC1664p
    /* renamed from: m */
    public final InterfaceC1245ib c() {
        YC yc = this.c;
        if (yc != null) {
            return yc;
        }
        k(5);
        throw null;
    }

    public final String toString() {
        String str = AbstractC0114Eh.g(this.c).a;
        if (str != null) {
            return str;
        }
        C2377zo.a(4);
        throw null;
    }
}
