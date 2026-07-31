package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdSize;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.h1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4672h1 {

    @NotNull
    public static final a b = new a(null);
    private static final int c = -1;

    @NotNull
    private final C4760m0 a;

    /* renamed from: com.ironsource.h1$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: com.ironsource.h1$b */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((LevelPlayAdSize) t2).getWidth()), Integer.valueOf(((LevelPlayAdSize) t).getWidth()));
        }
    }

    /* renamed from: com.ironsource.h1$c */
    public static final class c<T> implements Comparator {
        final /* synthetic */ Comparator a;

        public c(Comparator comparator) {
            this.a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.a.compare(t, t2);
            return compare != 0 ? compare : ComparisonsKt.compareValues(Integer.valueOf(((LevelPlayAdSize) t2).getHeight()), Integer.valueOf(((LevelPlayAdSize) t).getHeight()));
        }
    }

    public C4672h1(@NotNull C4760m0 adSizeTools) {
        Intrinsics.checkNotNullParameter(adSizeTools, "adSizeTools");
        this.a = adSizeTools;
    }

    @Nullable
    public final LevelPlayAdSize a(@NotNull Context context, @Nullable Integer num) {
        int i;
        LevelPlayAdSize levelPlayAdSize;
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.a.a()) {
            IronLog.API.error(C4760m0.a(this.a, "The SDK must be successfully initialized to create an Adaptive Ad Size", (String) null, 2, (Object) null));
            return null;
        }
        Integer b2 = this.a.b(context);
        if (b2 == null) {
            IronLog.API.error(C4760m0.a(this.a, "Error getting max current orientation banner height", (String) null, 2, (Object) null));
            return null;
        }
        int intValue = b2.intValue();
        int a2 = a(num, context);
        int a3 = this.a.a(a2);
        List<LevelPlayAdSize> a4 = a();
        for (LevelPlayAdSize levelPlayAdSize2 : a(a4, intValue, a2)) {
            if (levelPlayAdSize2.getWidth() <= a2 && (levelPlayAdSize2.getHeight() <= a3 || a3 == -1)) {
                a3 = Math.max(a3, levelPlayAdSize2.getHeight());
                break;
            }
        }
        levelPlayAdSize2 = null;
        if (levelPlayAdSize2 == null) {
            int height = ((LevelPlayAdSize) CollectionsKt.last((List) a4)).getHeight();
            i = height;
            levelPlayAdSize = LevelPlayAdSize.Companion.createCustomSize(a2, height);
        } else {
            i = a3;
            levelPlayAdSize = levelPlayAdSize2;
        }
        IronLog.INTERNAL.info(C4760m0.a(this.a, "Adaptive: " + a2 + VastAttributes.HORIZONTAL_POSITION + i + " Fallback: " + levelPlayAdSize, (String) null, 2, (Object) null));
        return new LevelPlayAdSize(a2, i, com.ironsource.mediationsdk.j.f, true, levelPlayAdSize);
    }

    private final int a(Integer num, Context context) {
        if (num != null && num.intValue() < 0) {
            IronLog.API.info(C4760m0.a(this.a, "Width is invalid, screen width will be used", (String) null, 2, (Object) null));
            return Z4.a.b(context);
        }
        if (num == null) {
            return Z4.a.b(context);
        }
        return num.intValue();
    }

    private final List<LevelPlayAdSize> a() {
        return CollectionsKt.sortedWith(this.a.c(), new c(new b()));
    }

    private final List<LevelPlayAdSize> a(List<LevelPlayAdSize> list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            LevelPlayAdSize levelPlayAdSize = (LevelPlayAdSize) obj;
            if (levelPlayAdSize.getHeight() <= i && levelPlayAdSize.getWidth() <= i2) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
