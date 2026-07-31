package com.ironsource;

import com.ironsource.AbstractC4709j3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes9.dex */
public final class Xg<Smash extends AbstractC4709j3<?>> {

    @NotNull
    private final W a;

    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((AbstractC4709j3) t).i().l()), Integer.valueOf(((AbstractC4709j3) t2).i().l()));
        }
    }

    public Xg(@NotNull W managerData) {
        Intrinsics.checkNotNullParameter(managerData, "managerData");
        this.a = managerData;
    }

    public final boolean a(@NotNull AbstractC4709j3<?> smash, @NotNull List<? extends Smash> waterfall) {
        Object obj;
        Intrinsics.checkNotNullParameter(smash, "smash");
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        Iterator<T> it = b(waterfall).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!((AbstractC4709j3) obj).x()) {
                break;
            }
        }
        return Intrinsics.areEqual(obj, smash);
    }

    @NotNull
    public final List<Smash> b(@NotNull List<? extends Smash> waterfall) {
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        return CollectionsKt.sortedWith(waterfall, new a());
    }

    @Nullable
    public final Smash c(@NotNull List<? extends Smash> waterfall) {
        Object obj;
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        Iterator<T> it = b(waterfall).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AbstractC4709j3) obj).B()) {
                break;
            }
        }
        return (Smash) obj;
    }

    @NotNull
    public final Yg<Smash> d(@NotNull List<? extends Smash> waterfall) {
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        IronLog.INTERNAL.verbose(this.a.b().name() + " waterfall size: " + waterfall.size());
        dh a2 = dh.g.a(this.a.c() ? Ug.BIDDER_SENSITIVE : Ug.DEFAULT, this.a.i(), this.a.m(), waterfall);
        Iterator<? extends Smash> it = waterfall.iterator();
        while (it.hasNext()) {
            a2.d(it.next());
            if (a2.e()) {
                return new Yg<>(a2);
            }
        }
        return new Yg<>(a2);
    }

    public final boolean a(@NotNull List<? extends Smash> waterfall) {
        int i;
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        if ((waterfall instanceof Collection) && waterfall.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = waterfall.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((AbstractC4709j3) it.next()).y() && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i >= this.a.i();
    }
}
