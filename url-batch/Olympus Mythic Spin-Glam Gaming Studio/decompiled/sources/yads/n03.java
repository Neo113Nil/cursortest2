package yads;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes6.dex */
public abstract class n03 {
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0049, code lost:
    
        if (r3 == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0050, code lost:
    
        if (r5 <= r3) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(Context context, t8 t8Var, ju0 ju0Var, hl hlVar, l03 l03Var) {
        boolean z;
        hlVar.getClass();
        boolean z2 = ju0Var.c(context) > 0 && ju0Var.a(context) > 0;
        boolean z3 = t8Var.z;
        Context applicationContext = context.getApplicationContext();
        int c = l03Var.c(applicationContext);
        int a = l03Var.a(applicationContext);
        int c2 = ju0Var.c(applicationContext);
        int a2 = ju0Var.a(applicationContext);
        int ordinal = l03Var.b().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                z = true;
            }
            if (c2 <= c) {
                if (c > 0) {
                    if (a2 > a) {
                    }
                    z = true;
                }
            }
            z = false;
        } else {
            if (c2 <= c) {
                if (c > 0) {
                }
            }
            z = false;
        }
        return z3 || (z2 && (z && (ju0Var.c(applicationContext) <= hl3.d(applicationContext) && ju0Var.a(applicationContext) <= hl3.b(applicationContext))));
    }
}
