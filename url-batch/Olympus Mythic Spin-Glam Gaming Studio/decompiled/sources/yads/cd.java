package yads;

import android.content.Context;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes5.dex */
public final class cd {
    public final CoroutineDispatcher a;
    public final wy0 b;
    public final b01 c;
    public final kc d;
    public final ge2 e;

    public cd(Context context) {
        CoroutineDispatcher io2 = Dispatchers.getIO();
        wy0 wy0Var = new wy0(context);
        b01 b01Var = new b01(context);
        kc a = lc.a(context);
        ge2 ge2Var = new ge2(context);
        this.a = io2;
        this.b = wy0Var;
        this.c = b01Var;
        this.d = a;
        this.e = ge2Var;
    }
}
