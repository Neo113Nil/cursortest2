package com.ironsource;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

/* renamed from: com.ironsource.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4535a extends Thread {
    private static final int l = 1;
    private static final InterfaceC4562b m = new C0357a();
    private static final InterfaceC4894t9 n = new b();
    private final int d;
    private InterfaceC4562b a = m;
    private InterfaceC4894t9 b = n;
    private final Handler c = new Handler(Looper.getMainLooper());
    private String e = "";
    private boolean f = false;
    private boolean g = false;
    private volatile int h = 0;
    private int i = 1;
    private int j = 0;
    private final Runnable k = new c();

    /* renamed from: com.ironsource.a$a, reason: collision with other inner class name */
    class C0357a implements InterfaceC4562b {
        C0357a() {
        }

        @Override // com.ironsource.InterfaceC4562b
        public void a() {
        }

        @Override // com.ironsource.InterfaceC4562b
        public void b() {
            throw new RuntimeException("ANRHandler has given up");
        }
    }

    /* renamed from: com.ironsource.a$b */
    class b implements InterfaceC4894t9 {
        b() {
        }

        @Override // com.ironsource.InterfaceC4894t9
        public void a(InterruptedException interruptedException) {
            Log.w("ANRHandler", "Interrupted: " + interruptedException.getMessage());
        }
    }

    /* renamed from: com.ironsource.a$c */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4535a c4535a = C4535a.this;
            c4535a.h = (c4535a.h + 1) % Integer.MAX_VALUE;
        }
    }

    public C4535a(int i) {
        this.d = i;
    }

    public void a(int i) {
        this.i = i;
    }

    public int b() {
        return this.i;
    }

    public C4535a c() {
        this.e = null;
        return this;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        setName("|ANR-ANRHandler|");
        int i = -1;
        while (!isInterrupted() && this.j < this.i) {
            int i2 = this.h;
            this.c.post(this.k);
            try {
                Thread.sleep(this.d);
                if (this.h != i2) {
                    this.j = 0;
                } else if (this.g || !Debug.isDebuggerConnected()) {
                    this.j++;
                    this.a.a();
                    String str = C4782n4.l;
                    if (str != null && !str.trim().isEmpty()) {
                        new K5(C4782n4.l, String.valueOf(System.currentTimeMillis()), "ANR").a();
                    }
                } else {
                    if (this.h != i) {
                        Log.w("ANRHandler", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                    }
                    i = this.h;
                }
            } catch (InterruptedException e) {
                this.b.a(e);
                return;
            }
        }
        if (this.j >= this.i) {
            this.a.b();
        }
    }

    public int a() {
        return this.j;
    }

    public C4535a b(boolean z) {
        this.f = z;
        return this;
    }

    public C4535a a(InterfaceC4562b interfaceC4562b) {
        if (interfaceC4562b == null) {
            this.a = m;
        } else {
            this.a = interfaceC4562b;
        }
        return this;
    }

    public C4535a a(InterfaceC4894t9 interfaceC4894t9) {
        if (interfaceC4894t9 == null) {
            this.b = n;
        } else {
            this.b = interfaceC4894t9;
        }
        return this;
    }

    public C4535a a(String str) {
        if (str == null) {
            str = "";
        }
        this.e = str;
        return this;
    }

    public C4535a a(boolean z) {
        this.g = z;
        return this;
    }

    private String a(StackTraceElement[] stackTraceElementArr) {
        String str = "";
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                if (stackTraceElement != null) {
                    str = str + stackTraceElement.toString() + ";\n";
                }
            }
        }
        return str;
    }
}
