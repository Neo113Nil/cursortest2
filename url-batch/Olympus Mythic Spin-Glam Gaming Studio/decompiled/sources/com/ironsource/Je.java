package com.ironsource;

import android.content.Context;
import com.ironsource.InterfaceC4818p4;
import com.ironsource.J8;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes12.dex */
public final class Je implements J8, J8.a {

    @NotNull
    private final Ke a;

    @NotNull
    private final InterfaceC5011ze b;

    @NotNull
    private final InterfaceC4818p4 c;
    private int d;
    private long e;

    public static final class a {

        @NotNull
        public static final a a = new a();
        public static final int b = -1;
        public static final int c = 0;
        public static final long d = -1;

        private a() {
        }
    }

    public Je(@NotNull Ke storage, @NotNull InterfaceC5011ze initResponseStorage, @NotNull InterfaceC4818p4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(initResponseStorage, "initResponseStorage");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.a = storage;
        this.b = initResponseStorage;
        this.c = currentTimeProvider;
        this.d = -1;
        this.e = -1L;
    }

    private final int b(Context context, Ke ke) {
        int b = ke.b(context, 0) + 1;
        ke.a(context, b);
        return b;
    }

    @Override // com.ironsource.J8.a
    public void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.d = b(context, this.a);
        this.e = a(context, this.a);
    }

    @Override // com.ironsource.J8
    public int c() {
        return this.d;
    }

    private final long a(Context context, Ke ke) {
        long a2 = ke.a(context, -1L);
        if (this.b.a(context) || a2 != -1) {
            return a2;
        }
        long a3 = this.c.a();
        IronLog.INTERNAL.verbose("set first session timestamp = " + a3);
        ke.b(context, a3);
        return a3;
    }

    @Override // com.ironsource.J8
    @NotNull
    public String b() {
        String d = IronSourceUtils.d();
        Intrinsics.checkNotNullExpressionValue(d, "getSessionId()");
        return d;
    }

    public /* synthetic */ Je(Ke ke, InterfaceC5011ze interfaceC5011ze, InterfaceC4818p4 interfaceC4818p4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ke, (i & 2) != 0 ? new Ae() : interfaceC5011ze, (i & 4) != 0 ? new InterfaceC4818p4.a() : interfaceC4818p4);
    }

    @Override // com.ironsource.J8
    public long a() {
        return this.e;
    }
}
