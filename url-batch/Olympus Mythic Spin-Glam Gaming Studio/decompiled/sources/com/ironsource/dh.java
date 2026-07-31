package com.ironsource;

import com.ironsource.AbstractC4709j3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class dh<Smash extends AbstractC4709j3<?>> {

    @NotNull
    public static final a g = new a(null);
    private final int a;
    private final boolean b;

    @NotNull
    private final List<Smash> c;

    @NotNull
    private final List<Smash> d;

    @NotNull
    private final List<Smash> e;

    @NotNull
    private final List<Smash> f;

    public static final class a {

        /* renamed from: com.ironsource.dh$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1358a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[Ug.values().length];
                try {
                    iArr[Ug.DEFAULT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Ug.BIDDER_SENSITIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <Smash extends AbstractC4709j3<?>> dh<Smash> a(@NotNull Ug loadingStrategy, int i, boolean z, @NotNull List<? extends Smash> waterfall) {
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            Intrinsics.checkNotNullParameter(waterfall, "waterfall");
            int i2 = C1358a.a[loadingStrategy.ordinal()];
            if (i2 == 1) {
                return new I4(i, z, waterfall);
            }
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return new C4817p3(i, z, waterfall, false, 8, null);
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dh(int i, boolean z, @NotNull List<? extends Smash> waterfall) {
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        this.a = i;
        this.b = z;
        this.c = waterfall;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
    }

    private final boolean b(Smash smash) {
        return b() < a(smash);
    }

    @NotNull
    public final List<Smash> a() {
        return this.f;
    }

    @NotNull
    public final List<Smash> c() {
        return this.d;
    }

    public abstract void c(@NotNull Smash smash);

    public final int d() {
        return this.d.size() + this.e.size() + this.f.size();
    }

    public boolean e() {
        return d() >= this.a;
    }

    private final int a(Smash smash) {
        return smash.i().l();
    }

    public final void d(@NotNull Smash smash) {
        Intrinsics.checkNotNullParameter(smash, "smash");
        if (smash.x()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - smash " + smash.k() + " is failed to load");
            return;
        }
        if (smash.y()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is already loaded");
            this.e.add(smash);
            return;
        }
        if (smash.z()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " still loading");
            this.f.add(smash);
            return;
        }
        if (smash.A().get()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " marked as loading candidate");
            this.f.add(smash);
            return;
        }
        if (!this.b || !b(smash)) {
            c(smash);
            return;
        }
        IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is not better than already loaded smashes");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int b() {
        Integer num;
        List<Smash> list = this.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((AbstractC4709j3) obj).y()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Integer valueOf = Integer.valueOf(a((AbstractC4709j3) it.next()));
            while (it.hasNext()) {
                Integer valueOf2 = Integer.valueOf(a((AbstractC4709j3) it.next()));
                if (valueOf.compareTo(valueOf2) > 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }
}
