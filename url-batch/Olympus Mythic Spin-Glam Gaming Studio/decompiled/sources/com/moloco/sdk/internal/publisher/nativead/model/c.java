package com.moloco.sdk.internal.publisher.nativead.model;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.publisher.nativead.model.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes5.dex */
public abstract class c {
    public static final int d = 0;

    @NotNull
    public final b.a a;
    public final int b;
    public final boolean c;

    @StabilityInferred
    public static final class a extends c {
        public static final int f = 0;

        @NotNull
        public final String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull b.a.C1547a originAsset) {
            super(originAsset, null);
            Intrinsics.checkNotNullParameter(originAsset, "originAsset");
            this.e = originAsset.e();
        }

        @NotNull
        public final String d() {
            return this.e;
        }
    }

    @StabilityInferred
    public static final class b extends c {
        public static final int f = 8;

        @NotNull
        public final Uri e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull b.a.C1548b originAsset, @NotNull Uri precachedAssetUri) {
            super(originAsset, null);
            Intrinsics.checkNotNullParameter(originAsset, "originAsset");
            Intrinsics.checkNotNullParameter(precachedAssetUri, "precachedAssetUri");
            this.e = precachedAssetUri;
        }

        @NotNull
        public final Uri d() {
            return this.e;
        }
    }

    @StabilityInferred
    /* renamed from: com.moloco.sdk.internal.publisher.nativead.model.c$c, reason: collision with other inner class name */
    public static final class C1550c extends c {
        public static final int f = 0;

        @NotNull
        public final String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1550c(@NotNull b.a.c originAsset) {
            super(originAsset, null);
            Intrinsics.checkNotNullParameter(originAsset, "originAsset");
            this.e = originAsset.d();
        }

        @NotNull
        public final String d() {
            return this.e;
        }
    }

    @StabilityInferred
    public static final class d extends c {
        public static final int f = 8;

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull b.a.d originAsset, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a vastAd) {
            super(originAsset, null);
            Intrinsics.checkNotNullParameter(originAsset, "originAsset");
            Intrinsics.checkNotNullParameter(vastAd, "vastAd");
            this.e = vastAd;
        }

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a d() {
            return this.e;
        }
    }

    public /* synthetic */ c(b.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public final int a() {
        return this.b;
    }

    @NotNull
    public final b.a b() {
        return this.a;
    }

    public final boolean c() {
        return this.c;
    }

    public c(b.a aVar) {
        this.a = aVar;
        this.b = aVar.a();
        this.c = aVar.b();
    }
}
