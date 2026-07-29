package o;

import com.google.firebase.messaging.Constants;

/* renamed from: o.jb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1309jb extends AbstractC1598o {
    public final InterfaceC1118gg l;
    public final IS m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1309jb(OT ot, InterfaceC1118gg interfaceC1118gg, C0827cE c0827cE, IS is) {
        super(ot, c0827cE);
        if (ot == null) {
            F(0);
            throw null;
        }
        if (interfaceC1118gg == null) {
            F(1);
            throw null;
        }
        if (c0827cE == null) {
            F(2);
            throw null;
        }
        this.l = interfaceC1118gg;
        this.m = is;
    }

    public static /* synthetic */ void F(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = Constants.ScionAnalytics.PARAM_SOURCE;
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // o.InterfaceC1249ig
    public final IS d() {
        IS is = this.m;
        if (is != null) {
            return is;
        }
        F(5);
        throw null;
    }

    @Override // o.InterfaceC1118gg
    public final InterfaceC1118gg n() {
        InterfaceC1118gg interfaceC1118gg = this.l;
        if (interfaceC1118gg != null) {
            return interfaceC1118gg;
        }
        F(4);
        throw null;
    }

    public boolean w() {
        return false;
    }
}
