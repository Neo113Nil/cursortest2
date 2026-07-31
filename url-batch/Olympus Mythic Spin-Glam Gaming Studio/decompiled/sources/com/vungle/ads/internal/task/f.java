package com.vungle.ads.internal.task;

import android.os.Bundle;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class f implements Cloneable {
    public final String a;
    public boolean b;
    public long c;
    public Bundle d;
    public int e;

    public f(String jobTag) {
        Intrinsics.checkNotNullParameter(jobTag, "jobTag");
        this.a = jobTag;
        this.d = new Bundle();
        this.e = 2;
    }

    public final f a(Bundle extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.d = extras;
        return this;
    }

    public final long b() {
        return this.c;
    }

    public final Bundle c() {
        return this.d;
    }

    public final Object clone() {
        return super.clone();
    }

    public final String d() {
        return this.a;
    }

    public final int e() {
        return this.e;
    }

    public final boolean f() {
        return this.b;
    }

    public final void g() {
        this.c = 0L;
    }

    public final f a() {
        try {
            Object clone = super.clone();
            Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type com.vungle.ads.internal.task.JobInfo");
            return (f) clone;
        } catch (CloneNotSupportedException e) {
            boolean z = u.a;
            t.a("JobInfo", "Cannot copy JobInfo " + this, e);
            return null;
        }
    }
}
