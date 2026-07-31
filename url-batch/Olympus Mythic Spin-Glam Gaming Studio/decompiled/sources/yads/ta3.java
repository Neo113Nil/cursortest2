package yads;

import java.lang.Thread;
import java.util.Set;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.SetsKt;

/* loaded from: classes5.dex */
public final class ta3 implements Thread.UncaughtExceptionHandler {
    public final mt1 a;
    public final Thread.UncaughtExceptionHandler b;
    public final bu2 c;

    public ta3(mt1 mt1Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, bu2 bu2Var) {
        this.a = mt1Var;
        this.b = uncaughtExceptionHandler;
        this.c = bu2Var;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        try {
            Set set = this.c.r0;
            if (set == null) {
                set = SetsKt.emptySet();
            }
            Set set2 = s33.a;
            if (s33.a(th.getStackTrace(), set)) {
                this.a.b(th);
            }
            if (this.c.p0 || (uncaughtExceptionHandler = this.b) == null) {
                return;
            }
        } catch (Throwable th2) {
            try {
                Result.Companion companion = Result.INSTANCE;
                this.a.reportError("Failed to report uncaught exception", th2);
                Result.m8023constructorimpl(Unit.INSTANCE);
            } finally {
                try {
                    if (this.c.p0 || (uncaughtExceptionHandler = this.b) == null) {
                        return;
                    }
                } catch (Throwable th3) {
                }
            }
            if (this.c.p0) {
                return;
            } else {
                return;
            }
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }
}
