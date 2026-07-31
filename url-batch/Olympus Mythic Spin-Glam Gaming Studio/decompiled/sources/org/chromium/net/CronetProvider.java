package org.chromium.net;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.chromium.net.CronetEngine;
import org.chromium.net.impl.CronetLogger;

/* loaded from: classes6.dex */
public abstract class CronetProvider {
    private static final String GMS_CORE_CRONET_PROVIDER_CLASS = "com.google.android.gms.net.GmsCoreCronetProvider";
    private static final String JAVA_CRONET_PROVIDER_CLASS = "org.chromium.net.impl.JavaCronetProvider";
    private static final String NATIVE_CRONET_PROVIDER_CLASS = "org.chromium.net.impl.NativeCronetProvider";
    private static final String PLAY_SERVICES_CRONET_PROVIDER_CLASS = "com.google.android.gms.net.PlayServicesCronetProvider";
    public static final String PROVIDER_NAME_APP_PACKAGED = "App-Packaged-Cronet-Provider";
    public static final String PROVIDER_NAME_FALLBACK = "Fallback-Cronet-Provider";
    private static final String RES_KEY_CRONET_IMPL_CLASS = "CronetProviderClassName";
    private static final String TAG = "CronetProvider";
    protected final Context mContext;

    public abstract CronetEngine.Builder createBuilder();

    public abstract String getName();

    public abstract String getVersion();

    public abstract boolean isEnabled();

    protected CronetProvider(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null");
        }
        this.mContext = context;
    }

    public String toString() {
        return "[class=" + getClass().getName() + ", name=" + getName() + ", version=" + getVersion() + ", enabled=" + isEnabled() + X3.j.e;
    }

    static final class ProviderInfo {
        public CronetLogger.CronetSource logSource;
        public CronetProvider provider;

        ProviderInfo() {
        }

        public int hashCode() {
            return this.provider.hashCode();
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof ProviderInfo) && this.provider.equals(((ProviderInfo) obj).provider);
        }
    }

    public static List<CronetProvider> getAllProviders(Context context) {
        ArrayList arrayList = new ArrayList();
        Iterator<ProviderInfo> it = getAllProviderInfos(context).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().provider);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static List<ProviderInfo> getAllProviderInfos(Context context) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        addCronetProviderFromResourceFile(context, CronetLogger.CronetSource.CRONET_SOURCE_UNSPECIFIED, linkedHashSet);
        CronetLogger.CronetSource cronetSource = CronetLogger.CronetSource.CRONET_SOURCE_PLAY_SERVICES;
        addCronetProviderImplByClassName(context, PLAY_SERVICES_CRONET_PROVIDER_CLASS, cronetSource, linkedHashSet, false);
        addCronetProviderImplByClassName(context, GMS_CORE_CRONET_PROVIDER_CLASS, cronetSource, linkedHashSet, false);
        addCronetProviderImplByClassName(context, NATIVE_CRONET_PROVIDER_CLASS, CronetLogger.CronetSource.CRONET_SOURCE_STATICALLY_LINKED, linkedHashSet, false);
        addCronetProviderImplByClassName(context, JAVA_CRONET_PROVIDER_CLASS, CronetLogger.CronetSource.CRONET_SOURCE_FALLBACK, linkedHashSet, false);
        return Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    private static boolean addCronetProviderImplByClassName(Context context, String str, CronetLogger.CronetSource cronetSource, Set<ProviderInfo> set, boolean z) {
        try {
            Constructor constructor = context.getClassLoader().loadClass(str).asSubclass(CronetProvider.class).getConstructor(Context.class);
            ProviderInfo providerInfo = new ProviderInfo();
            providerInfo.provider = (CronetProvider) constructor.newInstance(context);
            providerInfo.logSource = cronetSource;
            set.add(providerInfo);
            return true;
        } catch (ClassNotFoundException e) {
            logReflectiveOperationException(str, z, e);
            return false;
        } catch (IllegalAccessException e2) {
            logReflectiveOperationException(str, z, e2);
            return false;
        } catch (InstantiationException e3) {
            logReflectiveOperationException(str, z, e3);
            return false;
        } catch (NoSuchMethodException e4) {
            logReflectiveOperationException(str, z, e4);
            return false;
        } catch (InvocationTargetException e5) {
            logReflectiveOperationException(str, z, e5);
            return false;
        }
    }

    private static void logReflectiveOperationException(String str, boolean z, Exception exc) {
        if (z) {
            Log.e(TAG, "Unable to load provider class: " + str, exc);
            return;
        }
        String str2 = TAG;
        if (Log.isLoggable(str2, 3)) {
            Log.d(str2, "Tried to load " + str + " provider class but it wasn't included in the app classpath");
        }
    }

    private static boolean addCronetProviderFromResourceFile(Context context, CronetLogger.CronetSource cronetSource, Set<ProviderInfo> set) {
        int identifier = context.getResources().getIdentifier(RES_KEY_CRONET_IMPL_CLASS, "string", context.getPackageName());
        boolean z = false;
        if (identifier == 0) {
            return false;
        }
        String string = context.getString(identifier);
        if (string != null && !string.equals(PLAY_SERVICES_CRONET_PROVIDER_CLASS) && !string.equals(GMS_CORE_CRONET_PROVIDER_CLASS) && !string.equals(JAVA_CRONET_PROVIDER_CLASS) && !string.equals(NATIVE_CRONET_PROVIDER_CLASS)) {
            z = true;
            if (!addCronetProviderImplByClassName(context, string, cronetSource, set, true)) {
                Log.e(TAG, "Unable to instantiate Cronet implementation class " + string + " that is listed as in the app string resource file under CronetProviderClassName key");
            }
        }
        return z;
    }
}
