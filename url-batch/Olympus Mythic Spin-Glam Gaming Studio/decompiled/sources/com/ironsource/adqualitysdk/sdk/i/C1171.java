package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.Thread;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﬥ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C1171 implements Thread.UncaughtExceptionHandler {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1086 f2973;

    public C1171(C1086 c1086) {
        this.f2973 = c1086;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            AbstractC0577.m4067(StringFog.decrypt("F1wFq2rQ2zol\n", "VjJkxxOkslk=\n"), StringFog.decrypt("C+VoBVbSWcR+7nMHRsVF2THl\n", "XosLZCO1MbA=\n"), StringFog.decrypt("vxwwkTXA1piA\n", "625R8lCit/s=\n"), th, null, null, false, false, false);
        } catch (Throwable unused) {
        }
        this.f2973.m4381();
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f2973.f2758;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        try {
            Process.killProcess(Process.myPid());
            System.exit(10);
        } catch (SecurityException unused2) {
        }
    }
}
