package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.ironsource.V5;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidStorageManager.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0014\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\fH\u0016J\u0014\u0010\r\u001a\u00020\u000e2\n\u0010\n\u001a\u00060\u000bj\u0002`\fH\u0016J\u0014\u0010\u000f\u001a\u00020\u00052\n\u0010\n\u001a\u00060\u000bj\u0002`\fH\u0016J\u001c\u0010\u0010\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0014\u0010\u0013\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\fH\u0016J\b\u0010\u0014\u001a\u00020\tH\u0016¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/data/manager/AndroidStorageManager;", "Lcom/unity3d/ads/core/data/manager/StorageManager;", "<init>", "()V", "init", "", "context", "Landroid/content/Context;", "initStorage", "", "type", "Lcom/unity3d/services/core/device/StorageManager$StorageType;", "Lcom/unity3d/ads/core/data/manager/LegacyStorageType;", "getStorage", "Lcom/unity3d/services/core/device/Storage;", "hasStorage", "addStorageLocation", V5.c.b, "", "removeStorage", "hasInitialized", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AndroidStorageManager implements StorageManager {

    @NotNull
    private static final String KEY_INITIALIZED = "configuration.hasInitialized";

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public boolean init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return com.unity3d.services.core.device.StorageManager.init(context);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void initStorage(@NotNull StorageManager.StorageType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        com.unity3d.services.core.device.StorageManager.initStorage(type);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    @NotNull
    public Storage getStorage(@NotNull StorageManager.StorageType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        Storage storage = com.unity3d.services.core.device.StorageManager.getStorage(type);
        Intrinsics.checkNotNullExpressionValue(storage, "getStorage(...)");
        return storage;
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public boolean hasStorage(@NotNull StorageManager.StorageType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return com.unity3d.services.core.device.StorageManager.hasStorage(type);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void addStorageLocation(@NotNull StorageManager.StorageType type, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        com.unity3d.services.core.device.StorageManager.addStorageLocation(type, fileName);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void removeStorage(@NotNull StorageManager.StorageType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        com.unity3d.services.core.device.StorageManager.removeStorage(type);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void hasInitialized() {
        Storage storage = getStorage(StorageManager.StorageType.PRIVATE);
        storage.set(KEY_INITIALIZED, Boolean.TRUE);
        storage.writeStorage();
    }
}
