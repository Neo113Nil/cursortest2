package yads;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ch3 {
    public final Context a;
    public final gp3 b;
    public final ah3 c;
    public final ArrayList d;

    public ch3(Context context, v3 v3Var, i5 i5Var, yu2 yu2Var, bd3 bd3Var, pg3 pg3Var) {
        Context applicationContext = context.getApplicationContext();
        gp3 gp3Var = new gp3(applicationContext, v3Var, i5Var, yu2Var, bd3Var, pg3Var);
        ah3 ah3Var = new ah3();
        this.a = applicationContext;
        this.b = gp3Var;
        this.c = ah3Var;
        this.d = new ArrayList();
    }
}
