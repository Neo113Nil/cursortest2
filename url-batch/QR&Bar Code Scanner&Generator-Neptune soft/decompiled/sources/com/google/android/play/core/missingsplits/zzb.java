package com.google.android.play.core.missingsplits;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.play.core.internal.zzag;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes2.dex */
final class zzb implements MissingSplitsManager {
    private static final zzag zza = new zzag("MissingSplitsManagerImpl");
    private final Context zzb;
    private final Runtime zzc;
    private final zza zzd;
    private final AtomicReference zze;

    zzb(Context context, Runtime runtime, zza zzaVar, AtomicReference atomicReference) {
        this.zzb = context;
        this.zzc = runtime;
        this.zzd = zzaVar;
        this.zze = atomicReference;
    }

    private final List zza() {
        List<ActivityManager.AppTask> appTasks = ((ActivityManager) this.zzb.getSystemService("activity")).getAppTasks();
        return appTasks != null ? appTasks : Collections.emptyList();
    }

    @Override // com.google.android.play.core.missingsplits.MissingSplitsManager
    public final boolean disableAppIfMissingRequiredSplits() {
        boolean booleanValue;
        boolean z;
        Class<?> cls;
        ApplicationInfo applicationInfo;
        Set emptySet;
        boolean z2;
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        synchronized (this.zze) {
            if (((Boolean) this.zze.get()) == null) {
                AtomicReference atomicReference = this.zze;
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        applicationInfo = this.zzb.getPackageManager().getApplicationInfo(this.zzb.getPackageName(), 128);
                    } catch (PackageManager.NameNotFoundException unused) {
                        zza.zze("App '%s' is not found in the PackageManager", this.zzb.getPackageName());
                    }
                    if (applicationInfo != null && applicationInfo.metaData != null) {
                        if (Boolean.TRUE.equals(applicationInfo.metaData.get("com.android.vending.splits.required"))) {
                            if (Build.VERSION.SDK_INT < 21) {
                                emptySet = Collections.emptySet();
                            } else {
                                try {
                                    PackageInfo packageInfo = this.zzb.getPackageManager().getPackageInfo(this.zzb.getPackageName(), 0);
                                    HashSet hashSet = new HashSet();
                                    if (packageInfo != null && packageInfo.splitNames != null) {
                                        Collections.addAll(hashSet, packageInfo.splitNames);
                                    }
                                    emptySet = hashSet;
                                } catch (PackageManager.NameNotFoundException unused2) {
                                    zza.zze("App '%s' is not found in PackageManager", this.zzb.getPackageName());
                                    emptySet = Collections.emptySet();
                                }
                            }
                            if (emptySet.isEmpty() || (emptySet.size() == 1 && emptySet.contains(""))) {
                                z2 = true;
                                atomicReference.set(Boolean.valueOf(z2));
                            }
                        }
                    }
                }
                z2 = false;
                atomicReference.set(Boolean.valueOf(z2));
            }
            booleanValue = ((Boolean) this.zze.get()).booleanValue();
        }
        if (!booleanValue) {
            if (this.zzd.zzc()) {
                this.zzd.zzb();
                this.zzc.exit(0);
            }
            return false;
        }
        Iterator it = zza().iterator();
        while (true) {
            if (it.hasNext()) {
                ActivityManager.AppTask appTask = (ActivityManager.AppTask) it.next();
                if (appTask.getTaskInfo() != null && appTask.getTaskInfo().baseIntent != null && appTask.getTaskInfo().baseIntent.getComponent() != null && PlayCoreMissingSplitsActivity.class.getName().equals(appTask.getTaskInfo().baseIntent.getComponent().getClassName())) {
                    break;
                }
            } else {
                Iterator it2 = zza().iterator();
                loop1: while (it2.hasNext()) {
                    ActivityManager.RecentTaskInfo taskInfo = ((ActivityManager.AppTask) it2.next()).getTaskInfo();
                    if (taskInfo != null && taskInfo.baseIntent != null && taskInfo.baseIntent.getComponent() != null) {
                        ComponentName component = taskInfo.baseIntent.getComponent();
                        String className = component.getClassName();
                        try {
                            cls = Class.forName(className);
                        } catch (ClassNotFoundException unused3) {
                            zza.zze("ClassNotFoundException when scanning class hierarchy of '%s'", className);
                            try {
                                if (this.zzb.getPackageManager().getActivityInfo(component, 0) != null) {
                                }
                            } catch (PackageManager.NameNotFoundException unused4) {
                                continue;
                            }
                        }
                        while (cls != null) {
                            if (cls.equals(Activity.class)) {
                                z = true;
                                break loop1;
                            }
                            Class<? super Object> superclass = cls.getSuperclass();
                            cls = superclass != cls ? superclass : null;
                        }
                    }
                }
                z = false;
                this.zzd.zza();
                Iterator it3 = zza().iterator();
                while (it3.hasNext()) {
                    ((ActivityManager.AppTask) it3.next()).finishAndRemoveTask();
                }
                if (z) {
                    this.zzb.getPackageManager().setComponentEnabledSetting(new ComponentName(this.zzb, (Class<?>) PlayCoreMissingSplitsActivity.class), 1, 1);
                    this.zzb.startActivity(new Intent(this.zzb, (Class<?>) PlayCoreMissingSplitsActivity.class).addFlags(884998144));
                }
                this.zzc.exit(0);
            }
        }
        return true;
    }

    @Override // com.google.android.play.core.missingsplits.MissingSplitsManager
    public final boolean isMissingRequiredSplits() {
        boolean booleanValue;
        ApplicationInfo applicationInfo;
        Set emptySet;
        synchronized (this.zze) {
            if (((Boolean) this.zze.get()) == null) {
                AtomicReference atomicReference = this.zze;
                boolean z = true;
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        applicationInfo = this.zzb.getPackageManager().getApplicationInfo(this.zzb.getPackageName(), 128);
                    } catch (PackageManager.NameNotFoundException unused) {
                        zza.zze("App '%s' is not found in the PackageManager", this.zzb.getPackageName());
                    }
                    if (applicationInfo != null && applicationInfo.metaData != null) {
                        if (Boolean.TRUE.equals(applicationInfo.metaData.get("com.android.vending.splits.required"))) {
                            if (Build.VERSION.SDK_INT < 21) {
                                emptySet = Collections.emptySet();
                            } else {
                                try {
                                    PackageInfo packageInfo = this.zzb.getPackageManager().getPackageInfo(this.zzb.getPackageName(), 0);
                                    HashSet hashSet = new HashSet();
                                    if (packageInfo != null && packageInfo.splitNames != null) {
                                        Collections.addAll(hashSet, packageInfo.splitNames);
                                    }
                                    emptySet = hashSet;
                                } catch (PackageManager.NameNotFoundException unused2) {
                                    zza.zze("App '%s' is not found in PackageManager", this.zzb.getPackageName());
                                    emptySet = Collections.emptySet();
                                }
                            }
                            if (!emptySet.isEmpty()) {
                                if (emptySet.size() == 1 && emptySet.contains("")) {
                                }
                            }
                            atomicReference.set(Boolean.valueOf(z));
                        }
                    }
                }
                z = false;
                atomicReference.set(Boolean.valueOf(z));
            }
            booleanValue = ((Boolean) this.zze.get()).booleanValue();
        }
        return booleanValue;
    }
}
