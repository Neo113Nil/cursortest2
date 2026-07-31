package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.x3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5790x3 implements Bg {
    public final Bg a;
    public final InterfaceC5647rg b;
    public boolean c;
    public final ArrayList d = new ArrayList();
    public final Object e = new Object();

    public C5790x3(@NotNull Bg bg, @NotNull InterfaceC5647rg interfaceC5647rg) {
        this.a = bg;
        this.b = interfaceC5647rg;
    }

    @Override // io.appmetrica.analytics.impl.Bg
    @NotNull
    public final String a() {
        return this.a.a();
    }

    public final void b() {
        synchronized (this.e) {
            if (this.c) {
                return;
            }
            this.c = true;
            if (((Uo) this.b).c()) {
                return;
            }
            Unit unit = Unit.INSTANCE;
            try {
                this.a.a(new InterfaceC5803xg() { // from class: io.appmetrica.analytics.impl.x3$$ExternalSyntheticLambda0
                    @Override // io.appmetrica.analytics.impl.InterfaceC5803xg
                    public final void a(Eg eg) {
                        C5790x3.a(C5790x3.this, eg);
                    }
                });
            } catch (Throwable th) {
                a(new Cg("Failed to request referrer", th));
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Bg
    public final void a(@NotNull InterfaceC5803xg interfaceC5803xg) {
        Eg eg;
        synchronized (this.e) {
            try {
                eg = null;
                if (((Uo) this.b).c()) {
                    Eg b = ((Uo) this.b).b();
                    if (b == null) {
                        b = new Cg("Referrer is null", null, 2, null);
                    }
                    eg = b;
                } else {
                    this.d.add(interfaceC5803xg);
                }
            } finally {
            }
        }
        if (eg != null) {
            interfaceC5803xg.a(eg);
        }
        b();
    }

    public static final void a(C5790x3 c5790x3, Eg eg) {
        synchronized (c5790x3.e) {
            ((Uo) c5790x3.b).a(eg);
            Unit unit = Unit.INSTANCE;
        }
        c5790x3.a(eg);
    }

    public final void a(Eg eg) {
        List list;
        synchronized (this.e) {
            list = CollectionsKt.toList(this.d);
            this.d.clear();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC5803xg) it.next()).a(eg);
        }
    }
}
