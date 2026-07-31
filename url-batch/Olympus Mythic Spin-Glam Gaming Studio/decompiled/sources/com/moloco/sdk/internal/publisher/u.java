package com.moloco.sdk.internal.publisher;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.publisher.AdShowListener;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes3.dex */
public final class u<T extends AdShowListener> {
    public static final int f = 8;

    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> a;

    @Nullable
    public com.moloco.sdk.internal.ortb.model.B b;

    @Nullable
    public C5035k c;

    @Nullable
    public Job d;

    @Nullable
    public z e;

    public u() {
        this(null, null, null, null, null, 31, null);
    }

    @Nullable
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> a() {
        return this.a;
    }

    @Nullable
    public final Job b() {
        return this.d;
    }

    @Nullable
    public final C5035k c() {
        return this.c;
    }

    @Nullable
    public final z d() {
        return this.e;
    }

    @Nullable
    public final com.moloco.sdk.internal.ortb.model.B e() {
        return this.b;
    }

    public u(@Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> lVar, @Nullable com.moloco.sdk.internal.ortb.model.B b, @Nullable C5035k c5035k, @Nullable Job job, @Nullable z zVar) {
        this.a = lVar;
        this.b = b;
        this.c = c5035k;
        this.d = job;
        this.e = zVar;
    }

    public final void a(@Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> lVar) {
        this.a = lVar;
    }

    public final void a(@Nullable com.moloco.sdk.internal.ortb.model.B b) {
        this.b = b;
    }

    public final void a(@Nullable C5035k c5035k) {
        this.c = c5035k;
    }

    public final void a(@Nullable Job job) {
        this.d = job;
    }

    public final void a(@Nullable z zVar) {
        this.e = zVar;
    }

    public /* synthetic */ u(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l lVar, com.moloco.sdk.internal.ortb.model.B b, C5035k c5035k, Job job, z zVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : lVar, (i & 2) != 0 ? null : b, (i & 4) != 0 ? null : c5035k, (i & 8) != 0 ? null : job, (i & 16) != 0 ? null : zVar);
    }
}
