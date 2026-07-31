package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.h4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4675h4 {

    /* renamed from: com.ironsource.h4$a */
    public static final class a implements InterfaceC4675h4 {
        private final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        @Override // com.ironsource.InterfaceC4675h4
        public void a() {
            C4951w8.a(C4703ie.x, new C4857r8().a(B5.y, Boolean.valueOf(this.a)).a());
        }
    }

    /* renamed from: com.ironsource.h4$b */
    public static final class b implements InterfaceC4675h4 {
        private final boolean a;
        private final long b;

        @NotNull
        private final InterfaceC4818p4 c;

        public b(boolean z, long j, @NotNull InterfaceC4818p4 currentTimeProvider) {
            Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
            this.a = z;
            this.b = j;
            this.c = currentTimeProvider;
        }

        @Override // com.ironsource.InterfaceC4675h4
        public void a() {
            C4857r8 a = new C4857r8().a(B5.y, Boolean.valueOf(this.a));
            if (this.b > 0) {
                a.a(B5.B, Long.valueOf(this.c.a() - this.b));
            }
            C4951w8.a(C4703ie.w, a.a());
        }

        @NotNull
        public final InterfaceC4818p4 b() {
            return this.c;
        }
    }

    void a();
}
