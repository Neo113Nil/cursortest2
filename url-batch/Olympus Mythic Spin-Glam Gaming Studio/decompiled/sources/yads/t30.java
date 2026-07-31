package yads;

import java.io.IOException;

/* loaded from: classes10.dex */
public abstract class t30 {
    public static void a(q30 q30Var) {
        if (q30Var != null) {
            try {
                q30Var.close();
            } catch (IOException unused) {
            }
        }
    }
}
