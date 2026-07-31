package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/* loaded from: classes6.dex */
public final class E6 {
    public final C5771wa a;
    public final C5741v6 b;
    public final Context c;
    public final C5745va d;

    public E6(Context context) {
        this(context, new C5771wa(), new C5741v6(), C5745va.a(context));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:3|(5:(10:5|(2:7|(1:9)(1:13))|14|15|16|18|19|20|98|25)(1:34)|18|19|20|98)|(1:11)|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Ih ih) {
        boolean mkdir;
        String str;
        R9 b;
        PrintWriter printWriter;
        C5745va c5745va;
        File crashesDirectory = FileUtils.getCrashesDirectory(this.c);
        this.b.getClass();
        if (crashesDirectory == null) {
            return;
        }
        try {
            if (crashesDirectory.exists()) {
                if (!crashesDirectory.isDirectory()) {
                    if (!crashesDirectory.delete()) {
                        return;
                    } else {
                        mkdir = crashesDirectory.mkdir();
                    }
                }
                Wf wf = ih.e.a;
                str = wf.a.getAsInteger("PROCESS_CFG_PROCESS_ID") + "-" + wf.a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
                b = this.d.b(str);
                b.a.lock();
                b.b.a();
                this.a.getClass();
                printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
                printWriter.write(new Fb(ih.a, ih.e, ih.d).l());
                Do.a((Closeable) printWriter);
                b.c();
                c5745va = this.d;
                synchronized (c5745va) {
                    c5745va.b.remove(str);
                }
                return;
            }
            mkdir = crashesDirectory.mkdir();
            printWriter.write(new Fb(ih.a, ih.e, ih.d).l());
            Do.a((Closeable) printWriter);
            b.c();
            c5745va = this.d;
            synchronized (c5745va) {
            }
        } catch (Throwable unused) {
            Do.a((Closeable) printWriter);
            b.c();
            this.d.a(str);
            return;
        }
        if (!mkdir) {
            return;
        }
        Wf wf2 = ih.e.a;
        str = wf2.a.getAsInteger("PROCESS_CFG_PROCESS_ID") + "-" + wf2.a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
        b = this.d.b(str);
        b.a.lock();
        b.b.a();
        this.a.getClass();
        printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
    }

    public E6(Context context, C5771wa c5771wa, C5741v6 c5741v6, C5745va c5745va) {
        this.c = context;
        this.a = c5771wa;
        this.b = c5741v6;
        this.d = c5745va;
    }
}
