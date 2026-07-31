package com.vungle.ads.internal.omsdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.iab.omid.library.vungle.Omid;
import com.iab.omid.library.vungle.internal.l;
import com.vungle.ads.R;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes4.dex */
public final class c {
    public final Context a;
    public final Handler b;
    public AtomicReference c;
    public AtomicReference d;

    public c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        this.b = new Handler(Looper.getMainLooper());
        this.c = new AtomicReference(null);
        this.d = new AtomicReference(null);
    }

    public static final void a(c this$0) {
        Object m8023constructorimpl;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (!Omid.isActive()) {
                Omid.activate(this$0.a);
            }
            m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null) {
            boolean z = u.a;
            StringBuilder a = l.a("error: ");
            a.append(m8026exceptionOrNullimpl.getLocalizedMessage());
            t.b("OMInjector", a.toString());
        }
    }

    public final void b() {
        this.b.post(new Runnable() { // from class: com.vungle.ads.internal.omsdk.c$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                c.a(c.this);
            }
        });
    }

    public final void a(File dir) {
        FileWriter fileWriter;
        Intrinsics.checkNotNullParameter(dir, "dir");
        ArrayList arrayList = new ArrayList();
        File file = new File(dir, "omsdk.js");
        if (!file.exists()) {
            boolean z = u.a;
            StringBuilder a = l.a("injecting omsdk.js to ");
            a.append(file.getAbsolutePath());
            t.a("OMInjector", a.toString());
            String a2 = a();
            if (a2 != null) {
                fileWriter = new FileWriter(file);
                try {
                    fileWriter.write(a2);
                    fileWriter.flush();
                    CloseableKt.closeFinally(fileWriter, null);
                } finally {
                }
            }
            arrayList.add(file);
        }
        File file2 = new File(dir, "omsdk-session.js");
        if (file2.exists()) {
            return;
        }
        boolean z2 = u.a;
        StringBuilder a3 = l.a("injecting omsdk-session.js to ");
        a3.append(file2.getAbsolutePath());
        t.a("OMInjector", a3.toString());
        String str = (String) this.d.get();
        if (str == null) {
            str = a(R.raw.omid_session_client_v1_6_2);
            this.d.set(str);
        }
        if (str != null) {
            fileWriter = new FileWriter(file2);
            try {
                fileWriter.write(str);
                fileWriter.flush();
                CloseableKt.closeFinally(fileWriter, null);
            } finally {
            }
        }
        arrayList.add(file2);
    }

    public final String a() {
        String str = (String) this.c.get();
        if (str != null) {
            return str;
        }
        String a = a(R.raw.omsdk_v1_6_2);
        this.c.set(a);
        return a;
    }

    public final String a(int i) {
        Object m8023constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            InputStream openRawResource = this.a.getResources().openRawResource(i);
            Intrinsics.checkNotNullExpressionValue(openRawResource, "context.resources.openRawResource(resId)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource, Charsets.UTF_8), 8192);
            try {
                String readText = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                m8023constructorimpl = Result.m8023constructorimpl(readText);
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        return (String) (Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl);
    }
}
