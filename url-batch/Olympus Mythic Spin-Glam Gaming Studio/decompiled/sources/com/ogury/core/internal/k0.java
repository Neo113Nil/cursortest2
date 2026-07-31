package com.ogury.core.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
/* loaded from: classes5.dex */
public final class k0 extends Lambda implements Function0 {
    public final /* synthetic */ p0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(p0 p0Var) {
        super(0);
        this.a = p0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        p0 p0Var = this.a;
        return new z0(p0Var.a, "ogury_privacy_data", p0Var.a());
    }
}
