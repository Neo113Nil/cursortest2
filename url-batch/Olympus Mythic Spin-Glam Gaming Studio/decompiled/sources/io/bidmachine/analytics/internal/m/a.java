package io.bidmachine.analytics.internal.m;

import android.content.Context;
import io.bidmachine.analytics.internal.a.C5890a;
import io.bidmachine.analytics.internal.g.C5901c;
import io.bidmachine.analytics.internal.g.EnumC5899a;
import io.bidmachine.analytics.internal.g.EnumC5905g;
import io.bidmachine.analytics.internal.g.h;
import io.bidmachine.analytics.internal.h.InterfaceC5906a;
import io.bidmachine.analytics.internal.h.InterfaceC5907b;
import io.bidmachine.analytics.internal.i.AbstractC5912a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class a extends AbstractC5912a implements InterfaceC5907b, InterfaceC5906a {
    private final C5890a d;
    private InterfaceC5907b e;
    private String f;
    private C1739a g;
    private final Object h = new Object();
    private final Map i = new LinkedHashMap();
    private b j;

    /* renamed from: io.bidmachine.analytics.internal.m.a$a, reason: collision with other inner class name */
    public static final class C1739a implements AbstractC5912a.InterfaceC1735a {
        private final String a;
        private final long b;

        public /* synthetic */ C1739a(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j);
        }

        public final long a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        private C1739a(String str, long j) {
            this.a = str;
            this.b = j;
        }
    }

    public static final class b {
        private final String a;
        private final long b;
        private final int c;
        private final Float d;
        private final EnumC5905g e;
        private final String f;
        private final String g;
        private final boolean h;
        private final Float i;

        public b(String str, long j, int i, Float f, EnumC5905g enumC5905g, String str2, String str3, boolean z) {
            this.a = str;
            this.b = j;
            this.c = i;
            this.d = f;
            this.e = enumC5905g;
            this.f = str2;
            this.g = str3;
            this.h = z;
            this.i = f != null ? Float.valueOf(f.floatValue() * 1000) : null;
        }

        public final b a(String str, long j, int i, Float f, EnumC5905g enumC5905g, String str2, String str3, boolean z) {
            return new b(str, j, i, f, enumC5905g, str2, str3, z);
        }

        public final int b() {
            return this.c;
        }

        public final Float c() {
            return this.i;
        }

        public final String d() {
            return this.a;
        }

        public final String e() {
            return this.f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && Intrinsics.areEqual((Object) this.d, (Object) bVar.d) && this.e == bVar.e && Intrinsics.areEqual(this.f, bVar.f) && Intrinsics.areEqual(this.g, bVar.g) && this.h == bVar.h;
        }

        public final Float f() {
            return this.d;
        }

        public final EnumC5905g g() {
            return this.e;
        }

        public final long h() {
            return this.b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((this.a.hashCode() * 31) + Long.hashCode(this.b)) * 31) + Integer.hashCode(this.c)) * 31;
            Float f = this.d;
            int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
            EnumC5905g enumC5905g = this.e;
            int hashCode3 = (hashCode2 + (enumC5905g == null ? 0 : enumC5905g.hashCode())) * 31;
            String str = this.f;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.g;
            int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
            boolean z = this.h;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode5 + i;
        }

        public final boolean i() {
            return this.h;
        }

        public String toString() {
            return super.toString();
        }

        public static /* synthetic */ b a(b bVar, String str, long j, int i, Float f, EnumC5905g enumC5905g, String str2, String str3, boolean z, int i2, Object obj) {
            return bVar.a((i2 & 1) != 0 ? bVar.a : str, (i2 & 2) != 0 ? bVar.b : j, (i2 & 4) != 0 ? bVar.c : i, (i2 & 8) != 0 ? bVar.d : f, (i2 & 16) != 0 ? bVar.e : enumC5905g, (i2 & 32) != 0 ? bVar.f : str2, (i2 & 64) != 0 ? bVar.g : str3, (i2 & 128) != 0 ? bVar.h : z);
        }

        public final String a() {
            return this.g;
        }

        public /* synthetic */ b(String str, long j, int i, Float f, EnumC5905g enumC5905g, String str2, String str3, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? UUID.randomUUID().toString() : str, j, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : f, (i2 & 16) != 0 ? null : enumC5905g, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? false : z);
        }
    }

    public a(C5890a c5890a) {
        this.d = c5890a;
    }

    private final void b(EnumC5899a enumC5899a, b bVar) {
        Float f;
        EnumC5905g g;
        String str = this.f;
        if (str == null || (f = bVar.f()) == null) {
            return;
        }
        float floatValue = f.floatValue();
        if (floatValue > 0.0f && (g = bVar.g()) != null) {
            this.d.c().d().a(new C5901c(bVar.d(), str, bVar.h(), enumC5899a, floatValue, g));
        }
    }

    private final void c(EnumC5899a enumC5899a, b bVar) {
        b a;
        synchronized (this.h) {
            try {
                b bVar2 = this.j;
                if (Intrinsics.areEqual(bVar2 != null ? bVar2.d() : null, bVar.d())) {
                    b bVar3 = this.j;
                    a = b.a(bVar, null, 0L, bVar3 != null ? bVar3.b() : 0, null, null, null, null, false, 251, null);
                } else {
                    b bVar4 = this.j;
                    a = b.a(bVar, null, 0L, (bVar4 != null ? bVar4.b() : 0) + 1, null, null, null, null, false, 251, null);
                }
                this.j = a;
                b bVar5 = (b) this.i.get(enumC5899a);
                this.i.put(enumC5899a, bVar5 == null ? b.a(bVar, null, 0L, 1, null, null, null, null, false, 251, null) : Intrinsics.areEqual(bVar.d(), bVar5.d()) ? b.a(bVar, null, 0L, bVar5.b(), null, null, null, null, false, 251, null) : b.a(bVar, null, 0L, bVar5.b() + 1, null, null, null, null, false, 251, null));
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(AbstractC5912a.b bVar) {
        this.f = bVar.c();
        this.e = bVar.a();
        AbstractC5912a.InterfaceC1735a b2 = bVar.b();
        C1739a c1739a = b2 instanceof C1739a ? (C1739a) b2 : null;
        this.g = c1739a;
        if (c1739a != null) {
            Result.m8022boximpl(this.d.c().d().a(c1739a.a()));
        }
    }

    public abstract b b(Map map);

    public abstract EnumC5899a c(Map map);

    @Override // io.bidmachine.analytics.internal.h.AbstractC5909d
    public void f(Context context) {
        synchronized (this.h) {
            this.i.clear();
            this.j = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // io.bidmachine.analytics.internal.h.InterfaceC5907b
    public void a(Map map) {
        b b2;
        a();
        InterfaceC5907b interfaceC5907b = this.e;
        if (interfaceC5907b != null) {
            interfaceC5907b.a(map);
        }
        EnumC5899a c = c(map);
        if (c == null || (b2 = b(map)) == null) {
            return;
        }
        a(c, b2);
    }

    private final void a(EnumC5899a enumC5899a, b bVar) {
        c(enumC5899a, bVar);
        b(enumC5899a, bVar);
    }

    @Override // io.bidmachine.analytics.internal.h.InterfaceC5907b
    public void a(h hVar) {
        InterfaceC5907b interfaceC5907b = this.e;
        if (interfaceC5907b != null) {
            interfaceC5907b.a(hVar);
        }
    }

    public final b a(EnumC5899a enumC5899a) {
        b bVar;
        synchronized (this.h) {
            bVar = (b) this.i.get(enumC5899a);
        }
        return bVar;
    }

    @Override // io.bidmachine.analytics.internal.h.InterfaceC5906a
    public Object a(String str) {
        C1739a c1739a;
        String b2;
        if (!Intrinsics.areEqual(str, "iaa") || (c1739a = this.g) == null || (b2 = c1739a.b()) == null) {
            return null;
        }
        Object a = this.d.c().d().a(b2);
        Boolean bool = (Boolean) (Result.m8028isFailureimpl(a) ? null : a);
        a();
        return bool;
    }

    public final b b() {
        b bVar;
        synchronized (this.h) {
            bVar = this.j;
        }
        return bVar;
    }
}
