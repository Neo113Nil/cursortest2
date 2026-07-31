package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.h8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC5380h8 {
    public final Context a;
    public final ProtobufStateStorage b;
    public final AbstractC5431j8 c;
    public final InterfaceC5681so d;
    public final Zm e;
    public final InterfaceC5468kj f;
    public final InterfaceC5416ij g;
    public final R6 h;
    public InterfaceC5406i8 i;

    public AbstractC5380h8(Context context, ProtobufStateStorage protobufStateStorage, AbstractC5431j8 abstractC5431j8, InterfaceC5681so interfaceC5681so, Zm zm, InterfaceC5468kj interfaceC5468kj, InterfaceC5416ij interfaceC5416ij, R6 r6, InterfaceC5406i8 interfaceC5406i8) {
        this.a = context;
        this.b = protobufStateStorage;
        this.c = abstractC5431j8;
        this.d = interfaceC5681so;
        this.e = zm;
        this.f = interfaceC5468kj;
        this.g = interfaceC5416ij;
        this.h = r6;
        this.i = interfaceC5406i8;
    }

    @NotNull
    public final synchronized InterfaceC5406i8 a() {
        return this.i;
    }

    public final synchronized boolean b(@NotNull InterfaceC5509m8 interfaceC5509m8) {
        try {
            boolean z = false;
            if (interfaceC5509m8.a() == EnumC5483l8.c) {
                return false;
            }
            if (Intrinsics.areEqual(interfaceC5509m8, this.i.b())) {
                return false;
            }
            List list = (List) this.d.invoke(this.i.a(), interfaceC5509m8);
            boolean z2 = list != null;
            if (list == null) {
                list = this.i.a();
            }
            if (this.c.a(interfaceC5509m8, this.i.b())) {
                z = true;
            } else {
                interfaceC5509m8 = (InterfaceC5509m8) this.i.b();
            }
            if (z || z2) {
                InterfaceC5406i8 interfaceC5406i8 = this.i;
                InterfaceC5406i8 interfaceC5406i82 = (InterfaceC5406i8) this.e.invoke(interfaceC5509m8, list);
                this.i = interfaceC5406i82;
                this.b.save(interfaceC5406i82);
                AbstractC5754vj.a("Update distribution data: %s -> %s", interfaceC5406i8, this.i);
            }
            return z;
        } finally {
        }
    }

    public final synchronized InterfaceC5509m8 c() {
        try {
            if (!this.g.a()) {
                InterfaceC5509m8 interfaceC5509m8 = (InterfaceC5509m8) this.f.mo4828invoke();
                this.g.b();
                if (interfaceC5509m8 != null) {
                    b(interfaceC5509m8);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (InterfaceC5509m8) this.i.b();
    }

    @NotNull
    public final InterfaceC5509m8 a(@NotNull InterfaceC5509m8 interfaceC5509m8) {
        InterfaceC5509m8 c;
        this.h.a(this.a);
        synchronized (this) {
            b(interfaceC5509m8);
            c = c();
        }
        return c;
    }

    @NotNull
    public final InterfaceC5509m8 b() {
        this.h.a(this.a);
        return c();
    }
}
