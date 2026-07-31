package io.bidmachine.ads.networks.gam_dynamic.versions;

import androidx.annotation.NonNull;
import io.bidmachine.utils.version.Version;

/* loaded from: classes4.dex */
public abstract class BaseVersionWrapper implements VersionWrapper {
    private final int minDeviceApiVersion;

    @NonNull
    private final Version versionForWhichCompiled;

    public BaseVersionWrapper(int i, @NonNull Version version) {
        this.minDeviceApiVersion = i;
        this.versionForWhichCompiled = version;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.versions.VersionWrapper
    public int getMinDeviceApiVersion() {
        return this.minDeviceApiVersion;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.versions.VersionWrapper
    @NonNull
    public Version getVersionForWhichCompiled() {
        return this.versionForWhichCompiled;
    }
}
