package com.unity3d.ads.core.data.datasource;

import com.ironsource.C4901tg;
import com.ironsource.X3;
import com.unity3d.services.core.misc.JsonStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidMediationDataSource.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidMediationDataSource;", "Lcom/unity3d/ads/core/data/datasource/MediationDataSource;", X3.a.k, "Lcom/unity3d/services/core/misc/JsonStorage;", "<init>", "(Lcom/unity3d/services/core/misc/JsonStorage;)V", "name", "", "getName", "()Ljava/lang/String;", "version", C4901tg.b, "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidMediationDataSource implements MediationDataSource {

    @NotNull
    private static final String MEDIATION_NAME = "name";

    @NotNull
    public static final String MEDIATION_NAME_KEY = "mediation.name.value";

    @NotNull
    private static final String MEDIATION_STORAGE_NAME = "mediation";

    @NotNull
    private static final String MEDIATION_VALUE = "value";

    @NotNull
    private static final String MEDIATION_VERSION = "version";

    @NotNull
    public static final String MEDIATION_VERSION_KEY = "mediation.version.value";

    @NotNull
    private final JsonStorage storage;

    public AndroidMediationDataSource(@NotNull JsonStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.storage = storage;
    }

    @Override // com.unity3d.ads.core.data.datasource.MediationDataSource
    @Nullable
    public String getName() {
        return (String) this.storage.get(MEDIATION_NAME_KEY);
    }

    @Override // com.unity3d.ads.core.data.datasource.MediationDataSource
    @Nullable
    public String getVersion() {
        return (String) this.storage.get(MEDIATION_VERSION_KEY);
    }
}
