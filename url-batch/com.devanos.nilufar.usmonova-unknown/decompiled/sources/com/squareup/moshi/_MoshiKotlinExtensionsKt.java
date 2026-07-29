package com.squareup.moshi;

import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.NonNullJsonAdapter;
import com.squareup.moshi.internal.NullSafeJsonAdapter;
import kotlin.Metadata;
import o.AbstractC0048Bt;
import o.C1661ox;
import o.InterfaceC1463lx;
import o.PX;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a*\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00052\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0003\u0010\n¨\u0006\u000b"}, d2 = {"T", "Lcom/squareup/moshi/Moshi;", "Lcom/squareup/moshi/JsonAdapter;", "adapter", "(Lcom/squareup/moshi/Moshi;)Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/Moshi$Builder;", "addAdapter", "(Lcom/squareup/moshi/Moshi$Builder;Lcom/squareup/moshi/JsonAdapter;)Lcom/squareup/moshi/Moshi$Builder;", "Lo/lx;", "ktype", "(Lcom/squareup/moshi/Moshi;Lo/lx;)Lcom/squareup/moshi/JsonAdapter;", "moshi"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class _MoshiKotlinExtensionsKt {
    public static final <T> JsonAdapter<T> adapter(Moshi moshi, InterfaceC1463lx interfaceC1463lx) {
        AbstractC0048Bt.n(moshi, "<this>");
        AbstractC0048Bt.n(interfaceC1463lx, "ktype");
        JsonAdapter<T> adapter = moshi.adapter(PX.P(interfaceC1463lx));
        if ((adapter instanceof NullSafeJsonAdapter) || (adapter instanceof NonNullJsonAdapter)) {
            return adapter;
        }
        if (((C1661ox) interfaceC1463lx).h.C0()) {
            JsonAdapter<T> nullSafe = adapter.nullSafe();
            AbstractC0048Bt.m(nullSafe, "{\n    adapter.nullSafe()\n  }");
            return nullSafe;
        }
        JsonAdapter<T> nonNull = adapter.nonNull();
        AbstractC0048Bt.m(nonNull, "{\n    adapter.nonNull()\n  }");
        return nonNull;
    }

    public static final <T> Moshi.Builder addAdapter(Moshi.Builder builder, JsonAdapter<T> jsonAdapter) {
        AbstractC0048Bt.n(builder, "<this>");
        AbstractC0048Bt.n(jsonAdapter, "adapter");
        AbstractC0048Bt.h0();
        throw null;
    }

    public static final <T> JsonAdapter<T> adapter(Moshi moshi) {
        AbstractC0048Bt.n(moshi, "<this>");
        AbstractC0048Bt.h0();
        throw null;
    }
}
