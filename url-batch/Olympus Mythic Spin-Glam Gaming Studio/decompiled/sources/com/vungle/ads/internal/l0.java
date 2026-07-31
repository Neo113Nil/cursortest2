package com.vungle.ads.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l0 {
    public m0 a;
    public m0 b;

    public l0(m0 downCoordinate, m0 upCoordinate) {
        Intrinsics.checkNotNullParameter(downCoordinate, "downCoordinate");
        Intrinsics.checkNotNullParameter(upCoordinate, "upCoordinate");
        this.a = downCoordinate;
        this.b = upCoordinate;
    }

    public final m0 a() {
        return this.a;
    }

    public final m0 b() {
        return this.b;
    }

    public final boolean c() {
        m0 m0Var = this.a;
        if (m0Var.a != Integer.MIN_VALUE && m0Var.b != Integer.MIN_VALUE) {
            m0 m0Var2 = this.b;
            if (m0Var2.a != Integer.MIN_VALUE && m0Var2.b != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return Intrinsics.areEqual(this.a, l0Var.a) && Intrinsics.areEqual(this.b, l0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("ClickCoordinate(downCoordinate=");
        a.append(this.a);
        a.append(", upCoordinate=");
        a.append(this.b);
        a.append(')');
        return a.toString();
    }

    public final void a(m0 m0Var) {
        Intrinsics.checkNotNullParameter(m0Var, "<set-?>");
        this.a = m0Var;
    }

    public final void b(m0 m0Var) {
        Intrinsics.checkNotNullParameter(m0Var, "<set-?>");
        this.b = m0Var;
    }
}
