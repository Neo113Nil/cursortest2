package o;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: o.uk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2043uk extends XB {
    public final PA b;
    public final PA c;
    public final SA d;
    public final /* synthetic */ C2109vk e;

    public C2043uk(C2109vk c2109vk, OT ot) {
        if (ot == null) {
            h(0);
            throw null;
        }
        this.e = c2109vk;
        VA va = (VA) ot;
        this.b = va.b(new C1977tk(this, 0));
        int i = 1;
        this.c = va.b(new C1977tk(this, i));
        this.d = new SA(va, new C1335k0(i, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void h(int i) {
        String str;
        int i2;
        if (i != 3 && i != 7 && i != 9 && i != 12) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i != 3 && i != 7 && i != 9 && i != 12) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
                Object[] objArr = new Object[i2];
                switch (i) {
                    case 1:
                    case 4:
                    case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                    case 8:
                    case 10:
                        objArr[0] = "name";
                        break;
                    case 2:
                    case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                        objArr[0] = "location";
                        break;
                    case 3:
                    case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                    case 9:
                    case 12:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                        break;
                    case 11:
                        objArr[0] = "fromSupertypes";
                        break;
                    case 13:
                        objArr[0] = "kindFilter";
                        break;
                    case 14:
                        objArr[0] = "nameFilter";
                        break;
                    case 20:
                        objArr[0] = "p";
                        break;
                    default:
                        objArr[0] = "storageManager";
                        break;
                }
                if (i != 3) {
                    objArr[1] = "getContributedVariables";
                } else if (i == 7) {
                    objArr[1] = "getContributedFunctions";
                } else if (i == 9) {
                    objArr[1] = "getSupertypeScope";
                } else if (i != 12) {
                    switch (i) {
                        case 15:
                            objArr[1] = "getContributedDescriptors";
                            break;
                        case 16:
                            objArr[1] = "computeAllDeclarations";
                            break;
                        case 17:
                            objArr[1] = "getFunctionNames";
                            break;
                        case 18:
                            objArr[1] = "getClassifierNames";
                            break;
                        case 19:
                            objArr[1] = "getVariableNames";
                            break;
                        default:
                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                            break;
                    }
                } else {
                    objArr[1] = "resolveFakeOverrides";
                }
                switch (i) {
                    case 1:
                    case 2:
                        objArr[2] = "getContributedVariables";
                        break;
                    case 3:
                    case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                    case 9:
                    case 12:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    case 4:
                        objArr[2] = "computeProperties";
                        break;
                    case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                    case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                        objArr[2] = "getContributedFunctions";
                        break;
                    case 8:
                        objArr[2] = "computeFunctions";
                        break;
                    case 10:
                    case 11:
                        objArr[2] = "resolveFakeOverrides";
                        break;
                    case 13:
                    case 14:
                        objArr[2] = "getContributedDescriptors";
                        break;
                    case 20:
                        objArr[2] = "printScopeStructure";
                        break;
                    default:
                        objArr[2] = "<init>";
                        break;
                }
                String format = String.format(str, objArr);
                if (i != 3 && i != 7 && i != 9 && i != 12) {
                    switch (i) {
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i2 = 2;
            Object[] objArr2 = new Object[i2];
            switch (i) {
            }
            if (i != 3) {
            }
            switch (i) {
            }
            String format2 = String.format(str, objArr2);
            if (i != 3) {
                switch (i) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i != 3) {
            switch (i) {
            }
            Object[] objArr22 = new Object[i2];
            switch (i) {
            }
            if (i != 3) {
            }
            switch (i) {
            }
            String format22 = String.format(str, objArr22);
            if (i != 3) {
            }
            throw new IllegalStateException(format22);
        }
        i2 = 2;
        Object[] objArr222 = new Object[i2];
        switch (i) {
        }
        if (i != 3) {
        }
        switch (i) {
        }
        String format222 = String.format(str, objArr222);
        if (i != 3) {
        }
        throw new IllegalStateException(format222);
    }

    @Override // o.XB, o.WB
    public final Collection a(C0827cE c0827cE, DE de) {
        if (c0827cE != null) {
            return (Collection) this.b.invoke(c0827cE);
        }
        h(5);
        throw null;
    }

    @Override // o.XB, o.PN
    public final Collection b(C2106vh c2106vh, InterfaceC2114vp interfaceC2114vp) {
        if (c2106vh == null) {
            h(13);
            throw null;
        }
        Collection collection = (Collection) this.d.invoke();
        if (collection != null) {
            return collection;
        }
        h(15);
        throw null;
    }

    @Override // o.XB, o.WB
    public final Collection c(C0827cE c0827cE, DE de) {
        if (c0827cE != null) {
            return (Collection) this.c.invoke(c0827cE);
        }
        h(1);
        throw null;
    }

    @Override // o.XB, o.WB
    public final Set d() {
        Set set = (Set) this.e.p.invoke();
        if (set != null) {
            return set;
        }
        h(17);
        throw null;
    }

    @Override // o.XB, o.WB
    public final Set e() {
        Set set = (Set) this.e.p.invoke();
        if (set != null) {
            return set;
        }
        h(19);
        throw null;
    }

    @Override // o.XB, o.WB
    public final Set f() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        h(18);
        throw null;
    }

    public final WB i() {
        WB r0 = ((AbstractC1004ey) ((AbstractC1205i0) this.e.z()).d().iterator().next()).r0();
        if (r0 != null) {
            return r0;
        }
        h(9);
        throw null;
    }

    public final LinkedHashSet j(C0827cE c0827cE, Collection collection) {
        if (c0827cE == null) {
            h(10);
            throw null;
        }
        if (collection == null) {
            h(11);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        XG.c.h(c0827cE, collection, Collections.EMPTY_SET, this.e, new C0477Sh(linkedHashSet, 1));
        return linkedHashSet;
    }
}
