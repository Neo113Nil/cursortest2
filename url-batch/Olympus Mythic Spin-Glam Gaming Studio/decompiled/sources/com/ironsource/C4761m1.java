package com.ironsource;

import com.ironsource.C4797o1;
import com.ironsource.mediationsdk.IronSource;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.m1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4761m1 implements InterfaceC4779n1 {

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    @NotNull
    private final IronSource.a c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    /* renamed from: com.ironsource.m1$a */
    public static final class a {

        @NotNull
        public static final a a = new a();
        public static final int b = 1;
        public static final int c = 1;
        public static final int d = 1;

        private a() {
        }
    }

    public C4761m1(@NotNull String version, @NotNull String instanceId, @NotNull IronSource.a adFormat, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.a = version;
        this.b = instanceId;
        this.c = adFormat;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    @Override // com.ironsource.InterfaceC4779n1
    @NotNull
    public ArrayList<InterfaceC4815p1> a() {
        ArrayList<InterfaceC4815p1> arrayList = new ArrayList<>();
        arrayList.add(new C4797o1.v(this.a));
        arrayList.add(new C4797o1.x(this.b));
        arrayList.add(new C4797o1.a(this.c));
        if (this.d) {
            arrayList.add(new C4797o1.p(1));
        }
        if (this.e) {
            arrayList.add(new C4797o1.e(1));
        }
        if (this.f) {
            arrayList.add(new C4797o1.o(1));
        }
        return arrayList;
    }

    public /* synthetic */ C4761m1(String str, String str2, IronSource.a aVar, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, aVar, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? true : z3);
    }
}
