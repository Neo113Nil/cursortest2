package com.apollographql.apollo.api.json.internal;

import kotlin.Metadata;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0001¢\u0006\u0002\b\u0003\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0004H\u0001¢\u0006\u0002\b\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0004*\u00020\u0002H\u0001¢\u0006\u0002\b\u0007\u001a\u0011\u0010\b\u001a\u00020\u0002*\u00020\u0004H\u0001¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"toIntExact", "", "", "-LongToIntExact", "", "-DoubleToIntExact", "toDoubleExact", "-LongToDoubleExact", "toLongExact", "-DoubleToLongExact", "apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UtilsKt {
    /* renamed from: -LongToIntExact, reason: not valid java name */
    public static final int m9334LongToIntExact(long j) {
        int i = (int) j;
        if (i == j) {
            return i;
        }
        throw new IllegalStateException((j + " cannot be converted to Int").toString());
    }

    /* renamed from: -DoubleToIntExact, reason: not valid java name */
    public static final int m9331DoubleToIntExact(double d) {
        int i = (int) d;
        if (i == d) {
            return i;
        }
        throw new IllegalStateException((d + " cannot be converted to Int").toString());
    }

    /* renamed from: -LongToDoubleExact, reason: not valid java name */
    public static final double m9333LongToDoubleExact(long j) {
        double d = j;
        if (((long) d) == j) {
            return d;
        }
        throw new IllegalStateException((j + " cannot be converted to Double").toString());
    }

    /* renamed from: -DoubleToLongExact, reason: not valid java name */
    public static final long m9332DoubleToLongExact(double d) {
        long j = (long) d;
        if (j == d) {
            return j;
        }
        throw new IllegalStateException((d + " cannot be converted to Long").toString());
    }
}
