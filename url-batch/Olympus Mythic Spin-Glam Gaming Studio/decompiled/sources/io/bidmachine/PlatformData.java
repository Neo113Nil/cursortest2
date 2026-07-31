package io.bidmachine;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.XmlResourceParser;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import kotlin.KotlinVersion;

/* loaded from: classes6.dex */
public final class PlatformData {

    @Nullable
    private static volatile PlatformData instance;

    @NonNull
    private final Context context;

    @Nullable
    final String kotlinVersion = getKotlinVersion();

    @Nullable
    private Integer minSdkVersion;

    private PlatformData(@NonNull Context context) {
        this.context = context.getApplicationContext();
    }

    @NonNull
    public static PlatformData get(@NonNull Context context) {
        PlatformData platformData = instance;
        if (platformData == null) {
            synchronized (PlatformData.class) {
                try {
                    platformData = instance;
                    if (platformData == null) {
                        platformData = new PlatformData(context);
                        instance = platformData;
                    }
                } finally {
                }
            }
        }
        return platformData;
    }

    @Nullable
    private String getKotlinVersion() {
        try {
            return KotlinVersion.CURRENT.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    @RequiresApi
    private Integer getMinSdkVersionFromApplicationInfo(@NonNull Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo;
            if (applicationInfo != null) {
                return Integer.valueOf(applicationInfo.minSdkVersion);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    private Integer getMinSdkVersionFromManifest(@NonNull Context context) {
        Integer num = null;
        try {
            XmlResourceParser openXmlResourceParser = context.getAssets().openXmlResourceParser("AndroidManifest.xml");
            try {
                for (int eventType = openXmlResourceParser.getEventType(); eventType != 1; eventType = openXmlResourceParser.next()) {
                    if (eventType == 2) {
                        if ("uses-sdk".equals(openXmlResourceParser.getName())) {
                            int i = 0;
                            while (true) {
                                if (i >= openXmlResourceParser.getAttributeCount()) {
                                    break;
                                }
                                if ("minSdkVersion".equals(openXmlResourceParser.getAttributeName(i))) {
                                    num = Integer.valueOf(Integer.parseInt(openXmlResourceParser.getAttributeValue(i)));
                                    break;
                                }
                                i++;
                            }
                        }
                    }
                }
                openXmlResourceParser.close();
            } finally {
            }
        } catch (Exception unused) {
        }
        return num;
    }

    @Nullable
    Integer getMinSdkVersion() {
        Integer num = this.minSdkVersion;
        if (num != null) {
            return num;
        }
        Integer minSdkVersionFromApplicationInfo = getMinSdkVersionFromApplicationInfo(this.context);
        this.minSdkVersion = minSdkVersionFromApplicationInfo;
        if (minSdkVersionFromApplicationInfo == null) {
            this.minSdkVersion = getMinSdkVersionFromManifest(this.context);
        }
        return this.minSdkVersion;
    }
}
