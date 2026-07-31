package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.qm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5628qm extends BaseRequestConfig.BaseRequestArguments {

    @Nullable
    public final String a;

    @Nullable
    public final String b;

    @Nullable
    public final Map<String, String> c;
    public final boolean d;

    @Nullable
    public final List<String> e;

    public C5628qm(@NonNull Y3 y3) {
        this(y3.a().c(), y3.a().d(), y3.a().a(), y3.a().h(), y3.a().b());
    }

    public final boolean a(@NonNull C5628qm c5628qm) {
        return false;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C5628qm mergeFrom(@NonNull C5628qm c5628qm) {
        return new C5628qm((String) WrapUtils.getOrDefaultNullable(this.a, c5628qm.a), (String) WrapUtils.getOrDefaultNullable(this.b, c5628qm.b), (Map) WrapUtils.getOrDefaultNullable(this.c, c5628qm.c), this.d || c5628qm.d, c5628qm.d ? c5628qm.e : this.e);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(@NonNull Object obj) {
        return false;
    }

    public final String toString() {
        return "Arguments{distributionReferrer='" + this.a + "', installReferrerSource='" + this.b + "', clientClids=" + this.c + ", hasNewCustomHosts=" + this.d + ", newCustomHosts=" + this.e + '}';
    }

    public C5628qm(@Nullable String str, @Nullable String str2, @Nullable Map<String, String> map, boolean z, @Nullable List<String> list) {
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = z;
        this.e = list;
    }

    public C5628qm() {
        this(null, null, null, false, null);
    }
}
