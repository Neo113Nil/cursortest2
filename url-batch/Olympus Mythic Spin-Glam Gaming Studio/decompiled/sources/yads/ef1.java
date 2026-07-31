package yads;

import android.content.Context;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes10.dex */
public final class ef1 {
    public final Context a;
    public final og1 b;
    public final eh0 c;
    public final Mutex d;

    public ef1(Context context) {
        og1 a = sg1.a(context, "YadPreferenceFile");
        eh0 eh0Var = new eh0();
        this.a = context;
        this.b = a;
        this.c = eh0Var;
        this.d = MutexKt.Mutex$default(false, 1, null);
    }
}
