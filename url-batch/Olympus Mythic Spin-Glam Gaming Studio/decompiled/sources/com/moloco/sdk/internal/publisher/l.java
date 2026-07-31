package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class l<L extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w> {

    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> a;

    @Nullable
    public com.moloco.sdk.internal.ortb.model.B b;

    @Nullable
    public C5035k c;

    @Nullable
    public Job d;
    public boolean e;

    @Nullable
    public String f;

    @Nullable
    public String g;
    public boolean h;

    public l() {
        this(null, null, null, null, false, null, null, false, 255, null);
    }

    public final void a(@Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> b) {
        this.a = b;
    }

    @Nullable
    public final C5035k b() {
        return this.c;
    }

    @Nullable
    public final String c() {
        return this.g;
    }

    @Nullable
    public final String d() {
        return this.f;
    }

    @Nullable
    public final com.moloco.sdk.internal.ortb.model.B e() {
        return this.b;
    }

    @Nullable
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> f() {
        return this.a;
    }

    public final boolean g() {
        return this.h;
    }

    public final boolean h() {
        return this.e;
    }

    public l(@Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> b, @Nullable com.moloco.sdk.internal.ortb.model.B b2, @Nullable C5035k c5035k, @Nullable Job job, boolean z, @Nullable String str, @Nullable String str2, boolean z2) {
        this.a = b;
        this.b = b2;
        this.c = c5035k;
        this.d = job;
        this.e = z;
        this.f = str;
        this.g = str2;
        this.h = z2;
    }

    public final void a(@Nullable com.moloco.sdk.internal.ortb.model.B b) {
        this.b = b;
    }

    public final void b(boolean z) {
        this.e = z;
    }

    public final void a(@Nullable C5035k c5035k) {
        this.c = c5035k;
    }

    public final void b(@Nullable String str) {
        this.f = str;
    }

    @Nullable
    public final Job a() {
        return this.d;
    }

    public final void a(@Nullable Job job) {
        this.d = job;
    }

    public final void a(@Nullable String str) {
        this.g = str;
    }

    public final void a(boolean z) {
        this.h = z;
    }

    public /* synthetic */ l(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B b, com.moloco.sdk.internal.ortb.model.B b2, C5035k c5035k, Job job, boolean z, String str, String str2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : b, (i & 2) != 0 ? null : b2, (i & 4) != 0 ? null : c5035k, (i & 8) != 0 ? null : job, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str, (i & 64) == 0 ? str2 : null, (i & 128) == 0 ? z2 : false);
    }
}
