package yads;

import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class pj1 implements ci {
    public final k21 a;
    public final cn1 b;

    public pj1() {
        k21 k21Var = new k21();
        cn1 cn1Var = new cn1();
        this.a = k21Var;
        this.b = cn1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    @Override // yads.ci
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Object obj) {
        boolean z;
        boolean z2;
        dn1 dn1Var = (dn1) obj;
        List<q31> list = dn1Var.c;
        ij1 ij1Var = dn1Var.a;
        if (list != null) {
            if (!list.isEmpty()) {
                for (q31 q31Var : list) {
                    this.a.getClass();
                    String str = q31Var.c;
                    if (str != null && str.length() > 0 && !Intrinsics.areEqual(POBCommonConstants.NULL_VALUE, str)) {
                    }
                }
            }
            z = true;
            if (ij1Var != null) {
                this.b.getClass();
                if (ij1Var.b > 0.0f) {
                    z2 = true;
                    if (list == null && ij1Var != null) {
                        return z2 && z;
                    }
                    if (list != null) {
                        return z;
                    }
                    if (ij1Var != null) {
                        return z2;
                    }
                    return false;
                }
            }
            z2 = false;
            if (list == null) {
            }
            if (list != null) {
            }
        }
        z = false;
        if (ij1Var != null) {
        }
        z2 = false;
        if (list == null) {
        }
        if (list != null) {
        }
    }
}
