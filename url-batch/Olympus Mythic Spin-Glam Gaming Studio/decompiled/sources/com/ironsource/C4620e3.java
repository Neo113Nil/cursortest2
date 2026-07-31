package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.e3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4620e3 extends AbstractC4781n3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4620e3(int i, @NotNull String placementName, boolean z, @Nullable C4702id c4702id) {
        super(i, placementName, z, c4702id);
        Intrinsics.checkNotNullParameter(placementName, "placementName");
    }

    @Override // com.ironsource.AbstractC4781n3
    @NotNull
    public String toString() {
        return super.toString() + ", placementId: " + b();
    }
}
