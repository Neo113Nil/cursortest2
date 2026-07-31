package com.unity3d.ads;

import com.ironsource.C4901tg;
import com.ironsource.Qf;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MediationInfo.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/MediationInfo;", "", "name", "", "version", Qf.b, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", C4901tg.b, "()Ljava/lang/String;", "getAdapterVersion", "getName", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MediationInfo {

    @NotNull
    private final String adapterVersion;

    @NotNull
    private final String name;

    @NotNull
    private final String version;

    public MediationInfo(@NotNull String name, @NotNull String version, @NotNull String adapterVersion) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(adapterVersion, "adapterVersion");
        this.version = version;
        this.adapterVersion = adapterVersion;
        String lowerCase = name.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        this.name = lowerCase;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    public final String getAdapterVersion() {
        return this.adapterVersion;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }
}
