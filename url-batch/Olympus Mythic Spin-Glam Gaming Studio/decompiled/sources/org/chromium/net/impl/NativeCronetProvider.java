package org.chromium.net.impl;

import android.content.Context;
import java.util.Arrays;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.httpflags.ResolvedFlags;
import org.chromium.net.impl.CronetLogger;

/* loaded from: classes5.dex */
public class NativeCronetProvider extends CronetProvider {
    public static final String OVERRIDE_NATIVE_CRONET_WITH_HTTPENGINE_FLAG = "Cronet_OverrideNativeCronetWithHttpEngine";
    private final HttpEngineNativeProvider mHttpEngineProvider;

    @Override // org.chromium.net.CronetProvider
    public boolean isEnabled() {
        return true;
    }

    public NativeCronetProvider(Context context) {
        super(context);
        this.mHttpEngineProvider = new HttpEngineNativeProvider(this.mContext);
    }

    @Override // org.chromium.net.CronetProvider
    public CronetEngine.Builder createBuilder() {
        if (shouldUseHttpEngine()) {
            return this.mHttpEngineProvider.createBuilder();
        }
        return new ExperimentalCronetEngine.Builder(new NativeCronetEngineBuilderWithLibraryLoaderImpl(this.mContext));
    }

    @Override // org.chromium.net.CronetProvider
    public String getName() {
        return CronetProvider.PROVIDER_NAME_APP_PACKAGED;
    }

    @Override // org.chromium.net.CronetProvider
    public String getVersion() {
        if (shouldUseHttpEngine()) {
            return this.mHttpEngineProvider.getVersion();
        }
        return ImplVersion.getCronetVersion();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{NativeCronetProvider.class, this.mContext});
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof NativeCronetProvider) && this.mContext.equals(((NativeCronetProvider) obj).mContext));
    }

    private boolean shouldUseHttpEngine() {
        ResolvedFlags.Value value;
        return HttpEngineNativeProvider.isHttpEngineAvailable() && (value = HttpFlagsForImpl.getHttpFlags(this.mContext, CronetLogger.CronetSource.CRONET_SOURCE_STATICALLY_LINKED).flags().get(OVERRIDE_NATIVE_CRONET_WITH_HTTPENGINE_FLAG)) != null && value.getBoolValue();
    }
}
