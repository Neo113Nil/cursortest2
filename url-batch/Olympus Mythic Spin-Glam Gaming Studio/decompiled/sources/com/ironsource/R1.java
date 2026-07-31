package com.ironsource;

import android.os.Looper;
import android.util.Log;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes11.dex */
public final class R1 {

    @NotNull
    public static final a a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a() {
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                Log.e("AssertThread", "ALERT UI THREAD: " + Thread.currentThread().getStackTrace()[4].getMethodName());
            }
        }

        private a() {
        }
    }

    public static final void a() {
        a.a();
    }
}
