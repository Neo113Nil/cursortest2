package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.h0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4671h0 {

    @NotNull
    private final IronSource.a a;

    @NotNull
    private final UUID b;

    @NotNull
    private final String c;

    @Nullable
    private C4684hd d;

    @Nullable
    private final Uf e;

    @Nullable
    private final Double f;

    /* renamed from: com.ironsource.h0$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public C4671h0(@NotNull IronSource.a adFormat, @NotNull UUID adId, @NotNull String adUnitId, @Nullable C4684hd c4684hd, @Nullable Uf uf, @Nullable Double d) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.a = adFormat;
        this.b = adId;
        this.c = adUnitId;
        this.d = c4684hd;
        this.e = uf;
        this.f = d;
    }

    @NotNull
    public final IronSource.a a() {
        return this.a;
    }

    @NotNull
    public final UUID b() {
        return this.b;
    }

    @NotNull
    public final String c() {
        return this.c;
    }

    @Nullable
    public final Double d() {
        return this.f;
    }

    @NotNull
    public final LevelPlay.AdFormat e() {
        int i = a.a[this.a.ordinal()];
        if (i == 1) {
            return LevelPlay.AdFormat.REWARDED;
        }
        if (i == 2) {
            return LevelPlay.AdFormat.INTERSTITIAL;
        }
        if (i == 3) {
            return LevelPlay.AdFormat.BANNER;
        }
        if (i == 4) {
            return LevelPlay.AdFormat.NATIVE_AD;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Nullable
    public final C4684hd f() {
        return this.d;
    }

    @Nullable
    public final Uf g() {
        return this.e;
    }

    public final boolean h() {
        return CollectionsKt.listOf((Object[]) new IronSource.a[]{IronSource.a.REWARDED_VIDEO, IronSource.a.INTERSTITIAL}).contains(this.a);
    }

    public final void a(@Nullable C4684hd c4684hd) {
        this.d = c4684hd;
    }

    public /* synthetic */ C4671h0(IronSource.a aVar, UUID uuid, String str, C4684hd c4684hd, Uf uf, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, uuid, str, (i & 8) != 0 ? null : c4684hd, (i & 16) != 0 ? null : uf, (i & 32) != 0 ? null : d);
    }
}
