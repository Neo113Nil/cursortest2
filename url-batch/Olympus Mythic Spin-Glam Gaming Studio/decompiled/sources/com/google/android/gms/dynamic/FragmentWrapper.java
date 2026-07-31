package com.google.android.gms.dynamic;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IFragmentWrapper;
import com.safedk.android.utils.Logger;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
@SuppressLint({"NewApi"})
/* loaded from: classes5.dex */
public final class FragmentWrapper extends IFragmentWrapper.Stub {
    private final Fragment zza;

    private FragmentWrapper(Fragment fragment) {
        this.zza = fragment;
    }

    public static void safedk_Fragment_startActivityForResult_217cff818a3a1b3aacc309b44c0675e4(Fragment p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    public static void safedk_Fragment_startActivity_8f6fc823412b34e0e98859b54c6fab97(Fragment p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Fragment;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    public static FragmentWrapper wrap(Fragment fragment) {
        if (fragment != null) {
            return new FragmentWrapper(fragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzA(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        Preconditions.checkNotNull(view);
        this.zza.unregisterForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IObjectWrapper zzb() {
        return ObjectWrapper.wrap(this.zza.getActivity());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final Bundle zzc() {
        return this.zza.getArguments();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int zzd() {
        return this.zza.getId();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper zze() {
        return wrap(this.zza.getParentFragment());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IObjectWrapper zzf() {
        return ObjectWrapper.wrap(this.zza.getResources());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzg() {
        return this.zza.getRetainInstance();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final String zzh() {
        return this.zza.getTag();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper zzi() {
        return wrap(this.zza.getTargetFragment());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int zzj() {
        return this.zza.getTargetRequestCode();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzk() {
        return this.zza.getUserVisibleHint();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IObjectWrapper zzl() {
        return ObjectWrapper.wrap(this.zza.getView());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzm() {
        return this.zza.isAdded();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzn() {
        return this.zza.isDetached();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzo() {
        return this.zza.isHidden();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzp() {
        return this.zza.isInLayout();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzq() {
        return this.zza.isRemoving();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzr() {
        return this.zza.isResumed();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzs() {
        return this.zza.isVisible();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzt(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        Preconditions.checkNotNull(view);
        this.zza.registerForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzu(boolean z) {
        this.zza.setHasOptionsMenu(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzv(boolean z) {
        this.zza.setMenuVisibility(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzw(boolean z) {
        this.zza.setRetainInstance(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzx(boolean z) {
        this.zza.setUserVisibleHint(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzy(Intent intent) {
        safedk_Fragment_startActivity_8f6fc823412b34e0e98859b54c6fab97(this.zza, intent);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzz(Intent intent, int i) {
        safedk_Fragment_startActivityForResult_217cff818a3a1b3aacc309b44c0675e4(this.zza, intent, i);
    }
}
