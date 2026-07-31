package yads;

import java.util.NoSuchElementException;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes5.dex */
public abstract class xq1 {
    public static ch2 a(String str, Exception exc) {
        tg2 tg2Var = exc instanceof TimeoutCancellationException ? tg2.d : exc instanceof IllegalArgumentException ? tg2.e : exc instanceof NoSuchElementException ? tg2.f : tg2.g;
        boolean z = ob1.a;
        return dh2.a(str, tg2Var.b(), Integer.valueOf(tg2Var.a()));
    }

    public static ch2 a(String str) {
        tg2 tg2Var = tg2.f;
        boolean z = ob1.a;
        return dh2.a(str, tg2Var.b(), Integer.valueOf(tg2Var.a()));
    }

    public static ch2 a() {
        tg2.f.b();
        boolean z = ob1.a;
        return dh2.a();
    }
}
