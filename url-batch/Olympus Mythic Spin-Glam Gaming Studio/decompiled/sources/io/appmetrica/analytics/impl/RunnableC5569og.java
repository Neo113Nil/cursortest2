package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.og, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC5569og implements Runnable {
    public final File a;
    public final Function b;
    public final Consumer c;
    public final Consumer d;
    public final C5745va e;
    public final InterfaceC5730ul f;

    public RunnableC5569og(File file, Function function, Consumer consumer, Consumer consumer2, C5745va c5745va, InterfaceC5730ul interfaceC5730ul) {
        this.a = file;
        this.b = function;
        this.c = consumer;
        this.d = consumer2;
        this.e = c5745va;
        this.f = interfaceC5730ul;
    }

    public static final void a(File file) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.exists()) {
            R9 b = this.e.b(this.a.getName());
            Consumer consumer = this.c;
            try {
                b.a.lock();
                b.b.a();
            } catch (Throwable unused) {
            }
            if (!this.a.exists()) {
                consumer.consume(this.a);
                b.c();
                C5745va c5745va = this.e;
                String name = this.a.getName();
                synchronized (c5745va) {
                    c5745va.b.remove(name);
                }
                return;
            }
            Object apply = this.b.apply(this.a);
            if (apply != null) {
                if (this.f.a(apply)) {
                    this.d.consume(apply);
                } else {
                    consumer = new Consumer() { // from class: io.appmetrica.analytics.impl.og$$ExternalSyntheticLambda0
                        @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
                        public final void consume(Object obj) {
                            RunnableC5569og.a((File) obj);
                        }
                    };
                }
            }
            consumer.consume(this.a);
            b.c();
            this.e.a(this.a.getName());
        }
    }
}
