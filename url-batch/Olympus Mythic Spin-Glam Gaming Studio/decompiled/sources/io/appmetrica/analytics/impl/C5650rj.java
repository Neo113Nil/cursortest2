package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.rj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5650rj implements InterfaceC5474l {
    public C5594pf a;
    public ScreenInfo b;
    public boolean c;
    public boolean d;
    public final C5625qj e = new C5625qj();
    public WeakReference f = new WeakReference(null);

    @WorkerThread
    public final synchronized void a(@NotNull Activity activity) {
        try {
            this.f = new WeakReference(activity);
            if (!this.d) {
                if (this.a == null) {
                    this.a = C5661s4.l().b(activity);
                }
                C5594pf c5594pf = this.a;
                Intrinsics.checkNotNull(c5594pf);
                this.b = c5594pf.p();
                if (this.a == null) {
                    this.a = C5661s4.l().b(activity);
                }
                C5594pf c5594pf2 = this.a;
                Intrinsics.checkNotNull(c5594pf2);
                this.c = c5594pf2.t();
                this.d = true;
            }
            if (this.b == null) {
                b(activity);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(Context context) {
        if (context != null) {
            this.e.getClass();
            ScreenInfo a = C5625qj.a(context);
            if (a == null || Intrinsics.areEqual(a, this.b)) {
                return;
            }
            this.b = a;
            if (this.a == null) {
                this.a = C5661s4.l().b(context);
            }
            C5594pf c5594pf = this.a;
            Intrinsics.checkNotNull(c5594pf);
            c5594pf.a(this.b);
        }
    }

    @WorkerThread
    @Nullable
    public final synchronized ScreenInfo a(@NotNull Context context) {
        try {
            if (!this.d) {
                if (this.a == null) {
                    this.a = C5661s4.l().b(context);
                }
                C5594pf c5594pf = this.a;
                Intrinsics.checkNotNull(c5594pf);
                this.b = c5594pf.p();
                if (this.a == null) {
                    this.a = C5661s4.l().b(context);
                }
                C5594pf c5594pf2 = this.a;
                Intrinsics.checkNotNull(c5594pf2);
                this.c = c5594pf2.t();
                this.d = true;
            }
            b((Context) this.f.get());
            if (this.b == null) {
                if (AndroidUtils.isApiAchieved(30)) {
                    if (!this.c) {
                        b(context);
                        this.c = true;
                        if (this.a == null) {
                            this.a = C5661s4.l().b(context);
                        }
                        C5594pf c5594pf3 = this.a;
                        Intrinsics.checkNotNull(c5594pf3);
                        c5594pf3.v();
                    }
                } else {
                    b(context);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    @VisibleForTesting
    public final void a(@NotNull C5594pf c5594pf) {
        this.a = c5594pf;
    }
}
