package com.five_corp.ad.internal.exception;

import com.five_corp.ad.internal.m;

/* loaded from: classes4.dex */
public final class a extends b {
    public a(m mVar, int i) {
        super(mVar, String.format("DetailedErrorCode name %s: DetailedErrorCode enum value: %d, unknown enum value %d", mVar.name(), Integer.valueOf(mVar.a), Integer.valueOf(i)));
    }
}
