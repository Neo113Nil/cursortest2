package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbzt;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
@KeepForSdk
/* loaded from: classes13.dex */
public final class AdActivity extends Activity {

    @NonNull
    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";

    @Nullable
    private zzbzt zza;

    private final void zza() {
        zzbzt zzbztVar = this.zza;
        if (zzbztVar != null) {
            try {
                zzbztVar.zzr();
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.h, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, @NonNull Intent intent) {
        try {
            zzbzt zzbztVar = this.zza;
            if (zzbztVar != null) {
                zzbztVar.zzl(i, i2, intent);
            }
        } catch (Exception e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zzbzt zzbztVar = this.zza;
            if (zzbztVar != null) {
                if (!zzbztVar.zzf()) {
                    return;
                }
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            zzbzt zzbztVar2 = this.zza;
            if (zzbztVar2 != null) {
                zzbztVar2.zzd();
            }
        } catch (RemoteException e2) {
            zzo.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbzt zzbztVar = this.zza;
            if (zzbztVar != null) {
                zzbztVar.zzm(ObjectWrapper.wrap(configuration));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        zzo.zzd("AdActivity onCreate");
        zzbzt zzg = zzay.zzb().zzg(this);
        this.zza = zzg;
        if (zzg == null) {
            zzo.zzl("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            zzg.zzg(bundle);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        zzo.zzd("AdActivity onDestroy");
        try {
            zzbzt zzbztVar = this.zza;
            if (zzbztVar != null) {
                zzbztVar.zzp();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        zzo.zzd("AdActivity onPause");
        try {
            zzbzt zzbztVar = this.zza;
            if (zzbztVar != null) {
                zzbztVar.zzk();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        try {
            zzbzt zzbztVar = this.zza;
            if (zzbztVar != null) {
                zzbztVar.zzG(i, strArr, iArr);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        zzo.zzd("AdActivity onRestart");
        try {
            zzbzt zzbztVar = this.zza;
            if (zzbztVar != null) {
                zzbztVar.zzh();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        zzo.zzd("AdActivity onResume");
        super.onResume();
        try {
            zzbzt zzbztVar = this.zza;
            if (zzbztVar != null) {
                zzbztVar.zzj();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(@NonNull Bundle bundle) {
        try {
            zzbzt zzbztVar = this.zza;
            if (zzbztVar != null) {
                zzbztVar.zzn(bundle);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        zzo.zzd("AdActivity onStart");
        try {
            zzbzt zzbztVar = this.zza;
            if (zzbztVar != null) {
                zzbztVar.zzi();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onStop() {
        zzo.zzd("AdActivity onStop");
        try {
            zzbzt zzbztVar = this.zza;
            if (zzbztVar != null) {
                zzbztVar.zzo();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbzt zzbztVar = this.zza;
            if (zzbztVar != null) {
                zzbztVar.zze();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(@NonNull View view) {
        super.setContentView(view);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(@NonNull View view, @NonNull ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zza();
    }
}
